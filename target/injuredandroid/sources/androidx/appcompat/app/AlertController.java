package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0606i0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p000a.p001a.C0000a;
import p000a.p001a.C0005f;
import p000a.p001a.C0009j;
import p000a.p019g.p028k.C0252s;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    NestedScrollView f1172A;

    /* renamed from: C */
    private Drawable f1174C;

    /* renamed from: D */
    private ImageView f1175D;

    /* renamed from: E */
    private TextView f1176E;

    /* renamed from: F */
    private TextView f1177F;

    /* renamed from: G */
    private View f1178G;

    /* renamed from: H */
    ListAdapter f1179H;

    /* renamed from: J */
    private int f1181J;

    /* renamed from: K */
    private int f1182K;

    /* renamed from: L */
    int f1183L;

    /* renamed from: M */
    int f1184M;

    /* renamed from: N */
    int f1185N;

    /* renamed from: O */
    int f1186O;

    /* renamed from: P */
    private boolean f1187P;

    /* renamed from: R */
    Handler f1189R;

    /* renamed from: a */
    private final Context f1191a;

    /* renamed from: b */
    final DialogC0476g f1192b;

    /* renamed from: c */
    private final Window f1193c;

    /* renamed from: d */
    private final int f1194d;

    /* renamed from: e */
    private CharSequence f1195e;

    /* renamed from: f */
    private CharSequence f1196f;

    /* renamed from: g */
    ListView f1197g;

    /* renamed from: h */
    private View f1198h;

    /* renamed from: i */
    private int f1199i;

    /* renamed from: j */
    private int f1200j;

    /* renamed from: k */
    private int f1201k;

    /* renamed from: l */
    private int f1202l;

    /* renamed from: m */
    private int f1203m;

    /* renamed from: o */
    Button f1205o;

    /* renamed from: p */
    private CharSequence f1206p;

    /* renamed from: q */
    Message f1207q;

    /* renamed from: r */
    private Drawable f1208r;

    /* renamed from: s */
    Button f1209s;

    /* renamed from: t */
    private CharSequence f1210t;

    /* renamed from: u */
    Message f1211u;

    /* renamed from: v */
    private Drawable f1212v;

    /* renamed from: w */
    Button f1213w;

    /* renamed from: x */
    private CharSequence f1214x;

    /* renamed from: y */
    Message f1215y;

    /* renamed from: z */
    private Drawable f1216z;

    /* renamed from: n */
    private boolean f1204n = false;

    /* renamed from: B */
    private int f1173B = 0;

    /* renamed from: I */
    int f1180I = -1;

    /* renamed from: Q */
    private int f1188Q = 0;

    /* renamed from: S */
    private final View.OnClickListener f1190S = new View$OnClickListenerC0433a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: f */
        private final int f1217f;

        /* renamed from: g */
        private final int f1218g;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.RecycleListView);
            this.f1218g = obtainStyledAttributes.getDimensionPixelOffset(C0009j.RecycleListView_paddingBottomNoButtons, -1);
            this.f1217f = obtainStyledAttributes.getDimensionPixelOffset(C0009j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void m8101a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f1217f, getPaddingRight(), z2 ? getPaddingBottom() : this.f1218g);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0433a implements View.OnClickListener {
        View$OnClickListenerC0433a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f1205o
                if (r3 != r1) goto Lf
                android.os.Message r0 = r0.f1207q
                if (r0 == 0) goto Lf
            La:
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L2a
            Lf:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f1209s
                if (r3 != r1) goto L1a
                android.os.Message r0 = r0.f1211u
                if (r0 == 0) goto L1a
                goto La
            L1a:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f1213w
                if (r3 != r1) goto L29
                android.os.Message r3 = r0.f1215y
                if (r3 == 0) goto L29
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L2a
            L29:
                r3 = 0
            L2a:
                if (r3 == 0) goto L2f
                r3.sendToTarget()
            L2f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f1189R
                r1 = 1
                androidx.appcompat.app.g r3 = r3.f1192b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.View$OnClickListenerC0433a.onClick(android.view.View):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes.dex */
    public class C0434b implements NestedScrollView.InterfaceC0766b {

        /* renamed from: a */
        final /* synthetic */ View f1220a;

        /* renamed from: b */
        final /* synthetic */ View f1221b;

        C0434b(AlertController alertController, View view, View view2) {
            this.f1220a = view;
            this.f1221b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC0766b
        /* renamed from: a */
        public void mo6692a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m8122f(nestedScrollView, this.f1220a, this.f1221b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes.dex */
    public class RunnableC0435c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f1222f;

        /* renamed from: g */
        final /* synthetic */ View f1223g;

        RunnableC0435c(View view, View view2) {
            this.f1222f = view;
            this.f1223g = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m8122f(AlertController.this.f1172A, this.f1222f, this.f1223g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes.dex */
    public class C0436d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f1225a;

        /* renamed from: b */
        final /* synthetic */ View f1226b;

        C0436d(AlertController alertController, View view, View view2) {
            this.f1225a = view;
            this.f1226b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m8122f(absListView, this.f1225a, this.f1226b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$e */
    /* loaded from: classes.dex */
    public class RunnableC0437e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f1227f;

        /* renamed from: g */
        final /* synthetic */ View f1228g;

        RunnableC0437e(View view, View view2) {
            this.f1227f = view;
            this.f1228g = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m8122f(AlertController.this.f1197g, this.f1227f, this.f1228g);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    /* loaded from: classes.dex */
    public static class C0438f {

        /* renamed from: A */
        public int f1230A;

        /* renamed from: B */
        public int f1231B;

        /* renamed from: C */
        public int f1232C;

        /* renamed from: D */
        public int f1233D;

        /* renamed from: F */
        public boolean[] f1235F;

        /* renamed from: G */
        public boolean f1236G;

        /* renamed from: H */
        public boolean f1237H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f1239J;

        /* renamed from: K */
        public Cursor f1240K;

        /* renamed from: L */
        public String f1241L;

        /* renamed from: M */
        public String f1242M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f1243N;

        /* renamed from: O */
        public InterfaceC0443e f1244O;

        /* renamed from: a */
        public final Context f1245a;

        /* renamed from: b */
        public final LayoutInflater f1246b;

        /* renamed from: d */
        public Drawable f1248d;

        /* renamed from: f */
        public CharSequence f1250f;

        /* renamed from: g */
        public View f1251g;

        /* renamed from: h */
        public CharSequence f1252h;

        /* renamed from: i */
        public CharSequence f1253i;

        /* renamed from: j */
        public Drawable f1254j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f1255k;

        /* renamed from: l */
        public CharSequence f1256l;

        /* renamed from: m */
        public Drawable f1257m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f1258n;

        /* renamed from: o */
        public CharSequence f1259o;

        /* renamed from: p */
        public Drawable f1260p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f1261q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f1263s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f1264t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f1265u;

        /* renamed from: v */
        public CharSequence[] f1266v;

        /* renamed from: w */
        public ListAdapter f1267w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f1268x;

        /* renamed from: y */
        public int f1269y;

        /* renamed from: z */
        public View f1270z;

        /* renamed from: c */
        public int f1247c = 0;

        /* renamed from: e */
        public int f1249e = 0;

        /* renamed from: E */
        public boolean f1234E = false;

        /* renamed from: I */
        public int f1238I = -1;

        /* renamed from: r */
        public boolean f1262r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        /* loaded from: classes.dex */
        public class C0439a extends ArrayAdapter<CharSequence> {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f1271f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0439a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f1271f = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0438f.this.f1235F;
                if (zArr != null && zArr[i]) {
                    this.f1271f.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        /* loaded from: classes.dex */
        public class C0440b extends CursorAdapter {

            /* renamed from: f */
            private final int f1273f;

            /* renamed from: g */
            private final int f1274g;

            /* renamed from: h */
            final /* synthetic */ RecycleListView f1275h;

            /* renamed from: i */
            final /* synthetic */ AlertController f1276i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0440b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f1275h = recycleListView;
                this.f1276i = alertController;
                Cursor cursor2 = getCursor();
                this.f1273f = cursor2.getColumnIndexOrThrow(C0438f.this.f1241L);
                this.f1274g = cursor2.getColumnIndexOrThrow(C0438f.this.f1242M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f1273f));
                this.f1275h.setItemChecked(cursor.getPosition(), cursor.getInt(this.f1274g) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0438f.this.f1246b.inflate(this.f1276i.f1184M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        /* loaded from: classes.dex */
        public class C0441c implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ AlertController f1278f;

            C0441c(AlertController alertController) {
                this.f1278f = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0438f.this.f1268x.onClick(this.f1278f.f1192b, i);
                if (C0438f.this.f1237H) {
                    return;
                }
                this.f1278f.f1192b.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        /* loaded from: classes.dex */
        public class C0442d implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f1280f;

            /* renamed from: g */
            final /* synthetic */ AlertController f1281g;

            C0442d(RecycleListView recycleListView, AlertController alertController) {
                this.f1280f = recycleListView;
                this.f1281g = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0438f.this.f1235F;
                if (zArr != null) {
                    zArr[i] = this.f1280f.isItemChecked(i);
                }
                C0438f.this.f1239J.onClick(this.f1281g.f1192b, i, this.f1280f.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        /* loaded from: classes.dex */
        public interface InterfaceC0443e {
            /* renamed from: a */
            void m8098a(ListView listView);
        }

        public C0438f(Context context) {
            this.f1245a = context;
            this.f1246b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m8099b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f1246b
                int r1 = r11.f1183L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f1236G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.f1240K
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f1245a
                int r4 = r11.f1184M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f1266v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f1245a
                android.database.Cursor r4 = r10.f1240K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.f1237H
                if (r1 == 0) goto L3c
                int r1 = r11.f1185N
                goto L3e
            L3c:
                int r1 = r11.f1186O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.f1240K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f1245a
                android.database.Cursor r5 = r10.f1240K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f1241L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.f1267w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f1245a
                java.lang.CharSequence[] r3 = r10.f1266v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.f1244O
                if (r1 == 0) goto L72
                r1.m8098a(r0)
            L72:
                r11.f1179H = r9
                int r1 = r10.f1238I
                r11.f1180I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f1268x
                if (r1 == 0) goto L85
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f1239J
                if (r1 == 0) goto L8f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f1243N
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.f1237H
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r1 = r10.f1236G
                if (r1 == 0) goto La6
                r1 = 2
                r0.setChoiceMode(r1)
            La6:
                r11.f1197g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0438f.m8099b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void m8100a(AlertController alertController) {
            View view = this.f1251g;
            if (view != null) {
                alertController.m8116l(view);
            } else {
                CharSequence charSequence = this.f1250f;
                if (charSequence != null) {
                    alertController.m8111q(charSequence);
                }
                Drawable drawable = this.f1248d;
                if (drawable != null) {
                    alertController.m8114n(drawable);
                }
                int i = this.f1247c;
                if (i != 0) {
                    alertController.m8115m(i);
                }
                int i2 = this.f1249e;
                if (i2 != 0) {
                    alertController.m8115m(alertController.m8125c(i2));
                }
            }
            CharSequence charSequence2 = this.f1252h;
            if (charSequence2 != null) {
                alertController.m8113o(charSequence2);
            }
            if (this.f1253i != null || this.f1254j != null) {
                alertController.m8117k(-1, this.f1253i, this.f1255k, null, this.f1254j);
            }
            if (this.f1256l != null || this.f1257m != null) {
                alertController.m8117k(-2, this.f1256l, this.f1258n, null, this.f1257m);
            }
            if (this.f1259o != null || this.f1260p != null) {
                alertController.m8117k(-3, this.f1259o, this.f1261q, null, this.f1260p);
            }
            if (this.f1266v != null || this.f1240K != null || this.f1267w != null) {
                m8099b(alertController);
            }
            View view2 = this.f1270z;
            if (view2 != null) {
                if (this.f1234E) {
                    alertController.m8108t(view2, this.f1230A, this.f1231B, this.f1232C, this.f1233D);
                    return;
                } else {
                    alertController.m8109s(view2);
                    return;
                }
            }
            int i3 = this.f1269y;
            if (i3 != 0) {
                alertController.m8110r(i3);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    /* loaded from: classes.dex */
    private static final class HandlerC0444g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f1283a;

        public HandlerC0444g(DialogInterface dialogInterface) {
            this.f1283a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f1283a.get(), message.what);
            } else if (i != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AlertController$h */
    /* loaded from: classes.dex */
    public static class C0445h extends ArrayAdapter<CharSequence> {
        public C0445h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0476g dialogC0476g, Window window) {
        this.f1191a = context;
        this.f1192b = dialogC0476g;
        this.f1193c = window;
        this.f1189R = new HandlerC0444g(dialogC0476g);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0009j.AlertDialog, C0000a.alertDialogStyle, 0);
        this.f1181J = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_android_layout, 0);
        this.f1182K = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_buttonPanelSideLayout, 0);
        this.f1183L = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_listLayout, 0);
        this.f1184M = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_multiChoiceItemLayout, 0);
        this.f1185N = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_singleChoiceItemLayout, 0);
        this.f1186O = obtainStyledAttributes.getResourceId(C0009j.AlertDialog_listItemLayout, 0);
        this.f1187P = obtainStyledAttributes.getBoolean(C0009j.AlertDialog_showTitle, true);
        this.f1194d = obtainStyledAttributes.getDimensionPixelSize(C0009j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        dialogC0476g.m7960f(1);
    }

    /* renamed from: a */
    static boolean m8127a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (m8127a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    private void m8126b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    static void m8122f(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: i */
    private ViewGroup m8119i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    private int m8118j() {
        int i = this.f1182K;
        return (i != 0 && this.f1188Q == 1) ? i : this.f1181J;
    }

    /* renamed from: p */
    private void m8112p(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f1193c.findViewById(C0005f.scrollIndicatorUp);
        View findViewById2 = this.f1193c.findViewById(C0005f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C0252s.m8597t0(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById == null && findViewById2 == null) {
                return;
            }
            if (this.f1196f != null) {
                this.f1172A.setOnScrollChangeListener(new C0434b(this, findViewById, findViewById2));
                this.f1172A.post(new RunnableC0435c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f1197g;
            if (listView != null) {
                listView.setOnScrollListener(new C0436d(this, findViewById, findViewById2));
                this.f1197g.post(new RunnableC0437e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        }
        viewGroup.removeView(findViewById2);
    }

    /* renamed from: u */
    private void m8107u(ViewGroup viewGroup) {
        boolean z;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f1205o = button2;
        button2.setOnClickListener(this.f1190S);
        if (TextUtils.isEmpty(this.f1206p) && this.f1208r == null) {
            this.f1205o.setVisibility(8);
            z = false;
        } else {
            this.f1205o.setText(this.f1206p);
            Drawable drawable = this.f1208r;
            if (drawable != null) {
                int i = this.f1194d;
                drawable.setBounds(0, 0, i, i);
                this.f1205o.setCompoundDrawables(this.f1208r, null, null, null);
            }
            this.f1205o.setVisibility(0);
            z = true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f1209s = button3;
        button3.setOnClickListener(this.f1190S);
        if (TextUtils.isEmpty(this.f1210t) && this.f1212v == null) {
            this.f1209s.setVisibility(8);
        } else {
            this.f1209s.setText(this.f1210t);
            Drawable drawable2 = this.f1212v;
            if (drawable2 != null) {
                int i2 = this.f1194d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f1209s.setCompoundDrawables(this.f1212v, null, null, null);
            }
            this.f1209s.setVisibility(0);
            z |= true;
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f1213w = button4;
        button4.setOnClickListener(this.f1190S);
        if (TextUtils.isEmpty(this.f1214x) && this.f1216z == null) {
            this.f1213w.setVisibility(8);
        } else {
            this.f1213w.setText(this.f1214x);
            Drawable drawable3 = this.f1208r;
            if (drawable3 != null) {
                int i3 = this.f1194d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f1205o.setCompoundDrawables(this.f1208r, null, null, null);
            }
            this.f1213w.setVisibility(0);
            z |= true;
        }
        if (m8102z(this.f1191a)) {
            if (z) {
                button = this.f1205o;
            } else if (z) {
                button = this.f1209s;
            } else if (z) {
                button = this.f1213w;
            }
            m8126b(button);
        }
        if (z) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: v */
    private void m8106v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f1193c.findViewById(C0005f.scrollView);
        this.f1172A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f1172A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f1177F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f1196f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f1172A.removeView(this.f1177F);
        if (this.f1197g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f1172A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.f1172A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f1197g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: w */
    private void m8105w(ViewGroup viewGroup) {
        View view = this.f1198h;
        if (view == null) {
            view = this.f1199i != 0 ? LayoutInflater.from(this.f1191a).inflate(this.f1199i, viewGroup, false) : null;
        }
        boolean z = view != null;
        if (!z || !m8127a(view)) {
            this.f1193c.setFlags(131072, 131072);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f1193c.findViewById(C0005f.custom);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f1204n) {
            frameLayout.setPadding(this.f1200j, this.f1201k, this.f1202l, this.f1203m);
        }
        if (this.f1197g != null) {
            ((C0606i0.C0607a) viewGroup.getLayoutParams()).f2045a = 0.0f;
        }
    }

    /* renamed from: x */
    private void m8104x(ViewGroup viewGroup) {
        if (this.f1178G != null) {
            viewGroup.addView(this.f1178G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f1193c.findViewById(C0005f.title_template).setVisibility(8);
            return;
        }
        this.f1175D = (ImageView) this.f1193c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f1195e)) || !this.f1187P) {
            this.f1193c.findViewById(C0005f.title_template).setVisibility(8);
            this.f1175D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f1193c.findViewById(C0005f.alertTitle);
        this.f1176E = textView;
        textView.setText(this.f1195e);
        int i = this.f1173B;
        if (i != 0) {
            this.f1175D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f1174C;
        if (drawable != null) {
            this.f1175D.setImageDrawable(drawable);
            return;
        }
        this.f1176E.setPadding(this.f1175D.getPaddingLeft(), this.f1175D.getPaddingTop(), this.f1175D.getPaddingRight(), this.f1175D.getPaddingBottom());
        this.f1175D.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    private void m8103y() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f1193c.findViewById(C0005f.parentPanel);
        View findViewById4 = findViewById3.findViewById(C0005f.topPanel);
        View findViewById5 = findViewById3.findViewById(C0005f.contentPanel);
        View findViewById6 = findViewById3.findViewById(C0005f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C0005f.customPanel);
        m8105w(viewGroup);
        View findViewById7 = viewGroup.findViewById(C0005f.topPanel);
        View findViewById8 = viewGroup.findViewById(C0005f.contentPanel);
        View findViewById9 = viewGroup.findViewById(C0005f.buttonPanel);
        ViewGroup m8119i = m8119i(findViewById7, findViewById4);
        ViewGroup m8119i2 = m8119i(findViewById8, findViewById5);
        ViewGroup m8119i3 = m8119i(findViewById9, findViewById6);
        m8106v(m8119i2);
        m8107u(m8119i3);
        m8104x(m8119i);
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (m8119i == null || m8119i.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (m8119i3 == null || m8119i3.getVisibility() == 8) ? false : true;
        if (!z3 && m8119i2 != null && (findViewById2 = m8119i2.findViewById(C0005f.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f1172A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (this.f1196f != null || this.f1197g != null) {
                view = m8119i.findViewById(C0005f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (m8119i2 != null && (findViewById = m8119i2.findViewById(C0005f.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f1197g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m8101a(z2, z3);
        }
        if (!z) {
            View view2 = this.f1197g;
            if (view2 == null) {
                view2 = this.f1172A;
            }
            if (view2 != null) {
                m8112p(m8119i2, view2, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f1197g;
        if (listView2 == null || (listAdapter = this.f1179H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i = this.f1180I;
        if (i > -1) {
            listView2.setItemChecked(i, true);
            listView2.setSelection(i);
        }
    }

    /* renamed from: z */
    private static boolean m8102z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0000a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: c */
    public int m8125c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f1191a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView m8124d() {
        return this.f1197g;
    }

    /* renamed from: e */
    public void m8123e() {
        this.f1192b.setContentView(m8118j());
        m8103y();
    }

    /* renamed from: g */
    public boolean m8121g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1172A;
        return nestedScrollView != null && nestedScrollView.m6702q(keyEvent);
    }

    /* renamed from: h */
    public boolean m8120h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1172A;
        return nestedScrollView != null && nestedScrollView.m6702q(keyEvent);
    }

    /* renamed from: k */
    public void m8117k(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f1189R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f1214x = charSequence;
            this.f1215y = message;
            this.f1216z = drawable;
        } else if (i == -2) {
            this.f1210t = charSequence;
            this.f1211u = message;
            this.f1212v = drawable;
        } else if (i != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.f1206p = charSequence;
            this.f1207q = message;
            this.f1208r = drawable;
        }
    }

    /* renamed from: l */
    public void m8116l(View view) {
        this.f1178G = view;
    }

    /* renamed from: m */
    public void m8115m(int i) {
        this.f1174C = null;
        this.f1173B = i;
        ImageView imageView = this.f1175D;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.f1175D.setImageResource(this.f1173B);
        }
    }

    /* renamed from: n */
    public void m8114n(Drawable drawable) {
        this.f1174C = drawable;
        this.f1173B = 0;
        ImageView imageView = this.f1175D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.f1175D.setImageDrawable(drawable);
        }
    }

    /* renamed from: o */
    public void m8113o(CharSequence charSequence) {
        this.f1196f = charSequence;
        TextView textView = this.f1177F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void m8111q(CharSequence charSequence) {
        this.f1195e = charSequence;
        TextView textView = this.f1176E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void m8110r(int i) {
        this.f1198h = null;
        this.f1199i = i;
        this.f1204n = false;
    }

    /* renamed from: s */
    public void m8109s(View view) {
        this.f1198h = view;
        this.f1199i = 0;
        this.f1204n = false;
    }

    /* renamed from: t */
    public void m8108t(View view, int i, int i2, int i3, int i4) {
        this.f1198h = view;
        this.f1199i = 0;
        this.f1204n = true;
        this.f1200j = i;
        this.f1201k = i2;
        this.f1202l = i3;
        this.f1203m = i4;
    }
}
