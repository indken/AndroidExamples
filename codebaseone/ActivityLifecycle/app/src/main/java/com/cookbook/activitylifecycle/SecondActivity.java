package com.cookbook.activitylifecycle;

/**
 * Created by KENNY on 14-12-2014.
 */


import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends MainActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "This Second Activity Created", Toast.LENGTH_SHORT).show();


    }


}
