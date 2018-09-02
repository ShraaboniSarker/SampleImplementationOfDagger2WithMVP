package com.example.shraboni.sampleimplementation.data.db;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.shraboni.sampleimplementation.di.custom_annotation.ApplicationContext;
import com.example.shraboni.sampleimplementation.di.custom_annotation.DatabaseInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DbHelper extends SQLiteOpenHelper {
    public static final String USER_TABLE_NAME = "users";
    public static final int USER_TABLE_VERSION = 1;
    public static final String USER_COLUMN_USER_ID = "id";
    public static final String USER_COLUMN_USER_NAME = "usr_name";
    public static final String USER_COLUMN_USER_ADDRESS = "usr_add";
    public static final String USER_COLUMN_USER_EMAIL = "usr_email";


    @Inject
    public DbHelper(@ApplicationContext Context context) {
        super(context,USER_TABLE_NAME,null,USER_TABLE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        tableCreateStatements(db);
    }


    private void tableCreateStatements(SQLiteDatabase db) {
        try {
            db.execSQL(
                    "CREATE TABLE IF NOT EXISTS "
                            + USER_TABLE_NAME + "("
                            + USER_COLUMN_USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                            + USER_COLUMN_USER_NAME + " VARCHAR(20), "
                            + USER_COLUMN_USER_ADDRESS + " VARCHAR(50), "
                            + USER_COLUMN_USER_EMAIL + " TEXT "  + ")"
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + USER_TABLE_NAME);
        onCreate(db);
    }
}
