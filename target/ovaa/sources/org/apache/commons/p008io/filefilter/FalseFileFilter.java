package org.apache.commons.p008io.filefilter;

import java.io.File;
import java.io.Serializable;
/* renamed from: org.apache.commons.io.filefilter.FalseFileFilter */
/* loaded from: classes.dex */
public class FalseFileFilter implements IOFileFilter, Serializable {
    public static final IOFileFilter FALSE;
    public static final IOFileFilter INSTANCE;
    private static final long serialVersionUID = 6210271677940926200L;

    static {
        FalseFileFilter falseFileFilter = new FalseFileFilter();
        FALSE = falseFileFilter;
        INSTANCE = falseFileFilter;
    }

    protected FalseFileFilter() {
    }

    @Override // org.apache.commons.p008io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }

    @Override // org.apache.commons.p008io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File dir, String name) {
        return false;
    }
}
