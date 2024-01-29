package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.C0925j;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* renamed from: androidx.navigation.r */
/* loaded from: classes.dex */
public abstract class AbstractC0952r<D extends C0925j> {

    /* renamed from: androidx.navigation.r$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0953a {
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.navigation.r$b */
    /* loaded from: classes.dex */
    public @interface InterfaceC0954b {
        String value();
    }

    /* renamed from: a */
    public abstract D mo5855a();

    /* renamed from: b */
    public abstract C0925j mo5854b(D d, Bundle bundle, C0932o c0932o, InterfaceC0953a interfaceC0953a);

    /* renamed from: c */
    public void mo5853c(Bundle bundle) {
    }

    /* renamed from: d */
    public Bundle mo5852d() {
        return null;
    }

    /* renamed from: e */
    public abstract boolean mo5851e();
}
