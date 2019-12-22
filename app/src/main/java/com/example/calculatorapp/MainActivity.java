package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void onButtonClick(View view){
        EditText e1=(EditText)findViewById(R.id.editText8);
        EditText e2=(EditText)findViewById(R.id.editText9);
        EditText e3=(EditText)findViewById(R.id.editText11);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());
        int num3=num1+num2;
        e3.setText(Integer.toString(num3));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
