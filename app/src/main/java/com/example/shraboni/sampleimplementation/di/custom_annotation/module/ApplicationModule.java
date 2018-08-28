package com.example.shraboni.sampleimplementation.di.custom_annotation.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.shraboni.sampleimplementation.data.db.DbHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mrrobot on 8/25/17.
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }


    @Provides
    @Singleton
    DbHelper provideDbHelper(Context context) {
        return new DbHelper(context);
    }


}
