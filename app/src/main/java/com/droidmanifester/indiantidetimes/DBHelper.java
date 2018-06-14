package com.droidmanifester.indiantidetimes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;

public class DBHelper extends SQLiteAssetHelper {
    //SQLiteDatabase sqLiteDatbase;
    SQLiteDatabase db;

    public DBHelper(Context context) {
        super(context, "itt.db", null, 1);
        db=getReadableDatabase();

    }

    public String getPoses(){
        String s,s1,s2,s3,s4;
        Cursor c = db.query("tbl_data",null,"cityid=?",new String[]{"4"},null,null,null);
        // select * from Persons where Name = name
        if(c.getCount()<1) {
            return "not exist";
        }
        c.moveToFirst();
        Log.i("fvhbjj",c.getColumnCount()+"  "+c.getCount());
        s = c.getString(c.getColumnIndex("Datee"));
        s1 = c.getString(c.getColumnIndex("Timee"));
        s2 = c.getString(c.getColumnIndex("Heightt"));
        s3 = c.getString(c.getColumnIndex("Infoo"));
        return s+" "+s1+" "+s2+" "+s3;
    }
//    public long savedat(String s1, String s2) {
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("Name",s1);
//        contentValues.put("Location",s2); // sqlite db
//        long j  = sqLiteDatabase.insert("Persons",null,contentValues);
//        return j;
//    }
//
//    public String getloc(String name) {
//        String s;
//        Cursor c = sqLiteDatabase.query("Persons",null,"Name=?",new String[]{name},null,null,null);
//        // select * from Persons where Name = name
//        if(c.getCount()<1) {
//            return "not exist";
//        }
//        c.moveToFirst();
//        s = c.getString(c.getColumnIndex("Location"));
//        return s;
//    }
//    public int updateval(String s4, String s5) {
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("Location",s5);
//        return sqLiteDatabase.update("Persons",contentValues,"Name = '"+s4+"'",null);
//        //  update table persons set Location='s5' where Name =  s4
//    }
}