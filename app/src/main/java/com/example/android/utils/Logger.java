package com.example.android.utils;

import android.util.Log;

public class Logger {
    private static boolean DEBUG = true;
    private static final String TAG = "Android";

    public static void e(String msg) {
        e(TAG, msg);
    }

    public static void e(String tag, String msg) {
        if (DEBUG) {
            Log.e(tag, msg);
        }
    }

    public static void d(String msg) {
        d(TAG, msg);
    }

    public static void d(String tag, String msg) {
        if (DEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void i(String msg) {
        i(TAG, msg);
    }

    public static void i(String tag, String msg) {
        if (DEBUG) {
            Log.i(tag, msg);
        }
    }

    public static void w(String msg) {
        w(TAG, msg);
    }

    public static void w(String tag, String msg) {
        if (DEBUG) {
            Log.w(tag, msg);
        }
    }

    public static void v(String msg) {
        v(TAG, msg);
    }

    public static void v(String tag, String msg) {
        if (DEBUG) {
            Log.v(tag, msg);
        }
    }
}
