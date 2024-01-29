package androidx.room.util;

import android.database.Cursor;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.util.TableInfo;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p005io.CloseableKt;
/* compiled from: TableInfo.kt */
@Metadata(m23d1 = {"\u0000H\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\"\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a \u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¨\u0006\u0017"}, m22d2 = {"readColumns", "", "", "Landroidx/room/util/TableInfo$Column;", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "tableName", "readForeignKeyFieldMappings", "", "Landroidx/room/util/TableInfo$ForeignKeyWithSequence;", "cursor", "Landroid/database/Cursor;", "readForeignKeys", "", "Landroidx/room/util/TableInfo$ForeignKey;", "readIndex", "Landroidx/room/util/TableInfo$Index;", "name", "unique", "", "readIndices", "readTableInfo", "Landroidx/room/util/TableInfo;", "room-runtime_release"}, m21k = 2, m20mv = {1, 8, 0}, m18xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TableInfoKt {
    public static final TableInfo readTableInfo(SupportSQLiteDatabase database, String tableName) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Map columns = readColumns(database, tableName);
        Set foreignKeys = readForeignKeys(database, tableName);
        Set indices = readIndices(database, tableName);
        return new TableInfo(tableName, columns, foreignKeys, indices);
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(SupportSQLiteDatabase database, String tableName) {
        Throwable th;
        List myColumns;
        List refColumns;
        boolean z;
        Cursor $this$useCursor$iv = database.query("PRAGMA foreign_key_list(`" + tableName + "`)");
        boolean z2 = false;
        Cursor cursor = $this$useCursor$iv;
        try {
            Cursor cursor2 = cursor;
            boolean z3 = false;
            int idColumnIndex = cursor2.getColumnIndex("id");
            int seqColumnIndex = cursor2.getColumnIndex("seq");
            int tableColumnIndex = cursor2.getColumnIndex("table");
            int onDeleteColumnIndex = cursor2.getColumnIndex("on_delete");
            int onUpdateColumnIndex = cursor2.getColumnIndex("on_update");
            Iterable ordered = readForeignKeyFieldMappings(cursor2);
            cursor2.moveToPosition(-1);
            Set $this$readForeignKeys_u24lambda_u243_u24lambda_u242 = SetsKt.createSetBuilder();
            while (cursor2.moveToNext()) {
                int seq = cursor2.getInt(seqColumnIndex);
                if (seq == 0) {
                    int id = cursor2.getInt(idColumnIndex);
                    List myColumns2 = new ArrayList();
                    List refColumns2 = new ArrayList();
                    Iterable $this$filter$iv = ordered;
                    Collection destination$iv$iv = new ArrayList();
                    for (Object element$iv$iv : $this$filter$iv) {
                        try {
                            TableInfo.ForeignKeyWithSequence it = (TableInfo.ForeignKeyWithSequence) element$iv$iv;
                            Cursor $this$useCursor$iv2 = $this$useCursor$iv;
                            int id2 = id;
                            if (it.getId() == id2) {
                                Collection destination$iv$iv2 = destination$iv$iv;
                                try {
                                    destination$iv$iv2.add(element$iv$iv);
                                    destination$iv$iv = destination$iv$iv2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        CloseableKt.closeFinally(cursor, th);
                                        throw th3;
                                    }
                                }
                            }
                            id = id2;
                            $this$useCursor$iv = $this$useCursor$iv2;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    Cursor $this$useCursor$iv3 = $this$useCursor$iv;
                    int id3 = id;
                    try {
                        Iterable $this$forEach$iv = (List) destination$iv$iv;
                        boolean z4 = false;
                        for (Object element$iv : $this$forEach$iv) {
                            TableInfo.ForeignKeyWithSequence key = (TableInfo.ForeignKeyWithSequence) element$iv;
                            Iterable $this$forEach$iv2 = $this$forEach$iv;
                            boolean z5 = z4;
                            List myColumns3 = myColumns2;
                            myColumns3.add(key.getFrom());
                            int id4 = id3;
                            List refColumns3 = refColumns2;
                            refColumns3.add(key.getTo());
                            refColumns2 = refColumns3;
                            $this$forEach$iv = $this$forEach$iv2;
                            id3 = id4;
                            myColumns2 = myColumns3;
                            z4 = z5;
                        }
                        myColumns = myColumns2;
                        refColumns = refColumns2;
                        z = z2;
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                    try {
                        String string = cursor2.getString(tableColumnIndex);
                        boolean z6 = z3;
                        Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(tableColumnIndex)");
                        String string2 = cursor2.getString(onDeleteColumnIndex);
                        int idColumnIndex2 = idColumnIndex;
                        Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(onDeleteColumnIndex)");
                        String string3 = cursor2.getString(onUpdateColumnIndex);
                        Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onUpdateColumnIndex)");
                        $this$readForeignKeys_u24lambda_u243_u24lambda_u242.add(new TableInfo.ForeignKey(string, string2, string3, myColumns, refColumns));
                        z2 = z;
                        z3 = z6;
                        idColumnIndex = idColumnIndex2;
                        cursor2 = cursor2;
                        $this$useCursor$iv = $this$useCursor$iv3;
                    } catch (Throwable th6) {
                        th = th6;
                        throw th;
                    }
                }
            }
            Set<TableInfo.ForeignKey> build = SetsKt.build($this$readForeignKeys_u24lambda_u243_u24lambda_u242);
            CloseableKt.closeFinally(cursor, null);
            return build;
        } catch (Throwable th7) {
            th = th7;
        }
    }

    private static final List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings(Cursor cursor) {
        int idColumnIndex = cursor.getColumnIndex("id");
        int seqColumnIndex = cursor.getColumnIndex("seq");
        int fromColumnIndex = cursor.getColumnIndex(TypedValues.TransitionType.S_FROM);
        int toColumnIndex = cursor.getColumnIndex(TypedValues.TransitionType.S_TO);
        List $this$readForeignKeyFieldMappings_u24lambda_u244 = CollectionsKt.createListBuilder();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(idColumnIndex);
            int i2 = cursor.getInt(seqColumnIndex);
            String string = cursor.getString(fromColumnIndex);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(toColumnIndex);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            $this$readForeignKeyFieldMappings_u24lambda_u244.add(new TableInfo.ForeignKeyWithSequence(i, i2, string, string2));
        }
        return CollectionsKt.sorted(CollectionsKt.build($this$readForeignKeyFieldMappings_u24lambda_u244));
    }

    private static final Map<String, TableInfo.Column> readColumns(SupportSQLiteDatabase database, String tableName) {
        Throwable th;
        String str = "type";
        String str2 = "name";
        Cursor $this$useCursor$iv = database.query("PRAGMA table_info(`" + tableName + "`)");
        Cursor cursor = $this$useCursor$iv;
        try {
            Cursor cursor2 = cursor;
            if (cursor2.getColumnCount() <= 0) {
                try {
                    Map<String, TableInfo.Column> emptyMap = MapsKt.emptyMap();
                    CloseableKt.closeFinally(cursor, null);
                    return emptyMap;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                int nameIndex = cursor2.getColumnIndex("name");
                int typeIndex = cursor2.getColumnIndex("type");
                int notNullIndex = cursor2.getColumnIndex("notnull");
                int pkIndex = cursor2.getColumnIndex("pk");
                int defaultValueIndex = cursor2.getColumnIndex("dflt_value");
                Map createMapBuilder = MapsKt.createMapBuilder();
                Map $this$readColumns_u24lambda_u246_u24lambda_u245 = createMapBuilder;
                while (cursor2.moveToNext()) {
                    String name = cursor2.getString(nameIndex);
                    String type = cursor2.getString(typeIndex);
                    boolean notNull = cursor2.getInt(notNullIndex) != 0;
                    int primaryKeyPosition = cursor2.getInt(pkIndex);
                    String defaultValue = cursor2.getString(defaultValueIndex);
                    Intrinsics.checkNotNullExpressionValue(name, str2);
                    String str3 = str2;
                    Cursor $this$useCursor$iv2 = $this$useCursor$iv;
                    try {
                        Intrinsics.checkNotNullExpressionValue(type, str);
                        String str4 = str;
                        Map $this$readColumns_u24lambda_u246_u24lambda_u2452 = $this$readColumns_u24lambda_u246_u24lambda_u245;
                        $this$readColumns_u24lambda_u246_u24lambda_u2452.put(name, new TableInfo.Column(name, type, notNull, primaryKeyPosition, defaultValue, 2));
                        $this$readColumns_u24lambda_u246_u24lambda_u245 = $this$readColumns_u24lambda_u246_u24lambda_u2452;
                        str = str4;
                        str2 = str3;
                        $this$useCursor$iv = $this$useCursor$iv2;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                Map<String, TableInfo.Column> build = MapsKt.build(createMapBuilder);
                CloseableKt.closeFinally(cursor, null);
                return build;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            throw th;
        } catch (Throwable th5) {
            CloseableKt.closeFinally(cursor, th);
            throw th5;
        }
    }

    private static final Set<TableInfo.Index> readIndices(SupportSQLiteDatabase database, String tableName) {
        Throwable th;
        Cursor $this$useCursor$iv = database.query("PRAGMA index_list(`" + tableName + "`)");
        Cursor cursor = $this$useCursor$iv;
        try {
            Cursor cursor2 = cursor;
            int nameColumnIndex = cursor2.getColumnIndex("name");
            int originColumnIndex = cursor2.getColumnIndex("origin");
            int uniqueIndex = cursor2.getColumnIndex("unique");
            if (nameColumnIndex != -1 && originColumnIndex != -1) {
                if (uniqueIndex != -1) {
                    Set $this$readIndices_u24lambda_u248_u24lambda_u247 = SetsKt.createSetBuilder();
                    while (cursor2.moveToNext()) {
                        String origin = cursor2.getString(originColumnIndex);
                        if (Intrinsics.areEqual("c", origin)) {
                            String name = cursor2.getString(nameColumnIndex);
                            Cursor $this$useCursor$iv2 = $this$useCursor$iv;
                            try {
                                boolean z = true;
                                if (cursor2.getInt(uniqueIndex) != 1) {
                                    z = false;
                                }
                                boolean unique = z;
                                Intrinsics.checkNotNullExpressionValue(name, "name");
                                TableInfo.Index index = readIndex(database, name, unique);
                                if (index == null) {
                                    CloseableKt.closeFinally(cursor, null);
                                    return null;
                                }
                                $this$readIndices_u24lambda_u248_u24lambda_u247.add(index);
                                $this$useCursor$iv = $this$useCursor$iv2;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    CloseableKt.closeFinally(cursor, th);
                                    throw th3;
                                }
                            }
                        }
                    }
                    Set<TableInfo.Index> build = SetsKt.build($this$readIndices_u24lambda_u248_u24lambda_u247);
                    CloseableKt.closeFinally(cursor, null);
                    return build;
                }
            }
            CloseableKt.closeFinally(cursor, null);
            return null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:19:0x007e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static final androidx.room.util.TableInfo.Index readIndex(androidx.sqlite.p004db.SupportSQLiteDatabase r21, java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.TableInfoKt.readIndex(androidx.sqlite.db.SupportSQLiteDatabase, java.lang.String, boolean):androidx.room.util.TableInfo$Index");
    }
}
