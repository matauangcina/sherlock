package androidx.security.crypto;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.security.crypto.EncryptedFile;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: EncryptedFile.kt */
@Metadata(m23d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\r"}, m22d2 = {"EncryptedFile", "Landroidx/security/crypto/EncryptedFile;", "context", "Landroid/content/Context;", "file", "Ljava/io/File;", "masterKey", "Landroidx/security/crypto/MasterKey;", "fileEncryptionScheme", "Landroidx/security/crypto/EncryptedFile$FileEncryptionScheme;", "keysetPrefName", "", "keysetAlias", "security-crypto-ktx_release"}, m21k = 2, m20mv = {1, 8, 0}, m18xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class EncryptedFileKt {
    public static final EncryptedFile EncryptedFile(Context context, File file, MasterKey masterKey, EncryptedFile.FileEncryptionScheme fileEncryptionScheme, String keysetPrefName, String keysetAlias) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(masterKey, "masterKey");
        Intrinsics.checkNotNullParameter(fileEncryptionScheme, "fileEncryptionScheme");
        EncryptedFile.Builder $this$EncryptedFile_u24lambda_u240 = new EncryptedFile.Builder(context, file, masterKey, fileEncryptionScheme);
        if (keysetPrefName != null) {
            $this$EncryptedFile_u24lambda_u240.setKeysetPrefName(keysetPrefName);
        }
        if (keysetAlias != null) {
            $this$EncryptedFile_u24lambda_u240.setKeysetAlias(keysetAlias);
        }
        EncryptedFile build = $this$EncryptedFile_u24lambda_u240.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(context, file, m…as(keysetAlias)\n}.build()");
        return build;
    }
}
