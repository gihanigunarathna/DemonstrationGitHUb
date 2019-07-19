package com.gigi.myactivitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class FirstActivity extends AppCompatActivity {

    TextView tvmsg1,tvmsg2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        tvmsg1=findViewById(R.id.tvMessage1);
        tvmsg2=findViewById(R.id.tvMessage2);

        tvmsg2.setText(R.string.message2);
        Log.i("ActivityLifeCycle","onCreate() was invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ActivityLifeCycle","onStart() was invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ActivityLifeCycle","onResume() was invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ActivityLifeCycle","onPause() was invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ActivityLifeCycle","onStop() was invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ActivityLifeCycle","onDestroy() was invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ActivityLifeCycle","onRestart() was invoked");

    }
}
