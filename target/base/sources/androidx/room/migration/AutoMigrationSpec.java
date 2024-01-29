package androidx.room.migration;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AutoMigrationSpec.kt */
@Metadata(m23d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m22d2 = {"Landroidx/room/migration/AutoMigrationSpec;", "", "onPostMigrate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "room-runtime_release"}, m21k = 1, m20mv = {1, 8, 0}, m18xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface AutoMigrationSpec {
    default void onPostMigrate(SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
    }
}
