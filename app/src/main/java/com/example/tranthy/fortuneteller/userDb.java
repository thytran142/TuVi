package com.example.tranthy.fortuneteller;

/**
 * Created by tranthy on 3/12/14.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
public class userDb {
final Context context;
dbHelper DBHelper;
SQLiteDatabase db;
public userDb(Context ctx){
    this.context=ctx;
    DBHelper=new dbHelper(this.context);
        }
        //open the database
        public userDb open() throws SQLException{
            db=DBHelper.getWritableDatabase();
            return this;
        }
        //close the database
        public void close(){
            DBHelper.close();
        }
        //Insert a contact into the database
        public long insertUser(String name, String gender,String place,String dateOfBirth,String timeOfBirth){
            ContentValues initialValues=new ContentValues();
            initialValues.put(dbHelper.COLUMN_NAME_NAME,name);
            initialValues.put(dbHelper.COLUMN_NAME_GENDER,gender);
            initialValues.put(dbHelper.COLUMN_NAME_PLACE,place);
            initialValues.put(dbHelper.COLUMN_NAME_DATE_OF_BIRTH,dateOfBirth);
            initialValues.put(dbHelper.COLUMN_NAME_TIME_OF_BIRTH,timeOfBirth);
            return db.insert(dbHelper.TABLE_NAME,null,initialValues);
        }
        //retrieves all the contacts
        public Cursor getAllContacts(){
            return db.query(dbHelper.TABLE_NAME,new String[]{
                    dbHelper.COLUMN_NAME_ID,
                    dbHelper.COLUMN_NAME_NAME,
                    dbHelper.COLUMN_NAME_GENDER,
                    dbHelper.COLUMN_NAME_PLACE,
                    dbHelper.COLUMN_NAME_DATE_OF_BIRTH,
                    dbHelper.COLUMN_NAME_TIME_OF_BIRTH},null,null,null,null,null);
        }
        //retrieve a particular contact
        public Cursor getContact(long rowId) throws SQLException {
            Cursor mCursor = db.query(true, dbHelper.TABLE_NAME, new String[]{
                    dbHelper.COLUMN_NAME_ID,
                    dbHelper.COLUMN_NAME_NAME,
                    dbHelper.COLUMN_NAME_GENDER,
                    dbHelper.COLUMN_NAME_PLACE,
                    dbHelper.COLUMN_NAME_DATE_OF_BIRTH,
                    dbHelper.COLUMN_NAME_TIME_OF_BIRTH
            }, dbHelper.COLUMN_NAME_ID + "=" + rowId, null, null, null, null, null);
            if (mCursor != null) {
                mCursor.moveToFirst();
            }
            return mCursor;
        }
        //delete a particular contact
        public boolean deleteContact(long rowId){
            return db.delete(dbHelper.TABLE_NAME,dbHelper.COLUMN_NAME_ID+"="+rowId,null)>0;
        }
        //update a contact
        public boolean updateContact(long rowId,String name,String number,String email,String option, String message){
            ContentValues initialValues= new ContentValues();
            initialValues.put(dbHelper.COLUMN_NAME_NAME,name);
            initialValues.put(dbHelper.COLUMN_NAME_GENDER,number);
            initialValues.put(dbHelper.COLUMN_NAME_PLACE,email);
            initialValues.put(dbHelper.COLUMN_NAME_DATE_OF_BIRTH,option);
            initialValues.put(dbHelper.COLUMN_NAME_TIME_OF_BIRTH,message);
            return db.update(dbHelper.TABLE_NAME,initialValues,dbHelper.COLUMN_NAME_ID+"="+rowId,null)!=0;
        }
        //update a contact name
        public boolean updateContactName(long rowId,String newName){
            ContentValues initialValues= new ContentValues();
            initialValues.put(dbHelper.COLUMN_NAME_NAME,newName);
            return db.update(dbHelper.TABLE_NAME,initialValues,dbHelper.COLUMN_NAME_ID+"="+rowId,null)!=0;
        }
        public boolean updateContactNumber(long rowId,String newNumber){
            ContentValues initialValues= new ContentValues();
            initialValues.put(dbHelper.COLUMN_NAME_GENDER,newNumber);
            return db.update(dbHelper.TABLE_NAME,initialValues,dbHelper.COLUMN_NAME_ID+"="+rowId,null)!=0;
        }
        public boolean updateContactEmail(long rowId,String newEmail){
            ContentValues initialValues= new ContentValues();
            initialValues.put(dbHelper.COLUMN_NAME_PLACE,newEmail);
            return db.update(dbHelper.TABLE_NAME,initialValues,dbHelper.COLUMN_NAME_ID+"="+rowId,null)!=0;
        }
        public boolean updateOption(long rowId,String option){
            ContentValues initialValues= new ContentValues();
            initialValues.put(dbHelper.COLUMN_NAME_DATE_OF_BIRTH,option);
            return db.update(dbHelper.TABLE_NAME,initialValues,dbHelper.COLUMN_NAME_ID+"="+rowId,null)!=0;
        }
        public boolean updateMessage(long rowId,String message){
            ContentValues initialValues= new ContentValues();
            initialValues.put(dbHelper.COLUMN_NAME_TIME_OF_BIRTH,message);
            return db.update(dbHelper.TABLE_NAME,initialValues,dbHelper.COLUMN_NAME_ID+"="+rowId,null)!=0;
        }
}
