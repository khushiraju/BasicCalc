package com.example.basiccalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View v){
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        int num1 = Integer.parseInt(num1EditText.getText().toString());
        int num2 = Integer.parseInt(num2EditText.getText().toString());

        int sum = num1 + num2;

        ansTextView.setText("Answer: " + sum);
    }

    public void subt(View v){
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        int num1 = Integer.parseInt(num1EditText.getText().toString());
        int num2 = Integer.parseInt(num2EditText.getText().toString());

        int diff = num1 - num2;

        ansTextView.setText("Answer: " + diff);
    }
}