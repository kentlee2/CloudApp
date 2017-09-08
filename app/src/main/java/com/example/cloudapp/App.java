package com.example.cloudapp;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/9/8.
 */

public class App extends Application {
    private static Context mContext;

    public static Context getContext() {
        return mContext;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();

    }

}
