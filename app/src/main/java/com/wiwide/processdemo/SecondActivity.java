package com.wiwide.processdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e(TAG, getPackageName());

        Log.e(TAG, "SecondActivity: sUserId = " + UserManager.sUserId);
    }

    public void openThirdActivity(View v) {
        startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
    }
}
