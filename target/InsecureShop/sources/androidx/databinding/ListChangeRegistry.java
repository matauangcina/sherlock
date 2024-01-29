package androidx.databinding;

import androidx.core.util.Pools;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.ObservableList;
/* loaded from: classes.dex */
public class ListChangeRegistry extends CallbackRegistry<ObservableList.OnListChangedCallback, ObservableList, ListChanges> {
    private static final int ALL = 0;
    private static final int CHANGED = 1;
    private static final int INSERTED = 2;
    private static final int MOVED = 3;
    private static final int REMOVED = 4;
    private static final Pools.SynchronizedPool<ListChanges> sListChanges = new Pools.SynchronizedPool<>(10);
    private static final CallbackRegistry.NotifierCallback<ObservableList.OnListChangedCallback, ObservableList, ListChanges> NOTIFIER_CALLBACK = new CallbackRegistry.NotifierCallback<ObservableList.OnListChangedCallback, ObservableList, ListChanges>() { // from class: androidx.databinding.ListChangeRegistry.1
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public void onNotifyCallback(ObservableList.OnListChangedCallback callback, ObservableList sender, int notificationType, ListChanges listChanges) {
            if (notificationType == 1) {
                callback.onItemRangeChanged(sender, listChanges.start, listChanges.count);
            } else if (notificationType == 2) {
                callback.onItemRangeInserted(sender, listChanges.start, listChanges.count);
            } else if (notificationType == 3) {
                callback.onItemRangeMoved(sender, listChanges.start, listChanges.f31to, listChanges.count);
            } else if (notificationType == 4) {
                callback.onItemRangeRemoved(sender, listChanges.start, listChanges.count);
            } else {
                callback.onChanged(sender);
            }
        }
    };

    public void notifyChanged(ObservableList list) {
        notifyCallbacks(list, 0, (ListChanges) null);
    }

    public void notifyChanged(ObservableList list, int start, int count) {
        ListChanges listChanges = acquire(start, 0, count);
        notifyCallbacks(list, 1, listChanges);
    }

    public void notifyInserted(ObservableList list, int start, int count) {
        ListChanges listChanges = acquire(start, 0, count);
        notifyCallbacks(list, 2, listChanges);
    }

    public void notifyMoved(ObservableList list, int from, int to, int count) {
        ListChanges listChanges = acquire(from, to, count);
        notifyCallbacks(list, 3, listChanges);
    }

    public void notifyRemoved(ObservableList list, int start, int count) {
        ListChanges listChanges = acquire(start, 0, count);
        notifyCallbacks(list, 4, listChanges);
    }

    private static ListChanges acquire(int start, int to, int count) {
        ListChanges listChanges = sListChanges.acquire();
        if (listChanges == null) {
            listChanges = new ListChanges();
        }
        listChanges.start = start;
        listChanges.f31to = to;
        listChanges.count = count;
        return listChanges;
    }

    @Override // androidx.databinding.CallbackRegistry
    public synchronized void notifyCallbacks(ObservableList sender, int notificationType, ListChanges listChanges) {
        super.notifyCallbacks((ListChangeRegistry) sender, notificationType, (int) listChanges);
        if (listChanges != null) {
            sListChanges.release(listChanges);
        }
    }

    public ListChangeRegistry() {
        super(NOTIFIER_CALLBACK);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ListChanges {
        public int count;
        public int start;

        /* renamed from: to */
        public int f31to;

        ListChanges() {
        }
    }
}
