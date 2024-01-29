package androidx.core.graphics;

import android.graphics.Path;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Path.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f¨\u0006\f"}, m19d2 = {"and", "Landroid/graphics/Path;", "p", "flatten", "", "Landroidx/core/graphics/PathSegment;", "error", "", "minus", "or", "plus", "xor", "core-ktx_release"}, m18k = 2, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class PathKt {
    public static final Iterable<PathSegment> flatten(Path flatten, float error) {
        Intrinsics.checkParameterIsNotNull(flatten, "$this$flatten");
        Collection<PathSegment> flatten2 = PathUtils.flatten(flatten, error);
        Intrinsics.checkExpressionValueIsNotNull(flatten2, "PathUtils.flatten(this, error)");
        return flatten2;
    }

    public static /* synthetic */ Iterable flatten$default(Path path, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.5f;
        }
        return flatten(path, f);
    }

    public static final Path plus(Path plus, Path p) {
        Intrinsics.checkParameterIsNotNull(plus, "$this$plus");
        Intrinsics.checkParameterIsNotNull(p, "p");
        Path $this$apply = new Path(plus);
        $this$apply.op(p, Path.Op.UNION);
        return $this$apply;
    }

    public static final Path minus(Path minus, Path p) {
        Intrinsics.checkParameterIsNotNull(minus, "$this$minus");
        Intrinsics.checkParameterIsNotNull(p, "p");
        Path $this$apply = new Path(minus);
        $this$apply.op(p, Path.Op.DIFFERENCE);
        return $this$apply;
    }

    /* renamed from: or */
    public static final Path m33or(Path or, Path p) {
        Intrinsics.checkParameterIsNotNull(or, "$this$or");
        Intrinsics.checkParameterIsNotNull(p, "p");
        Path $this$apply$iv = new Path(or);
        $this$apply$iv.op(p, Path.Op.UNION);
        return $this$apply$iv;
    }

    public static final Path and(Path and, Path p) {
        Intrinsics.checkParameterIsNotNull(and, "$this$and");
        Intrinsics.checkParameterIsNotNull(p, "p");
        Path $this$apply = new Path();
        $this$apply.op(and, p, Path.Op.INTERSECT);
        return $this$apply;
    }

    public static final Path xor(Path xor, Path p) {
        Intrinsics.checkParameterIsNotNull(xor, "$this$xor");
        Intrinsics.checkParameterIsNotNull(p, "p");
        Path $this$apply = new Path(xor);
        $this$apply.op(p, Path.Op.XOR);
        return $this$apply;
    }
}
