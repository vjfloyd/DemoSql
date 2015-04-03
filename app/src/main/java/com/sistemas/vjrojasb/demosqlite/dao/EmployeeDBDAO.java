package com.sistemas.vjrojasb.demosqlite.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/**
 * Created by vjrojasb on 3/30/15.
 */
public class EmployeeDBDAO {

    protected SQLiteDatabase database;
    private DataBaseHelper dbHelper;
    private Context mContext;

    public EmployeeDBDAO(Context context)  {
        this.mContext = context;
        this.dbHelper = dbHelper;
        open();
    }

    public void open() throws SQLiteException{
        if(dbHelper == null)
            dbHelper = DataBaseHelper.getHelper(mContext);
        database = dbHelper.getWritableDatabase();
    }



}
