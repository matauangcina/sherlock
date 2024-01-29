package p108c.p109a.p110c.p113c;

import android.view.PointerIcon;
import io.flutter.embedding.engine.p159i.C2877f;
import java.util.HashMap;
/* renamed from: c.a.c.c.a */
/* loaded from: classes.dex */
public class C1534a {

    /* renamed from: c */
    private static HashMap<String, Integer> f4567c;

    /* renamed from: a */
    private final InterfaceC1537c f4568a;

    /* renamed from: b */
    private final C2877f f4569b;

    /* renamed from: c.a.c.c.a$a */
    /* loaded from: classes.dex */
    class C1535a implements C2877f.InterfaceC2879b {
        C1535a() {
        }

        @Override // io.flutter.embedding.engine.p159i.C2877f.InterfaceC2879b
        /* renamed from: a */
        public void mo462a(String str) {
            C1534a.this.f4568a.setPointerIcon(C1534a.this.m3997d(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c.a.c.c.a$b */
    /* loaded from: classes.dex */
    public class C1536b extends HashMap<String, Integer> {
        C1536b(C1534a c1534a) {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    /* renamed from: c.a.c.c.a$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1537c {
        /* renamed from: a */
        PointerIcon mo651a(int i);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public C1534a(InterfaceC1537c interfaceC1537c, C2877f c2877f) {
        this.f4568a = interfaceC1537c;
        this.f4569b = c2877f;
        c2877f.m463b(new C1535a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public PointerIcon m3997d(String str) {
        if (f4567c == null) {
            f4567c = new C1536b(this);
        }
        return this.f4568a.mo651a(f4567c.getOrDefault(str, 1000).intValue());
    }

    /* renamed from: c */
    public void m3998c() {
        this.f4569b.m463b(null);
    }
}
