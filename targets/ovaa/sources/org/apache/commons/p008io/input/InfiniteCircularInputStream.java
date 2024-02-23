package org.apache.commons.p008io.input;

import java.io.InputStream;
import kotlin.UByte;
/* renamed from: org.apache.commons.io.input.InfiniteCircularInputStream */
/* loaded from: classes.dex */
public class InfiniteCircularInputStream extends InputStream {
    private int position = -1;
    private final byte[] repeatedContent;

    public InfiniteCircularInputStream(byte[] repeatedContent) {
        this.repeatedContent = repeatedContent;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.repeatedContent;
        int length = (this.position + 1) % bArr.length;
        this.position = length;
        return bArr[length] & UByte.MAX_VALUE;
    }
}
