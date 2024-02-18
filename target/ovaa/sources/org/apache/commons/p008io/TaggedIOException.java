package org.apache.commons.p008io;

import java.io.IOException;
import java.io.Serializable;
/* renamed from: org.apache.commons.io.TaggedIOException */
/* loaded from: classes.dex */
public class TaggedIOException extends IOExceptionWithCause {
    private static final long serialVersionUID = -6994123481142850163L;
    private final Serializable tag;

    public static boolean isTaggedWith(Throwable throwable, Object tag) {
        return tag != null && (throwable instanceof TaggedIOException) && tag.equals(((TaggedIOException) throwable).tag);
    }

    public static void throwCauseIfTaggedWith(Throwable throwable, Object tag) throws IOException {
        if (isTaggedWith(throwable, tag)) {
            throw ((TaggedIOException) throwable).getCause();
        }
    }

    public TaggedIOException(IOException original, Serializable tag) {
        super(original.getMessage(), original);
        this.tag = tag;
    }

    public Serializable getTag() {
        return this.tag;
    }

    @Override // java.lang.Throwable
    public IOException getCause() {
        return (IOException) super.getCause();
    }
}
