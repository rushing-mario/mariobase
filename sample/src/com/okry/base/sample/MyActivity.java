package com.okry.base.sample;

import android.os.Bundle;
import android.widget.Toast;
import com.okry.base.activity.BaseActivity;

public class MyActivity extends BaseActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Toast.makeText(this, "Hello Mario Base", Toast.LENGTH_SHORT).show();
    }
}
