package org.apache.commons.p008io;

import java.io.File;
@Deprecated
/* renamed from: org.apache.commons.io.FileCleaner */
/* loaded from: classes.dex */
public class FileCleaner {
    static final FileCleaningTracker theInstance = new FileCleaningTracker();

    @Deprecated
    public static void track(File file, Object marker) {
        theInstance.track(file, marker);
    }

    @Deprecated
    public static void track(File file, Object marker, FileDeleteStrategy deleteStrategy) {
        theInstance.track(file, marker, deleteStrategy);
    }

    @Deprecated
    public static void track(String path, Object marker) {
        theInstance.track(path, marker);
    }

    @Deprecated
    public static void track(String path, Object marker, FileDeleteStrategy deleteStrategy) {
        theInstance.track(path, marker, deleteStrategy);
    }

    @Deprecated
    public static int getTrackCount() {
        return theInstance.getTrackCount();
    }

    @Deprecated
    public static synchronized void exitWhenFinished() {
        synchronized (FileCleaner.class) {
            theInstance.exitWhenFinished();
        }
    }

    public static FileCleaningTracker getInstance() {
        return theInstance;
    }
}
