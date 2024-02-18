package org.apache.commons.p008io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
/* renamed from: org.apache.commons.io.filefilter.IOFileFilter */
/* loaded from: classes.dex */
public interface IOFileFilter extends FileFilter, FilenameFilter {
    @Override // java.io.FileFilter
    boolean accept(File file);

    boolean accept(File file, String str);
}
