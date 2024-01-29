package b3nac.injuredandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC0453c;
import com.google.firebase.auth.FirebaseAuth;
import p054b.p059c.p060a.p061a.p074f.AbstractC1288g;
import p054b.p059c.p060a.p061a.p074f.InterfaceC1284c;
import p135d.p142s.p144d.C2725g;
/* loaded from: classes.dex */
public final class QXV0aA extends ActivityC0453c {

    /* renamed from: w */
    private FirebaseAuth f4501w;

    /* renamed from: b3nac.injuredandroid.QXV0aA$a */
    /* loaded from: classes.dex */
    static final class C1478a<TResult> implements InterfaceC1284c<Object> {
        C1478a() {
        }

        @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1284c
        /* renamed from: a */
        public final void mo3802a(AbstractC1288g<Object> abstractC1288g) {
            QXV0aA qXV0aA;
            String str;
            C2725g.m881e(abstractC1288g, "task");
            if (abstractC1288g.mo4578l()) {
                qXV0aA = QXV0aA.this;
                str = "Authentication succeeded.";
            } else {
                qXV0aA = QXV0aA.this;
                str = "Authentication failed.";
            }
            Toast.makeText(qXV0aA, str, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_qxv0a);
    }

    public final void signInAnonymously(View view) {
        C2725g.m881e(view, "view");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        this.f4501w = firebaseAuth;
        C2725g.m883c(firebaseAuth);
        firebaseAuth.m2422d().mo4588b(this, new C1478a());
    }
}
