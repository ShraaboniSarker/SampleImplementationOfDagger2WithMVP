package com.example.shraboni.sampleimplementation.ui;

public class LoginPresenter implements ILoginPresenter {

    private ILoginView view;

    @Override
    public void setView(ILoginView view) {
        this.view = view;
    }

    @Override
    public void retriveData() {
        //will make the network call here
    }
}
