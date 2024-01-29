package androidx.security.crypto;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.security.crypto.MasterKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MasterKey.kt */
@Metadata(m23d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a@\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t¨\u0006\r"}, m22d2 = {"MasterKey", "Landroidx/security/crypto/MasterKey;", "context", "Landroid/content/Context;", "keyAlias", "", "keyScheme", "Landroidx/security/crypto/MasterKey$KeyScheme;", "authenticationRequired", "", "userAuthenticationValidityDurationSeconds", "", "requestStrongBoxBacked", "security-crypto-ktx_release"}, m21k = 2, m20mv = {1, 8, 0}, m18xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class MasterKeyKt {
    public static /* synthetic */ MasterKey MasterKey$default(Context context, String str, MasterKey.KeyScheme keyScheme, boolean z, int i, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = MasterKey.DEFAULT_MASTER_KEY_ALIAS;
        }
        return MasterKey(context, str, (i2 & 4) != 0 ? MasterKey.KeyScheme.AES256_GCM : keyScheme, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? MasterKey.getDefaultAuthenticationValidityDurationSeconds() : i, (i2 & 32) == 0 ? z2 : false);
    }

    public static final MasterKey MasterKey(Context context, String keyAlias, MasterKey.KeyScheme keyScheme, boolean authenticationRequired, int userAuthenticationValidityDurationSeconds, boolean requestStrongBoxBacked) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(keyAlias, "keyAlias");
        Intrinsics.checkNotNullParameter(keyScheme, "keyScheme");
        MasterKey build = new MasterKey.Builder(context, keyAlias).setKeyScheme(keyScheme).setUserAuthenticationRequired(authenticationRequired, userAuthenticationValidityDurationSeconds).setRequestStrongBoxBacked(requestStrongBoxBacked).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(context, keyAlia…ngBoxBacked)\n    .build()");
        return build;
    }
}
