package com.example.a3_1triathlonregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    int cost, person;
    String place;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText people = (EditText) findViewById(R.id.peopleInput);
        final Spinner location = (Spinner) findViewById(R.id.spinner);

        Button calculate = (Button) findViewById(R.id.btnCost);

        calculate.setOnClickListener(new View.OnClickListener() {
            final TextView costDisplay = (TextView) findViewById(R.id.costOutput);
            @Override
            public void onClick(View v) {
                //calculate cost
                person = Integer.parseInt(people.getText().toString());
                cost = person * 725;
                place = location.getSelectedItem().toString();
                DecimalFormat form = new DecimalFormat("$###,###");
                costDisplay.setText(place+" team fee is "+form.format(cost));
            }
        });
    }
}
