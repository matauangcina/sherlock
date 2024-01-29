package com.google.firebase.database.p120m;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.firebase.database.C2307c;
import com.google.firebase.database.p124p.C2411b;
import com.google.firebase.database.p124p.C2449g;
import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.C2561y;
import com.google.firebase.database.p124p.p126f0.C2437g;
import com.google.firebase.database.p124p.p126f0.C2441h;
import com.google.firebase.database.p124p.p126f0.InterfaceC2436f;
import com.google.firebase.database.p124p.p127g0.C2457d;
import com.google.firebase.database.p124p.p127g0.C2461e;
import com.google.firebase.database.p124p.p127g0.C2463g;
import com.google.firebase.database.p124p.p127g0.C2472l;
import com.google.firebase.database.p124p.p128h0.C2488i;
import com.google.firebase.database.p130q.C2566c;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.C2573c;
import com.google.firebase.database.p131r.C2585g;
import com.google.firebase.database.p131r.C2593m;
import com.google.firebase.database.p131r.C2597o;
import com.google.firebase.database.p131r.InterfaceC2594n;
import com.google.firebase.database.p133t.C2625b;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.firebase.database.m.i */
/* loaded from: classes.dex */
public class C2336i implements InterfaceC2436f {

    /* renamed from: e */
    private static final Charset f6153e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final SQLiteDatabase f6154a;

    /* renamed from: b */
    private final C2566c f6155b;

    /* renamed from: c */
    private boolean f6156c;

    /* renamed from: d */
    private long f6157d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.m.i$a */
    /* loaded from: classes.dex */
    public class C2337a implements C2457d.InterfaceC2460c<Void, Integer> {

        /* renamed from: a */
        final /* synthetic */ C2457d f6158a;

        C2337a(C2336i c2336i, C2457d c2457d) {
            this.f6158a = c2457d;
        }

        @Override // com.google.firebase.database.p124p.p127g0.C2457d.InterfaceC2460c
        /* renamed from: b */
        public Integer mo1221a(C2506l c2506l, Void r2, Integer num) {
            return Integer.valueOf(this.f6158a.m1555s(c2506l) == null ? num.intValue() + 1 : num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.m.i$b */
    /* loaded from: classes.dex */
    public class C2338b implements C2457d.InterfaceC2460c<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ C2457d f6159a;

        /* renamed from: b */
        final /* synthetic */ List f6160b;

        /* renamed from: c */
        final /* synthetic */ C2506l f6161c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC2594n f6162d;

        C2338b(C2336i c2336i, C2457d c2457d, List list, C2506l c2506l, InterfaceC2594n interfaceC2594n) {
            this.f6159a = c2457d;
            this.f6160b = list;
            this.f6161c = c2506l;
            this.f6162d = interfaceC2594n;
        }

        @Override // com.google.firebase.database.p124p.p127g0.C2457d.InterfaceC2460c
        /* renamed from: b */
        public Void mo1221a(C2506l c2506l, Void r4, Void r5) {
            if (this.f6159a.m1555s(c2506l) == null) {
                this.f6160b.add(new C2463g(this.f6161c.m1390i(c2506l), this.f6162d.mo1086h(c2506l)));
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.m.i$c */
    /* loaded from: classes.dex */
    public static class C2339c extends SQLiteOpenHelper {
        public C2339c(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        }

        /* renamed from: a */
        private void m1996a(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            sQLiteDatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
            sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
            sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > 1) {
                throw new AssertionError("We don't handle upgrading to " + i2);
            }
            m1996a(sQLiteDatabase, "serverCache");
            sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            m1996a(sQLiteDatabase, "complete");
            sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
        }
    }

    public C2336i(Context context, C2449g c2449g, String str) {
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            this.f6155b = c2449g.m1589n("Persistence");
            this.f6154a = m2017B(context, encode);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: A */
    private Cursor m2018A(C2506l c2506l, String[] strArr) {
        String m2014E = m2014E(c2506l);
        String m2015D = m2015D(m2014E);
        String[] strArr2 = new String[c2506l.size() + 3];
        String str = m2003v(c2506l, strArr2) + " OR (path > ? AND path < ?)";
        strArr2[c2506l.size() + 1] = m2014E;
        strArr2[c2506l.size() + 2] = m2015D;
        return this.f6154a.query("serverCache", strArr, str, strArr2, null, null, "path");
    }

    /* renamed from: B */
    private SQLiteDatabase m2017B(Context context, String str) {
        try {
            SQLiteDatabase writableDatabase = new C2339c(context, str).getWritableDatabase();
            writableDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", null).close();
            writableDatabase.beginTransaction();
            writableDatabase.endTransaction();
            return writableDatabase;
        } catch (SQLiteException e) {
            if (e instanceof SQLiteDatabaseLockedException) {
                throw new C2307c("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", e);
            }
            throw e;
        }
    }

    /* renamed from: C */
    private String m2016C(C2506l c2506l, int i) {
        return m2014E(c2506l) + String.format(".part-%04d", Integer.valueOf(i));
    }

    /* renamed from: D */
    private static String m2015D(String str) {
        return str.substring(0, str.length() - 1) + '0';
    }

    /* renamed from: E */
    private static String m2014E(C2506l c2506l) {
        if (c2506l.isEmpty()) {
            return "/";
        }
        return c2506l.toString() + "/";
    }

    /* renamed from: F */
    private void m2013F(C2506l c2506l, C2506l c2506l2, C2457d<Long> c2457d, C2457d<Long> c2457d2, C2437g c2437g, List<C2463g<C2506l, InterfaceC2594n>> list) {
        if (c2457d.getValue() == null) {
            Iterator<Map.Entry<C2570b, C2457d<Long>>> it = c2457d.m1553w().iterator();
            while (it.hasNext()) {
                Map.Entry<C2570b, C2457d<Long>> next = it.next();
                C2570b key = next.getKey();
                m2013F(c2506l, c2506l2.m1389l(key), next.getValue(), c2457d2.m1554u(key), c2437g.m1650a(next.getKey()), list);
            }
            return;
        }
        int intValue = ((Integer) c2437g.m1649b(0, new C2337a(this, c2457d2))).intValue();
        if (intValue > 0) {
            C2506l m1390i = c2506l.m1390i(c2506l2);
            if (this.f6155b.m1174f()) {
                this.f6155b.m1178b(String.format("Need to rewrite %d nodes below path %s", Integer.valueOf(intValue), m1390i), new Object[0]);
            }
            c2437g.m1649b(null, new C2338b(this, c2457d2, list, c2506l2, m1999z(m1390i)));
        }
    }

    /* renamed from: G */
    private int m2012G(String str, C2506l c2506l) {
        String m2014E = m2014E(c2506l);
        return this.f6154a.delete(str, "path >= ? AND path < ?", new String[]{m2014E, m2015D(m2014E)});
    }

    /* renamed from: H */
    private int m2011H(C2506l c2506l, InterfaceC2594n interfaceC2594n) {
        long m1546b = C2461e.m1546b(interfaceC2594n);
        if (!(interfaceC2594n instanceof C2573c) || m1546b <= 16384) {
            m2010I(c2506l, interfaceC2594n);
            return 1;
        }
        int i = 0;
        if (this.f6155b.m1174f()) {
            this.f6155b.m1178b(String.format("Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", c2506l, Long.valueOf(m1546b), 16384), new Object[0]);
        }
        for (C2593m c2593m : interfaceC2594n) {
            i += m2011H(c2506l.m1389l(c2593m.m1089c()), c2593m.m1088d());
        }
        if (!interfaceC2594n.mo1078c().isEmpty()) {
            m2010I(c2506l.m1389l(C2570b.m1159m()), interfaceC2594n.mo1078c());
            i++;
        }
        m2010I(c2506l, C2585g.m1115s());
        return i + 1;
    }

    /* renamed from: I */
    private void m2010I(C2506l c2506l, InterfaceC2594n interfaceC2594n) {
        byte[] m2008K = m2008K(interfaceC2594n.mo1081r(true));
        if (m2008K.length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("path", m2014E(c2506l));
            contentValues.put("value", m2008K);
            this.f6154a.insertWithOnConflict("serverCache", null, contentValues, 5);
            return;
        }
        List<byte[]> m2007L = m2007L(m2008K, 262144);
        if (this.f6155b.m1174f()) {
            C2566c c2566c = this.f6155b;
            c2566c.m1178b("Saving huge leaf node with " + m2007L.size() + " parts.", new Object[0]);
        }
        for (int i = 0; i < m2007L.size(); i++) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("path", m2016C(c2506l, i));
            contentValues2.put("value", m2007L.get(i));
            this.f6154a.insertWithOnConflict("serverCache", null, contentValues2, 5);
        }
    }

    /* renamed from: J */
    private void m2009J(C2506l c2506l, long j, String str, byte[] bArr) {
        m2004O();
        this.f6154a.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        if (bArr.length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("path", m2014E(c2506l));
            contentValues.put("type", str);
            contentValues.put("part", (Integer) null);
            contentValues.put("node", bArr);
            this.f6154a.insertWithOnConflict("writes", null, contentValues, 5);
            return;
        }
        List<byte[]> m2007L = m2007L(bArr, 262144);
        for (int i = 0; i < m2007L.size(); i++) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("id", Long.valueOf(j));
            contentValues2.put("path", m2014E(c2506l));
            contentValues2.put("type", str);
            contentValues2.put("part", Integer.valueOf(i));
            contentValues2.put("node", m2007L.get(i));
            this.f6154a.insertWithOnConflict("writes", null, contentValues2, 5);
        }
    }

    /* renamed from: K */
    private byte[] m2008K(Object obj) {
        try {
            return C2625b.m991d(obj).getBytes(f6153e);
        } catch (IOException e) {
            throw new RuntimeException("Could not serialize leaf node", e);
        }
    }

    /* renamed from: L */
    private static List<byte[]> m2007L(byte[] bArr, int i) {
        int length = ((bArr.length - 1) / i) + 1;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * i;
            int min = Math.min(i, bArr.length - i3);
            byte[] bArr2 = new byte[min];
            System.arraycopy(bArr, i3, bArr2, 0, min);
            arrayList.add(bArr2);
        }
        return arrayList;
    }

    /* renamed from: M */
    private int m2006M(C2506l c2506l, List<String> list, int i) {
        int i2 = i + 1;
        String m2014E = m2014E(c2506l);
        if (list.get(i).startsWith(m2014E)) {
            while (i2 < list.size() && list.get(i2).equals(m2016C(c2506l, i2 - i))) {
                i2++;
            }
            if (i2 < list.size()) {
                if (list.get(i2).startsWith(m2014E + ".part-")) {
                    throw new IllegalStateException("Run did not finish with all parts");
                }
            }
            return i2 - i;
        }
        throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
    }

    /* renamed from: N */
    private void m2005N(C2506l c2506l, InterfaceC2594n interfaceC2594n, boolean z) {
        int i;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            int i3 = 0;
            int i4 = 0;
            for (C2593m c2593m : interfaceC2594n) {
                i4 += m2012G("serverCache", c2506l.m1389l(c2593m.m1089c()));
                i3 += m2011H(c2506l.m1389l(c2593m.m1089c()), c2593m.m1088d());
            }
            i = i3;
            i2 = i4;
        } else {
            i2 = m2012G("serverCache", c2506l);
            i = m2011H(c2506l, interfaceC2594n);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f6155b.m1174f()) {
            this.f6155b.m1178b(String.format("Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", Integer.valueOf(i), Integer.valueOf(i2), c2506l.toString(), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    /* renamed from: O */
    private void m2004O() {
        C2472l.m1519f(this.f6156c, "Transaction expected to already be in progress.");
    }

    /* renamed from: v */
    private static String m2003v(C2506l c2506l, String[] strArr) {
        int i = 0;
        StringBuilder sb = new StringBuilder("(");
        while (true) {
            boolean isEmpty = c2506l.isEmpty();
            sb.append("path");
            if (isEmpty) {
                sb.append(" = ?)");
                strArr[i] = m2014E(C2506l.m1385w());
                return sb.toString();
            }
            sb.append(" = ? OR ");
            strArr[i] = m2014E(c2506l);
            c2506l = c2506l.m1383y();
            i++;
        }
    }

    /* renamed from: w */
    private String m2002w(Collection<Long> collection) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Long l : collection) {
            long longValue = l.longValue();
            if (!z) {
                sb.append(",");
            }
            z = false;
            sb.append(longValue);
        }
        return sb.toString();
    }

    /* renamed from: x */
    private InterfaceC2594n m2001x(byte[] bArr) {
        try {
            return C2597o.m1075a(C2625b.m993b(new String(bArr, f6153e)));
        } catch (IOException e) {
            String str = new String(bArr, f6153e);
            throw new RuntimeException("Could not deserialize node: " + str, e);
        }
    }

    /* renamed from: y */
    private byte[] m2000y(List<byte[]> list) {
        int i = 0;
        for (byte[] bArr : list) {
            i += bArr.length;
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : list) {
            System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
            i2 += bArr3.length;
        }
        return bArr2;
    }

    /* renamed from: z */
    private InterfaceC2594n m1999z(C2506l c2506l) {
        long j;
        InterfaceC2594n m2001x;
        C2506l c2506l2;
        int i;
        C2506l c2506l3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Cursor m2018A = m2018A(c2506l, new String[]{"path", "value"});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis();
        while (m2018A.moveToNext()) {
            try {
                arrayList.add(m2018A.getString(0));
                arrayList2.add(m2018A.getBlob(1));
            } catch (Throwable th) {
                m2018A.close();
                throw th;
            }
        }
        m2018A.close();
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
        long currentTimeMillis5 = System.currentTimeMillis();
        InterfaceC2594n m1115s = C2585g.m1115s();
        HashMap hashMap = new HashMap();
        int i2 = 0;
        boolean z = false;
        while (true) {
            long j2 = currentTimeMillis4;
            if (i2 >= arrayList2.size()) {
                long j3 = currentTimeMillis2;
                for (Map.Entry entry : hashMap.entrySet()) {
                    m1115s = m1115s.mo1082q(C2506l.m1382z(c2506l, (C2506l) entry.getKey()), (InterfaceC2594n) entry.getValue());
                }
                long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
                long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis;
                if (this.f6155b.m1174f()) {
                    this.f6155b.m1178b(String.format("Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", Integer.valueOf(arrayList2.size()), Integer.valueOf(C2461e.m1545c(m1115s)), c2506l, Long.valueOf(currentTimeMillis7), Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(currentTimeMillis6)), new Object[0]);
                }
                return m1115s;
            }
            if (arrayList.get(i2).endsWith(".part-0000")) {
                String str = arrayList.get(i2);
                j = currentTimeMillis2;
                C2506l c2506l4 = new C2506l(str.substring(0, str.length() - 10));
                int m2006M = m2006M(c2506l4, arrayList, i2);
                if (this.f6155b.m1174f()) {
                    C2566c c2566c = this.f6155b;
                    c2506l3 = c2506l4;
                    c2566c.m1178b("Loading split node with " + m2006M + " parts.", new Object[0]);
                } else {
                    c2506l3 = c2506l4;
                }
                int i3 = m2006M + i2;
                m2001x = m2001x(m2000y(arrayList2.subList(i2, i3)));
                i2 = i3 - 1;
                c2506l2 = c2506l3;
            } else {
                j = currentTimeMillis2;
                m2001x = m2001x((byte[]) arrayList2.get(i2));
                c2506l2 = new C2506l(arrayList.get(i2));
            }
            if (c2506l2.m1386u() != null && c2506l2.m1386u().m1158w()) {
                hashMap.put(c2506l2, m2001x);
            } else if (c2506l2.m1387s(c2506l)) {
                C2472l.m1519f(!z, "Descendants of path must come after ancestors.");
                m1115s = m2001x.mo1086h(C2506l.m1382z(c2506l2, c2506l));
            } else if (!c2506l.m1387s(c2506l2)) {
                throw new IllegalStateException(String.format("Loading an unrelated row with path %s for %s", c2506l2, c2506l));
            } else {
                m1115s = m1115s.mo1082q(C2506l.m1382z(c2506l, c2506l2), m2001x);
                i = 1;
                z = true;
                i2 += i;
                currentTimeMillis4 = j2;
                currentTimeMillis2 = j;
            }
            i = 1;
            i2 += i;
            currentTimeMillis4 = j2;
            currentTimeMillis2 = j;
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: a */
    public void mo1671a(long j) {
        m2004O();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.f6154a.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f6155b.m1174f()) {
            this.f6155b.m1178b(String.format("Deleted %d write(s) with writeId %d in %dms", Integer.valueOf(delete), Long.valueOf(j), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: b */
    public void mo1670b(C2506l c2506l, C2411b c2411b, long j) {
        m2004O();
        long currentTimeMillis = System.currentTimeMillis();
        m2009J(c2506l, j, "m", m2008K(c2411b.m1740z(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f6155b.m1174f()) {
            this.f6155b.m1178b(String.format("Persisted user merge in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: c */
    public List<C2561y> mo1669c() {
        byte[] m2000y;
        C2561y c2561y;
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.f6154a.query("writes", new String[]{"id", "path", "type", "part", "node"}, null, null, null, null, "id, part");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    long j = query.getLong(0);
                    C2506l c2506l = new C2506l(query.getString(1));
                    String string = query.getString(2);
                    if (query.isNull(3)) {
                        m2000y = query.getBlob(4);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        do {
                            arrayList2.add(query.getBlob(4));
                            if (!query.moveToNext()) {
                                break;
                            }
                        } while (query.getLong(0) == j);
                        query.moveToPrevious();
                        m2000y = m2000y(arrayList2);
                    }
                    Object m993b = C2625b.m993b(new String(m2000y, f6153e));
                    if ("o".equals(string)) {
                        c2561y = new C2561y(j, c2506l, C2597o.m1075a(m993b), true);
                    } else if (!"m".equals(string)) {
                        throw new IllegalStateException("Got invalid write type: " + string);
                    } else {
                        c2561y = new C2561y(j, c2506l, C2411b.m1743w((Map) m993b));
                    }
                    arrayList.add(c2561y);
                } catch (IOException e) {
                    throw new RuntimeException("Failed to load writes", e);
                }
            } finally {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f6155b.m1174f()) {
            this.f6155b.m1178b(String.format("Loaded %d writes in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
        return arrayList;
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: d */
    public void mo1668d(C2506l c2506l, InterfaceC2594n interfaceC2594n, long j) {
        m2004O();
        long currentTimeMillis = System.currentTimeMillis();
        m2009J(c2506l, j, "o", m2008K(interfaceC2594n.mo1081r(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f6155b.m1174f()) {
            this.f6155b.m1178b(String.format("Persisted user overwrite in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: e */
    public void mo1667e() {
        this.f6154a.endTransaction();
        this.f6156c = false;
        long currentTimeMillis = System.currentTimeMillis() - this.f6157d;
        if (this.f6155b.m1174f()) {
            this.f6155b.m1178b(String.format("Transaction completed. Elapsed: %dms", Long.valueOf(currentTimeMillis)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: f */
    public void mo1666f() {
        C2472l.m1519f(!this.f6156c, "runInTransaction called when an existing transaction is already in progress.");
        if (this.f6155b.m1174f()) {
            this.f6155b.m1178b("Starting transaction.", new Object[0]);
        }
        this.f6154a.beginTransaction();
        this.f6156c = true;
        this.f6157d = System.currentTimeMillis();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: g */
    public void mo1665g(long j) {
        m2004O();
        String valueOf = String.valueOf(j);
        this.f6154a.delete("trackedQueries", "id = ?", new String[]{valueOf});
        this.f6154a.delete("trackedKeys", "id = ?", new String[]{valueOf});
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: h */
    public Set<C2570b> mo1664h(long j) {
        return mo1652t(Collections.singleton(Long.valueOf(j)));
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: i */
    public void mo1663i(long j) {
        m2004O();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Boolean.FALSE);
        contentValues.put("lastUse", Long.valueOf(j));
        this.f6154a.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f6155b.m1174f()) {
            this.f6155b.m1178b(String.format("Reset active tracked queries in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: j */
    public void mo1662j(C2506l c2506l, InterfaceC2594n interfaceC2594n) {
        m2004O();
        m2005N(c2506l, interfaceC2594n, true);
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: k */
    public void mo1661k(long j, Set<C2570b> set) {
        m2004O();
        long currentTimeMillis = System.currentTimeMillis();
        this.f6154a.delete("trackedKeys", "id = ?", new String[]{String.valueOf(j)});
        for (C2570b c2570b : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", c2570b.m1164e());
            this.f6154a.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f6155b.m1174f()) {
            this.f6155b.m1178b(String.format("Set %d tracked query keys for tracked query %d in %dms", Integer.valueOf(set.size()), Long.valueOf(j), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: l */
    public void mo1660l(C2441h c2441h) {
        m2004O();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(c2441h.f6400a));
        contentValues.put("path", m2014E(c2441h.f6401b.m1456e()));
        contentValues.put("queryParams", c2441h.f6401b.m1457d().m1461q());
        contentValues.put("lastUse", Long.valueOf(c2441h.f6402c));
        contentValues.put("complete", Boolean.valueOf(c2441h.f6403d));
        contentValues.put("active", Boolean.valueOf(c2441h.f6404e));
        this.f6154a.insertWithOnConflict("trackedQueries", null, contentValues, 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f6155b.m1174f()) {
            this.f6155b.m1178b(String.format("Saved new tracked query in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: m */
    public void mo1659m(C2506l c2506l, InterfaceC2594n interfaceC2594n) {
        m2004O();
        m2005N(c2506l, interfaceC2594n, false);
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: n */
    public long mo1658n() {
        Cursor rawQuery = this.f6154a.rawQuery(String.format("SELECT sum(length(%s) + length(%s)) FROM %s", "value", "path", "serverCache"), null);
        try {
            if (rawQuery.moveToFirst()) {
                return rawQuery.getLong(0);
            }
            throw new IllegalStateException("Couldn't read database result!");
        } finally {
            rawQuery.close();
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: o */
    public void mo1657o(C2506l c2506l, C2411b c2411b) {
        m2004O();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<Map.Entry<C2506l, InterfaceC2594n>> it = c2411b.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry<C2506l, InterfaceC2594n> next = it.next();
            i += m2012G("serverCache", c2506l.m1390i(next.getKey()));
            i2 += m2011H(c2506l.m1390i(next.getKey()), next.getValue());
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f6155b.m1174f()) {
            this.f6155b.m1178b(String.format("Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", Integer.valueOf(i2), Integer.valueOf(i), c2506l.toString(), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: p */
    public List<C2441h> mo1656p() {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.f6154a.query("trackedQueries", new String[]{"id", "path", "queryParams", "lastUse", "complete", "active"}, null, null, null, null, "id");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    arrayList.add(new C2441h(query.getLong(0), C2488i.m1459b(new C2506l(query.getString(1)), C2625b.m994a(query.getString(2))), query.getLong(3), query.getInt(4) != 0, query.getInt(5) != 0));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } finally {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f6155b.m1174f()) {
            this.f6155b.m1178b(String.format("Loaded %d tracked queries in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
        return arrayList;
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: q */
    public InterfaceC2594n mo1655q(C2506l c2506l) {
        return m1999z(c2506l);
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: r */
    public void mo1654r() {
        this.f6154a.setTransactionSuccessful();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: s */
    public void mo1653s(long j, Set<C2570b> set, Set<C2570b> set2) {
        m2004O();
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(j);
        Iterator<C2570b> it = set2.iterator();
        while (it.hasNext()) {
            this.f6154a.delete("trackedKeys", "id = ? AND key = ?", new String[]{valueOf, it.next().m1164e()});
        }
        for (C2570b c2570b : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", c2570b.m1164e());
            this.f6154a.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f6155b.m1174f()) {
            this.f6155b.m1178b(String.format("Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", Integer.valueOf(set.size()), Integer.valueOf(set2.size()), Long.valueOf(j), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: t */
    public Set<C2570b> mo1652t(Set<Long> set) {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.f6154a.query(true, "trackedKeys", new String[]{"key"}, "id IN (" + m2002w(set) + ")", null, null, null, null, null);
        HashSet hashSet = new HashSet();
        while (query.moveToNext()) {
            try {
                hashSet.add(C2570b.m1162g(query.getString(0)));
            } finally {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f6155b.m1174f()) {
            this.f6155b.m1178b(String.format("Loaded %d tracked queries keys for tracked queries %s in %dms", Integer.valueOf(hashSet.size()), set.toString(), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
        return hashSet;
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2436f
    /* renamed from: u */
    public void mo1651u(C2506l c2506l, C2437g c2437g) {
        int i;
        int i2;
        C2566c c2566c;
        StringBuilder sb;
        String str;
        if (c2437g.m1646e()) {
            m2004O();
            long currentTimeMillis = System.currentTimeMillis();
            Cursor m2018A = m2018A(c2506l, new String[]{"rowid", "path"});
            C2457d<Long> c2457d = new C2457d<>(null);
            C2457d<Long> c2457d2 = new C2457d<>(null);
            while (m2018A.moveToNext()) {
                long j = m2018A.getLong(0);
                C2506l c2506l2 = new C2506l(m2018A.getString(1));
                if (c2506l.m1387s(c2506l2)) {
                    C2506l m1382z = C2506l.m1382z(c2506l, c2506l2);
                    if (c2437g.m1644g(m1382z)) {
                        c2457d = c2457d.m1566B(m1382z, Long.valueOf(j));
                    } else if (c2437g.m1645f(m1382z)) {
                        c2457d2 = c2457d2.m1566B(m1382z, Long.valueOf(j));
                    } else {
                        c2566c = this.f6155b;
                        sb = new StringBuilder();
                        sb.append("We are pruning at ");
                        sb.append(c2506l);
                        sb.append(" and have data at ");
                        sb.append(c2506l2);
                        str = " that isn't marked for pruning or keeping. Ignoring.";
                    }
                } else {
                    c2566c = this.f6155b;
                    sb = new StringBuilder();
                    sb.append("We are pruning at ");
                    sb.append(c2506l);
                    sb.append(" but we have data stored higher up at ");
                    sb.append(c2506l2);
                    str = ". Ignoring.";
                }
                sb.append(str);
                c2566c.m1171i(sb.toString());
            }
            if (c2457d.isEmpty()) {
                i = 0;
                i2 = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                m2013F(c2506l, C2506l.m1385w(), c2457d, c2457d2, c2437g, arrayList);
                Collection<Long> m1563E = c2457d.m1563E();
                this.f6154a.delete("serverCache", "rowid IN (" + m2002w(m1563E) + ")", null);
                for (C2463g<C2506l, InterfaceC2594n> c2463g : arrayList) {
                    m2011H(c2506l.m1390i(c2463g.m1542a()), c2463g.m1541b());
                }
                i = m1563E.size();
                i2 = arrayList.size();
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (this.f6155b.m1174f()) {
                this.f6155b.m1178b(String.format("Pruned %d rows with %d nodes resaved in %dms", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(currentTimeMillis2)), new Object[0]);
            }
        }
    }
}
