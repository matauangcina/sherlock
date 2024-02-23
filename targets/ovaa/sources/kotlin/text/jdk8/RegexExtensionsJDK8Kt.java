package kotlin.text.jdk8;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchNamedGroupCollection;
/* compiled from: RegexExtensions.kt */
@Metadata(m31d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0002¨\u0006\u0005"}, m30d2 = {"get", "Lkotlin/text/MatchGroup;", "Lkotlin/text/MatchGroupCollection;", "name", "", "kotlin-stdlib-jdk8"}, m29k = 2, m28mv = {1, 8, 0}, m27pn = "kotlin.text", m26xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class RegexExtensionsJDK8Kt {
    public static final MatchGroup get(MatchGroupCollection $this$get, String name) {
        Intrinsics.checkNotNullParameter($this$get, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        MatchNamedGroupCollection namedGroups = $this$get instanceof MatchNamedGroupCollection ? (MatchNamedGroupCollection) $this$get : null;
        if (namedGroups == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        return namedGroups.get(name);
    }
}
