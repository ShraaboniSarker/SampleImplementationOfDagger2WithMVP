package com.example.shraboni.sampleimplementation.ui;

import android.content.Context;

import com.example.shraboni.sampleimplementation.SampleImplementationapp;

public class LoginPresenter implements ILoginPresenter {

    private ILoginView view;

    public LoginPresenter(Context context) {
        ((SampleImplementationapp) context).getComponent().inject(this);

    }

    @Override
    public void setView(ILoginView view) {
        this.view = view;
    }

    @Override
    public void retriveData() {
        //will make the network call here
    }
}
