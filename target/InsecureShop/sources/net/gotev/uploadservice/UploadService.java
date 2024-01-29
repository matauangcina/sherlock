package net.gotev.uploadservice;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.gotev.uploadservice.http.HttpStack;
import net.gotev.uploadservice.http.impl.HurlStack;
/* loaded from: classes.dex */
public final class UploadService extends Service {
    private static final String ACTION_UPLOAD_SUFFIX = ".uploadservice.action.upload";
    private static final String BROADCAST_ACTION_SUFFIX = ".uploadservice.broadcast.status";
    protected static final String PARAM_BROADCAST_DATA = "broadcastData";
    protected static final String PARAM_TASK_CLASS = "taskClass";
    protected static final String PARAM_TASK_PARAMETERS = "taskParameters";
    protected static final long PROGRESS_REPORT_INTERVAL = 166;
    protected static final int UPLOAD_NOTIFICATION_BASE_ID = 1234;
    private int notificationIncrementalId = 0;
    private final BlockingQueue<Runnable> uploadTasksQueue = new LinkedBlockingQueue();
    private ThreadPoolExecutor uploadThreadPool;
    private PowerManager.WakeLock wakeLock;
    private static final String TAG = UploadService.class.getSimpleName();
    public static int UPLOAD_POOL_SIZE = Runtime.getRuntime().availableProcessors();
    public static int KEEP_ALIVE_TIME_IN_SECONDS = 1;
    public static boolean EXECUTE_IN_FOREGROUND = true;
    public static String NAMESPACE = "net.gotev";
    public static HttpStack HTTP_STACK = new HurlStack();
    public static int BUFFER_SIZE = 4096;
    public static int INITIAL_RETRY_WAIT_TIME = 1000;
    public static int BACKOFF_MULTIPLIER = 10;
    public static int MAX_RETRY_WAIT_TIME = 600000;
    private static final Map<String, UploadTask> uploadTasksMap = new ConcurrentHashMap();
    private static final Map<String, UploadStatusDelegate> uploadDelegates = new ConcurrentHashMap();
    private static volatile String foregroundUploadId = null;

    /* JADX INFO: Access modifiers changed from: protected */
    public static String getActionUpload() {
        return NAMESPACE + ACTION_UPLOAD_SUFFIX;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String getActionBroadcast() {
        return NAMESPACE + BROADCAST_ACTION_SUFFIX;
    }

    public static synchronized void stopUpload(String uploadId) {
        synchronized (UploadService.class) {
            UploadTask removedTask = uploadTasksMap.get(uploadId);
            if (removedTask != null) {
                removedTask.cancel();
            }
        }
    }

    public static synchronized List<String> getTaskList() {
        List<String> tasks;
        synchronized (UploadService.class) {
            if (uploadTasksMap.isEmpty()) {
                tasks = new ArrayList<>(1);
            } else {
                tasks = new ArrayList<>(uploadTasksMap.size());
                tasks.addAll(uploadTasksMap.keySet());
            }
        }
        return tasks;
    }

    public static synchronized void stopAllUploads() {
        synchronized (UploadService.class) {
            if (uploadTasksMap.isEmpty()) {
                return;
            }
            for (String str : uploadTasksMap.keySet()) {
                UploadTask taskToCancel = uploadTasksMap.get(str);
                taskToCancel.cancel();
            }
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        PowerManager pm = (PowerManager) getSystemService("power");
        PowerManager.WakeLock newWakeLock = pm.newWakeLock(1, TAG);
        this.wakeLock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        if (!this.wakeLock.isHeld()) {
            this.wakeLock.acquire();
        }
        if (UPLOAD_POOL_SIZE <= 0) {
            UPLOAD_POOL_SIZE = Runtime.getRuntime().availableProcessors();
        }
        int i = UPLOAD_POOL_SIZE;
        this.uploadThreadPool = new ThreadPoolExecutor(i, i, KEEP_ALIVE_TIME_IN_SECONDS, TimeUnit.SECONDS, this.uploadTasksQueue);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent == null || !getActionUpload().equals(intent.getAction())) {
            return shutdownIfThereArentAnyActiveTasks();
        }
        String str = TAG;
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[4];
        objArr[0] = NAMESPACE;
        objArr[1] = Integer.valueOf(UPLOAD_POOL_SIZE);
        objArr[2] = Integer.valueOf(KEEP_ALIVE_TIME_IN_SECONDS);
        objArr[3] = EXECUTE_IN_FOREGROUND ? "enabled" : "disabled";
        Logger.info(str, String.format(locale, "Starting service with namespace: %s, upload pool size: %d, %ds idle thread keep alive time. Foreground execution is %s", objArr));
        UploadTask currentTask = getTask(intent);
        if (currentTask == null) {
            return shutdownIfThereArentAnyActiveTasks();
        }
        if (uploadTasksMap.containsKey(currentTask.params.getId())) {
            Logger.error(TAG, "Preventing upload with id: " + currentTask.params.getId() + " to be uploaded twice! Please check your code and fix it!");
            return shutdownIfThereArentAnyActiveTasks();
        }
        this.notificationIncrementalId += 2;
        currentTask.setLastProgressNotificationTime(0L).setNotificationId(this.notificationIncrementalId + UPLOAD_NOTIFICATION_BASE_ID);
        uploadTasksMap.put(currentTask.params.getId(), currentTask);
        this.uploadThreadPool.execute(currentTask);
        return 1;
    }

    private int shutdownIfThereArentAnyActiveTasks() {
        if (uploadTasksMap.isEmpty()) {
            stopSelf();
            return 2;
        }
        return 1;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        stopAllUploads();
        this.uploadThreadPool.shutdown();
        if (EXECUTE_IN_FOREGROUND) {
            Logger.debug(TAG, "Stopping foreground execution");
            stopForeground(true);
        }
        if (this.wakeLock.isHeld()) {
            this.wakeLock.release();
        }
        uploadTasksMap.clear();
        uploadDelegates.clear();
        Logger.debug(TAG, "UploadService destroyed");
    }

    UploadTask getTask(Intent intent) {
        String taskClass = intent.getStringExtra(PARAM_TASK_CLASS);
        if (taskClass == null) {
            return null;
        }
        UploadTask uploadTask = null;
        try {
            Class<?> task = Class.forName(taskClass);
            if (UploadTask.class.isAssignableFrom(task)) {
                uploadTask = (UploadTask) UploadTask.class.cast(task.newInstance());
                uploadTask.init(this, intent);
            } else {
                String str = TAG;
                Logger.error(str, taskClass + " does not extend UploadTask!");
            }
            String str2 = TAG;
            Logger.debug(str2, "Successfully created new task with class: " + taskClass);
        } catch (Exception exc) {
            Logger.error(TAG, "Error while instantiating new task", exc);
        }
        return uploadTask;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized boolean holdForegroundNotification(String uploadId, Notification notification) {
        if (EXECUTE_IN_FOREGROUND) {
            if (foregroundUploadId == null) {
                foregroundUploadId = uploadId;
                String str = TAG;
                Logger.debug(str, uploadId + " now holds the foreground notification");
            }
            if (uploadId.equals(foregroundUploadId)) {
                startForeground(UPLOAD_NOTIFICATION_BASE_ID, notification);
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void taskCompleted(String uploadId) {
        UploadTask task = uploadTasksMap.remove(uploadId);
        uploadDelegates.remove(uploadId);
        if (EXECUTE_IN_FOREGROUND && task != null && task.params.getId().equals(foregroundUploadId)) {
            String str = TAG;
            Logger.debug(str, uploadId + " now un-holded the foreground notification");
            foregroundUploadId = null;
        }
        if (EXECUTE_IN_FOREGROUND && uploadTasksMap.isEmpty()) {
            Logger.debug(TAG, "All tasks completed, stopping foreground execution");
            stopForeground(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void setUploadStatusDelegate(String uploadId, UploadStatusDelegate delegate) {
        if (delegate == null) {
            return;
        }
        uploadDelegates.put(uploadId, delegate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static UploadStatusDelegate getUploadStatusDelegate(String uploadId) {
        return uploadDelegates.get(uploadId);
    }
}
