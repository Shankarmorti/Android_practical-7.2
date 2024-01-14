package com.example.practical72;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e=(EditText) findViewById(R.id.edit1);
        EditText e1=(EditText) findViewById(R.id.edit2);
        EditText e2=(EditText) findViewById(R.id.edit3);
        EditText e3=(EditText) findViewById(R.id.edit4);
        EditText e4=(EditText) findViewById(R.id.edit5);

        Button bb = (Button) findViewById(R.id.btn1);

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Student Roll no="+e.getText().toString()+"\n Student your name="+e1.getText().toString()+"\n Student your class"+e2.getText().toString()+"\n Student your name="+e1.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
