package com.example.shraboni.sampleimplementation.data.db;

import android.content.Context;

import com.example.shraboni.sampleimplementation.di.custom_annotation.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DataManager {
    private Context mContext;
    private DbHelper mDbHelper;

    @Inject
    public DataManager(@ApplicationContext Context context,
                       DbHelper dbHelper) {
        mContext = context;
        mDbHelper = dbHelper;
    }

}
