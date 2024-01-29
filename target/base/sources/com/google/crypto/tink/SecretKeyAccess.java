package com.google.crypto.tink;

import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
@Immutable
@CheckReturnValue
/* loaded from: classes.dex */
public final class SecretKeyAccess {
    private static final SecretKeyAccess INSTANCE = new SecretKeyAccess();

    private SecretKeyAccess() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SecretKeyAccess instance() {
        return INSTANCE;
    }

    public static SecretKeyAccess requireAccess(@Nullable SecretKeyAccess access) throws GeneralSecurityException {
        if (access == null) {
            throw new GeneralSecurityException("SecretKeyAccess is required");
        }
        return access;
    }
}
