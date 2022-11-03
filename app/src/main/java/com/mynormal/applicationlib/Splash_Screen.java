package com.mynormal.applicationlib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.unisob.vclibs.mads.SplashActivity;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        try {
            SplashActivity.All_Data(this, new Intent(this, Class.forName(getPackageName()  + ".MainActivity")));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
