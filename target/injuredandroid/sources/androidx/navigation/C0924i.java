package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
/* renamed from: androidx.navigation.i */
/* loaded from: classes.dex */
public class C0924i {

    /* renamed from: a */
    private final Uri f3233a;

    /* renamed from: b */
    private final String f3234b;

    /* renamed from: c */
    private final String f3235c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0924i(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }

    C0924i(Uri uri, String str, String str2) {
        this.f3233a = uri;
        this.f3234b = str;
        this.f3235c = str2;
    }

    /* renamed from: a */
    public String m5969a() {
        return this.f3234b;
    }

    /* renamed from: b */
    public String m5968b() {
        return this.f3235c;
    }

    /* renamed from: c */
    public Uri m5967c() {
        return this.f3233a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (this.f3233a != null) {
            sb.append(" uri=");
            sb.append(this.f3233a.toString());
        }
        if (this.f3234b != null) {
            sb.append(" action=");
            sb.append(this.f3234b);
        }
        if (this.f3235c != null) {
            sb.append(" mimetype=");
            sb.append(this.f3235c);
        }
        sb.append(" }");
        return sb.toString();
    }
}
