package com.kairocosta.keepapp;

import android.app.Application;
import android.util.Log;

/**
 * Created by lapesi on 08/03/17.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static void log(String TAG, String message) {
        if(BuildConfig.DEBUG) Log.i(TAG, message);
    }

    public static void startNewThread(Runnable runnable) {
        new Thread(runnable).start();
    }

}
