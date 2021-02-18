package com.example.apkadlacebulakw;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToCalculator(View v) {
        Intent i = new Intent(this, CalculatorActivity.class);
        startActivity(i);
    }

    public void goToShoppingList(View v) {
        Intent i = new Intent(this, ShoppingListActivity.class);
        startActivity(i);
    }

    public void goToInfo(View v) {
        Intent i = new Intent(this, InfoActivity.class);
        startActivity(i);
    }
}
