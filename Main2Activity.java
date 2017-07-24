package com.example.ikkuiqbal.myappactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String s;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);

        Intent i=getIntent();
        s=i.getStringExtra("n");
        String s2=i.getStringExtra("n1");

        t1.setText(s);
        t2.setText(s2);



    }



}
