package com.example.tranthy.fortuneteller;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
/**
 * Created by tranthy on 3/12/14.
 */
public class dbHelper extends SQLiteOpenHelper {
    public static final String TABLE_NAME="user";
    public static final String COLUMN_NAME_ID="id";
    public static final String COLUMN_NAME_NAME="name";
    public static final String COLUMN_NAME_GENDER="gender";
    public static final String COLUMN_NAME_PLACE="place";
    public static final String COLUMN_NAME_DATE_OF_BIRTH="date_of_birth";
    public static final String COLUMN_NAME_TIME_OF_BIRTH="time_of_birth";

    private static final String SQL_CREATE="CREATE TABLE "+ TABLE_NAME + "("+
            COLUMN_NAME_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
            COLUMN_NAME_NAME + " TEXT NOT NULL,"+
            COLUMN_NAME_GENDER+ " TEXT NOT NULL,"+
            COLUMN_NAME_PLACE+ " TEXT NOT NULL,"+
            COLUMN_NAME_DATE_OF_BIRTH+ " TEXT NOT NULL,"+
            COLUMN_NAME_TIME_OF_BIRTH+ " TEXT NOT NULL);";
    private static final String SQL_DELETE="DROP TABLE IF EXISTS "+TABLE_NAME;
    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="userDB";
    public dbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(SQL_CREATE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL(SQL_DELETE);
        onCreate(db);
    }
}
