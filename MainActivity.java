package com.example.ikkuiqbal.myappactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(getApplicationContext(), "item1", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(getApplicationContext(), "item2", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(), "item3", Toast.LENGTH_LONG).show();
                return true;
            default:

                return super.onOptionsItemSelected(item);
        }
    }
    Button b1;
    EditText et;
    EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button);
        et=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name =et.getText().toString();
                String pwd =et2.getText().toString();


                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("n",name);
                intent.putExtra("n1",pwd);
                startActivity(intent);
            }
        });


    }
}
