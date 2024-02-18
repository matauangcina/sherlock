package org.apache.commons.p008io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.apache.commons.p008io.IOCase;
/* renamed from: org.apache.commons.io.filefilter.RegexFileFilter */
/* loaded from: classes.dex */
public class RegexFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 4269646126155225062L;
    private final Pattern pattern;

    public RegexFileFilter(String pattern) {
        if (pattern == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.pattern = Pattern.compile(pattern);
    }

    public RegexFileFilter(String pattern, IOCase caseSensitivity) {
        if (pattern == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        int flags = 0;
        if (caseSensitivity != null && !caseSensitivity.isCaseSensitive()) {
            flags = 2;
        }
        this.pattern = Pattern.compile(pattern, flags);
    }

    public RegexFileFilter(String pattern, int flags) {
        if (pattern == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.pattern = Pattern.compile(pattern, flags);
    }

    public RegexFileFilter(Pattern pattern) {
        if (pattern == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.pattern = pattern;
    }

    @Override // org.apache.commons.p008io.filefilter.AbstractFileFilter, org.apache.commons.p008io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File dir, String name) {
        return this.pattern.matcher(name).matches();
    }
}
