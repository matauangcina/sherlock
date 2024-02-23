package org.apache.commons.p008io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.p008io.FilenameUtils;
import org.apache.commons.p008io.IOCase;
/* renamed from: org.apache.commons.io.filefilter.WildcardFileFilter */
/* loaded from: classes.dex */
public class WildcardFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -7426486598995782105L;
    private final IOCase caseSensitivity;
    private final String[] wildcards;

    public WildcardFileFilter(String wildcard) {
        this(wildcard, IOCase.SENSITIVE);
    }

    public WildcardFileFilter(String wildcard, IOCase caseSensitivity) {
        if (wildcard == null) {
            throw new IllegalArgumentException("The wildcard must not be null");
        }
        this.wildcards = new String[]{wildcard};
        this.caseSensitivity = caseSensitivity == null ? IOCase.SENSITIVE : caseSensitivity;
    }

    public WildcardFileFilter(String[] wildcards) {
        this(wildcards, IOCase.SENSITIVE);
    }

    public WildcardFileFilter(String[] wildcards, IOCase caseSensitivity) {
        if (wildcards == null) {
            throw new IllegalArgumentException("The wildcard array must not be null");
        }
        String[] strArr = new String[wildcards.length];
        this.wildcards = strArr;
        System.arraycopy(wildcards, 0, strArr, 0, wildcards.length);
        this.caseSensitivity = caseSensitivity == null ? IOCase.SENSITIVE : caseSensitivity;
    }

    public WildcardFileFilter(List<String> wildcards) {
        this(wildcards, IOCase.SENSITIVE);
    }

    public WildcardFileFilter(List<String> wildcards, IOCase caseSensitivity) {
        if (wildcards == null) {
            throw new IllegalArgumentException("The wildcard list must not be null");
        }
        this.wildcards = (String[]) wildcards.toArray(new String[wildcards.size()]);
        this.caseSensitivity = caseSensitivity == null ? IOCase.SENSITIVE : caseSensitivity;
    }

    @Override // org.apache.commons.p008io.filefilter.AbstractFileFilter, org.apache.commons.p008io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File dir, String name) {
        String[] strArr;
        for (String wildcard : this.wildcards) {
            if (FilenameUtils.wildcardMatch(name, wildcard, this.caseSensitivity)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.p008io.filefilter.AbstractFileFilter, org.apache.commons.p008io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        String[] strArr;
        String name = file.getName();
        for (String wildcard : this.wildcards) {
            if (FilenameUtils.wildcardMatch(name, wildcard, this.caseSensitivity)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.p008io.filefilter.AbstractFileFilter
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(super.toString());
        buffer.append("(");
        if (this.wildcards != null) {
            for (int i = 0; i < this.wildcards.length; i++) {
                if (i > 0) {
                    buffer.append(",");
                }
                buffer.append(this.wildcards[i]);
            }
        }
        buffer.append(")");
        return buffer.toString();
    }
}
