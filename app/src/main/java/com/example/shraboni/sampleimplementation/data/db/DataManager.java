package com.example.shraboni.sampleimplementation.data.db;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DataManager {
    private Context mContext;
    private DbHelper mDbHelper;

    @Inject
    public DataManager(Context context,
                       DbHelper dbHelper) {
        mContext = context;
        mDbHelper = dbHelper;
    }

}
