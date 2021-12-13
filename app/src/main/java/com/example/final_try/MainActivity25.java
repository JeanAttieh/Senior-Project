package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity25 extends AppCompatActivity {
    private EditText    aPosValue, bPosValue;
    private TextView    positiveRslt;
    private Button      positiveCalc;
    private double      a, b, solve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);
        this.setTitle("Positive formula");

        aPosValue = findViewById(R.id.aPosValue);
        bPosValue = findViewById(R.id.bPosValue);
        positiveRslt = findViewById(R.id.positiveRslt);
        positiveCalc = findViewById(R.id.positiveCalc);
        positiveCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(aPosValue.getText().toString());
                b  = Double.parseDouble(bPosValue.getText().toString());

                solve = Math.pow(a,2) + Math.pow(b,2) + (2 * a * b);
                positiveRslt.setText("(a+b)\u00b2 = a\u00b2 + 2ab + b\u00b2\n--> " + a + "\u00b2" + " + 2(" + a + ")(" + b + ") + " + b + "\u00b2\n--> " + solve + ".");
            }
        });
    }
}