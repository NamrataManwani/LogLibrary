package com.loglibrary;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.loglib.LogMethods;

/**
 * Created by KamalManwani on 1/2/2018.
 */

public class MainActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogMethods.logError("test");
    }
}
