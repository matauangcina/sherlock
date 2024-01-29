package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000a.p001a.C0000a;
import p000a.p001a.C0003d;
import p000a.p001a.C0005f;
import p000a.p001a.C0006g;
import p000a.p001a.C0007h;
import p000a.p001a.C0009j;
import p000a.p001a.p007n.InterfaceC0032c;
import p000a.p019g.p028k.C0252s;
import p000a.p030h.p031a.AbstractC0274a;
import p000a.p032i.p033a.AbstractC0280a;
/* loaded from: classes.dex */
public class SearchView extends C0606i0 implements InterfaceC0032c {

    /* renamed from: v0 */
    static final C0556k f1784v0 = new C0556k();

    /* renamed from: A */
    final ImageView f1785A;

    /* renamed from: B */
    final ImageView f1786B;

    /* renamed from: C */
    private final View f1787C;

    /* renamed from: D */
    private C0562p f1788D;

    /* renamed from: E */
    private Rect f1789E;

    /* renamed from: F */
    private Rect f1790F;

    /* renamed from: G */
    private int[] f1791G;

    /* renamed from: H */
    private int[] f1792H;

    /* renamed from: I */
    private final ImageView f1793I;

    /* renamed from: J */
    private final Drawable f1794J;

    /* renamed from: K */
    private final int f1795K;

    /* renamed from: L */
    private final int f1796L;

    /* renamed from: M */
    private final Intent f1797M;

    /* renamed from: N */
    private final Intent f1798N;

    /* renamed from: O */
    private final CharSequence f1799O;

    /* renamed from: P */
    private InterfaceC0558m f1800P;

    /* renamed from: Q */
    private InterfaceC0557l f1801Q;

    /* renamed from: R */
    View.OnFocusChangeListener f1802R;

    /* renamed from: S */
    private InterfaceC0559n f1803S;

    /* renamed from: T */
    private View.OnClickListener f1804T;

    /* renamed from: U */
    private boolean f1805U;

    /* renamed from: V */
    private boolean f1806V;

    /* renamed from: W */
    AbstractC0274a f1807W;

    /* renamed from: a0 */
    private boolean f1808a0;

    /* renamed from: b0 */
    private CharSequence f1809b0;

    /* renamed from: c0 */
    private boolean f1810c0;

    /* renamed from: d0 */
    private boolean f1811d0;

    /* renamed from: e0 */
    private int f1812e0;

    /* renamed from: f0 */
    private boolean f1813f0;

    /* renamed from: g0 */
    private CharSequence f1814g0;

    /* renamed from: h0 */
    private CharSequence f1815h0;

    /* renamed from: i0 */
    private boolean f1816i0;

    /* renamed from: j0 */
    private int f1817j0;

    /* renamed from: k0 */
    SearchableInfo f1818k0;

    /* renamed from: l0 */
    private Bundle f1819l0;

    /* renamed from: m0 */
    private final Runnable f1820m0;

    /* renamed from: n0 */
    private Runnable f1821n0;

    /* renamed from: o0 */
    private final WeakHashMap<String, Drawable.ConstantState> f1822o0;

    /* renamed from: p0 */
    private final View.OnClickListener f1823p0;

    /* renamed from: q0 */
    View.OnKeyListener f1824q0;

    /* renamed from: r0 */
    private final TextView.OnEditorActionListener f1825r0;

    /* renamed from: s0 */
    private final AdapterView.OnItemClickListener f1826s0;

    /* renamed from: t0 */
    private final AdapterView.OnItemSelectedListener f1827t0;

    /* renamed from: u */
    final SearchAutoComplete f1828u;

    /* renamed from: u0 */
    private TextWatcher f1829u0;

    /* renamed from: v */
    private final View f1830v;

    /* renamed from: w */
    private final View f1831w;

    /* renamed from: x */
    private final View f1832x;

    /* renamed from: y */
    final ImageView f1833y;

    /* renamed from: z */
    final ImageView f1834z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C0589d {

        /* renamed from: i */
        private int f1835i;

        /* renamed from: j */
        private SearchView f1836j;

        /* renamed from: k */
        private boolean f1837k;

        /* renamed from: l */
        final Runnable f1838l;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: classes.dex */
        class RunnableC0545a implements Runnable {
            RunnableC0545a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m7636b();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0000a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1838l = new RunnableC0545a();
            this.f1835i = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                if (i < 600) {
                    return (i < 640 || i2 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        /* renamed from: a */
        boolean m7637a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: b */
        void m7636b() {
            if (this.f1837k) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1837k = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1835i <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0589d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1837k) {
                removeCallbacks(this.f1838l);
                post(this.f1838l);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1836j.m7652Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1836j.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1836j.hasFocus() && getVisibility() == 0) {
                this.f1837k = true;
                if (SearchView.m7665M(getContext())) {
                    SearchView.f1784v0.m7633c(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1837k = false;
                removeCallbacks(this.f1838l);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f1837k = true;
            } else {
                this.f1837k = false;
                removeCallbacks(this.f1838l);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1836j = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1835i = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    /* loaded from: classes.dex */
    class C0546a implements TextWatcher {
        C0546a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.m7653Y(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    /* loaded from: classes.dex */
    class RunnableC0547b implements Runnable {
        RunnableC0547b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m7644f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    /* loaded from: classes.dex */
    class RunnableC0548c implements Runnable {
        RunnableC0548c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0274a abstractC0274a = SearchView.this.f1807W;
            if (abstractC0274a instanceof View$OnClickListenerC0641q0) {
                abstractC0274a.mo7294a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    /* loaded from: classes.dex */
    class View$OnFocusChangeListenerC0549d implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC0549d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1802R;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    /* loaded from: classes.dex */
    class View$OnLayoutChangeListenerC0550e implements View.OnLayoutChangeListener {
        View$OnLayoutChangeListenerC0550e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.m7676B();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0551f implements View.OnClickListener {
        View$OnClickListenerC0551f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1833y) {
                searchView.m7656V();
            } else if (view == searchView.f1785A) {
                searchView.m7660R();
            } else if (view == searchView.f1834z) {
                searchView.m7655W();
            } else if (view == searchView.f1786B) {
                searchView.m7651a0();
            } else if (view == searchView.f1828u) {
                searchView.m7670H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    /* loaded from: classes.dex */
    class View$OnKeyListenerC0552g implements View.OnKeyListener {
        View$OnKeyListenerC0552g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1818k0 == null) {
                return false;
            }
            if (!searchView.f1828u.isPopupShowing() || SearchView.this.f1828u.getListSelection() == -1) {
                if (!SearchView.this.f1828u.m7637a() && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                    view.cancelLongPress();
                    SearchView searchView2 = SearchView.this;
                    searchView2.m7662P(0, null, searchView2.f1828u.getText().toString());
                    return true;
                }
                return false;
            }
            return SearchView.this.m7654X(view, i, keyEvent);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    /* loaded from: classes.dex */
    class C0553h implements TextView.OnEditorActionListener {
        C0553h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m7655W();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    /* loaded from: classes.dex */
    class C0554i implements AdapterView.OnItemClickListener {
        C0554i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m7659S(i, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    /* loaded from: classes.dex */
    class C0555j implements AdapterView.OnItemSelectedListener {
        C0555j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m7658T(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.SearchView$k */
    /* loaded from: classes.dex */
    public static class C0556k {

        /* renamed from: a */
        private Method f1850a;

        /* renamed from: b */
        private Method f1851b;

        /* renamed from: c */
        private Method f1852c;

        C0556k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1850a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1851b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1852c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: a */
        void m7635a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1851b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        void m7634b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1850a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        void m7633c(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f1852c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    /* loaded from: classes.dex */
    public interface InterfaceC0557l {
        /* renamed from: b */
        boolean m7632b();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    /* loaded from: classes.dex */
    public interface InterfaceC0558m {
        /* renamed from: a */
        boolean m7631a(String str);

        /* renamed from: b */
        boolean m7630b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    /* loaded from: classes.dex */
    public interface InterfaceC0559n {
        /* renamed from: a */
        boolean m7629a(int i);

        /* renamed from: b */
        boolean m7628b(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.SearchView$o */
    /* loaded from: classes.dex */
    public static class C0560o extends AbstractC0280a {
        public static final Parcelable.Creator<C0560o> CREATOR = new C0561a();

        /* renamed from: h */
        boolean f1853h;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        /* loaded from: classes.dex */
        static class C0561a implements Parcelable.ClassLoaderCreator<C0560o> {
            C0561a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0560o createFromParcel(Parcel parcel) {
                return new C0560o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C0560o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0560o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C0560o[] newArray(int i) {
                return new C0560o[i];
            }
        }

        public C0560o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1853h = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        C0560o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1853h + "}";
        }

        @Override // p000a.p032i.p033a.AbstractC0280a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1853h));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    /* loaded from: classes.dex */
    private static class C0562p extends TouchDelegate {

        /* renamed from: a */
        private final View f1854a;

        /* renamed from: b */
        private final Rect f1855b;

        /* renamed from: c */
        private final Rect f1856c;

        /* renamed from: d */
        private final Rect f1857d;

        /* renamed from: e */
        private final int f1858e;

        /* renamed from: f */
        private boolean f1859f;

        public C0562p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1858e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1855b = new Rect();
            this.f1857d = new Rect();
            this.f1856c = new Rect();
            m7624a(rect, rect2);
            this.f1854a = view;
        }

        /* renamed from: a */
        public void m7624a(Rect rect, Rect rect2) {
            this.f1855b.set(rect);
            this.f1857d.set(rect);
            Rect rect3 = this.f1857d;
            int i = this.f1858e;
            rect3.inset(-i, -i);
            this.f1856c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float f;
            int i;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f1859f;
                    if (z2 && !this.f1857d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f1859f;
                        this.f1859f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f1855b.contains(x, y)) {
                    this.f1859f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (z3) {
                if (!z || this.f1856c.contains(x, y)) {
                    Rect rect = this.f1856c;
                    f = x - rect.left;
                    i = y - rect.top;
                } else {
                    f = this.f1854a.getWidth() / 2;
                    i = this.f1854a.getHeight() / 2;
                }
                motionEvent.setLocation(f, i);
                return this.f1854a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1789E = new Rect();
        this.f1790F = new Rect();
        this.f1791G = new int[2];
        this.f1792H = new int[2];
        this.f1820m0 = new RunnableC0547b();
        this.f1821n0 = new RunnableC0548c();
        this.f1822o0 = new WeakHashMap<>();
        this.f1823p0 = new View$OnClickListenerC0551f();
        this.f1824q0 = new View$OnKeyListenerC0552g();
        this.f1825r0 = new C0553h();
        this.f1826s0 = new C0554i();
        this.f1827t0 = new C0555j();
        this.f1829u0 = new C0546a();
        C0665w0 m7213u = C0665w0.m7213u(context, attributeSet, C0009j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(m7213u.m7220n(C0009j.SearchView_layout, C0006g.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C0005f.search_src_text);
        this.f1828u = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1830v = findViewById(C0005f.search_edit_frame);
        this.f1831w = findViewById(C0005f.search_plate);
        this.f1832x = findViewById(C0005f.submit_area);
        this.f1833y = (ImageView) findViewById(C0005f.search_button);
        this.f1834z = (ImageView) findViewById(C0005f.search_go_btn);
        this.f1785A = (ImageView) findViewById(C0005f.search_close_btn);
        this.f1786B = (ImageView) findViewById(C0005f.search_voice_btn);
        this.f1793I = (ImageView) findViewById(C0005f.search_mag_icon);
        C0252s.m8619i0(this.f1831w, m7213u.m7227g(C0009j.SearchView_queryBackground));
        C0252s.m8619i0(this.f1832x, m7213u.m7227g(C0009j.SearchView_submitBackground));
        this.f1833y.setImageDrawable(m7213u.m7227g(C0009j.SearchView_searchIcon));
        this.f1834z.setImageDrawable(m7213u.m7227g(C0009j.SearchView_goIcon));
        this.f1785A.setImageDrawable(m7213u.m7227g(C0009j.SearchView_closeIcon));
        this.f1786B.setImageDrawable(m7213u.m7227g(C0009j.SearchView_voiceIcon));
        this.f1793I.setImageDrawable(m7213u.m7227g(C0009j.SearchView_searchIcon));
        this.f1794J = m7213u.m7227g(C0009j.SearchView_searchHintIcon);
        C0673y0.m7140a(this.f1833y, getResources().getString(C0007h.abc_searchview_description_search));
        this.f1795K = m7213u.m7220n(C0009j.SearchView_suggestionRowLayout, C0006g.abc_search_dropdown_item_icons_2line);
        this.f1796L = m7213u.m7220n(C0009j.SearchView_commitIcon, 0);
        this.f1833y.setOnClickListener(this.f1823p0);
        this.f1785A.setOnClickListener(this.f1823p0);
        this.f1834z.setOnClickListener(this.f1823p0);
        this.f1786B.setOnClickListener(this.f1823p0);
        this.f1828u.setOnClickListener(this.f1823p0);
        this.f1828u.addTextChangedListener(this.f1829u0);
        this.f1828u.setOnEditorActionListener(this.f1825r0);
        this.f1828u.setOnItemClickListener(this.f1826s0);
        this.f1828u.setOnItemSelectedListener(this.f1827t0);
        this.f1828u.setOnKeyListener(this.f1824q0);
        this.f1828u.setOnFocusChangeListener(new View$OnFocusChangeListenerC0549d());
        setIconifiedByDefault(m7213u.m7233a(C0009j.SearchView_iconifiedByDefault, true));
        int m7228f = m7213u.m7228f(C0009j.SearchView_android_maxWidth, -1);
        if (m7228f != -1) {
            setMaxWidth(m7228f);
        }
        this.f1799O = m7213u.m7218p(C0009j.SearchView_defaultQueryHint);
        this.f1809b0 = m7213u.m7218p(C0009j.SearchView_queryHint);
        int m7223k = m7213u.m7223k(C0009j.SearchView_android_imeOptions, -1);
        if (m7223k != -1) {
            setImeOptions(m7223k);
        }
        int m7223k2 = m7213u.m7223k(C0009j.SearchView_android_inputType, -1);
        if (m7223k2 != -1) {
            setInputType(m7223k2);
        }
        setFocusable(m7213u.m7233a(C0009j.SearchView_android_focusable, true));
        m7213u.m7212v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1797M = intent;
        intent.addFlags(268435456);
        this.f1797M.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1798N = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.f1828u.getDropDownAnchor());
        this.f1787C = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0550e());
        }
        m7639k0(this.f1805U);
        m7643g0();
    }

    /* renamed from: C */
    private Intent m7675C(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1815h0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1819l0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1818k0.getSearchActivity());
        return intent;
    }

    /* renamed from: D */
    private Intent m7674D(Cursor cursor, int i, String str) {
        int i2;
        String m7285o;
        try {
            String m7285o2 = View$OnClickListenerC0641q0.m7285o(cursor, "suggest_intent_action");
            if (m7285o2 == null) {
                m7285o2 = this.f1818k0.getSuggestIntentAction();
            }
            if (m7285o2 == null) {
                m7285o2 = "android.intent.action.SEARCH";
            }
            String str2 = m7285o2;
            String m7285o3 = View$OnClickListenerC0641q0.m7285o(cursor, "suggest_intent_data");
            if (m7285o3 == null) {
                m7285o3 = this.f1818k0.getSuggestIntentData();
            }
            if (m7285o3 != null && (m7285o = View$OnClickListenerC0641q0.m7285o(cursor, "suggest_intent_data_id")) != null) {
                m7285o3 = m7285o3 + "/" + Uri.encode(m7285o);
            }
            return m7675C(str2, m7285o3 == null ? null : Uri.parse(m7285o3), View$OnClickListenerC0641q0.m7285o(cursor, "suggest_intent_extra_data"), View$OnClickListenerC0641q0.m7285o(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: E */
    private Intent m7673E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1819l0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: F */
    private Intent m7672F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: G */
    private void m7671G() {
        this.f1828u.dismissDropDown();
    }

    /* renamed from: I */
    private void m7669I(View view, Rect rect) {
        view.getLocationInWindow(this.f1791G);
        getLocationInWindow(this.f1792H);
        int[] iArr = this.f1791G;
        int i = iArr[1];
        int[] iArr2 = this.f1792H;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: J */
    private CharSequence m7668J(CharSequence charSequence) {
        if (!this.f1805U || this.f1794J == null) {
            return charSequence;
        }
        int textSize = (int) (this.f1828u.getTextSize() * 1.25d);
        this.f1794J.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1794J), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: K */
    private boolean m7667K() {
        SearchableInfo searchableInfo = this.f1818k0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1818k0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1797M;
        } else if (this.f1818k0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1798N;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: M */
    static boolean m7665M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: N */
    private boolean m7664N() {
        return (this.f1808a0 || this.f1813f0) && !m7666L();
    }

    /* renamed from: O */
    private void m7663O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e) {
            Log.e("SearchView", "Failed launch activity: " + intent, e);
        }
    }

    /* renamed from: Q */
    private boolean m7661Q(int i, int i2, String str) {
        Cursor mo8524b = this.f1807W.mo8524b();
        if (mo8524b == null || !mo8524b.moveToPosition(i)) {
            return false;
        }
        m7663O(m7674D(mo8524b, i2, str));
        return true;
    }

    /* renamed from: b0 */
    private void m7650b0() {
        post(this.f1820m0);
    }

    /* renamed from: c0 */
    private void m7648c0(int i) {
        CharSequence mo7293c;
        Editable text = this.f1828u.getText();
        Cursor mo8524b = this.f1807W.mo8524b();
        if (mo8524b == null) {
            return;
        }
        if (!mo8524b.moveToPosition(i) || (mo7293c = this.f1807W.mo7293c(mo8524b)) == null) {
            setQuery(text);
        } else {
            setQuery(mo7293c);
        }
    }

    /* renamed from: e0 */
    private void m7646e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1828u.getText());
        if (!z2 && (!this.f1805U || this.f1816i0)) {
            z = false;
        }
        this.f1785A.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f1785A.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: g0 */
    private void m7643g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1828u;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m7668J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0003d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0003d.abc_search_view_preferred_width);
    }

    /* renamed from: h0 */
    private void m7642h0() {
        this.f1828u.setThreshold(this.f1818k0.getSuggestThreshold());
        this.f1828u.setImeOptions(this.f1818k0.getImeOptions());
        int inputType = this.f1818k0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1818k0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1828u.setInputType(inputType);
        AbstractC0274a abstractC0274a = this.f1807W;
        if (abstractC0274a != null) {
            abstractC0274a.mo7294a(null);
        }
        if (this.f1818k0.getSuggestAuthority() != null) {
            View$OnClickListenerC0641q0 view$OnClickListenerC0641q0 = new View$OnClickListenerC0641q0(getContext(), this, this.f1818k0, this.f1822o0);
            this.f1807W = view$OnClickListenerC0641q0;
            this.f1828u.setAdapter(view$OnClickListenerC0641q0);
            ((View$OnClickListenerC0641q0) this.f1807W).m7276x(this.f1810c0 ? 2 : 1);
        }
    }

    /* renamed from: i0 */
    private void m7641i0() {
        this.f1832x.setVisibility((m7664N() && (this.f1834z.getVisibility() == 0 || this.f1786B.getVisibility() == 0)) ? 0 : 8);
    }

    /* renamed from: j0 */
    private void m7640j0(boolean z) {
        this.f1834z.setVisibility((this.f1808a0 && m7664N() && hasFocus() && (z || !this.f1813f0)) ? 0 : 8);
    }

    /* renamed from: k0 */
    private void m7639k0(boolean z) {
        this.f1806V = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f1828u.getText());
        this.f1833y.setVisibility(i2);
        m7640j0(z2);
        this.f1830v.setVisibility(z ? 8 : 0);
        this.f1793I.setVisibility((this.f1793I.getDrawable() == null || this.f1805U) ? 8 : 8);
        m7646e0();
        m7638l0(!z2);
        m7641i0();
    }

    /* renamed from: l0 */
    private void m7638l0(boolean z) {
        int i = 8;
        if (this.f1813f0 && !m7666L() && z) {
            this.f1834z.setVisibility(8);
            i = 0;
        }
        this.f1786B.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1828u.setText(charSequence);
        this.f1828u.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: B */
    void m7676B() {
        if (this.f1787C.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1831w.getPaddingLeft();
            Rect rect = new Rect();
            boolean m7482b = C0588c1.m7482b(this);
            int dimensionPixelSize = this.f1805U ? resources.getDimensionPixelSize(C0003d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0003d.abc_dropdownitem_text_padding_left) : 0;
            this.f1828u.getDropDownBackground().getPadding(rect);
            int i = rect.left;
            this.f1828u.setDropDownHorizontalOffset(m7482b ? -i : paddingLeft - (i + dimensionPixelSize));
            this.f1828u.setDropDownWidth((((this.f1787C.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* renamed from: H */
    void m7670H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1828u.refreshAutoCompleteResults();
            return;
        }
        f1784v0.m7634b(this.f1828u);
        f1784v0.m7635a(this.f1828u);
    }

    /* renamed from: L */
    public boolean m7666L() {
        return this.f1806V;
    }

    /* renamed from: P */
    void m7662P(int i, String str, String str2) {
        getContext().startActivity(m7675C("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: R */
    void m7660R() {
        if (!TextUtils.isEmpty(this.f1828u.getText())) {
            this.f1828u.setText("");
            this.f1828u.requestFocus();
            this.f1828u.setImeVisibility(true);
        } else if (this.f1805U) {
            InterfaceC0557l interfaceC0557l = this.f1801Q;
            if (interfaceC0557l == null || !interfaceC0557l.m7632b()) {
                clearFocus();
                m7639k0(true);
            }
        }
    }

    /* renamed from: S */
    boolean m7659S(int i, int i2, String str) {
        InterfaceC0559n interfaceC0559n = this.f1803S;
        if (interfaceC0559n == null || !interfaceC0559n.m7628b(i)) {
            m7661Q(i, 0, null);
            this.f1828u.setImeVisibility(false);
            m7671G();
            return true;
        }
        return false;
    }

    /* renamed from: T */
    boolean m7658T(int i) {
        InterfaceC0559n interfaceC0559n = this.f1803S;
        if (interfaceC0559n == null || !interfaceC0559n.m7629a(i)) {
            m7648c0(i);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m7657U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: V */
    void m7656V() {
        m7639k0(false);
        this.f1828u.requestFocus();
        this.f1828u.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1804T;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: W */
    void m7655W() {
        Editable text = this.f1828u.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0558m interfaceC0558m = this.f1800P;
        if (interfaceC0558m == null || !interfaceC0558m.m7630b(text.toString())) {
            if (this.f1818k0 != null) {
                m7662P(0, null, text.toString());
            }
            this.f1828u.setImeVisibility(false);
            m7671G();
        }
    }

    /* renamed from: X */
    boolean m7654X(View view, int i, KeyEvent keyEvent) {
        if (this.f1818k0 != null && this.f1807W != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m7659S(this.f1828u.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22) {
                this.f1828u.setSelection(i == 21 ? 0 : this.f1828u.length());
                this.f1828u.setListSelection(0);
                this.f1828u.clearListSelection();
                f1784v0.m7633c(this.f1828u, true);
                return true;
            } else if (i != 19 || this.f1828u.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: Y */
    void m7653Y(CharSequence charSequence) {
        Editable text = this.f1828u.getText();
        this.f1815h0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m7640j0(z);
        m7638l0(!z);
        m7646e0();
        m7641i0();
        if (this.f1800P != null && !TextUtils.equals(charSequence, this.f1814g0)) {
            this.f1800P.m7631a(charSequence.toString());
        }
        this.f1814g0 = charSequence.toString();
    }

    /* renamed from: Z */
    void m7652Z() {
        m7639k0(m7666L());
        m7650b0();
        if (this.f1828u.hasFocus()) {
            m7670H();
        }
    }

    /* renamed from: a0 */
    void m7651a0() {
        Intent m7673E;
        SearchableInfo searchableInfo = this.f1818k0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                m7673E = m7672F(this.f1797M, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                m7673E = m7673E(this.f1798N, searchableInfo);
            }
            getContext().startActivity(m7673E);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // p000a.p001a.p007n.InterfaceC0032c
    /* renamed from: c */
    public void mo7649c() {
        if (this.f1816i0) {
            return;
        }
        this.f1816i0 = true;
        int imeOptions = this.f1828u.getImeOptions();
        this.f1817j0 = imeOptions;
        this.f1828u.setImeOptions(imeOptions | 33554432);
        this.f1828u.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1811d0 = true;
        super.clearFocus();
        this.f1828u.clearFocus();
        this.f1828u.setImeVisibility(false);
        this.f1811d0 = false;
    }

    /* renamed from: d0 */
    public void m7647d0(CharSequence charSequence, boolean z) {
        this.f1828u.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1828u;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1815h0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m7655W();
    }

    @Override // p000a.p001a.p007n.InterfaceC0032c
    /* renamed from: f */
    public void mo7645f() {
        m7647d0("", false);
        clearFocus();
        m7639k0(true);
        this.f1828u.setImeOptions(this.f1817j0);
        this.f1816i0 = false;
    }

    /* renamed from: f0 */
    void m7644f0() {
        int[] iArr = this.f1828u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1831w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1832x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1828u.getImeOptions();
    }

    public int getInputType() {
        return this.f1828u.getInputType();
    }

    public int getMaxWidth() {
        return this.f1812e0;
    }

    public CharSequence getQuery() {
        return this.f1828u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1809b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1818k0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1799O : getContext().getText(this.f1818k0.getHintId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f1796L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f1795K;
    }

    public AbstractC0274a getSuggestionsAdapter() {
        return this.f1807W;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1820m0);
        post(this.f1821n0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0606i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m7669I(this.f1828u, this.f1789E);
            Rect rect = this.f1790F;
            Rect rect2 = this.f1789E;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0562p c0562p = this.f1788D;
            if (c0562p != null) {
                c0562p.m7624a(this.f1790F, this.f1789E);
                return;
            }
            C0562p c0562p2 = new C0562p(this.f1790F, this.f1789E, this.f1828u);
            this.f1788D = c0562p2;
            setTouchDelegate(c0562p2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // androidx.appcompat.widget.C0606i0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.m7666L()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.f1812e0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.f1812e0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.f1812e0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0560o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0560o c0560o = (C0560o) parcelable;
        super.onRestoreInstanceState(c0560o.m8522a());
        m7639k0(c0560o.f1853h);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0560o c0560o = new C0560o(super.onSaveInstanceState());
        c0560o.f1853h = m7666L();
        return c0560o;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m7650b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (!this.f1811d0 && isFocusable()) {
            if (m7666L()) {
                return super.requestFocus(i, rect);
            }
            boolean requestFocus = this.f1828u.requestFocus(i, rect);
            if (requestFocus) {
                m7639k0(false);
            }
            return requestFocus;
        }
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1819l0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m7660R();
        } else {
            m7656V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1805U == z) {
            return;
        }
        this.f1805U = z;
        m7639k0(z);
        m7643g0();
    }

    public void setImeOptions(int i) {
        this.f1828u.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1828u.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1812e0 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0557l interfaceC0557l) {
        this.f1801Q = interfaceC0557l;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1802R = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0558m interfaceC0558m) {
        this.f1800P = interfaceC0558m;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1804T = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0559n interfaceC0559n) {
        this.f1803S = interfaceC0559n;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1809b0 = charSequence;
        m7643g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1810c0 = z;
        AbstractC0274a abstractC0274a = this.f1807W;
        if (abstractC0274a instanceof View$OnClickListenerC0641q0) {
            ((View$OnClickListenerC0641q0) abstractC0274a).m7276x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1818k0 = searchableInfo;
        if (searchableInfo != null) {
            m7642h0();
            m7643g0();
        }
        boolean m7667K = m7667K();
        this.f1813f0 = m7667K;
        if (m7667K) {
            this.f1828u.setPrivateImeOptions("nm");
        }
        m7639k0(m7666L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1808a0 = z;
        m7639k0(m7666L());
    }

    public void setSuggestionsAdapter(AbstractC0274a abstractC0274a) {
        this.f1807W = abstractC0274a;
        this.f1828u.setAdapter(abstractC0274a);
    }
}
