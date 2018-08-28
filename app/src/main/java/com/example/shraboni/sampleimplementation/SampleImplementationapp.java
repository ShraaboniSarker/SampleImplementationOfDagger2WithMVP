package com.example.shraboni.sampleimplementation;

import android.app.Application;
import android.content.Context;

import com.example.shraboni.sampleimplementation.data.db.DataManager;
import com.example.shraboni.sampleimplementation.di.custom_annotation.component.ApplicationComponent;
import com.example.shraboni.sampleimplementation.di.custom_annotation.module.ApplicationModule;

import javax.inject.Inject;

public class SampleImplementationapp extends Application {
    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static SampleImplementationapp get(Context context) {
        return (SampleImplementationapp) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}

