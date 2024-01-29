package com.google.crypto.tink.jwt;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Optional;
@Immutable
/* loaded from: classes.dex */
public interface JwtPublicKeySignInternal {
    String signAndEncodeWithKid(RawJwt token, Optional<String> kid) throws GeneralSecurityException;
}
