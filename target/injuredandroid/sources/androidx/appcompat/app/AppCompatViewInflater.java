package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.C0577b0;
import androidx.appcompat.widget.C0589d;
import androidx.appcompat.widget.C0594f;
import androidx.appcompat.widget.C0598g;
import androidx.appcompat.widget.C0601h;
import androidx.appcompat.widget.C0617k;
import androidx.appcompat.widget.C0622m;
import androidx.appcompat.widget.C0632o;
import androidx.appcompat.widget.C0634p;
import androidx.appcompat.widget.C0645s;
import androidx.appcompat.widget.C0647t;
import androidx.appcompat.widget.C0648t0;
import androidx.appcompat.widget.C0649u;
import androidx.appcompat.widget.C0653w;
import androidx.appcompat.widget.C0674z;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p000a.p001a.C0009j;
import p000a.p001a.p007n.C0033d;
import p000a.p014d.C0066a;
import p000a.p019g.p028k.C0252s;
/* loaded from: classes.dex */
public class AppCompatViewInflater {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new C0066a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AppCompatViewInflater$a */
    /* loaded from: classes.dex */
    public static class View$OnClickListenerC0446a implements View.OnClickListener {

        /* renamed from: f */
        private final View f1284f;

        /* renamed from: g */
        private final String f1285g;

        /* renamed from: h */
        private Method f1286h;

        /* renamed from: i */
        private Context f1287i;

        public View$OnClickListenerC0446a(View view, String str) {
            this.f1284f = view;
            this.f1285g = str;
        }

        /* renamed from: a */
        private void m8097a(Context context, String str) {
            int id;
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1285g, View.class)) != null) {
                        this.f1286h = method;
                        this.f1287i = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            if (this.f1284f.getId() == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f1284f.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f1285g + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1284f.getClass() + str2);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f1286h == null) {
                m8097a(this.f1284f.getContext(), this.f1285g);
            }
            try {
                this.f1286h.invoke(this.f1287i, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || C0252s.m8655H(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new View$OnClickListenerC0446a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        Constructor<? extends View> constructor = sConstructorMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            sConstructorMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (int i = 0; i < sClassPrefixList.length; i++) {
                    View createViewByPrefix = createViewByPrefix(context, str, sClassPrefixList[i]);
                    if (createViewByPrefix != null) {
                        return createViewByPrefix;
                    }
                }
                return null;
            }
            return createViewByPrefix(context, str, null);
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = null;
            objArr[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0009j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C0009j.View_theme, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof C0033d) && ((C0033d) context).m9496b() == resourceId) ? context : new C0033d(context, resourceId) : context;
    }

    private void verifyNotNull(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected C0589d createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0589d(context, attributeSet);
    }

    protected C0594f createButton(Context context, AttributeSet attributeSet) {
        return new C0594f(context, attributeSet);
    }

    protected C0598g createCheckBox(Context context, AttributeSet attributeSet) {
        return new C0598g(context, attributeSet);
    }

    protected C0601h createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C0601h(context, attributeSet);
    }

    protected C0617k createEditText(Context context, AttributeSet attributeSet) {
        return new C0617k(context, attributeSet);
    }

    protected C0622m createImageButton(Context context, AttributeSet attributeSet) {
        return new C0622m(context, attributeSet);
    }

    protected C0632o createImageView(Context context, AttributeSet attributeSet) {
        return new C0632o(context, attributeSet);
    }

    protected C0634p createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0634p(context, attributeSet);
    }

    protected C0645s createRadioButton(Context context, AttributeSet attributeSet) {
        return new C0645s(context, attributeSet);
    }

    protected C0647t createRatingBar(Context context, AttributeSet attributeSet) {
        return new C0647t(context, attributeSet);
    }

    protected C0649u createSeekBar(Context context, AttributeSet attributeSet) {
        return new C0649u(context, attributeSet);
    }

    protected C0653w createSpinner(Context context, AttributeSet attributeSet) {
        return new C0653w(context, attributeSet);
    }

    protected C0674z createTextView(Context context, AttributeSet attributeSet) {
        return new C0674z(context, attributeSet);
    }

    protected C0577b0 createToggleButton(Context context, AttributeSet attributeSet) {
        return new C0577b0(context, attributeSet);
    }

    protected View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View createTextView;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0648t0.m7263b(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = '\b';
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = '\f';
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\r';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                createTextView = createTextView(context2, attributeSet);
                verifyNotNull(createTextView, str);
                break;
            case 1:
                createTextView = createImageView(context2, attributeSet);
                verifyNotNull(createTextView, str);
                break;
            case 2:
                createTextView = createButton(context2, attributeSet);
                verifyNotNull(createTextView, str);
                break;
            case 3:
                createTextView = createEditText(context2, attributeSet);
                verifyNotNull(createTextView, str);
                break;
            case 4:
                createTextView = createSpinner(context2, attributeSet);
                verifyNotNull(createTextView, str);
                break;
            case 5:
                createTextView = createImageButton(context2, attributeSet);
                verifyNotNull(createTextView, str);
                break;
            case 6:
                createTextView = createCheckBox(context2, attributeSet);
                verifyNotNull(createTextView, str);
                break;
            case 7:
                createTextView = createRadioButton(context2, attributeSet);
                verifyNotNull(createTextView, str);
                break;
            case '\b':
                createTextView = createCheckedTextView(context2, attributeSet);
                verifyNotNull(createTextView, str);
                break;
            case '\t':
                createTextView = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createTextView, str);
                break;
            case '\n':
                createTextView = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createTextView, str);
                break;
            case 11:
                createTextView = createRatingBar(context2, attributeSet);
                verifyNotNull(createTextView, str);
                break;
            case '\f':
                createTextView = createSeekBar(context2, attributeSet);
                verifyNotNull(createTextView, str);
                break;
            case '\r':
                createTextView = createToggleButton(context2, attributeSet);
                verifyNotNull(createTextView, str);
                break;
            default:
                createTextView = createView(context2, str, attributeSet);
                break;
        }
        if (createTextView == null && context != context2) {
            createTextView = createViewFromTag(context2, str, attributeSet);
        }
        if (createTextView != null) {
            checkOnClickListener(createTextView, attributeSet);
        }
        return createTextView;
    }
}
