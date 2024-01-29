package com.test.test.database;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p004db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class EmployeeDao_Impl implements EmployeeDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<Employee> __insertionAdapterOfEmployee;
    private final SharedSQLiteStatement __preparedStmtOfRemoveEmployees;

    public EmployeeDao_Impl(final RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfEmployee = new EntityInsertionAdapter<Employee>(__db) { // from class: com.test.test.database.EmployeeDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR IGNORE INTO `employee` (`id`,`nik`,`employee_name`,`employee_email`,`phone_number`,`domicile`,`position`) VALUES (?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            public void bind(final SupportSQLiteStatement statement, final Employee entity) {
                if (entity.getId() == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindString(1, entity.getId());
                }
                if (entity.getNIK() == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindString(2, entity.getNIK());
                }
                if (entity.getName() == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindString(3, entity.getName());
                }
                if (entity.getEmail() == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindString(4, entity.getEmail());
                }
                if (entity.getPhoneNum() == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindString(5, entity.getPhoneNum());
                }
                if (entity.getDomicile() == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindString(6, entity.getDomicile());
                }
                if (entity.getPosition() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, entity.getPosition());
                }
            }
        };
        this.__preparedStmtOfRemoveEmployees = new SharedSQLiteStatement(__db) { // from class: com.test.test.database.EmployeeDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM employee";
            }
        };
    }

    @Override // com.test.test.database.EmployeeDao
    public void insert(final Employee employee) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfEmployee.insert((EntityInsertionAdapter<Employee>) employee);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.test.test.database.EmployeeDao
    public void removeEmployees() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement _stmt = this.__preparedStmtOfRemoveEmployees.acquire();
        try {
            this.__db.beginTransaction();
            _stmt.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
        } finally {
            this.__preparedStmtOfRemoveEmployees.release(_stmt);
        }
    }

    @Override // com.test.test.database.EmployeeDao
    public List<Employee> getEmployees() {
        String _tmpMId;
        String _tmpMNIK;
        String _tmpMName;
        int _cursorIndexOfMId;
        String _tmpMEmail;
        String _tmpMEmail2;
        String _tmpMPhoneNum;
        String _tmpMDomicile;
        RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire("SELECT * FROM employee", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor _cursor = DBUtil.query(this.__db, _statement, false, null);
        try {
            int _cursorIndexOfMId2 = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            int _cursorIndexOfMNIK = CursorUtil.getColumnIndexOrThrow(_cursor, "nik");
            int _cursorIndexOfMName = CursorUtil.getColumnIndexOrThrow(_cursor, "employee_name");
            int _cursorIndexOfMEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "employee_email");
            int _cursorIndexOfMPhoneNum = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_number");
            int _cursorIndexOfMDomicile = CursorUtil.getColumnIndexOrThrow(_cursor, "domicile");
            int _cursorIndexOfMPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "position");
            List<Employee> _result = new ArrayList<>(_cursor.getCount());
            while (_cursor.moveToNext()) {
                Employee _item = new Employee();
                if (_cursor.isNull(_cursorIndexOfMId2)) {
                    _tmpMId = null;
                } else {
                    _tmpMId = _cursor.getString(_cursorIndexOfMId2);
                }
                _item.setId(_tmpMId);
                if (_cursor.isNull(_cursorIndexOfMNIK)) {
                    _tmpMNIK = null;
                } else {
                    _tmpMNIK = _cursor.getString(_cursorIndexOfMNIK);
                }
                _item.setNIK(_tmpMNIK);
                if (_cursor.isNull(_cursorIndexOfMName)) {
                    _tmpMName = null;
                } else {
                    _tmpMName = _cursor.getString(_cursorIndexOfMName);
                }
                _item.setName(_tmpMName);
                if (_cursor.isNull(_cursorIndexOfMEmail)) {
                    _cursorIndexOfMId = _cursorIndexOfMId2;
                    _tmpMEmail = null;
                } else {
                    String _tmpMEmail3 = _cursor.getString(_cursorIndexOfMEmail);
                    _cursorIndexOfMId = _cursorIndexOfMId2;
                    _tmpMEmail = _tmpMEmail3;
                }
                _item.setEmail(_tmpMEmail);
                if (_cursor.isNull(_cursorIndexOfMPhoneNum)) {
                    _tmpMEmail2 = null;
                } else {
                    String _tmpMPhoneNum2 = _cursor.getString(_cursorIndexOfMPhoneNum);
                    _tmpMEmail2 = _tmpMPhoneNum2;
                }
                _item.setPhoneNum(_tmpMEmail2);
                if (_cursor.isNull(_cursorIndexOfMDomicile)) {
                    _tmpMPhoneNum = null;
                } else {
                    String _tmpMDomicile2 = _cursor.getString(_cursorIndexOfMDomicile);
                    _tmpMPhoneNum = _tmpMDomicile2;
                }
                _item.setDomicile(_tmpMPhoneNum);
                if (_cursor.isNull(_cursorIndexOfMPosition)) {
                    _tmpMDomicile = null;
                } else {
                    String _tmpMPosition = _cursor.getString(_cursorIndexOfMPosition);
                    _tmpMDomicile = _tmpMPosition;
                }
                _item.setPosition(_tmpMDomicile);
                _result.add(_item);
                _cursorIndexOfMId2 = _cursorIndexOfMId;
            }
            return _result;
        } finally {
            _cursor.close();
            _statement.release();
        }
    }

    @Override // com.test.test.database.EmployeeDao
    public Employee getEmployee(final String id) {
        Employee _result;
        String _tmpMId;
        String _tmpMNIK;
        String _tmpMName;
        String _tmpMName2;
        String _tmpMEmail;
        String _tmpMPhoneNum;
        String _tmpMDomicile;
        RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire("SELECT * FROM employee WHERE id = ?", 1);
        if (id == null) {
            _statement.bindNull(1);
        } else {
            _statement.bindString(1, id);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor _cursor = DBUtil.query(this.__db, _statement, false, null);
        try {
            int _cursorIndexOfMId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            int _cursorIndexOfMNIK = CursorUtil.getColumnIndexOrThrow(_cursor, "nik");
            int _cursorIndexOfMName = CursorUtil.getColumnIndexOrThrow(_cursor, "employee_name");
            int _cursorIndexOfMEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "employee_email");
            int _cursorIndexOfMPhoneNum = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_number");
            int _cursorIndexOfMDomicile = CursorUtil.getColumnIndexOrThrow(_cursor, "domicile");
            int _cursorIndexOfMPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "position");
            if (_cursor.moveToFirst()) {
                _result = new Employee();
                if (_cursor.isNull(_cursorIndexOfMId)) {
                    _tmpMId = null;
                } else {
                    _tmpMId = _cursor.getString(_cursorIndexOfMId);
                }
                _result.setId(_tmpMId);
                if (_cursor.isNull(_cursorIndexOfMNIK)) {
                    _tmpMNIK = null;
                } else {
                    _tmpMNIK = _cursor.getString(_cursorIndexOfMNIK);
                }
                _result.setNIK(_tmpMNIK);
                if (_cursor.isNull(_cursorIndexOfMName)) {
                    _tmpMName = null;
                } else {
                    String _tmpMName3 = _cursor.getString(_cursorIndexOfMName);
                    _tmpMName = _tmpMName3;
                }
                _result.setName(_tmpMName);
                if (_cursor.isNull(_cursorIndexOfMEmail)) {
                    _tmpMName2 = null;
                } else {
                    String _tmpMEmail2 = _cursor.getString(_cursorIndexOfMEmail);
                    _tmpMName2 = _tmpMEmail2;
                }
                _result.setEmail(_tmpMName2);
                if (_cursor.isNull(_cursorIndexOfMPhoneNum)) {
                    _tmpMEmail = null;
                } else {
                    String _tmpMPhoneNum2 = _cursor.getString(_cursorIndexOfMPhoneNum);
                    _tmpMEmail = _tmpMPhoneNum2;
                }
                _result.setPhoneNum(_tmpMEmail);
                if (_cursor.isNull(_cursorIndexOfMDomicile)) {
                    _tmpMPhoneNum = null;
                } else {
                    String _tmpMDomicile2 = _cursor.getString(_cursorIndexOfMDomicile);
                    _tmpMPhoneNum = _tmpMDomicile2;
                }
                _result.setDomicile(_tmpMPhoneNum);
                if (_cursor.isNull(_cursorIndexOfMPosition)) {
                    _tmpMDomicile = null;
                } else {
                    String _tmpMPosition = _cursor.getString(_cursorIndexOfMPosition);
                    _tmpMDomicile = _tmpMPosition;
                }
                _result.setPosition(_tmpMDomicile);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _cursor.close();
            _statement.release();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
