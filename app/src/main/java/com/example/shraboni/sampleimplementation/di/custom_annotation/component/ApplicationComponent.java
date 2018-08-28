package com.example.shraboni.sampleimplementation.di.custom_annotation.component;


import com.example.shraboni.sampleimplementation.ui.LoginActivity;
import com.example.shraboni.sampleimplementation.SampleImplementationapp;
import com.example.shraboni.sampleimplementation.di.custom_annotation.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mrrobot on 28/28/17.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(SampleImplementationapp target);

    void inject(LoginActivity target);

    }