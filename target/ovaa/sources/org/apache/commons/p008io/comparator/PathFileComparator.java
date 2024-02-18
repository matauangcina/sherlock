package org.apache.commons.p008io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.p008io.IOCase;
/* renamed from: org.apache.commons.io.comparator.PathFileComparator */
/* loaded from: classes.dex */
public class PathFileComparator extends AbstractFileComparator implements Serializable {
    public static final Comparator<File> PATH_COMPARATOR;
    public static final Comparator<File> PATH_INSENSITIVE_COMPARATOR;
    public static final Comparator<File> PATH_INSENSITIVE_REVERSE;
    public static final Comparator<File> PATH_REVERSE;
    public static final Comparator<File> PATH_SYSTEM_COMPARATOR;
    public static final Comparator<File> PATH_SYSTEM_REVERSE;
    private static final long serialVersionUID = 6527501707585768673L;
    private final IOCase caseSensitivity;

    @Override // org.apache.commons.p008io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort(list);
    }

    @Override // org.apache.commons.p008io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    static {
        PathFileComparator pathFileComparator = new PathFileComparator();
        PATH_COMPARATOR = pathFileComparator;
        PATH_REVERSE = new ReverseComparator(pathFileComparator);
        PathFileComparator pathFileComparator2 = new PathFileComparator(IOCase.INSENSITIVE);
        PATH_INSENSITIVE_COMPARATOR = pathFileComparator2;
        PATH_INSENSITIVE_REVERSE = new ReverseComparator(pathFileComparator2);
        PathFileComparator pathFileComparator3 = new PathFileComparator(IOCase.SYSTEM);
        PATH_SYSTEM_COMPARATOR = pathFileComparator3;
        PATH_SYSTEM_REVERSE = new ReverseComparator(pathFileComparator3);
    }

    public PathFileComparator() {
        this.caseSensitivity = IOCase.SENSITIVE;
    }

    public PathFileComparator(IOCase caseSensitivity) {
        this.caseSensitivity = caseSensitivity == null ? IOCase.SENSITIVE : caseSensitivity;
    }

    @Override // java.util.Comparator
    public int compare(File file1, File file2) {
        return this.caseSensitivity.checkCompareTo(file1.getPath(), file2.getPath());
    }

    @Override // org.apache.commons.p008io.comparator.AbstractFileComparator
    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.caseSensitivity + "]";
    }
}
