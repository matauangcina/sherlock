package com.test.test.database;

import java.util.List;
/* loaded from: classes3.dex */
public interface EmployeeDao {
    Employee getEmployee(String id);

    List<Employee> getEmployees();

    void insert(Employee employee);

    void removeEmployees();
}
