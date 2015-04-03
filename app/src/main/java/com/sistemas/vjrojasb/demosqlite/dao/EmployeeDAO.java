package com.sistemas.vjrojasb.demosqlite.dao;

import com.sistemas.vjrojasb.demosqlite.entity.Employee;

import android.content.ContentValues;
import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by vjrojasb on 3/30/15.
 */
public class EmployeeDAO extends EmployeeDBDAO {

    private static final SimpleDateFormat formatter = new SimpleDateFormat(
            "yyyy-MM-dd", Locale.ENGLISH);

    public EmployeeDAO(Context context) {
        super(context);
    }

    public long save(Employee employee) {
        ContentValues values = new ContentValues();
        values.put(DataBaseHelper.NAME_COLUMN, employee.getName());
        values.put(DataBaseHelper.EMPLOYEE_DOB, formatter.format(employee.getDateOfBirth()));
        values.put(DataBaseHelper.EMPLOYEE_SALARY, employee.getSalary());
        values.put(DataBaseHelper.EMPLOYEE_DEPARTMENT_ID, employee.getDepartment().getId());

        return database.insert(DataBaseHelper.EMPLOYEE_TABLE, null, values);
    }


}
