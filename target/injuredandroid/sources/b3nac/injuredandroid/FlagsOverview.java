package b3nac.injuredandroid;

import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.ActivityC0453c;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import p000a.p045o.p046a.C0327c;
import p000a.p045o.p046a.SharedPreferencesC0317a;
import p135d.p142s.p144d.C2725g;
/* loaded from: classes.dex */
public final class FlagsOverview extends ActivityC0453c {

    /* renamed from: G */
    public static boolean f4479G;

    /* renamed from: H */
    public static boolean f4480H;

    /* renamed from: I */
    public static boolean f4481I;

    /* renamed from: J */
    public static boolean f4482J;

    /* renamed from: K */
    public static boolean f4483K;

    /* renamed from: L */
    public static boolean f4484L;

    /* renamed from: M */
    public static boolean f4485M;

    /* renamed from: N */
    public static boolean f4486N;

    /* renamed from: O */
    public static boolean f4487O;

    /* renamed from: P */
    public static boolean f4488P;

    /* renamed from: A */
    private boolean f4489A;

    /* renamed from: B */
    private boolean f4490B;

    /* renamed from: C */
    private boolean f4491C;

    /* renamed from: D */
    private boolean f4492D;

    /* renamed from: E */
    private boolean f4493E;

    /* renamed from: F */
    private boolean f4494F;

    /* renamed from: w */
    private final String f4495w = "b3nac.injuredandroid.encrypted";

    /* renamed from: x */
    public SharedPreferences f4496x;

    /* renamed from: y */
    private boolean f4497y;

    /* renamed from: z */
    private boolean f4498z;

    /* renamed from: b3nac.injuredandroid.FlagsOverview$a */
    /* loaded from: classes.dex */
    static final class View$OnClickListenerC1477a implements View.OnClickListener {

        /* renamed from: f */
        public static final View$OnClickListenerC1477a f4499f = new View$OnClickListenerC1477a();

        View$OnClickListenerC1477a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Snackbar m2647X = Snackbar.m2647X(view, "If the flag button is green you have captured that flag!", 0);
            m2647X.m2646Y("Action", null);
            m2647X.mo2650N();
        }
    }

    /* renamed from: F */
    private final void m4089F() {
        String m8379c = C0327c.m8379c(C0327c.f881a);
        C2725g.m882d(m8379c, "MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)");
        SharedPreferences m8399b = SharedPreferencesC0317a.m8399b(this.f4495w, m8379c, getApplicationContext(), SharedPreferencesC0317a.EnumC0321d.AES256_SIV, SharedPreferencesC0317a.EnumC0322e.AES256_GCM);
        C2725g.m882d(m8399b, "EncryptedSharedPreferenc…heme.AES256_GCM\n        )");
        this.f4496x = m8399b;
    }

    /* renamed from: G */
    public final void m4088G(boolean z) {
        this.f4494F = z;
    }

    /* renamed from: H */
    public final void m4087H(boolean z) {
        this.f4491C = z;
    }

    /* renamed from: I */
    public final void m4086I(boolean z) {
        this.f4490B = z;
    }

    /* renamed from: J */
    public final void m4085J(boolean z) {
        this.f4497y = z;
    }

    /* renamed from: K */
    public final void m4084K(boolean z) {
        this.f4493E = z;
    }

    /* renamed from: L */
    public final void m4083L(boolean z) {
        this.f4489A = z;
    }

    /* renamed from: M */
    public final void m4082M(boolean z) {
        this.f4498z = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        Button button;
        boolean z;
        m4089F();
        super.onCreate(bundle);
        setContentView(R.layout.activity_flags_overview);
        m8078C((Toolbar) findViewById(R.id.toolbar));
        SharedPreferences sharedPreferences = getSharedPreferences("b3nac.injuredandroid", 0);
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(View$OnClickListenerC1477a.f4499f);
        View findViewById = findViewById(R.id.button10);
        C2725g.m882d(findViewById, "findViewById(R.id.button10)");
        Button button2 = (Button) findViewById;
        View findViewById2 = findViewById(R.id.button12);
        C2725g.m882d(findViewById2, "findViewById(R.id.button12)");
        Button button3 = (Button) findViewById2;
        View findViewById3 = findViewById(R.id.button13);
        C2725g.m882d(findViewById3, "findViewById(R.id.button13)");
        Button button4 = (Button) findViewById3;
        View findViewById4 = findViewById(R.id.button14);
        C2725g.m882d(findViewById4, "findViewById(R.id.button14)");
        Button button5 = (Button) findViewById4;
        View findViewById5 = findViewById(R.id.button15);
        C2725g.m882d(findViewById5, "findViewById(R.id.button15)");
        Button button6 = (Button) findViewById5;
        View findViewById6 = findViewById(R.id.button16);
        C2725g.m882d(findViewById6, "findViewById(R.id.button16)");
        Button button7 = (Button) findViewById6;
        View findViewById7 = findViewById(R.id.button17);
        C2725g.m882d(findViewById7, "findViewById(R.id.button17)");
        Button button8 = (Button) findViewById7;
        View findViewById8 = findViewById(R.id.button18);
        C2725g.m882d(findViewById8, "findViewById(R.id.button18)");
        Button button9 = (Button) findViewById8;
        View findViewById9 = findViewById(R.id.button19);
        C2725g.m882d(findViewById9, "findViewById(R.id.button19)");
        Button button10 = (Button) findViewById9;
        View findViewById10 = findViewById(R.id.button20);
        C2725g.m882d(findViewById10, "findViewById(R.id.button20)");
        Button button11 = (Button) findViewById10;
        View findViewById11 = findViewById(R.id.button21);
        C2725g.m882d(findViewById11, "findViewById(R.id.button21)");
        Button button12 = (Button) findViewById11;
        View findViewById12 = findViewById(R.id.button22);
        C2725g.m882d(findViewById12, "findViewById(R.id.button22)");
        Button button13 = (Button) findViewById12;
        View findViewById13 = findViewById(R.id.button37);
        C2725g.m882d(findViewById13, "findViewById(R.id.button37)");
        Button button14 = (Button) findViewById13;
        View findViewById14 = findViewById(R.id.button38);
        C2725g.m882d(findViewById14, "findViewById(R.id.button38)");
        Button button15 = (Button) findViewById14;
        View findViewById15 = findViewById(R.id.button41);
        C2725g.m882d(findViewById15, "findViewById(R.id.button41)");
        Button button16 = (Button) findViewById15;
        View findViewById16 = findViewById(R.id.button43);
        C2725g.m882d(findViewById16, "findViewById(R.id.button43)");
        Button button17 = (Button) findViewById16;
        View findViewById17 = findViewById(R.id.button46);
        C2725g.m882d(findViewById17, "findViewById(R.id.button46)");
        Button button18 = (Button) findViewById17;
        View findViewById18 = findViewById(R.id.button47);
        C2725g.m882d(findViewById18, "findViewById(R.id.button47)");
        Button button19 = (Button) findViewById18;
        SharedPreferences sharedPreferences2 = this.f4496x;
        if (sharedPreferences2 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences2.getBoolean("flagOneButtonColor", false)) {
            SharedPreferences sharedPreferences3 = this.f4496x;
            if (sharedPreferences3 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            }
            this.f4497y = sharedPreferences3.getBoolean("flagOneButtonColor", true);
            button = button13;
            button2.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
        } else {
            button = button13;
        }
        SharedPreferences sharedPreferences4 = this.f4496x;
        if (sharedPreferences4 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences4.getBoolean("flagOneButtonColor", true)) {
            SharedPreferences sharedPreferences5 = this.f4496x;
            if (sharedPreferences5 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                this.f4497y = sharedPreferences5.getBoolean("flagOneButtonColor", false);
                button2.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!this.f4497y) {
            button2.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences6 = this.f4496x;
        if (sharedPreferences6 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences6.getBoolean("flagTwoButtonColor", false)) {
            SharedPreferences sharedPreferences7 = this.f4496x;
            if (sharedPreferences7 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                this.f4498z = sharedPreferences7.getBoolean("flagTwoButtonColor", true);
                button3.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences8 = this.f4496x;
        if (sharedPreferences8 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences8.getBoolean("flagTwoButtonColor", true)) {
            SharedPreferences sharedPreferences9 = this.f4496x;
            if (sharedPreferences9 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                this.f4498z = sharedPreferences9.getBoolean("flagTwoButtonColor", false);
                button3.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!this.f4498z) {
            button3.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences10 = this.f4496x;
        if (sharedPreferences10 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences10.getBoolean("flagThreeButtonColor", false)) {
            SharedPreferences sharedPreferences11 = this.f4496x;
            if (sharedPreferences11 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                this.f4489A = sharedPreferences11.getBoolean("flagThreeButtonColor", true);
                button4.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences12 = this.f4496x;
        if (sharedPreferences12 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences12.getBoolean("flagThreeButtonColor", true)) {
            SharedPreferences sharedPreferences13 = this.f4496x;
            if (sharedPreferences13 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                this.f4489A = sharedPreferences13.getBoolean("flagThreeButtonColor", false);
                button4.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!this.f4489A) {
            button4.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences14 = this.f4496x;
        if (sharedPreferences14 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences14.getBoolean("flagFourButtonColor", false)) {
            SharedPreferences sharedPreferences15 = this.f4496x;
            if (sharedPreferences15 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                this.f4490B = sharedPreferences15.getBoolean("flagFourButtonColor", true);
                button5.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences16 = this.f4496x;
        if (sharedPreferences16 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences16.getBoolean("flagFourButtonColor", true)) {
            SharedPreferences sharedPreferences17 = this.f4496x;
            if (sharedPreferences17 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                this.f4490B = sharedPreferences17.getBoolean("flagFourButtonColor", false);
                button5.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!this.f4490B) {
            button5.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences18 = this.f4496x;
        if (sharedPreferences18 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences18.getBoolean("flagFiveButtonColor", false)) {
            SharedPreferences sharedPreferences19 = this.f4496x;
            if (sharedPreferences19 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                this.f4491C = sharedPreferences19.getBoolean("flagFiveButtonColor", true);
                button6.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences20 = this.f4496x;
        if (sharedPreferences20 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences20.getBoolean("flagFiveButtonColor", true)) {
            SharedPreferences sharedPreferences21 = this.f4496x;
            if (sharedPreferences21 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                this.f4491C = sharedPreferences21.getBoolean("flagFiveButtonColor", false);
                button6.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!this.f4491C) {
            button6.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences22 = this.f4496x;
        if (sharedPreferences22 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences22.getBoolean("flagSixButtonColor", false)) {
            SharedPreferences sharedPreferences23 = this.f4496x;
            if (sharedPreferences23 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4479G = sharedPreferences23.getBoolean("flagSixButtonColor", true);
                button7.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences24 = this.f4496x;
        if (sharedPreferences24 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences24.getBoolean("flagSixButtonColor", true)) {
            SharedPreferences sharedPreferences25 = this.f4496x;
            if (sharedPreferences25 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4479G = sharedPreferences25.getBoolean("flagSixButtonColor", false);
                button7.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!f4479G) {
            button7.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences26 = this.f4496x;
        if (sharedPreferences26 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences26.getBoolean("flagSevenButtonColor", false)) {
            SharedPreferences sharedPreferences27 = this.f4496x;
            if (sharedPreferences27 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4480H = sharedPreferences27.getBoolean("flagSevenButtonColor", true);
                button8.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences28 = this.f4496x;
        if (sharedPreferences28 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences28.getBoolean("flagSevenButtonColor", true)) {
            SharedPreferences sharedPreferences29 = this.f4496x;
            if (sharedPreferences29 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4480H = sharedPreferences29.getBoolean("flagSevenButtonColor", false);
                button8.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!f4480H) {
            button8.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences30 = this.f4496x;
        if (sharedPreferences30 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences30.getBoolean("flagEightButtonColor", false)) {
            SharedPreferences sharedPreferences31 = this.f4496x;
            if (sharedPreferences31 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4481I = sharedPreferences31.getBoolean("flagEightButtonColor", true);
                button9.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences32 = this.f4496x;
        if (sharedPreferences32 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences32.getBoolean("flagEightButtonColor", true)) {
            SharedPreferences sharedPreferences33 = this.f4496x;
            if (sharedPreferences33 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4481I = sharedPreferences33.getBoolean("flagEightButtonColor", false);
                button9.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!f4481I) {
            button9.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences34 = this.f4496x;
        if (sharedPreferences34 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences34.getBoolean("flagNineButtonColor", false)) {
            SharedPreferences sharedPreferences35 = this.f4496x;
            if (sharedPreferences35 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                this.f4492D = sharedPreferences35.getBoolean("flagNineButtonColor", true);
                button10.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences36 = this.f4496x;
        if (sharedPreferences36 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences36.getBoolean("flagNineButtonColor", true)) {
            SharedPreferences sharedPreferences37 = this.f4496x;
            if (sharedPreferences37 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                this.f4492D = sharedPreferences37.getBoolean("flagNineButtonColor", false);
                button10.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!this.f4492D) {
            button10.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences38 = this.f4496x;
        if (sharedPreferences38 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences38.getBoolean("flagTenButtonColor", false)) {
            SharedPreferences sharedPreferences39 = this.f4496x;
            if (sharedPreferences39 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                this.f4493E = sharedPreferences39.getBoolean("flagTenButtonColor", true);
                button11.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences40 = this.f4496x;
        if (sharedPreferences40 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences40.getBoolean("flagTenButtonColor", true)) {
            SharedPreferences sharedPreferences41 = this.f4496x;
            if (sharedPreferences41 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                this.f4493E = sharedPreferences41.getBoolean("flagTenButtonColor", false);
                button11.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!this.f4493E) {
            button11.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences42 = this.f4496x;
        if (sharedPreferences42 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences42.getBoolean("flagElevenButtonColor", false)) {
            SharedPreferences sharedPreferences43 = this.f4496x;
            if (sharedPreferences43 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                this.f4494F = sharedPreferences43.getBoolean("flagElevenButtonColor", true);
                button12.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences44 = this.f4496x;
        if (sharedPreferences44 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences44.getBoolean("flagElevenButtonColor", true)) {
            SharedPreferences sharedPreferences45 = this.f4496x;
            if (sharedPreferences45 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                this.f4494F = sharedPreferences45.getBoolean("flagElevenButtonColor", false);
                button12.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!this.f4494F) {
            button12.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences46 = this.f4496x;
        if (sharedPreferences46 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences46.getBoolean("flagTwelveButtonColor", false)) {
            SharedPreferences sharedPreferences47 = this.f4496x;
            if (sharedPreferences47 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4483K = sharedPreferences47.getBoolean("flagTwelveButtonColor", true);
                button.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences48 = this.f4496x;
        if (sharedPreferences48 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences48.getBoolean("flagTwelveButtonColor", true)) {
            SharedPreferences sharedPreferences49 = this.f4496x;
            if (sharedPreferences49 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4483K = sharedPreferences49.getBoolean("flagTwelveButtonColor", false);
                button.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!f4483K) {
            button.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences50 = this.f4496x;
        if (sharedPreferences50 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences50.getBoolean("flagThirteenButtonColor", false)) {
            SharedPreferences sharedPreferences51 = this.f4496x;
            if (sharedPreferences51 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4484L = sharedPreferences51.getBoolean("flagThirteenButtonColor", true);
                button14.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences52 = this.f4496x;
        if (sharedPreferences52 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences52.getBoolean("flagThirteenButtonColor", true)) {
            SharedPreferences sharedPreferences53 = this.f4496x;
            if (sharedPreferences53 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4484L = sharedPreferences53.getBoolean("flagThirteenButtonColor", false);
                button14.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!f4484L) {
            button14.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences54 = getSharedPreferences("FlutterSharedPreferences", 0);
        String string = sharedPreferences54.getString("flutter.flagFourteenButtonColor", "");
        if (C2725g.m885a(string, "Flag fourteen found!")) {
            z = true;
            sharedPreferences.edit().putBoolean("flagFourteenButtonColor", true).apply();
            button15.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
        } else {
            z = true;
        }
        SharedPreferences sharedPreferences55 = this.f4496x;
        if (sharedPreferences55 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences55.getBoolean("flagFourteenButtonColor", z)) {
            sharedPreferences54.getBoolean("flagFourteenButtonColor", false);
            button15.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
        }
        if (C2725g.m885a(string, "Flag fourteen found!") ^ z) {
            button15.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences56 = this.f4496x;
        if (sharedPreferences56 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences56.getBoolean("flagFifteenButtonColor", false)) {
            SharedPreferences sharedPreferences57 = this.f4496x;
            if (sharedPreferences57 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4485M = sharedPreferences57.getBoolean("flagFifteenButtonColor", true);
                button16.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences58 = this.f4496x;
        if (sharedPreferences58 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences58.getBoolean("flagFifteenButtonColor", true)) {
            SharedPreferences sharedPreferences59 = this.f4496x;
            if (sharedPreferences59 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4485M = sharedPreferences59.getBoolean("flagFifteenButtonColor", false);
                button16.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!f4485M) {
            button16.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences60 = this.f4496x;
        if (sharedPreferences60 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences60.getBoolean("flagSixteenButtonColor", false)) {
            SharedPreferences sharedPreferences61 = this.f4496x;
            if (sharedPreferences61 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4486N = sharedPreferences61.getBoolean("flagSixteenButtonColor", true);
                button17.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences62 = this.f4496x;
        if (sharedPreferences62 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences62.getBoolean("flagSixteenButtonColor", true)) {
            SharedPreferences sharedPreferences63 = this.f4496x;
            if (sharedPreferences63 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4486N = sharedPreferences63.getBoolean("flagSixteenButtonColor", false);
                button17.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!f4486N) {
            button17.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences64 = this.f4496x;
        if (sharedPreferences64 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences64.getBoolean("flagSeventeenButtonColor", false)) {
            SharedPreferences sharedPreferences65 = this.f4496x;
            if (sharedPreferences65 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4487O = sharedPreferences65.getBoolean("flagSeventeenButtonColor", true);
                button18.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences66 = this.f4496x;
        if (sharedPreferences66 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences66.getBoolean("flagSeventeenButtonColor", true)) {
            SharedPreferences sharedPreferences67 = this.f4496x;
            if (sharedPreferences67 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4487O = sharedPreferences67.getBoolean("flagSeventeenButtonColor", false);
                button18.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (!f4487O) {
            button18.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        }
        SharedPreferences sharedPreferences68 = this.f4496x;
        if (sharedPreferences68 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences68.getBoolean("flagEighteenButtonColor", false)) {
            SharedPreferences sharedPreferences69 = this.f4496x;
            if (sharedPreferences69 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4488P = sharedPreferences69.getBoolean("flagEighteenButtonColor", true);
                button19.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        SharedPreferences sharedPreferences70 = this.f4496x;
        if (sharedPreferences70 == null) {
            C2725g.m872n("sharedPreferences");
            throw null;
        }
        if (sharedPreferences70.getBoolean("flagEighteenButtonColor", true)) {
            SharedPreferences sharedPreferences71 = this.f4496x;
            if (sharedPreferences71 == null) {
                C2725g.m872n("sharedPreferences");
                throw null;
            } else {
                f4488P = sharedPreferences71.getBoolean("flagEighteenButtonColor", false);
                button19.getBackground().setColorFilter(-16711936, PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (f4488P) {
            return;
        }
        button19.getBackground().setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
    }
}
