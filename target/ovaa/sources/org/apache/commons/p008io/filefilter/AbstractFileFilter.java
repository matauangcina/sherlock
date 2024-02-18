package org.apache.commons.p008io.filefilter;

import java.io.File;
/* renamed from: org.apache.commons.io.filefilter.AbstractFileFilter */
/* loaded from: classes.dex */
public abstract class AbstractFileFilter implements IOFileFilter {
    @Override // org.apache.commons.p008io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return accept(file.getParentFile(), file.getName());
    }

    @Override // org.apache.commons.p008io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File dir, String name) {
        return accept(new File(dir, name));
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
