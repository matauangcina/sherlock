package net.gotev.uploadservice.schemehandlers;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import net.gotev.uploadservice.ContentType;
/* loaded from: classes.dex */
class FileSchemeHandler implements SchemeHandler {
    private File file;

    FileSchemeHandler() {
    }

    @Override // net.gotev.uploadservice.schemehandlers.SchemeHandler
    public void init(String path) {
        this.file = new File(path);
    }

    @Override // net.gotev.uploadservice.schemehandlers.SchemeHandler
    public long getLength(Context context) {
        return this.file.length();
    }

    @Override // net.gotev.uploadservice.schemehandlers.SchemeHandler
    public InputStream getInputStream(Context context) throws FileNotFoundException {
        return new FileInputStream(this.file);
    }

    @Override // net.gotev.uploadservice.schemehandlers.SchemeHandler
    public String getContentType(Context context) {
        return ContentType.autoDetect(this.file.getAbsolutePath());
    }

    @Override // net.gotev.uploadservice.schemehandlers.SchemeHandler
    public String getName(Context context) {
        return this.file.getName();
    }
}
