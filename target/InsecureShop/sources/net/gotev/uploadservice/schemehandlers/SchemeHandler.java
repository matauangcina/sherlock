package net.gotev.uploadservice.schemehandlers;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.InputStream;
/* loaded from: classes.dex */
public interface SchemeHandler {
    String getContentType(Context context);

    InputStream getInputStream(Context context) throws FileNotFoundException;

    long getLength(Context context);

    String getName(Context context);

    void init(String str);
}
