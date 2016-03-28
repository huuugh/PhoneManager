package com.app.hugh.androidphonemanager.Activity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

import com.app.hugh.androidphonemanager.R;

public class PhoneBakActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonebak);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    public void next(View view)
    {
        startActivity(new Intent(this,BindSIMActivity.class));
    }
}
