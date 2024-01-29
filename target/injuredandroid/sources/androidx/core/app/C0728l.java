package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;
/* renamed from: androidx.core.app.l */
/* loaded from: classes.dex */
public final class C0728l {
    /* renamed from: a */
    static RemoteInput m6905a(C0728l c0728l) {
        Set<String> m6902d;
        RemoteInput.Builder addExtras = new RemoteInput.Builder(c0728l.m6897i()).setLabel(c0728l.m6898h()).setChoices(c0728l.m6901e()).setAllowFreeFormInput(c0728l.m6903c()).addExtras(c0728l.m6899g());
        if (Build.VERSION.SDK_INT >= 26 && (m6902d = c0728l.m6902d()) != null) {
            for (String str : m6902d) {
                addExtras.setAllowDataType(str, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(c0728l.m6900f());
        }
        return addExtras.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static RemoteInput[] m6904b(C0728l[] c0728lArr) {
        if (c0728lArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[c0728lArr.length];
        for (int i = 0; i < c0728lArr.length; i++) {
            remoteInputArr[i] = m6905a(c0728lArr[i]);
        }
        return remoteInputArr;
    }

    /* renamed from: c */
    public abstract boolean m6903c();

    /* renamed from: d */
    public abstract Set<String> m6902d();

    /* renamed from: e */
    public abstract CharSequence[] m6901e();

    /* renamed from: f */
    public abstract int m6900f();

    /* renamed from: g */
    public abstract Bundle m6899g();

    /* renamed from: h */
    public abstract CharSequence m6898h();

    /* renamed from: i */
    public abstract String m6897i();
}
