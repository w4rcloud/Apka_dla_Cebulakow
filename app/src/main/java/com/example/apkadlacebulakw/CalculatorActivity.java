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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void calculate(View v) {
        double price = Double.parseDouble(((TextView) findViewById(R.id.price)).getText().toString());
        double amount = Double.parseDouble(((TextView) findViewById(R.id.amount)).getText().toString());
        if (amount == 0) {
            deployDolan();
        }
        EditText t = findViewById(R.id.amount);
        String input = t.getText().toString();
        Log.d("result", ((TextView) findViewById(R.id.result)).getText().toString());

//        double number = Double.parseDouble(price.gettex)

        Log.d("price", String.valueOf(price));
        Log.d("amount", String.valueOf(amount));
        Log.d("price / amount", String.valueOf(price / amount));
//        Toast.makeText(this, String.valueOf(price / amount), Toast.LENGTH_LONG).show();
        ((TextView) findViewById(R.id.result)).setText("Cena za 1 jednostkę (szt, ml, g, itp.) = " + String.valueOf(price / amount));
    }

    public void calculate2(View v) {
        double price2 = Double.parseDouble(((TextView) findViewById(R.id.price2)).getText().toString());
        double amount2 = Double.parseDouble(((TextView) findViewById(R.id.amount2)).getText().toString());
        if (amount2 == 0) {
            deployDolan();
        }
        double result = getPriceFor100(price2, amount2);
        ((TextView)findViewById(R.id.result2)).setText("Cena za 100 jednostek (ml, g, itp.) = " +String.valueOf(result));
    }

    private void deployDolan() {
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

    private double getPriceFor100 (double price, double amount) {
        return (100 * price) / amount;
    }

}
