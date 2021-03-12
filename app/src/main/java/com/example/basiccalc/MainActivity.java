package com.example.basiccalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        int num1 = 0;
        int num2 = 0;

        try {
            num1 = Integer.parseInt(num1EditText.getText().toString());
            num2 = Integer.parseInt(num2EditText.getText().toString());
        }
        catch(Exception e) {
            Log.e("DENNA", "No number entered, using default of 0");
            Toast.makeText(getApplicationContext(),"Please enter values for BOTH nums",Toast.LENGTH_SHORT).show();
        }


        int sum = num1 + num2;

        ansTextView.setText("Answer: " + sum);
        closeKeyboard();
    }

    public void subt(View v){
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        int num1 = Integer.parseInt(num1EditText.getText().toString());
        int num2 = Integer.parseInt(num2EditText.getText().toString());

        int diff = num1 - num2;

        ansTextView.setText("Answer: " + diff);
        closeKeyboard();
    }

    /*
       How to close the keyboard on buttonClick
       https://www.geeksforgeeks.org/how-to-programmatically-hide-android-soft-keyboard/
    */
    private void closeKeyboard()
    {
        // this will give us the view
        // which is currently focus
        // in this layout
        View view = this.getCurrentFocus();

        // if nothing is currently
        // focus then this will protect
        // the app from crash
        if (view != null) {

            // now assign the system
            // service to InputMethodManager
            InputMethodManager manager
                    = (InputMethodManager)
                    getSystemService(
                            Context.INPUT_METHOD_SERVICE);
            manager
                    .hideSoftInputFromWindow(
                            view.getWindowToken(), 0);
        }
    }
}