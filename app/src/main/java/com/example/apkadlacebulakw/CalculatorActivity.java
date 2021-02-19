package com.example.apkadlacebulakw;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {
    boolean dolanOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void calculate(View v) {
        double price = Double.parseDouble(((TextView) findViewById(R.id.price)).getText().toString());
        double amount = Double.parseDouble(((TextView) findViewById(R.id.amount)).getText().toString());
        if (amount == 0 && !dolanOn) {
            findViewById(R.id.dolan).setVisibility(View.VISIBLE);
        }
        EditText t = findViewById(R.id.amount);
        String input = t.getText().toString();
        Log.d("result", ((TextView) findViewById(R.id.result)).getText().toString());

//        double number = Double.parseDouble(price.gettex)

        Log.d("price", String.valueOf(price));
        Log.d("amount", String.valueOf(amount));
        Log.d("price / amount", String.valueOf(price / amount));
        Toast.makeText(this, String.valueOf(price / amount), Toast.LENGTH_LONG).show();
        ((TextView) findViewById(R.id.result)).setText(String.valueOf(price / amount));
    }

    public void calculate2() {
    }

}
