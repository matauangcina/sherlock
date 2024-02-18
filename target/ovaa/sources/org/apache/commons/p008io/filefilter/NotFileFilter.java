package org.apache.commons.p008io.filefilter;

import java.io.File;
import java.io.Serializable;
/* renamed from: org.apache.commons.io.filefilter.NotFileFilter */
/* loaded from: classes.dex */
public class NotFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 6131563330944994230L;
    private final IOFileFilter filter;

    public NotFileFilter(IOFileFilter filter) {
        if (filter == null) {
            throw new IllegalArgumentException("The filter must not be null");
        }
        this.filter = filter;
    }

    @Override // org.apache.commons.p008io.filefilter.AbstractFileFilter, org.apache.commons.p008io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return !this.filter.accept(file);
    }

    @Override // org.apache.commons.p008io.filefilter.AbstractFileFilter, org.apache.commons.p008io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String name) {
        return !this.filter.accept(file, name);
    }

    @Override // org.apache.commons.p008io.filefilter.AbstractFileFilter
    public String toString() {
        return super.toString() + "(" + this.filter.toString() + ")";
    }
}
