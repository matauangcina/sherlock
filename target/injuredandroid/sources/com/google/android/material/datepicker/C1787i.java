package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0835t;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0793c;
import com.google.android.material.datepicker.C1763a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p019g.p028k.C0252s;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1342d;
import p054b.p059c.p060a.p075b.C1343e;
import p054b.p059c.p060a.p075b.C1344f;
import p054b.p059c.p060a.p075b.C1346h;
import p054b.p059c.p060a.p075b.C1347i;
import p054b.p059c.p060a.p075b.C1348j;
import p054b.p059c.p060a.p075b.p076a0.C1315g;
import p054b.p059c.p060a.p075b.p085r.View$OnTouchListenerC1378a;
import p054b.p059c.p060a.p075b.p091x.C1387b;
/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes.dex */
public final class C1787i<S> extends DialogInterface$OnCancelListenerC0793c {

    /* renamed from: F0 */
    static final Object f5243F0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: G0 */
    static final Object f5244G0 = "CANCEL_BUTTON_TAG";

    /* renamed from: H0 */
    static final Object f5245H0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: A0 */
    private boolean f5246A0;

    /* renamed from: B0 */
    private TextView f5247B0;

    /* renamed from: C0 */
    private CheckableImageButton f5248C0;

    /* renamed from: D0 */
    private C1315g f5249D0;

    /* renamed from: E0 */
    private Button f5250E0;

    /* renamed from: p0 */
    private final LinkedHashSet<InterfaceC1792j<? super S>> f5251p0 = new LinkedHashSet<>();

    /* renamed from: q0 */
    private final LinkedHashSet<View.OnClickListener> f5252q0 = new LinkedHashSet<>();

    /* renamed from: r0 */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f5253r0 = new LinkedHashSet<>();

    /* renamed from: s0 */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f5254s0 = new LinkedHashSet<>();

    /* renamed from: t0 */
    private int f5255t0;

    /* renamed from: u0 */
    private InterfaceC1769d<S> f5256u0;

    /* renamed from: v0 */
    private AbstractC1802p<S> f5257v0;

    /* renamed from: w0 */
    private C1763a f5258w0;

    /* renamed from: x0 */
    private C1774h<S> f5259x0;

    /* renamed from: y0 */
    private int f5260y0;

    /* renamed from: z0 */
    private CharSequence f5261z0;

    /* renamed from: com.google.android.material.datepicker.i$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC1788a implements View.OnClickListener {
        View$OnClickListenerC1788a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C1787i.this.f5251p0.iterator();
            while (it.hasNext()) {
                ((InterfaceC1792j) it.next()).m3011a(C1787i.this.m3020N1());
            }
            C1787i.this.m6500s1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$b */
    /* loaded from: classes.dex */
    class View$OnClickListenerC1789b implements View.OnClickListener {
        View$OnClickListenerC1789b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C1787i.this.f5252q0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C1787i.this.m6500s1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.i$c */
    /* loaded from: classes.dex */
    public class C1790c implements InterfaceC1801o<S> {
        C1790c() {
        }

        @Override // com.google.android.material.datepicker.InterfaceC1801o
        /* renamed from: a */
        public void mo2977a(S s) {
            Button button;
            boolean z;
            C1787i.this.m3014T1();
            if (C1787i.this.f5256u0.m3074i()) {
                button = C1787i.this.f5250E0;
                z = true;
            } else {
                button = C1787i.this.f5250E0;
                z = false;
            }
            button.setEnabled(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.i$d */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1791d implements View.OnClickListener {
        View$OnClickListenerC1791d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1787i.this.f5248C0.toggle();
            C1787i c1787i = C1787i.this;
            c1787i.m3013U1(c1787i.f5248C0);
            C1787i.this.m3016R1();
        }
    }

    /* renamed from: J1 */
    private static Drawable m3024J1(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C0010a.m9577d(context, C1343e.ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C0010a.m9577d(context, C1343e.ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: K1 */
    private static int m3023K1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C1342d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C1342d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C1342d.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C1342d.mtrl_calendar_days_of_week_height);
        return dimensionPixelSize + dimensionPixelSize2 + (C1797m.f5276j * resources.getDimensionPixelSize(C1342d.mtrl_calendar_day_height)) + ((C1797m.f5276j - 1) * resources.getDimensionPixelOffset(C1342d.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C1342d.mtrl_calendar_bottom_padding);
    }

    /* renamed from: M1 */
    private static int m3021M1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C1342d.mtrl_calendar_content_padding);
        int i = C1795l.m3001F().f5273j;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C1342d.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(C1342d.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: O1 */
    private int m3019O1(Context context) {
        int i = this.f5255t0;
        return i != 0 ? i : this.f5256u0.m3076e(context);
    }

    /* renamed from: P1 */
    private void m3018P1(Context context) {
        this.f5248C0.setTag(f5245H0);
        this.f5248C0.setImageDrawable(m3024J1(context));
        C0252s.m8625f0(this.f5248C0, null);
        m3013U1(this.f5248C0);
        this.f5248C0.setOnClickListener(new View$OnClickListenerC1791d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q1 */
    public static boolean m3017Q1(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1387b.m4264c(context, C1338b.materialCalendarStyle, C1774h.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R1 */
    public void m3016R1() {
        this.f5259x0 = C1774h.m3052H1(this.f5256u0, m3019O1(m6567d1()), this.f5258w0);
        this.f5257v0 = this.f5248C0.isChecked() ? C1793k.m3007s1(this.f5256u0, this.f5258w0) : this.f5259x0;
        m3014T1();
        AbstractC0835t m6357i = m6540q().m6357i();
        m6357i.m6233o(C1344f.mtrl_calendar_frame, this.f5257v0);
        m6357i.mo6238j();
        this.f5257v0.m2976q1(new C1790c());
    }

    /* renamed from: S1 */
    public static long m3015S1() {
        return C1795l.m3001F().f5275l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T1 */
    public void m3014T1() {
        String m3022L1 = m3022L1();
        this.f5247B0.setContentDescription(String.format(m6603K(C1347i.mtrl_picker_announce_current_selection), m3022L1));
        this.f5247B0.setText(m3022L1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U1 */
    public void m3013U1(CheckableImageButton checkableImageButton) {
        this.f5248C0.setContentDescription(checkableImageButton.getContext().getString(this.f5248C0.isChecked() ? C1347i.mtrl_picker_toggle_to_calendar_input_mode : C1347i.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0793c, androidx.fragment.app.Fragment
    /* renamed from: A0 */
    public final void mo3010A0(Bundle bundle) {
        super.mo3010A0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f5255t0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f5256u0);
        C1763a.C1765b c1765b = new C1763a.C1765b(this.f5258w0);
        if (this.f5259x0.m3056D1() != null) {
            c1765b.m3082b(this.f5259x0.m3056D1().f5275l);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c1765b.m3083a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f5260y0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f5261z0);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0793c, androidx.fragment.app.Fragment
    /* renamed from: B0 */
    public void mo3034B0() {
        super.mo3034B0();
        Window window = m6496x1().getWindow();
        if (this.f5246A0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f5249D0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m6615E().getDimensionPixelOffset(C1342d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f5249D0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new View$OnTouchListenerC1378a(m6496x1(), rect));
        }
        m3016R1();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0793c, androidx.fragment.app.Fragment
    /* renamed from: C0 */
    public void mo3032C0() {
        this.f5257v0.m2975r1();
        super.mo3032C0();
    }

    /* renamed from: L1 */
    public String m3022L1() {
        return this.f5256u0.m3077d(m6539r());
    }

    /* renamed from: N1 */
    public final S m3020N1() {
        return this.f5256u0.m3072m();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0793c, androidx.fragment.app.Fragment
    /* renamed from: e0 */
    public final void mo3009e0(Bundle bundle) {
        super.mo3009e0(bundle);
        if (bundle == null) {
            bundle = m6543p();
        }
        this.f5255t0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f5256u0 = (InterfaceC1769d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f5258w0 = (C1763a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f5260y0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f5261z0 = bundle.getCharSequence("TITLE_TEXT_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: i0 */
    public final View mo3008i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f5246A0 ? C1346h.mtrl_picker_fullscreen : C1346h.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f5246A0) {
            inflate.findViewById(C1344f.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m3021M1(context), -2));
        } else {
            View findViewById = inflate.findViewById(C1344f.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(C1344f.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m3021M1(context), -1));
            findViewById2.setMinimumHeight(m3023K1(m6567d1()));
        }
        TextView textView = (TextView) inflate.findViewById(C1344f.mtrl_picker_header_selection_text);
        this.f5247B0 = textView;
        C0252s.m8621h0(textView, 1);
        this.f5248C0 = (CheckableImageButton) inflate.findViewById(C1344f.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(C1344f.mtrl_picker_title_text);
        CharSequence charSequence = this.f5261z0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f5260y0);
        }
        m3018P1(context);
        this.f5250E0 = (Button) inflate.findViewById(C1344f.confirm_button);
        if (this.f5256u0.m3074i()) {
            this.f5250E0.setEnabled(true);
        } else {
            this.f5250E0.setEnabled(false);
        }
        this.f5250E0.setTag(f5243F0);
        this.f5250E0.setOnClickListener(new View$OnClickListenerC1788a());
        Button button = (Button) inflate.findViewById(C1344f.cancel_button);
        button.setTag(f5244G0);
        button.setOnClickListener(new View$OnClickListenerC1789b());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0793c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f5253r0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0793c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f5254s0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) m6597N();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0793c
    /* renamed from: w1 */
    public final Dialog mo3012w1(Bundle bundle) {
        Dialog dialog = new Dialog(m6567d1(), m3019O1(m6567d1()));
        Context context = dialog.getContext();
        this.f5246A0 = m3017Q1(context);
        int m4264c = C1387b.m4264c(context, C1338b.colorSurface, C1787i.class.getCanonicalName());
        C1315g c1315g = new C1315g(context, null, C1338b.materialCalendarStyle, C1348j.Widget_MaterialComponents_MaterialCalendar);
        this.f5249D0 = c1315g;
        c1315g.m4552L(context);
        this.f5249D0.m4544T(ColorStateList.valueOf(m4264c));
        this.f5249D0.m4545S(C0252s.m8602r(dialog.getWindow().getDecorView()));
        return dialog;
    }
}
