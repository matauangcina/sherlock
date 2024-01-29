package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC0451b;
import androidx.appcompat.view.menu.InterfaceC0527p;
import p000a.p001a.C0000a;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.InterfaceC0251r;
/* renamed from: androidx.appcompat.widget.w */
/* loaded from: classes.dex */
public class C0653w extends Spinner implements InterfaceC0251r {

    /* renamed from: n */
    private static final int[] f2205n = {16843505};

    /* renamed from: f */
    private final C0592e f2206f;

    /* renamed from: g */
    private final Context f2207g;

    /* renamed from: h */
    private AbstractView$OnTouchListenerC0602h0 f2208h;

    /* renamed from: i */
    private SpinnerAdapter f2209i;

    /* renamed from: j */
    private final boolean f2210j;

    /* renamed from: k */
    private InterfaceC0664g f2211k;

    /* renamed from: l */
    int f2212l;

    /* renamed from: m */
    final Rect f2213m;

    /* renamed from: androidx.appcompat.widget.w$a */
    /* loaded from: classes.dex */
    class C0654a extends AbstractView$OnTouchListenerC0602h0 {

        /* renamed from: o */
        final /* synthetic */ C0658e f2214o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0654a(View view, C0658e c0658e) {
            super(view);
            this.f2214o = c0658e;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0602h0
        /* renamed from: b */
        public InterfaceC0527p mo7253b() {
            return this.f2214o;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0602h0
        /* renamed from: c */
        public boolean mo7252c() {
            if (C0653w.this.getInternalPopup().mo7244c()) {
                return true;
            }
            C0653w.this.m7254b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.w$b */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0655b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0655b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C0653w.this.getInternalPopup().mo7244c()) {
                C0653w.this.m7254b();
            }
            ViewTreeObserver viewTreeObserver = C0653w.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w$c */
    /* loaded from: classes.dex */
    class DialogInterface$OnClickListenerC0656c implements InterfaceC0664g, DialogInterface.OnClickListener {

        /* renamed from: f */
        DialogInterfaceC0451b f2217f;

        /* renamed from: g */
        private ListAdapter f2218g;

        /* renamed from: h */
        private CharSequence f2219h;

        DialogInterface$OnClickListenerC0656c() {
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: b */
        public void mo7245b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: c */
        public boolean mo7244c() {
            DialogInterfaceC0451b dialogInterfaceC0451b = this.f2217f;
            if (dialogInterfaceC0451b != null) {
                return dialogInterfaceC0451b.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: d */
        public int mo7243d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        public void dismiss() {
            DialogInterfaceC0451b dialogInterfaceC0451b = this.f2217f;
            if (dialogInterfaceC0451b != null) {
                dialogInterfaceC0451b.dismiss();
                this.f2217f = null;
            }
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: g */
        public Drawable mo7242g() {
            return null;
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: i */
        public void mo7241i(CharSequence charSequence) {
            this.f2219h = charSequence;
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: j */
        public void mo7240j(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: k */
        public void mo7239k(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: l */
        public void mo7238l(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: m */
        public void mo7237m(int i, int i2) {
            if (this.f2218g == null) {
                return;
            }
            DialogInterfaceC0451b.C0452a c0452a = new DialogInterfaceC0451b.C0452a(C0653w.this.getPopupContext());
            CharSequence charSequence = this.f2219h;
            if (charSequence != null) {
                c0452a.m8081h(charSequence);
            }
            c0452a.m8082g(this.f2218g, C0653w.this.getSelectedItemPosition(), this);
            DialogInterfaceC0451b m8088a = c0452a.m8088a();
            this.f2217f = m8088a;
            ListView m8090h = m8088a.m8090h();
            if (Build.VERSION.SDK_INT >= 17) {
                m8090h.setTextDirection(i);
                m8090h.setTextAlignment(i2);
            }
            this.f2217f.show();
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: n */
        public int mo7236n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: o */
        public CharSequence mo7235o() {
            return this.f2219h;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C0653w.this.setSelection(i);
            if (C0653w.this.getOnItemClickListener() != null) {
                C0653w.this.performItemClick(null, i, this.f2218g.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: p */
        public void mo7234p(ListAdapter listAdapter) {
            this.f2218g = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.w$d */
    /* loaded from: classes.dex */
    public static class C0657d implements ListAdapter, SpinnerAdapter {

        /* renamed from: f */
        private SpinnerAdapter f2221f;

        /* renamed from: g */
        private ListAdapter f2222g;

        public C0657d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f2221f = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2222g = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                } else if (spinnerAdapter instanceof InterfaceC0646s0) {
                    InterfaceC0646s0 interfaceC0646s0 = (InterfaceC0646s0) spinnerAdapter;
                    if (interfaceC0646s0.getDropDownViewTheme() == null) {
                        interfaceC0646s0.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2222g;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f2221f;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2221f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f2221f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f2221f;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f2221f;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f2222g;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2221f;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2221f;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w$e */
    /* loaded from: classes.dex */
    class C0658e extends C0610j0 implements InterfaceC0664g {

        /* renamed from: N */
        private CharSequence f2223N;

        /* renamed from: O */
        ListAdapter f2224O;

        /* renamed from: P */
        private final Rect f2225P;

        /* renamed from: Q */
        private int f2226Q;

        /* renamed from: androidx.appcompat.widget.w$e$a */
        /* loaded from: classes.dex */
        class C0659a implements AdapterView.OnItemClickListener {
            C0659a(C0653w c0653w) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0653w.this.setSelection(i);
                if (C0653w.this.getOnItemClickListener() != null) {
                    C0658e c0658e = C0658e.this;
                    C0653w.this.performItemClick(view, i, c0658e.f2224O.getItemId(i));
                }
                C0658e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.w$e$b */
        /* loaded from: classes.dex */
        class ViewTreeObserver$OnGlobalLayoutListenerC0660b implements ViewTreeObserver.OnGlobalLayoutListener {
            ViewTreeObserver$OnGlobalLayoutListenerC0660b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C0658e c0658e = C0658e.this;
                if (!c0658e.m7248Q(C0653w.this)) {
                    C0658e.this.dismiss();
                    return;
                }
                C0658e.this.m7250O();
                C0658e.super.mo7383a();
            }
        }

        /* renamed from: androidx.appcompat.widget.w$e$c */
        /* loaded from: classes.dex */
        class C0661c implements PopupWindow.OnDismissListener {

            /* renamed from: f */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2230f;

            C0661c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f2230f = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0653w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f2230f);
                }
            }
        }

        public C0658e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f2225P = new Rect();
            m7366z(C0653w.this);
            m7391F(true);
            m7386K(0);
            m7389H(new C0659a(C0653w.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /* renamed from: O */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m7250O() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.m7379g()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.w r1 = androidx.appcompat.widget.C0653w.this
                android.graphics.Rect r1 = r1.f2213m
                r0.getPadding(r1)
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.C0653w.this
                boolean r0 = androidx.appcompat.widget.C0588c1.m7482b(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.C0653w.this
                android.graphics.Rect r0 = r0.f2213m
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.C0653w.this
                android.graphics.Rect r0 = r0.f2213m
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.C0653w.this
                android.graphics.Rect r0 = r0.f2213m
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.C0653w.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.w r2 = androidx.appcompat.widget.C0653w.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.w r3 = androidx.appcompat.widget.C0653w.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.w r4 = androidx.appcompat.widget.C0653w.this
                int r5 = r4.f2212l
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.f2224O
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.m7379g()
                int r4 = r4.m7255a(r5, r6)
                androidx.appcompat.widget.w r5 = androidx.appcompat.widget.C0653w.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.w r6 = androidx.appcompat.widget.C0653w.this
                android.graphics.Rect r6 = r6.f2213m
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.m7395B(r4)
                goto L85
            L82:
                r8.m7395B(r5)
            L85:
                androidx.appcompat.widget.w r4 = androidx.appcompat.widget.C0653w.this
                boolean r4 = androidx.appcompat.widget.C0588c1.m7482b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r0 = r8.m7370v()
                int r3 = r3 - r0
                int r0 = r8.m7249P()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto La0
            L9a:
                int r2 = r8.m7249P()
                int r0 = r0 + r2
                int r1 = r1 + r0
            La0:
                r8.m7376l(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0653w.C0658e.m7250O():void");
        }

        /* renamed from: P */
        public int m7249P() {
            return this.f2226Q;
        }

        /* renamed from: Q */
        boolean m7248Q(View view) {
            return C0252s.m8651L(view) && view.getGlobalVisibleRect(this.f2225P);
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: i */
        public void mo7241i(CharSequence charSequence) {
            this.f2223N = charSequence;
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: k */
        public void mo7239k(int i) {
            this.f2226Q = i;
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: m */
        public void mo7237m(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean mo7381c = mo7381c();
            m7250O();
            m7392E(2);
            super.mo7383a();
            ListView mo7378h = mo7378h();
            mo7378h.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                mo7378h.setTextDirection(i);
                mo7378h.setTextAlignment(i2);
            }
            m7385L(C0653w.this.getSelectedItemPosition());
            if (mo7381c || (viewTreeObserver = C0653w.this.getViewTreeObserver()) == null) {
                return;
            }
            ViewTreeObserver$OnGlobalLayoutListenerC0660b viewTreeObserver$OnGlobalLayoutListenerC0660b = new ViewTreeObserver$OnGlobalLayoutListenerC0660b();
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC0660b);
            m7390G(new C0661c(viewTreeObserver$OnGlobalLayoutListenerC0660b));
        }

        @Override // androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: o */
        public CharSequence mo7235o() {
            return this.f2223N;
        }

        @Override // androidx.appcompat.widget.C0610j0, androidx.appcompat.widget.C0653w.InterfaceC0664g
        /* renamed from: p */
        public void mo7234p(ListAdapter listAdapter) {
            super.mo7234p(listAdapter);
            this.f2224O = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.w$f */
    /* loaded from: classes.dex */
    public static class C0662f extends View.BaseSavedState {
        public static final Parcelable.Creator<C0662f> CREATOR = new C0663a();

        /* renamed from: f */
        boolean f2232f;

        /* renamed from: androidx.appcompat.widget.w$f$a */
        /* loaded from: classes.dex */
        static class C0663a implements Parcelable.Creator<C0662f> {
            C0663a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0662f createFromParcel(Parcel parcel) {
                return new C0662f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C0662f[] newArray(int i) {
                return new C0662f[i];
            }
        }

        C0662f(Parcel parcel) {
            super(parcel);
            this.f2232f = parcel.readByte() != 0;
        }

        C0662f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f2232f ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.w$g */
    /* loaded from: classes.dex */
    public interface InterfaceC0664g {
        /* renamed from: b */
        void mo7245b(Drawable drawable);

        /* renamed from: c */
        boolean mo7244c();

        /* renamed from: d */
        int mo7243d();

        void dismiss();

        /* renamed from: g */
        Drawable mo7242g();

        /* renamed from: i */
        void mo7241i(CharSequence charSequence);

        /* renamed from: j */
        void mo7240j(int i);

        /* renamed from: k */
        void mo7239k(int i);

        /* renamed from: l */
        void mo7238l(int i);

        /* renamed from: m */
        void mo7237m(int i, int i2);

        /* renamed from: n */
        int mo7236n();

        /* renamed from: o */
        CharSequence mo7235o();

        /* renamed from: p */
        void mo7234p(ListAdapter listAdapter);
    }

    public C0653w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.spinnerStyle);
    }

    public C0653w(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0653w(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r11 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        r11.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0653w(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f2213m = r0
            int[] r0 = p000a.p001a.C0009j.Spinner
            r1 = 0
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.C0665w0.m7213u(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f2206f = r2
            if (r11 == 0) goto L22
            a.a.n.d r2 = new a.a.n.d
            r2.<init>(r7, r11)
        L1f:
            r6.f2207g = r2
            goto L32
        L22:
            int r11 = p000a.p001a.C0009j.Spinner_popupTheme
            int r11 = r0.m7220n(r11, r1)
            if (r11 == 0) goto L30
            a.a.n.d r2 = new a.a.n.d
            r2.<init>(r7, r11)
            goto L1f
        L30:
            r6.f2207g = r7
        L32:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L64
            int[] r11 = androidx.appcompat.widget.C0653w.f2205n     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            boolean r3 = r11.hasValue(r1)     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L5c
            if (r3 == 0) goto L46
            int r10 = r11.getInt(r1, r1)     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L5c
        L46:
            if (r11 == 0) goto L64
        L48:
            r11.recycle()
            goto L64
        L4c:
            r3 = move-exception
            goto L52
        L4e:
            r7 = move-exception
            goto L5e
        L50:
            r3 = move-exception
            r11 = r2
        L52:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L5c
            if (r11 == 0) goto L64
            goto L48
        L5c:
            r7 = move-exception
            r2 = r11
        L5e:
            if (r2 == 0) goto L63
            r2.recycle()
        L63:
            throw r7
        L64:
            r11 = 1
            if (r10 == 0) goto La1
            if (r10 == r11) goto L6a
            goto Lb1
        L6a:
            androidx.appcompat.widget.w$e r10 = new androidx.appcompat.widget.w$e
            android.content.Context r3 = r6.f2207g
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f2207g
            int[] r4 = p000a.p001a.C0009j.Spinner
            androidx.appcompat.widget.w0 r1 = androidx.appcompat.widget.C0665w0.m7213u(r3, r8, r4, r9, r1)
            int r3 = p000a.p001a.C0009j.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.m7221m(r3, r4)
            r6.f2212l = r3
            int r3 = p000a.p001a.C0009j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.m7227g(r3)
            r10.m7382b(r3)
            int r3 = p000a.p001a.C0009j.Spinner_android_prompt
            java.lang.String r3 = r0.m7219o(r3)
            r10.mo7241i(r3)
            r1.m7212v()
            r6.f2211k = r10
            androidx.appcompat.widget.w$a r1 = new androidx.appcompat.widget.w$a
            r1.<init>(r6, r10)
            r6.f2208h = r1
            goto Lb1
        La1:
            androidx.appcompat.widget.w$c r10 = new androidx.appcompat.widget.w$c
            r10.<init>()
            r6.f2211k = r10
            int r1 = p000a.p001a.C0009j.Spinner_android_prompt
            java.lang.String r1 = r0.m7219o(r1)
            r10.mo7241i(r1)
        Lb1:
            int r10 = p000a.p001a.C0009j.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.m7217q(r10)
            if (r10 == 0) goto Lc9
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p000a.p001a.C0006g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        Lc9:
            r0.m7212v()
            r6.f2210j = r11
            android.widget.SpinnerAdapter r7 = r6.f2209i
            if (r7 == 0) goto Ld7
            r6.setAdapter(r7)
            r6.f2209i = r2
        Ld7:
            androidx.appcompat.widget.e r7 = r6.f2206f
            r7.m7475e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0653w.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: a */
    int m7255a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f2213m);
            Rect rect = this.f2213m;
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    /* renamed from: b */
    void m7254b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f2211k.mo7237m(getTextDirection(), getTextAlignment());
        } else {
            this.f2211k.mo7237m(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0592e c0592e = this.f2206f;
        if (c0592e != null) {
            c0592e.m7478b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0664g interfaceC0664g = this.f2211k;
        if (interfaceC0664g != null) {
            return interfaceC0664g.mo7243d();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0664g interfaceC0664g = this.f2211k;
        if (interfaceC0664g != null) {
            return interfaceC0664g.mo7236n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f2211k != null) {
            return this.f2212l;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    final InterfaceC0664g getInternalPopup() {
        return this.f2211k;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0664g interfaceC0664g = this.f2211k;
        if (interfaceC0664g != null) {
            return interfaceC0664g.mo7242g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2207g;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0664g interfaceC0664g = this.f2211k;
        return interfaceC0664g != null ? interfaceC0664g.mo7235o() : super.getPrompt();
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public ColorStateList getSupportBackgroundTintList() {
        C0592e c0592e = this.f2206f;
        if (c0592e != null) {
            return c0592e.m7477c();
        }
        return null;
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0592e c0592e = this.f2206f;
        if (c0592e != null) {
            return c0592e.m7476d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0664g interfaceC0664g = this.f2211k;
        if (interfaceC0664g == null || !interfaceC0664g.mo7244c()) {
            return;
        }
        this.f2211k.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2211k == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m7255a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0662f c0662f = (C0662f) parcelable;
        super.onRestoreInstanceState(c0662f.getSuperState());
        if (!c0662f.f2232f || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC0655b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        C0662f c0662f = new C0662f(super.onSaveInstanceState());
        InterfaceC0664g interfaceC0664g = this.f2211k;
        c0662f.f2232f = interfaceC0664g != null && interfaceC0664g.mo7244c();
        return c0662f;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC0602h0 abstractView$OnTouchListenerC0602h0 = this.f2208h;
        if (abstractView$OnTouchListenerC0602h0 == null || !abstractView$OnTouchListenerC0602h0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC0664g interfaceC0664g = this.f2211k;
        if (interfaceC0664g != null) {
            if (interfaceC0664g.mo7244c()) {
                return true;
            }
            m7254b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2210j) {
            this.f2209i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2211k != null) {
            Context context = this.f2207g;
            if (context == null) {
                context = getContext();
            }
            this.f2211k.mo7234p(new C0657d(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0592e c0592e = this.f2206f;
        if (c0592e != null) {
            c0592e.m7474f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0592e c0592e = this.f2206f;
        if (c0592e != null) {
            c0592e.m7473g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC0664g interfaceC0664g = this.f2211k;
        if (interfaceC0664g != null) {
            interfaceC0664g.mo7239k(i);
            this.f2211k.mo7238l(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC0664g interfaceC0664g = this.f2211k;
        if (interfaceC0664g != null) {
            interfaceC0664g.mo7240j(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f2211k != null) {
            this.f2212l = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0664g interfaceC0664g = this.f2211k;
        if (interfaceC0664g != null) {
            interfaceC0664g.mo7245b(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0010a.m9577d(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0664g interfaceC0664g = this.f2211k;
        if (interfaceC0664g != null) {
            interfaceC0664g.mo7241i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0592e c0592e = this.f2206f;
        if (c0592e != null) {
            c0592e.m7471i(colorStateList);
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0592e c0592e = this.f2206f;
        if (c0592e != null) {
            c0592e.m7470j(mode);
        }
    }
}
