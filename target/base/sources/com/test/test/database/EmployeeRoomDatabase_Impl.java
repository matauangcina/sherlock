package com.test.test.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public final class EmployeeRoomDatabase_Impl extends EmployeeRoomDatabase {
    private volatile EmployeeDao _employeeDao;

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper createOpenHelper(final DatabaseConfiguration config) {
        SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) { // from class: com.test.test.database.EmployeeRoomDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(final SupportSQLiteDatabase db) {
                db.execSQL("CREATE TABLE IF NOT EXISTS `employee` (`id` TEXT NOT NULL, `nik` TEXT, `employee_name` TEXT, `employee_email` TEXT, `phone_number` TEXT, `domicile` TEXT, `position` TEXT, PRIMARY KEY(`id`))");
                db.execSQL(RoomMasterTable.CREATE_QUERY);
                db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '008c134402638cf51c3db9c3096f6fdb')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(final SupportSQLiteDatabase db) {
                db.execSQL("DROP TABLE IF EXISTS `employee`");
                List<? extends RoomDatabase.Callback> _callbacks = EmployeeRoomDatabase_Impl.this.mCallbacks;
                if (_callbacks != null) {
                    for (RoomDatabase.Callback _callback : _callbacks) {
                        _callback.onDestructiveMigration(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(final SupportSQLiteDatabase db) {
                List<? extends RoomDatabase.Callback> _callbacks = EmployeeRoomDatabase_Impl.this.mCallbacks;
                if (_callbacks != null) {
                    for (RoomDatabase.Callback _callback : _callbacks) {
                        _callback.onCreate(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(final SupportSQLiteDatabase db) {
                EmployeeRoomDatabase_Impl.this.mDatabase = db;
                EmployeeRoomDatabase_Impl.this.internalInitInvalidationTracker(db);
                List<? extends RoomDatabase.Callback> _callbacks = EmployeeRoomDatabase_Impl.this.mCallbacks;
                if (_callbacks != null) {
                    for (RoomDatabase.Callback _callback : _callbacks) {
                        _callback.onOpen(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(final SupportSQLiteDatabase db) {
                DBUtil.dropFtsSyncTriggers(db);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(final SupportSQLiteDatabase db) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(final SupportSQLiteDatabase db) {
                HashMap<String, TableInfo.Column> _columnsEmployee = new HashMap<>(7);
                _columnsEmployee.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                _columnsEmployee.put("nik", new TableInfo.Column("nik", "TEXT", false, 0, null, 1));
                _columnsEmployee.put("employee_name", new TableInfo.Column("employee_name", "TEXT", false, 0, null, 1));
                _columnsEmployee.put("employee_email", new TableInfo.Column("employee_email", "TEXT", false, 0, null, 1));
                _columnsEmployee.put("phone_number", new TableInfo.Column("phone_number", "TEXT", false, 0, null, 1));
                _columnsEmployee.put("domicile", new TableInfo.Column("domicile", "TEXT", false, 0, null, 1));
                _columnsEmployee.put("position", new TableInfo.Column("position", "TEXT", false, 0, null, 1));
                HashSet<TableInfo.ForeignKey> _foreignKeysEmployee = new HashSet<>(0);
                HashSet<TableInfo.Index> _indicesEmployee = new HashSet<>(0);
                TableInfo _infoEmployee = new TableInfo("employee", _columnsEmployee, _foreignKeysEmployee, _indicesEmployee);
                TableInfo _existingEmployee = TableInfo.read(db, "employee");
                if (!_infoEmployee.equals(_existingEmployee)) {
                    return new RoomOpenHelper.ValidationResult(false, "employee(com.test.test.database.Employee).\n Expected:\n" + _infoEmployee + "\n Found:\n" + _existingEmployee);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "008c134402638cf51c3db9c3096f6fdb", "7f2293e9cf3ea74d7241dd8d3a4748f4");
        SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
        SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
        return _helper;
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        HashMap<String, String> _shadowTablesMap = new HashMap<>(0);
        HashMap<String, Set<String>> _viewTables = new HashMap<>(0);
        return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "employee");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            _db.execSQL("DELETE FROM `employee`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            _db.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!_db.inTransaction()) {
                _db.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<>();
        _typeConvertersMap.put(EmployeeDao.class, EmployeeDao_Impl.getRequiredConverters());
        return _typeConvertersMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<>();
        return _autoMigrationSpecsSet;
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        List<Migration> _autoMigrations = new ArrayList<>();
        return _autoMigrations;
    }

    @Override // com.test.test.database.EmployeeRoomDatabase
    public EmployeeDao employeeDao() {
        EmployeeDao employeeDao;
        if (this._employeeDao != null) {
            return this._employeeDao;
        }
        synchronized (this) {
            if (this._employeeDao == null) {
                this._employeeDao = new EmployeeDao_Impl(this);
            }
            employeeDao = this._employeeDao;
        }
        return employeeDao;
    }
}
