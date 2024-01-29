package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p000a.p001a.C0000a;
/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public class DialogInterfaceC0451b extends DialogC0476g implements DialogInterface {

    /* renamed from: h */
    final AlertController f1289h;

    /* renamed from: androidx.appcompat.app.b$a */
    /* loaded from: classes.dex */
    public static class C0452a {

        /* renamed from: a */
        private final AlertController.C0438f f1290a;

        /* renamed from: b */
        private final int f1291b;

        public C0452a(Context context) {
            this(context, DialogInterfaceC0451b.m8089i(context, 0));
        }

        public C0452a(Context context, int i) {
            this.f1290a = new AlertController.C0438f(new ContextThemeWrapper(context, DialogInterfaceC0451b.m8089i(context, i)));
            this.f1291b = i;
        }

        /* renamed from: a */
        public DialogInterfaceC0451b m8088a() {
            DialogInterfaceC0451b dialogInterfaceC0451b = new DialogInterfaceC0451b(this.f1290a.f1245a, this.f1291b);
            this.f1290a.m8100a(dialogInterfaceC0451b.f1289h);
            dialogInterfaceC0451b.setCancelable(this.f1290a.f1262r);
            if (this.f1290a.f1262r) {
                dialogInterfaceC0451b.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0451b.setOnCancelListener(this.f1290a.f1263s);
            dialogInterfaceC0451b.setOnDismissListener(this.f1290a.f1264t);
            DialogInterface.OnKeyListener onKeyListener = this.f1290a.f1265u;
            if (onKeyListener != null) {
                dialogInterfaceC0451b.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0451b;
        }

        /* renamed from: b */
        public Context m8087b() {
            return this.f1290a.f1245a;
        }

        /* renamed from: c */
        public C0452a m8086c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0438f c0438f = this.f1290a;
            c0438f.f1267w = listAdapter;
            c0438f.f1268x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0452a m8085d(View view) {
            this.f1290a.f1251g = view;
            return this;
        }

        /* renamed from: e */
        public C0452a m8084e(Drawable drawable) {
            this.f1290a.f1248d = drawable;
            return this;
        }

        /* renamed from: f */
        public C0452a m8083f(DialogInterface.OnKeyListener onKeyListener) {
            this.f1290a.f1265u = onKeyListener;
            return this;
        }

        /* renamed from: g */
        public C0452a m8082g(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0438f c0438f = this.f1290a;
            c0438f.f1267w = listAdapter;
            c0438f.f1268x = onClickListener;
            c0438f.f1238I = i;
            c0438f.f1237H = true;
            return this;
        }

        /* renamed from: h */
        public C0452a m8081h(CharSequence charSequence) {
            this.f1290a.f1250f = charSequence;
            return this;
        }
    }

    protected DialogInterfaceC0451b(Context context, int i) {
        super(context, m8089i(context, i));
        this.f1289h = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: i */
    static int m8089i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0000a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: h */
    public ListView m8090h() {
        return this.f1289h.m8124d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.DialogC0476g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1289h.m8123e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f1289h.m8121g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f1289h.m8120h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.DialogC0476g, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1289h.m8111q(charSequence);
    }
}
