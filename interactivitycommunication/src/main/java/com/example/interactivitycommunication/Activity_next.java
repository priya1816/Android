package com.example.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Activity_next extends AppCompatActivity {
    public static final String TAG = Activity_next.class.getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        findViewById(R.id.btnBack).setOnClickListener(this::onBack);
        Intent intentResponse = getIntent();
        Bundle bundle = intentResponse.getExtras();
        if(bundle!=null){
            String one = bundle.getString("one");
            String two = bundle.getString("two");
            ((RadioButton)findViewById(R.id.radOne)).setText(one);
            ((RadioButton)findViewById(R.id.radTwo)).setText(two);


        }
    }

    private void onBack(View view) {
    }
}
