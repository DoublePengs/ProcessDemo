package com.wiwide.processdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, getPackageName());

        Log.e(TAG, "MainActivity: sUserId = " + UserManager.sUserId);
        UserManager.sUserId = 2;
        Log.e(TAG, "MainActivity: sUserId = " + UserManager.sUserId);
    }

    public void openSecondActivity(View v) {
        startActivity(new Intent(MainActivity.this, SecondActivity.class));
    }
}
