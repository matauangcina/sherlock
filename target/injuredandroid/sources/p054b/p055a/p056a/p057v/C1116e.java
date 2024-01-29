package p054b.p055a.p056a.p057v;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p054b.p055a.p056a.C1088g;
import p054b.p055a.p056a.C1108u;
import p054b.p055a.p056a.InterfaceC1078b;
/* renamed from: b.a.a.v.e */
/* loaded from: classes.dex */
public class C1116e implements InterfaceC1078b {

    /* renamed from: a */
    private final Map<String, C1117a> f3811a;

    /* renamed from: b */
    private long f3812b;

    /* renamed from: c */
    private final File f3813c;

    /* renamed from: d */
    private final int f3814d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.a.a.v.e$a */
    /* loaded from: classes.dex */
    public static class C1117a {

        /* renamed from: a */
        long f3815a;

        /* renamed from: b */
        final String f3816b;

        /* renamed from: c */
        final String f3817c;

        /* renamed from: d */
        final long f3818d;

        /* renamed from: e */
        final long f3819e;

        /* renamed from: f */
        final long f3820f;

        /* renamed from: g */
        final long f3821g;

        /* renamed from: h */
        final List<C1088g> f3822h;

        C1117a(String str, InterfaceC1078b.C1079a c1079a) {
            this(str, c1079a.f3718b, c1079a.f3719c, c1079a.f3720d, c1079a.f3721e, c1079a.f3722f, m4889a(c1079a));
            this.f3815a = c1079a.f3717a.length;
        }

        private C1117a(String str, String str2, long j, long j2, long j3, long j4, List<C1088g> list) {
            this.f3816b = str;
            this.f3817c = "".equals(str2) ? null : str2;
            this.f3818d = j;
            this.f3819e = j2;
            this.f3820f = j3;
            this.f3821g = j4;
            this.f3822h = list;
        }

        /* renamed from: a */
        private static List<C1088g> m4889a(InterfaceC1078b.C1079a c1079a) {
            List<C1088g> list = c1079a.f3724h;
            return list != null ? list : C1121g.m4874g(c1079a.f3723g);
        }

        /* renamed from: b */
        static C1117a m4888b(C1118b c1118b) {
            if (C1116e.m4899l(c1118b) == 538247942) {
                return new C1117a(C1116e.m4897n(c1118b), C1116e.m4897n(c1118b), C1116e.m4898m(c1118b), C1116e.m4898m(c1118b), C1116e.m4898m(c1118b), C1116e.m4898m(c1118b), C1116e.m4900k(c1118b));
            }
            throw new IOException();
        }

        /* renamed from: c */
        InterfaceC1078b.C1079a m4887c(byte[] bArr) {
            InterfaceC1078b.C1079a c1079a = new InterfaceC1078b.C1079a();
            c1079a.f3717a = bArr;
            c1079a.f3718b = this.f3817c;
            c1079a.f3719c = this.f3818d;
            c1079a.f3720d = this.f3819e;
            c1079a.f3721e = this.f3820f;
            c1079a.f3722f = this.f3821g;
            c1079a.f3723g = C1121g.m4873h(this.f3822h);
            c1079a.f3724h = Collections.unmodifiableList(this.f3822h);
            return c1079a;
        }

        /* renamed from: d */
        boolean m4886d(OutputStream outputStream) {
            try {
                C1116e.m4892s(outputStream, 538247942);
                C1116e.m4890u(outputStream, this.f3816b);
                C1116e.m4890u(outputStream, this.f3817c == null ? "" : this.f3817c);
                C1116e.m4891t(outputStream, this.f3818d);
                C1116e.m4891t(outputStream, this.f3819e);
                C1116e.m4891t(outputStream, this.f3820f);
                C1116e.m4891t(outputStream, this.f3821g);
                C1116e.m4893r(this.f3822h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C1108u.m4927b("%s", e.toString());
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.a.a.v.e$b */
    /* loaded from: classes.dex */
    public static class C1118b extends FilterInputStream {

        /* renamed from: f */
        private final long f3823f;

        /* renamed from: g */
        private long f3824g;

        C1118b(InputStream inputStream, long j) {
            super(inputStream);
            this.f3823f = j;
        }

        /* renamed from: a */
        long m4885a() {
            return this.f3823f - this.f3824g;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = super.read();
            if (read != -1) {
                this.f3824g++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f3824g += read;
            }
            return read;
        }
    }

    public C1116e(File file) {
        this(file, 5242880);
    }

    public C1116e(File file, int i) {
        this.f3811a = new LinkedHashMap(16, 0.75f, true);
        this.f3812b = 0L;
        this.f3813c = file;
        this.f3814d = i;
    }

    /* renamed from: g */
    private String m4904g(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    /* renamed from: h */
    private void m4903h(int i) {
        long j;
        long j2 = i;
        if (this.f3812b + j2 < this.f3814d) {
            return;
        }
        if (C1108u.f3794b) {
            C1108u.m4924e("Pruning old cache entries.", new Object[0]);
        }
        long j3 = this.f3812b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, C1117a>> it = this.f3811a.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C1117a value = it.next().getValue();
            if (m4905f(value.f3816b).delete()) {
                j = j2;
                this.f3812b -= value.f3815a;
            } else {
                j = j2;
                String str = value.f3816b;
                C1108u.m4927b("Could not delete cache entry for key=%s, filename=%s", str, m4904g(str));
            }
            it.remove();
            i2++;
            if (((float) (this.f3812b + j)) < this.f3814d * 0.9f) {
                break;
            }
            j2 = j;
        }
        if (C1108u.f3794b) {
            C1108u.m4924e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f3812b - j3), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    /* renamed from: i */
    private void m4902i(String str, C1117a c1117a) {
        if (this.f3811a.containsKey(str)) {
            this.f3812b += c1117a.f3815a - this.f3811a.get(str).f3815a;
        } else {
            this.f3812b += c1117a.f3815a;
        }
        this.f3811a.put(str, c1117a);
    }

    /* renamed from: j */
    private static int m4901j(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: k */
    static List<C1088g> m4900k(C1118b c1118b) {
        int m4899l = m4899l(c1118b);
        if (m4899l < 0) {
            throw new IOException("readHeaderList size=" + m4899l);
        }
        List<C1088g> emptyList = m4899l == 0 ? Collections.emptyList() : new ArrayList<>();
        for (int i = 0; i < m4899l; i++) {
            emptyList.add(new C1088g(m4897n(c1118b).intern(), m4897n(c1118b).intern()));
        }
        return emptyList;
    }

    /* renamed from: l */
    static int m4899l(InputStream inputStream) {
        return (m4901j(inputStream) << 24) | (m4901j(inputStream) << 0) | 0 | (m4901j(inputStream) << 8) | (m4901j(inputStream) << 16);
    }

    /* renamed from: m */
    static long m4898m(InputStream inputStream) {
        return ((m4901j(inputStream) & 255) << 0) | 0 | ((m4901j(inputStream) & 255) << 8) | ((m4901j(inputStream) & 255) << 16) | ((m4901j(inputStream) & 255) << 24) | ((m4901j(inputStream) & 255) << 32) | ((m4901j(inputStream) & 255) << 40) | ((m4901j(inputStream) & 255) << 48) | ((255 & m4901j(inputStream)) << 56);
    }

    /* renamed from: n */
    static String m4897n(C1118b c1118b) {
        return new String(m4894q(c1118b, m4898m(c1118b)), "UTF-8");
    }

    /* renamed from: p */
    private void m4895p(String str) {
        C1117a remove = this.f3811a.remove(str);
        if (remove != null) {
            this.f3812b -= remove.f3815a;
        }
    }

    /* renamed from: q */
    static byte[] m4894q(C1118b c1118b, long j) {
        long m4885a = c1118b.m4885a();
        if (j >= 0 && j <= m4885a) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(c1118b).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + m4885a);
    }

    /* renamed from: r */
    static void m4893r(List<C1088g> list, OutputStream outputStream) {
        if (list == null) {
            m4892s(outputStream, 0);
            return;
        }
        m4892s(outputStream, list.size());
        for (C1088g c1088g : list) {
            m4890u(outputStream, c1088g.m4992a());
            m4890u(outputStream, c1088g.m4991b());
        }
    }

    /* renamed from: s */
    static void m4892s(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: t */
    static void m4891t(OutputStream outputStream, long j) {
        outputStream.write((byte) (j >>> 0));
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    /* renamed from: u */
    static void m4890u(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m4891t(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // p054b.p055a.p056a.InterfaceC1078b
    /* renamed from: a */
    public synchronized void mo4910a() {
        long length;
        C1118b c1118b;
        if (!this.f3813c.exists()) {
            if (!this.f3813c.mkdirs()) {
                C1108u.m4926c("Unable to create cache dir %s", this.f3813c.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = this.f3813c.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                length = file.length();
                c1118b = new C1118b(new BufferedInputStream(m4907d(file)), length);
            } catch (IOException unused) {
                file.delete();
            }
            try {
                C1117a m4888b = C1117a.m4888b(c1118b);
                m4888b.f3815a = length;
                m4902i(m4888b.f3816b, m4888b);
                c1118b.close();
            } catch (Throwable th) {
                c1118b.close();
                throw th;
                break;
            }
        }
    }

    @Override // p054b.p055a.p056a.InterfaceC1078b
    /* renamed from: b */
    public synchronized void mo4909b(String str, InterfaceC1078b.C1079a c1079a) {
        m4903h(c1079a.f3717a.length);
        File m4905f = m4905f(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(m4906e(m4905f));
            C1117a c1117a = new C1117a(str, c1079a);
            if (!c1117a.m4886d(bufferedOutputStream)) {
                bufferedOutputStream.close();
                C1108u.m4927b("Failed to write header for %s", m4905f.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(c1079a.f3717a);
            bufferedOutputStream.close();
            m4902i(str, c1117a);
        } catch (IOException unused) {
            if (m4905f.delete()) {
                return;
            }
            C1108u.m4927b("Could not clean up file %s", m4905f.getAbsolutePath());
        }
    }

    @Override // p054b.p055a.p056a.InterfaceC1078b
    /* renamed from: c */
    public synchronized InterfaceC1078b.C1079a mo4908c(String str) {
        C1117a c1117a = this.f3811a.get(str);
        if (c1117a == null) {
            return null;
        }
        File m4905f = m4905f(str);
        try {
            C1118b c1118b = new C1118b(new BufferedInputStream(m4907d(m4905f)), m4905f.length());
            try {
                C1117a m4888b = C1117a.m4888b(c1118b);
                if (TextUtils.equals(str, m4888b.f3816b)) {
                    return c1117a.m4887c(m4894q(c1118b, c1118b.m4885a()));
                }
                C1108u.m4927b("%s: key=%s, found=%s", m4905f.getAbsolutePath(), str, m4888b.f3816b);
                m4895p(str);
                return null;
            } finally {
                c1118b.close();
            }
        } catch (IOException e) {
            C1108u.m4927b("%s: %s", m4905f.getAbsolutePath(), e.toString());
            m4896o(str);
            return null;
        }
    }

    /* renamed from: d */
    InputStream m4907d(File file) {
        return new FileInputStream(file);
    }

    /* renamed from: e */
    OutputStream m4906e(File file) {
        return new FileOutputStream(file);
    }

    /* renamed from: f */
    public File m4905f(String str) {
        return new File(this.f3813c, m4904g(str));
    }

    /* renamed from: o */
    public synchronized void m4896o(String str) {
        boolean delete = m4905f(str).delete();
        m4895p(str);
        if (!delete) {
            C1108u.m4927b("Could not delete cache entry for key=%s, filename=%s", str, m4904g(str));
        }
    }
}
