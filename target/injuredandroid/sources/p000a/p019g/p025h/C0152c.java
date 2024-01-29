package p000a.p019g.p025h;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.core.content.p052d.C0744c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p000a.p019g.p025h.C0161f;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.g.h.c */
/* loaded from: classes.dex */
public class C0152c {

    /* renamed from: a */
    private static final Comparator<byte[]> f561a = new C0153a();

    /* renamed from: a.g.h.c$a */
    /* loaded from: classes.dex */
    class C0153a implements Comparator<byte[]> {
        C0153a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length == bArr2.length) {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i = bArr[i3];
                        i2 = bArr2[i3];
                    }
                }
                return 0;
            }
            i = bArr.length;
            i2 = bArr2.length;
            return i - i2;
        }
    }

    /* renamed from: a */
    private static List<byte[]> m8958a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m8957b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static List<List<byte[]>> m8956c(C0154d c0154d, Resources resources) {
        return c0154d.m8950b() != null ? c0154d.m8950b() : C0744c.m6828c(resources, c0154d.m8949c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C0161f.C0162a m8955d(Context context, C0154d c0154d, CancellationSignal cancellationSignal) {
        ProviderInfo m8954e = m8954e(context.getPackageManager(), c0154d, context.getResources());
        return m8954e == null ? C0161f.C0162a.m8933a(1, null) : C0161f.C0162a.m8933a(0, m8953f(context, c0154d, m8954e.authority, cancellationSignal));
    }

    /* renamed from: e */
    static ProviderInfo m8954e(PackageManager packageManager, C0154d c0154d, Resources resources) {
        String m8947e = c0154d.m8947e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m8947e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + m8947e);
        } else if (!resolveContentProvider.packageName.equals(c0154d.m8946f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + m8947e + ", but package was not " + c0154d.m8946f());
        } else {
            List<byte[]> m8958a = m8958a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(m8958a, f561a);
            List<List<byte[]>> m8956c = m8956c(c0154d, resources);
            for (int i = 0; i < m8956c.size(); i++) {
                ArrayList arrayList = new ArrayList(m8956c.get(i));
                Collections.sort(arrayList, f561a);
                if (m8957b(m8958a, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
    }

    /* renamed from: f */
    static C0161f.C0163b[] m8953f(Context context, C0154d c0154d, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            cursor = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, strArr, "query = ?", new String[]{c0154d.m8945g()}, null, cancellationSignal) : context.getContentResolver().query(build, strArr, "query = ?", new String[]{c0154d.m8945g()}, null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    arrayList2.add(C0161f.C0163b.m8930a(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (C0161f.C0163b[]) arrayList.toArray(new C0161f.C0163b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
