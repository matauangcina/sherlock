package com.test.test.database;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import com.test.test.database.EmployeeRoomDatabase;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes3.dex */
public abstract class EmployeeRoomDatabase extends RoomDatabase {
    private static volatile EmployeeRoomDatabase INSTANCE = null;
    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService writeExecutor = Executors.newFixedThreadPool(4);
    private static final RoomDatabase.Callback sRoomDatabaseCallback = new C13721();

    public abstract EmployeeDao employeeDao();

    public static EmployeeRoomDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (EmployeeRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = (EmployeeRoomDatabase) Room.databaseBuilder(context.getApplicationContext(), EmployeeRoomDatabase.class, "employee.db").addCallback(sRoomDatabaseCallback).allowMainThreadQueries().build();
                }
            }
        }
        return INSTANCE;
    }

    /* renamed from: com.test.test.database.EmployeeRoomDatabase$1 */
    /* loaded from: classes3.dex */
    class C13721 extends RoomDatabase.Callback {
        C13721() {
        }

        @Override // androidx.room.RoomDatabase.Callback
        public void onCreate(SupportSQLiteDatabase db) {
            super.onCreate(db);
            EmployeeRoomDatabase.writeExecutor.execute(new Runnable() { // from class: com.test.test.database.EmployeeRoomDatabase$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    EmployeeRoomDatabase.C13721.lambda$onCreate$0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void lambda$onCreate$0() {
            EmployeeDao dao = EmployeeRoomDatabase.INSTANCE.employeeDao();
            dao.removeEmployees();
            Employee employee = new Employee("0000000000000000", "Bambang", "bambang@gmail.com", "081263546354", "New York", "administrator");
            dao.insert(employee);
            Employee employee2 = new Employee("1111111111111111", "Cecilia", "cecilia@gmail.com", "083546253746", "Chicago", "manager");
            dao.insert(employee2);
        }
    }
}
