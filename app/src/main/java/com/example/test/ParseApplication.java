package com.example.test;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("D3a51A7tjMOdS3vr7AlilT2SN8cGnA6tjYeZkjoB")
                .clientKey("4b4bNaDXBAYgxkFJz0cDioo8GzGTkGbwMOqCrovQ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
