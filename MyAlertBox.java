package com.example.dotnet.androidmenu;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyAlertBox extends AppCompatActivity {

    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alertboxx);


        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            //Creating the instance of MyAlertBox
//            AlertDialog alertDialog = new AlertDialog.Builder(MyAlertBox.this).create();
//
//            // Setting Dialog Title
//            alertDialog.setTitle("Alert Dialog");
//
//            // Setting Dialog Message
//            alertDialog.setMessage("Welcome  AlertBox");
//
//            // Setting Icon to Dialog
//            alertDialog.setIcon(R.drawable.a);
//
//            // Setting OK Button
//
//
//            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialog, int which) {
//                    // Write your code here to execute after dialog closed
//                    Toast.makeText(getApplicationContext(), "You clicked on OK", Toast.LENGTH_SHORT).show();
//                }
//            });
//            alertDialog.show();

            AlertDialog.Builder alertDialog1 = new AlertDialog.Builder(MyAlertBox.this);


            alertDialog1.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // User pressed YES button. Write Logic Here
                    Toast.makeText(getApplicationContext(), "You clicked on YES",
                            Toast.LENGTH_SHORT).show();
                }
            });

            // Setting Negative "NO" Button
            alertDialog1.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // User pressed No button. Write Logic Here
                    Toast.makeText(getApplicationContext(), "You clicked on NO", Toast.LENGTH_SHORT).show();
                }
            });
            alertDialog1.show();

        }
    });//closing the setOnClickListener method

    }
}
