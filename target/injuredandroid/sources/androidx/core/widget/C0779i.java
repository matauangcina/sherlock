package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p000a.p019g.p026i.C0174c;
import p000a.p019g.p027j.C0194i;
/* renamed from: androidx.core.widget.i */
/* loaded from: classes.dex */
public final class C0779i {

    /* renamed from: androidx.core.widget.i$a */
    /* loaded from: classes.dex */
    private static class ActionMode$CallbackC0780a implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f2771a;

        /* renamed from: b */
        private final TextView f2772b;

        /* renamed from: c */
        private Class<?> f2773c;

        /* renamed from: d */
        private Method f2774d;

        /* renamed from: e */
        private boolean f2775e;

        /* renamed from: f */
        private boolean f2776f = false;

        ActionMode$CallbackC0780a(ActionMode.Callback callback, TextView textView) {
            this.f2771a = callback;
            this.f2772b = textView;
        }

        /* renamed from: a */
        private Intent m6625a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        private Intent m6624b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m6625a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m6622d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        private List<ResolveInfo> m6623c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m6625a(), 0)) {
                    if (m6621e(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
                return arrayList;
            }
            return arrayList;
        }

        /* renamed from: d */
        private boolean m6622d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: e */
        private boolean m6621e(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo.exported) {
                String str = activityInfo.permission;
                return str == null || context.checkSelfPermission(str) == 0;
            }
            return false;
        }

        /* renamed from: f */
        private void m6620f(Menu menu) {
            Context context = this.f2772b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f2776f) {
                this.f2776f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2773c = cls;
                    this.f2774d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f2775e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f2773c = null;
                    this.f2774d = null;
                    this.f2775e = false;
                }
            }
            try {
                Method declaredMethod = (this.f2775e && this.f2773c.isInstance(menu)) ? this.f2774d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> m6623c = m6623c(context, packageManager);
                for (int i = 0; i < m6623c.size(); i++) {
                    ResolveInfo resolveInfo = m6623c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m6624b(resolveInfo, this.f2772b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2771a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2771a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f2771a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m6620f(menu);
            return this.f2771a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Drawable[] m6641a(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i >= 17) {
            boolean z = textView.getLayoutDirection() == 1;
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (z) {
                Drawable drawable = compoundDrawables[2];
                Drawable drawable2 = compoundDrawables[0];
                compoundDrawables[0] = drawable;
                compoundDrawables[2] = drawable2;
            }
            return compoundDrawables;
        }
        return textView.getCompoundDrawables();
    }

    /* renamed from: b */
    public static int m6640b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m6639c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    private static int m6638d(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: e */
    private static TextDirectionHeuristic m6637e(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    /* renamed from: f */
    public static C0174c.C0175a m6636f(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C0174c.C0175a(textView.getTextMetricsParams());
        }
        C0174c.C0175a.C0176a c0176a = new C0174c.C0175a.C0176a(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            c0176a.m8887b(textView.getBreakStrategy());
            c0176a.m8886c(textView.getHyphenationFrequency());
        }
        if (Build.VERSION.SDK_INT >= 18) {
            c0176a.m8885d(m6637e(textView));
        }
        return c0176a.m8888a();
    }

    /* renamed from: g */
    public static void m6635g(TextView textView, ColorStateList colorStateList) {
        C0194i.m8866c(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof InterfaceC0782k) {
            ((InterfaceC0782k) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: h */
    public static void m6634h(TextView textView, PorterDuff.Mode mode) {
        C0194i.m8866c(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof InterfaceC0782k) {
            ((InterfaceC0782k) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: i */
    public static void m6633i(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (i < 17) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            boolean z = textView.getLayoutDirection() == 1;
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        }
    }

    /* renamed from: j */
    public static void m6632j(TextView textView, int i) {
        C0194i.m8867b(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: k */
    public static void m6631k(TextView textView, int i) {
        C0194i.m8867b(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: l */
    public static void m6630l(TextView textView, int i) {
        C0194i.m8867b(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* renamed from: m */
    public static void m6629m(TextView textView, C0174c c0174c) {
        PrecomputedText precomputedText;
        if (Build.VERSION.SDK_INT >= 29) {
            precomputedText = c0174c.m8894b();
        } else {
            boolean m8893a = m6636f(textView).m8893a(c0174c.m8895a());
            precomputedText = c0174c;
            if (!m8893a) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
        }
        textView.setText(precomputedText);
    }

    /* renamed from: n */
    public static void m6628n(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: o */
    public static void m6627o(TextView textView, C0174c.C0175a c0175a) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setTextDirection(m6638d(c0175a.m8890d()));
        }
        if (Build.VERSION.SDK_INT >= 23) {
            textView.getPaint().set(c0175a.m8889e());
            textView.setBreakStrategy(c0175a.m8892b());
            textView.setHyphenationFrequency(c0175a.m8891c());
            return;
        }
        float textScaleX = c0175a.m8889e().getTextScaleX();
        textView.getPaint().set(c0175a.m8889e());
        if (textScaleX == textView.getTextScaleX()) {
            textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
        }
        textView.setTextScaleX(textScaleX);
    }

    /* renamed from: p */
    public static ActionMode.Callback m6626p(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionMode$CallbackC0780a) || callback == null) ? callback : new ActionMode$CallbackC0780a(callback, textView);
    }
}
