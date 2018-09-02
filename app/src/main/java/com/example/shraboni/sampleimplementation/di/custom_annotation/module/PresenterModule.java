package com.example.shraboni.sampleimplementation.di.custom_annotation.module;


import android.content.Context;

import com.example.shraboni.sampleimplementation.ui.ILoginPresenter;
import com.example.shraboni.sampleimplementation.ui.LoginPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {
    @Provides
    @Singleton
    ILoginPresenter provideLoginPresenter(Context context) {
        return new LoginPresenter(context);
    }
}
