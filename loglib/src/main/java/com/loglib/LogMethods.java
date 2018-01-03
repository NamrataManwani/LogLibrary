package com.loglib;

import android.util.Log;

/**
 * Created by KamalManwani on 1/2/2018.
 */

public class LogMethods {
    private static final String LOGLIBRARY= "LogLibrary";

    public static void logDebug(String text) {
        Log.d("LOGLIBRARY",text);
    }

    public static void logError(String text) {
        Log.e("LOGLIBRARY",text);
    }

    public static void logInfo(String text) {
        Log.i("LOGLIBRARY",text);
    }

    public static void logWarning(String text) {
        Log.w("LOGLIBRARY",text);
    }

    public static void logVerbose(String text) {
        Log.v("LOGLIBRARY",text);
    }

    public static void logTerribleFailures(String text) {
        Log.wtf("LOGLIBRARY",text);
    }
}
