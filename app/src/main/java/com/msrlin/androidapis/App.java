package com.msrlin.androidapis;

import android.app.Application;

/**
 * Created by Administrator on 2016/3/23.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler());
    }

}
