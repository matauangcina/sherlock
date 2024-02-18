package org.apache.commons.p008io.serialization;

import org.apache.commons.p008io.FilenameUtils;
/* renamed from: org.apache.commons.io.serialization.WildcardClassNameMatcher */
/* loaded from: classes.dex */
final class WildcardClassNameMatcher implements ClassNameMatcher {
    private final String pattern;

    public WildcardClassNameMatcher(String pattern) {
        this.pattern = pattern;
    }

    @Override // org.apache.commons.p008io.serialization.ClassNameMatcher
    public boolean matches(String className) {
        return FilenameUtils.wildcardMatch(className, this.pattern);
    }
}
