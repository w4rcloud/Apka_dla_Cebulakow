package com.example.apkadlacebulakw;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

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
            findViewById(R.id.button).setVisibility(View.INVISIBLE);
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    findViewById(R.id.dolan).setVisibility(View.INVISIBLE);
                    findViewById(R.id.button).setVisibility(View.VISIBLE);
                }
            }, 2000);
        }

        EditText t = findViewById(R.id.amount);
        String input = t.getText().toString();
        Log.d("result", ((TextView) findViewById(R.id.result)).getText().toString());

//        double number = Double.parseDouble(price.gettex)

        Log.d("price", String.valueOf(price));
        Log.d("amount", String.valueOf(amount));
        Log.d("price / amount", String.valueOf(price / amount));
        Toast.makeText(this, String.valueOf(price / amount), Toast.LENGTH_LONG).show();
        ((TextView) findViewById(R.id.result)).setText("Cena za 1 jednostkę (szt, ml, g, itp.) = " + String.valueOf(price / amount));
    }

    public void calculate2() {
    }

}
