package io.flutter.plugin.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.InterfaceC0432c;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.embedding.engine.p159i.C2881h;
import java.io.FileNotFoundException;
import java.util.List;
import p108c.p109a.C1499b;
/* renamed from: io.flutter.plugin.platform.d */
/* loaded from: classes.dex */
public class C2949d {

    /* renamed from: a */
    private final Activity f7362a;

    /* renamed from: b */
    private final C2881h f7363b;

    /* renamed from: c */
    private final InterfaceC2952c f7364c;

    /* renamed from: d */
    private C2881h.C2891j f7365d;

    /* renamed from: e */
    private int f7366e;

    /* renamed from: f */
    final C2881h.InterfaceC2889h f7367f;

    /* renamed from: io.flutter.plugin.platform.d$a */
    /* loaded from: classes.dex */
    class C2950a implements C2881h.InterfaceC2889h {
        C2950a() {
        }

        @Override // io.flutter.embedding.engine.p159i.C2881h.InterfaceC2889h
        /* renamed from: b */
        public void mo256b() {
            C2949d.this.m265m();
        }

        @Override // io.flutter.embedding.engine.p159i.C2881h.InterfaceC2889h
        /* renamed from: c */
        public void mo255c(C2881h.EnumC2890i enumC2890i) {
            C2949d.this.m266l(enumC2890i);
        }

        @Override // io.flutter.embedding.engine.p159i.C2881h.InterfaceC2889h
        /* renamed from: d */
        public void mo254d(List<C2881h.EnumC2892k> list) {
            C2949d.this.m261q(list);
        }

        @Override // io.flutter.embedding.engine.p159i.C2881h.InterfaceC2889h
        /* renamed from: e */
        public void mo253e() {
            C2949d.this.m264n();
        }

        @Override // io.flutter.embedding.engine.p159i.C2881h.InterfaceC2889h
        /* renamed from: f */
        public void mo252f(String str) {
            C2949d.this.m263o(str);
        }

        @Override // io.flutter.embedding.engine.p159i.C2881h.InterfaceC2889h
        /* renamed from: g */
        public void mo251g(C2881h.C2891j c2891j) {
            C2949d.this.m259s(c2891j);
        }

        @Override // io.flutter.embedding.engine.p159i.C2881h.InterfaceC2889h
        /* renamed from: h */
        public void mo250h(int i) {
            C2949d.this.m260r(i);
        }

        @Override // io.flutter.embedding.engine.p159i.C2881h.InterfaceC2889h
        /* renamed from: i */
        public void mo249i(C2881h.C2884c c2884c) {
            C2949d.this.m262p(c2884c);
        }

        @Override // io.flutter.embedding.engine.p159i.C2881h.InterfaceC2889h
        /* renamed from: j */
        public void mo248j(C2881h.EnumC2888g enumC2888g) {
            C2949d.this.m257u(enumC2888g);
        }

        @Override // io.flutter.embedding.engine.p159i.C2881h.InterfaceC2889h
        /* renamed from: k */
        public boolean mo247k() {
            CharSequence m267k = C2949d.this.m267k(C2881h.EnumC2886e.PLAIN_TEXT);
            return m267k != null && m267k.length() > 0;
        }

        @Override // io.flutter.embedding.engine.p159i.C2881h.InterfaceC2889h
        /* renamed from: l */
        public CharSequence mo246l(C2881h.EnumC2886e enumC2886e) {
            return C2949d.this.m267k(enumC2886e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugin.platform.d$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2951b {

        /* renamed from: a */
        static final /* synthetic */ int[] f7369a;

        /* renamed from: b */
        static final /* synthetic */ int[] f7370b;

        /* renamed from: c */
        static final /* synthetic */ int[] f7371c;

        static {
            int[] iArr = new int[C2881h.EnumC2885d.values().length];
            f7371c = iArr;
            try {
                iArr[C2881h.EnumC2885d.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7371c[C2881h.EnumC2885d.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[C2881h.EnumC2892k.values().length];
            f7370b = iArr2;
            try {
                iArr2[C2881h.EnumC2892k.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7370b[C2881h.EnumC2892k.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[C2881h.EnumC2888g.values().length];
            f7369a = iArr3;
            try {
                iArr3[C2881h.EnumC2888g.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7369a[C2881h.EnumC2888g.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7369a[C2881h.EnumC2888g.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7369a[C2881h.EnumC2888g.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7369a[C2881h.EnumC2888g.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: io.flutter.plugin.platform.d$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2952c {
        /* renamed from: b */
        boolean mo245b();
    }

    public C2949d(Activity activity, C2881h c2881h, InterfaceC2952c interfaceC2952c) {
        C2950a c2950a = new C2950a();
        this.f7367f = c2950a;
        this.f7362a = activity;
        this.f7363b = c2881h;
        c2881h.m449j(c2950a);
        this.f7364c = interfaceC2952c;
        this.f7366e = 1280;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public CharSequence m267k(C2881h.EnumC2886e enumC2886e) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f7362a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip()) {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (enumC2886e != null && enumC2886e != C2881h.EnumC2886e.PLAIN_TEXT) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                if (itemAt.getUri() != null) {
                    this.f7362a.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", null);
                }
                return itemAt.coerceToText(this.f7362a);
            } catch (FileNotFoundException unused) {
                return null;
            } catch (SecurityException e) {
                C1499b.m4048f("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m266l(C2881h.EnumC2890i enumC2890i) {
        if (enumC2890i == C2881h.EnumC2890i.CLICK) {
            this.f7362a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m265m() {
        InterfaceC2952c interfaceC2952c = this.f7364c;
        if (interfaceC2952c == null || !interfaceC2952c.mo245b()) {
            Activity activity = this.f7362a;
            if (activity instanceof InterfaceC0432c) {
                ((InterfaceC0432c) activity).mo6484i().m8133c();
            } else {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m264n() {
        m258t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m263o(String str) {
        ((ClipboardManager) this.f7362a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m262p(C2881h.C2884c c2884c) {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            return;
        }
        if (i < 28 && i > 21) {
            this.f7362a.setTaskDescription(new ActivityManager.TaskDescription(c2884c.f7126b, (Bitmap) null, c2884c.f7125a));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7362a.setTaskDescription(new ActivityManager.TaskDescription(c2884c.f7126b, 0, c2884c.f7125a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m261q(List<C2881h.EnumC2892k> list) {
        int i = (list.size() != 0 || Build.VERSION.SDK_INT < 19) ? 1798 : 5894;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = C2951b.f7370b[list.get(i2).ordinal()];
            if (i3 == 1) {
                i &= -5;
            } else if (i3 == 2) {
                i = i & (-513) & (-3);
            }
        }
        this.f7366e = i;
        m258t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m260r(int i) {
        this.f7362a.setRequestedOrientation(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m259s(C2881h.C2891j c2891j) {
        Window window = this.f7362a.getWindow();
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (Build.VERSION.SDK_INT >= 26) {
            C2881h.EnumC2885d enumC2885d = c2891j.f7154d;
            if (enumC2885d != null) {
                int i = C2951b.f7371c[enumC2885d.ordinal()];
                if (i == 1) {
                    systemUiVisibility |= 16;
                } else if (i == 2) {
                    systemUiVisibility &= -17;
                }
            }
            Integer num = c2891j.f7153c;
            if (num != null) {
                window.setNavigationBarColor(num.intValue());
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            C2881h.EnumC2885d enumC2885d2 = c2891j.f7152b;
            if (enumC2885d2 != null) {
                int i2 = C2951b.f7371c[enumC2885d2.ordinal()];
                if (i2 == 1) {
                    systemUiVisibility |= 8192;
                } else if (i2 == 2) {
                    systemUiVisibility &= -8193;
                }
            }
            Integer num2 = c2891j.f7151a;
            if (num2 != null) {
                window.setStatusBarColor(num2.intValue());
            }
        }
        if (c2891j.f7155e != null && Build.VERSION.SDK_INT >= 28) {
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            window.clearFlags(134217728);
            window.setNavigationBarDividerColor(c2891j.f7155e.intValue());
        }
        decorView.setSystemUiVisibility(systemUiVisibility);
        this.f7365d = c2891j;
    }

    /* renamed from: j */
    public void m268j() {
        this.f7363b.m449j(null);
    }

    /* renamed from: t */
    public void m258t() {
        this.f7362a.getWindow().getDecorView().setSystemUiVisibility(this.f7366e);
        C2881h.C2891j c2891j = this.f7365d;
        if (c2891j != null) {
            m259s(c2891j);
        }
    }

    /* renamed from: u */
    void m257u(C2881h.EnumC2888g enumC2888g) {
        int i;
        View decorView = this.f7362a.getWindow().getDecorView();
        int i2 = C2951b.f7369a[enumC2888g.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = 4;
                    if (i2 != 4) {
                        if (i2 != 5 || Build.VERSION.SDK_INT < 21) {
                            return;
                        }
                    } else if (Build.VERSION.SDK_INT < 23) {
                        return;
                    } else {
                        i = 6;
                    }
                }
            }
            decorView.performHapticFeedback(i3);
            return;
        }
        i = 0;
        decorView.performHapticFeedback(i);
    }
}
