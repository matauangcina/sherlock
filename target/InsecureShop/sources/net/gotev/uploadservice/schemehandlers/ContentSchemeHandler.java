package net.gotev.uploadservice.schemehandlers;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import net.gotev.uploadservice.ContentType;
import net.gotev.uploadservice.Logger;
/* loaded from: classes.dex */
class ContentSchemeHandler implements SchemeHandler {
    private Uri uri;

    ContentSchemeHandler() {
    }

    @Override // net.gotev.uploadservice.schemehandlers.SchemeHandler
    public void init(String path) {
        this.uri = Uri.parse(path);
    }

    @Override // net.gotev.uploadservice.schemehandlers.SchemeHandler
    public long getLength(Context context) {
        return getUriSize(context);
    }

    @Override // net.gotev.uploadservice.schemehandlers.SchemeHandler
    public InputStream getInputStream(Context context) throws FileNotFoundException {
        return context.getContentResolver().openInputStream(this.uri);
    }

    @Override // net.gotev.uploadservice.schemehandlers.SchemeHandler
    public String getContentType(Context context) {
        String type = context.getContentResolver().getType(this.uri);
        if (type == null || type.isEmpty()) {
            return ContentType.APPLICATION_OCTET_STREAM;
        }
        return type;
    }

    @Override // net.gotev.uploadservice.schemehandlers.SchemeHandler
    public String getName(Context context) {
        return getUriName(context);
    }

    private long getUriSize(Context context) {
        Cursor cursor = context.getContentResolver().query(this.uri, null, null, null, null);
        if (cursor == null) {
            String simpleName = getClass().getSimpleName();
            Logger.error(simpleName, "null cursor for " + this.uri + ", returning size 0");
            return 0L;
        }
        int sizeIndex = cursor.getColumnIndex("_size");
        cursor.moveToFirst();
        long size = cursor.getLong(sizeIndex);
        cursor.close();
        return size;
    }

    private String getUriName(Context context) {
        Cursor cursor = context.getContentResolver().query(this.uri, null, null, null, null);
        if (cursor == null) {
            return getUriNameFallback();
        }
        int nameIndex = cursor.getColumnIndex("_display_name");
        cursor.moveToFirst();
        String name = cursor.getString(nameIndex);
        cursor.close();
        return name;
    }

    private String getUriNameFallback() {
        String[] components = this.uri.toString().split(File.separator);
        return components[components.length - 1];
    }
}
