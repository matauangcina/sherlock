package com.google.firebase.database.p124p.p127g0;

import com.google.firebase.database.p131r.C2570b;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.firebase.database.p.g0.k */
/* loaded from: classes.dex */
public class C2471k<T> {

    /* renamed from: a */
    public Map<C2570b, C2471k<T>> f6454a = new HashMap();

    /* renamed from: b */
    public T f6455b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m1525a(String str) {
        String str2 = str + "<value>: " + this.f6455b + "\n";
        if (this.f6454a.isEmpty()) {
            return str2 + str + "<empty>";
        }
        for (Map.Entry<C2570b, C2471k<T>> entry : this.f6454a.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(entry.getKey());
            sb.append(":\n");
            sb.append(entry.getValue().m1525a(str + "\t"));
            sb.append("\n");
            str2 = sb.toString();
        }
        return str2;
    }
}
