package com.example.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnAndroid).setOnClickListener(this::onMango);
        findViewById(R.id.btnApple).setOnClickListener(this::onApple);
    }
    private void onApple(View view) {

        Class<Activity_next> cls = Activity_next.class;

        Bundle bundle = new Bundle();
        bundle.putString("one","iOS5");
        bundle.putString("two","iOS6");

        Intent intent = new Intent(this, cls);
        intent.putExtras(bundle);

        startActivity(intent);
        startActivityForResult(intent,333);
    }
    private void onMango(View view){

        Class<Activity_next> cls = Activity_next.class;

        Bundle bundle = new Bundle();
        bundle.putString("one","Nougat");
        bundle.putString("two","Marshmallow");

        Intent intent = new Intent(this, cls);
        intent.putExtras(bundle);

        startActivity(intent);
        startActivityForResult(intent,333);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 333){
            Bundle bundle = data.getExtras();
            if(bundle !=null){

                String res = bundle.getString("res");

                ((TextView)findViewById(R.id.txtRes)).setText(res);
            }
        }
    }
}
