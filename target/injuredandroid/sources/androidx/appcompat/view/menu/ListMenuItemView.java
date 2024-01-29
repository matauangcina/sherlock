package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0524n;
import androidx.appcompat.widget.C0665w0;
import p000a.p001a.C0000a;
import p000a.p001a.C0005f;
import p000a.p001a.C0006g;
import p000a.p001a.C0009j;
import p000a.p019g.p028k.C0252s;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0524n.InterfaceC0525a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f */
    private C0511i f1483f;

    /* renamed from: g */
    private ImageView f1484g;

    /* renamed from: h */
    private RadioButton f1485h;

    /* renamed from: i */
    private TextView f1486i;

    /* renamed from: j */
    private CheckBox f1487j;

    /* renamed from: k */
    private TextView f1488k;

    /* renamed from: l */
    private ImageView f1489l;

    /* renamed from: m */
    private ImageView f1490m;

    /* renamed from: n */
    private LinearLayout f1491n;

    /* renamed from: o */
    private Drawable f1492o;

    /* renamed from: p */
    private int f1493p;

    /* renamed from: q */
    private Context f1494q;

    /* renamed from: r */
    private boolean f1495r;

    /* renamed from: s */
    private Drawable f1496s;

    /* renamed from: t */
    private boolean f1497t;

    /* renamed from: u */
    private LayoutInflater f1498u;

    /* renamed from: v */
    private boolean f1499v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0665w0 m7213u = C0665w0.m7213u(getContext(), attributeSet, C0009j.MenuView, i, 0);
        this.f1492o = m7213u.m7227g(C0009j.MenuView_android_itemBackground);
        this.f1493p = m7213u.m7220n(C0009j.MenuView_android_itemTextAppearance, -1);
        this.f1495r = m7213u.m7233a(C0009j.MenuView_preserveIconSpacing, false);
        this.f1494q = context;
        this.f1496s = m7213u.m7227g(C0009j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C0000a.dropDownListViewStyle, 0);
        this.f1497t = obtainStyledAttributes.hasValue(0);
        m7213u.m7212v();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m7890a(View view) {
        m7889b(view, -1);
    }

    /* renamed from: b */
    private void m7889b(View view, int i) {
        LinearLayout linearLayout = this.f1491n;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    private void m7888c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C0006g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f1487j = checkBox;
        m7890a(checkBox);
    }

    /* renamed from: f */
    private void m7887f() {
        ImageView imageView = (ImageView) getInflater().inflate(C0006g.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f1484g = imageView;
        m7889b(imageView, 0);
    }

    /* renamed from: g */
    private void m7886g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C0006g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f1485h = radioButton;
        m7890a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f1498u == null) {
            this.f1498u = LayoutInflater.from(getContext());
        }
        return this.f1498u;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f1489l;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1490m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1490m.getLayoutParams();
        rect.top += this.f1490m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0524n.InterfaceC0525a
    /* renamed from: d */
    public boolean mo2799d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0524n.InterfaceC0525a
    /* renamed from: e */
    public void mo2798e(C0511i c0511i, int i) {
        this.f1483f = c0511i;
        setVisibility(c0511i.isVisible() ? 0 : 8);
        setTitle(c0511i.m7796i(this));
        setCheckable(c0511i.isCheckable());
        m7885h(c0511i.m7806A(), c0511i.m7798g());
        setIcon(c0511i.getIcon());
        setEnabled(c0511i.isEnabled());
        setSubMenuArrowVisible(c0511i.hasSubMenu());
        setContentDescription(c0511i.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0524n.InterfaceC0525a
    public C0511i getItemData() {
        return this.f1483f;
    }

    /* renamed from: h */
    public void m7885h(boolean z, char c) {
        int i = (z && this.f1483f.m7806A()) ? 0 : 8;
        if (i == 0) {
            this.f1488k.setText(this.f1483f.m7797h());
        }
        if (this.f1488k.getVisibility() != i) {
            this.f1488k.setVisibility(i);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C0252s.m8619i0(this, this.f1492o);
        TextView textView = (TextView) findViewById(C0005f.title);
        this.f1486i = textView;
        int i = this.f1493p;
        if (i != -1) {
            textView.setTextAppearance(this.f1494q, i);
        }
        this.f1488k = (TextView) findViewById(C0005f.shortcut);
        ImageView imageView = (ImageView) findViewById(C0005f.submenuarrow);
        this.f1489l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1496s);
        }
        this.f1490m = (ImageView) findViewById(C0005f.group_divider);
        this.f1491n = (LinearLayout) findViewById(C0005f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f1484g != null && this.f1495r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1484g.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f1485h == null && this.f1487j == null) {
            return;
        }
        if (this.f1483f.m7792m()) {
            if (this.f1485h == null) {
                m7886g();
            }
            compoundButton = this.f1485h;
            compoundButton2 = this.f1487j;
        } else {
            if (this.f1487j == null) {
                m7888c();
            }
            compoundButton = this.f1487j;
            compoundButton2 = this.f1485h;
        }
        if (z) {
            compoundButton.setChecked(this.f1483f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f1487j;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1485h;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1483f.m7792m()) {
            if (this.f1485h == null) {
                m7886g();
            }
            compoundButton = this.f1485h;
        } else {
            if (this.f1487j == null) {
                m7888c();
            }
            compoundButton = this.f1487j;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1499v = z;
        this.f1495r = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f1490m;
        if (imageView != null) {
            imageView.setVisibility((this.f1497t || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1483f.m7779z() || this.f1499v;
        if (z || this.f1495r) {
            if (this.f1484g == null && drawable == null && !this.f1495r) {
                return;
            }
            if (this.f1484g == null) {
                m7887f();
            }
            if (drawable == null && !this.f1495r) {
                this.f1484g.setVisibility(8);
                return;
            }
            ImageView imageView = this.f1484g;
            if (!z) {
                drawable = null;
            }
            imageView.setImageDrawable(drawable);
            if (this.f1484g.getVisibility() != 0) {
                this.f1484g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f1486i.setText(charSequence);
            if (this.f1486i.getVisibility() == 0) {
                return;
            }
            textView = this.f1486i;
            i = 0;
        } else {
            i = 8;
            if (this.f1486i.getVisibility() == 8) {
                return;
            }
            textView = this.f1486i;
        }
        textView.setVisibility(i);
    }
}
