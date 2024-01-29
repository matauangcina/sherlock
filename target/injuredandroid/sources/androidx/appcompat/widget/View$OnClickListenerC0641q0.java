package androidx.appcompat.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0734a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p001a.C0000a;
import p000a.p001a.C0005f;
import p000a.p030h.p031a.AbstractC0279c;
/* renamed from: androidx.appcompat.widget.q0 */
/* loaded from: classes.dex */
class View$OnClickListenerC0641q0 extends AbstractC0279c implements View.OnClickListener {

    /* renamed from: A */
    private int f2156A;

    /* renamed from: B */
    private int f2157B;

    /* renamed from: C */
    private int f2158C;

    /* renamed from: D */
    private int f2159D;

    /* renamed from: q */
    private final SearchView f2160q;

    /* renamed from: r */
    private final SearchableInfo f2161r;

    /* renamed from: s */
    private final Context f2162s;

    /* renamed from: t */
    private final WeakHashMap<String, Drawable.ConstantState> f2163t;

    /* renamed from: u */
    private final int f2164u;

    /* renamed from: v */
    private boolean f2165v;

    /* renamed from: w */
    private int f2166w;

    /* renamed from: x */
    private ColorStateList f2167x;

    /* renamed from: y */
    private int f2168y;

    /* renamed from: z */
    private int f2169z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.q0$a */
    /* loaded from: classes.dex */
    public static final class C0642a {

        /* renamed from: a */
        public final TextView f2170a;

        /* renamed from: b */
        public final TextView f2171b;

        /* renamed from: c */
        public final ImageView f2172c;

        /* renamed from: d */
        public final ImageView f2173d;

        /* renamed from: e */
        public final ImageView f2174e;

        public C0642a(View view) {
            this.f2170a = (TextView) view.findViewById(16908308);
            this.f2171b = (TextView) view.findViewById(16908309);
            this.f2172c = (ImageView) view.findViewById(16908295);
            this.f2173d = (ImageView) view.findViewById(16908296);
            this.f2174e = (ImageView) view.findViewById(C0005f.edit_query);
        }
    }

    public View$OnClickListenerC0641q0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f2165v = false;
        this.f2166w = 1;
        this.f2168y = -1;
        this.f2169z = -1;
        this.f2156A = -1;
        this.f2157B = -1;
        this.f2158C = -1;
        this.f2159D = -1;
        SearchManager searchManager = (SearchManager) this.f760i.getSystemService("search");
        this.f2160q = searchView;
        this.f2161r = searchableInfo;
        this.f2164u = searchView.getSuggestionCommitIconResId();
        this.f2162s = context;
        this.f2163t = weakHashMap;
    }

    /* renamed from: A */
    private void m7296A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f2163t.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    private void m7295B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: k */
    private Drawable m7289k(String str) {
        Drawable.ConstantState constantState = this.f2163t.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    private CharSequence m7288l(CharSequence charSequence) {
        if (this.f2167x == null) {
            TypedValue typedValue = new TypedValue();
            this.f760i.getTheme().resolveAttribute(C0000a.textColorSearchUrl, typedValue, true);
            this.f2167x = this.f760i.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f2167x, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    private Drawable m7287m(ComponentName componentName) {
        String nameNotFoundException;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f760i.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e) {
            nameNotFoundException = e.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable == null) {
            nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            Log.w("SuggestionsAdapter", nameNotFoundException);
            return null;
        }
        return drawable;
    }

    /* renamed from: n */
    private Drawable m7286n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f2163t.containsKey(flattenToShortString)) {
            Drawable m7287m = m7287m(componentName);
            this.f2163t.put(flattenToShortString, m7287m != null ? m7287m.getConstantState() : null);
            return m7287m;
        }
        Drawable.ConstantState constantState = this.f2163t.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f2162s.getResources());
    }

    /* renamed from: o */
    public static String m7285o(Cursor cursor, String str) {
        return m7277w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: p */
    private Drawable m7284p(Cursor cursor) {
        Drawable m7286n = m7286n(this.f2161r.getSearchActivity());
        return m7286n != null ? m7286n : this.f760i.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: q */
    private Drawable m7283q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m7282r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f2162s.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
            } catch (IOException e) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
            }
            return createFromStream;
        } catch (FileNotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
        return null;
    }

    /* renamed from: s */
    private Drawable m7281s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f2162s.getPackageName() + "/" + parseInt;
            Drawable m7289k = m7289k(str2);
            if (m7289k != null) {
                return m7289k;
            }
            Drawable m6874d = C0734a.m6874d(this.f2162s, parseInt);
            m7296A(str2, m6874d);
            return m6874d;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m7289k2 = m7289k(str);
            if (m7289k2 != null) {
                return m7289k2;
            }
            Drawable m7283q = m7283q(Uri.parse(str));
            m7296A(str, m7283q);
            return m7283q;
        }
    }

    /* renamed from: t */
    private Drawable m7280t(Cursor cursor) {
        int i = this.f2157B;
        if (i == -1) {
            return null;
        }
        Drawable m7281s = m7281s(cursor.getString(i));
        return m7281s != null ? m7281s : m7284p(cursor);
    }

    /* renamed from: u */
    private Drawable m7279u(Cursor cursor) {
        int i = this.f2158C;
        if (i == -1) {
            return null;
        }
        return m7281s(cursor.getString(i));
    }

    /* renamed from: w */
    private static String m7277w(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: y */
    private void m7275y(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    private void m7274z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // p000a.p030h.p031a.AbstractC0274a, p000a.p030h.p031a.C0277b.InterfaceC0278a
    /* renamed from: a */
    public void mo7294a(Cursor cursor) {
        if (this.f2165v) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo7294a(cursor);
            if (cursor != null) {
                this.f2168y = cursor.getColumnIndex("suggest_text_1");
                this.f2169z = cursor.getColumnIndex("suggest_text_2");
                this.f2156A = cursor.getColumnIndex("suggest_text_2_url");
                this.f2157B = cursor.getColumnIndex("suggest_icon_1");
                this.f2158C = cursor.getColumnIndex("suggest_icon_2");
                this.f2159D = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // p000a.p030h.p031a.AbstractC0274a, p000a.p030h.p031a.C0277b.InterfaceC0278a
    /* renamed from: c */
    public CharSequence mo7293c(Cursor cursor) {
        String m7285o;
        String m7285o2;
        if (cursor == null) {
            return null;
        }
        String m7285o3 = m7285o(cursor, "suggest_intent_query");
        if (m7285o3 != null) {
            return m7285o3;
        }
        if (!this.f2161r.shouldRewriteQueryFromData() || (m7285o2 = m7285o(cursor, "suggest_intent_data")) == null) {
            if (!this.f2161r.shouldRewriteQueryFromText() || (m7285o = m7285o(cursor, "suggest_text_1")) == null) {
                return null;
            }
            return m7285o;
        }
        return m7285o2;
    }

    @Override // p000a.p030h.p031a.C0277b.InterfaceC0278a
    /* renamed from: d */
    public Cursor mo7292d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f2160q.getVisibility() == 0 && this.f2160q.getWindowVisibility() == 0) {
            try {
                Cursor m7278v = m7278v(this.f2161r, charSequence2, 50);
                if (m7278v != null) {
                    m7278v.getCount();
                    return m7278v;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    @Override // p000a.p030h.p031a.AbstractC0274a
    /* renamed from: e */
    public void mo7291e(View view, Context context, Cursor cursor) {
        C0642a c0642a = (C0642a) view.getTag();
        int i = this.f2159D;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (c0642a.f2170a != null) {
            m7274z(c0642a.f2170a, m7277w(cursor, this.f2168y));
        }
        if (c0642a.f2171b != null) {
            String m7277w = m7277w(cursor, this.f2156A);
            CharSequence m7288l = m7277w != null ? m7288l(m7277w) : m7277w(cursor, this.f2169z);
            if (TextUtils.isEmpty(m7288l)) {
                TextView textView = c0642a.f2170a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    c0642a.f2170a.setMaxLines(2);
                }
            } else {
                TextView textView2 = c0642a.f2170a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    c0642a.f2170a.setMaxLines(1);
                }
            }
            m7274z(c0642a.f2171b, m7288l);
        }
        ImageView imageView = c0642a.f2172c;
        if (imageView != null) {
            m7275y(imageView, m7280t(cursor), 4);
        }
        ImageView imageView2 = c0642a.f2173d;
        if (imageView2 != null) {
            m7275y(imageView2, m7279u(cursor), 8);
        }
        int i3 = this.f2166w;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            c0642a.f2174e.setVisibility(8);
            return;
        }
        c0642a.f2174e.setVisibility(0);
        c0642a.f2174e.setTag(c0642a.f2170a.getText());
        c0642a.f2174e.setOnClickListener(this);
    }

    @Override // p000a.p030h.p031a.AbstractC0274a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo8523g = mo8523g(this.f760i, this.f759h, viewGroup);
            if (mo8523g != null) {
                ((C0642a) mo8523g.getTag()).f2170a.setText(e.toString());
            }
            return mo8523g;
        }
    }

    @Override // p000a.p030h.p031a.AbstractC0274a, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo7290h = mo7290h(this.f760i, this.f759h, viewGroup);
            if (mo7290h != null) {
                ((C0642a) mo7290h.getTag()).f2170a.setText(e.toString());
            }
            return mo7290h;
        }
    }

    @Override // p000a.p030h.p031a.AbstractC0279c, p000a.p030h.p031a.AbstractC0274a
    /* renamed from: h */
    public View mo7290h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo7290h = super.mo7290h(context, cursor, viewGroup);
        mo7290h.setTag(new C0642a(mo7290h));
        ((ImageView) mo7290h.findViewById(C0005f.edit_query)).setImageResource(this.f2164u);
        return mo7290h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m7295B(mo8524b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m7295B(mo8524b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2160q.m7657U((CharSequence) tag);
        }
    }

    /* renamed from: r */
    Drawable m7282r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f760i.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: v */
    Cursor m7278v(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f760i.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: x */
    public void m7276x(int i) {
        this.f2166w = i;
    }
}
