package org.apache.commons.p008io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
/* renamed from: org.apache.commons.io.comparator.DirectoryFileComparator */
/* loaded from: classes.dex */
public class DirectoryFileComparator extends AbstractFileComparator implements Serializable {
    public static final Comparator<File> DIRECTORY_COMPARATOR;
    public static final Comparator<File> DIRECTORY_REVERSE;
    private static final long serialVersionUID = 296132640160964395L;

    @Override // org.apache.commons.p008io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort(list);
    }

    @Override // org.apache.commons.p008io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    @Override // org.apache.commons.p008io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    static {
        DirectoryFileComparator directoryFileComparator = new DirectoryFileComparator();
        DIRECTORY_COMPARATOR = directoryFileComparator;
        DIRECTORY_REVERSE = new ReverseComparator(directoryFileComparator);
    }

    @Override // java.util.Comparator
    public int compare(File file1, File file2) {
        return getType(file1) - getType(file2);
    }

    private int getType(File file) {
        if (file.isDirectory()) {
            return 1;
        }
        return 2;
    }
}
