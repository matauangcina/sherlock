package p000a.p042m.p043a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/* renamed from: a.m.a.a */
/* loaded from: classes.dex */
public final class C0310a {

    /* renamed from: f */
    private static final Object f832f = new Object();

    /* renamed from: g */
    private static C0310a f833g;

    /* renamed from: a */
    private final Context f834a;

    /* renamed from: b */
    private final HashMap<BroadcastReceiver, ArrayList<C0313c>> f835b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, ArrayList<C0313c>> f836c = new HashMap<>();

    /* renamed from: d */
    private final ArrayList<C0312b> f837d = new ArrayList<>();

    /* renamed from: e */
    private final Handler f838e;

    /* renamed from: a.m.a.a$a */
    /* loaded from: classes.dex */
    class HandlerC0311a extends Handler {
        HandlerC0311a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C0310a.this.m8405a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.m.a.a$b */
    /* loaded from: classes.dex */
    public static final class C0312b {

        /* renamed from: a */
        final Intent f840a;

        /* renamed from: b */
        final ArrayList<C0313c> f841b;

        C0312b(Intent intent, ArrayList<C0313c> arrayList) {
            this.f840a = intent;
            this.f841b = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.m.a.a$c */
    /* loaded from: classes.dex */
    public static final class C0313c {

        /* renamed from: a */
        final IntentFilter f842a;

        /* renamed from: b */
        final BroadcastReceiver f843b;

        /* renamed from: c */
        boolean f844c;

        /* renamed from: d */
        boolean f845d;

        C0313c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f842a = intentFilter;
            this.f843b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f843b);
            sb.append(" filter=");
            sb.append(this.f842a);
            if (this.f845d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private C0310a(Context context) {
        this.f834a = context;
        this.f838e = new HandlerC0311a(context.getMainLooper());
    }

    /* renamed from: b */
    public static C0310a m8404b(Context context) {
        C0310a c0310a;
        synchronized (f832f) {
            if (f833g == null) {
                f833g = new C0310a(context.getApplicationContext());
            }
            c0310a = f833g;
        }
        return c0310a;
    }

    /* renamed from: a */
    void m8405a() {
        int size;
        C0312b[] c0312bArr;
        while (true) {
            synchronized (this.f835b) {
                size = this.f837d.size();
                if (size <= 0) {
                    return;
                }
                c0312bArr = new C0312b[size];
                this.f837d.toArray(c0312bArr);
                this.f837d.clear();
            }
            for (int i = 0; i < size; i++) {
                C0312b c0312b = c0312bArr[i];
                int size2 = c0312b.f841b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C0313c c0313c = c0312b.f841b.get(i2);
                    if (!c0313c.f845d) {
                        c0313c.f843b.onReceive(this.f834a, c0312b.f840a);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m8403c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f835b) {
            C0313c c0313c = new C0313c(intentFilter, broadcastReceiver);
            ArrayList<C0313c> arrayList = this.f835b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f835b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c0313c);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C0313c> arrayList2 = this.f836c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f836c.put(action, arrayList2);
                }
                arrayList2.add(c0313c);
            }
        }
    }

    /* renamed from: d */
    public boolean m8402d(Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<C0313c> arrayList2;
        String str2;
        synchronized (this.f835b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f834a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<C0313c> arrayList3 = this.f836c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    C0313c c0313c = arrayList3.get(i2);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + c0313c.f842a);
                    }
                    if (c0313c.f844c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i = i2;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i = i2;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = c0313c.f842a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(c0313c);
                            c0313c.f844c = true;
                            i2 = i + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((C0313c) arrayList5.get(i3)).f844c = false;
                    }
                    this.f837d.add(new C0312b(intent, arrayList5));
                    if (!this.f838e.hasMessages(1)) {
                        this.f838e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    public void m8401e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f835b) {
            ArrayList<C0313c> remove = this.f835b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                C0313c c0313c = remove.get(size);
                c0313c.f845d = true;
                for (int i = 0; i < c0313c.f842a.countActions(); i++) {
                    String action = c0313c.f842a.getAction(i);
                    ArrayList<C0313c> arrayList = this.f836c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            C0313c c0313c2 = arrayList.get(size2);
                            if (c0313c2.f843b == broadcastReceiver) {
                                c0313c2.f845d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f836c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
