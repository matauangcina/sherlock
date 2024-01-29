package com.insecureshop.contentProvider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.insecureshop.util.Prefs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InsecureshopFileProvider.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016JO\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0010\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u0016J;\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u0018¨\u0006\u001a"}, m19d2 = {"Lcom/insecureshop/contentProvider/InsecureshopFileProvider;", "Landroid/content/ContentProvider;", "()V", "delete", "", "uri", "Landroid/net/Uri;", "selection", "", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "insert", "values", "Landroid/content/ContentValues;", "onCreate", "", "query", "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class InsecureshopFileProvider extends ContentProvider {
    public static final Companion Companion = new Companion(null);
    public static final int URI_CODE = 100;
    private static UriMatcher uriMatcher;

    /* compiled from: InsecureshopFileProvider.kt */
    @Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m19d2 = {"Lcom/insecureshop/contentProvider/InsecureshopFileProvider$Companion;", "", "()V", "URI_CODE", "", "uriMatcher", "Landroid/content/UriMatcher;", "getUriMatcher", "()Landroid/content/UriMatcher;", "setUriMatcher", "(Landroid/content/UriMatcher;)V", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        public final UriMatcher getUriMatcher() {
            return InsecureshopFileProvider.uriMatcher;
        }

        public final void setUriMatcher(UriMatcher uriMatcher) {
            InsecureshopFileProvider.uriMatcher = uriMatcher;
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        UriMatcher uriMatcher2 = new UriMatcher(-1);
        uriMatcher = uriMatcher2;
        if (uriMatcher2 != null) {
            uriMatcher2.addURI("com.insecureshop.file_provider", "insecure", 100);
            return true;
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        UriMatcher uriMatcher2 = uriMatcher;
        if (uriMatcher2 != null && uriMatcher2.match(uri) == 100) {
            MatrixCursor cursor = new MatrixCursor(new String[]{"username", "password"});
            String[] strArr = new String[2];
            String username = Prefs.INSTANCE.getUsername();
            if (username == null) {
                Intrinsics.throwNpe();
            }
            strArr[0] = username;
            String password = Prefs.INSTANCE.getPassword();
            if (password == null) {
                Intrinsics.throwNpe();
            }
            strArr[1] = password;
            cursor.addRow(strArr);
            return cursor;
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        return 0;
    }
}
