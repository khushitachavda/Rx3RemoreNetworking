package com.janak.rxandroidnetworking;

import android.app.Application;

public class NetworkingApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
/*
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .addNetworkInterceptor(new StethoInterceptor())
                .addInterceptor(new CurlLoggerInterceptor())
                .build();
        AndroidNetworking.initialize(getApplicationContext(), okHttpClient);

        */

        //AndroidNetworking.initialize(getApplicationContext());
    }
}
