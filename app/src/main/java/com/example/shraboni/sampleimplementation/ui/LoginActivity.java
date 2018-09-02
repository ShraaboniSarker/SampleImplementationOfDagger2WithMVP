package com.example.shraboni.sampleimplementation.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.shraboni.sampleimplementation.R;
import com.example.shraboni.sampleimplementation.SampleImplementationapp;
import com.example.shraboni.sampleimplementation.data.db.DataManager;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements ILoginView{

    @Inject
    DataManager dataManager;

    @Inject
    ILoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ///injected this activity
        ((SampleImplementationapp) getApplication()).getComponent().inject(this);

        //set the view with presenter
        presenter.setView(this);
    }

    @Override
    public void loadData() {
        //after retriving data from presenter
        //will load to ui
    }
}
