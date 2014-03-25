package com.okry.base.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.okry.base.log.L;

/**
 * Created by MR on 14-3-20.
 */
public class BaseActivity extends Activity{

    protected final String LIFE_CYCLE_TAG = "lifecycle" + "[%s]";
    protected final String CLASS_TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        L.d(LIFE_CYCLE_TAG, CLASS_TAG + ":onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        L.d(LIFE_CYCLE_TAG, CLASS_TAG + ":onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        L.d(LIFE_CYCLE_TAG, CLASS_TAG + ":onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        L.d(LIFE_CYCLE_TAG, CLASS_TAG + ":onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        L.d(LIFE_CYCLE_TAG, CLASS_TAG + ":onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        L.d(LIFE_CYCLE_TAG, CLASS_TAG + ":onDestroy");
    }
}
