package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity26 extends AppCompatActivity {
    private EditText    aNegValue, bNegValue;
    private TextView    negativeRslt;
    private Button      negativeCalc;
    private double      a, b, solve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);
        this.setTitle("Positive formula");

        aNegValue = findViewById(R.id.aNegValue);
        bNegValue = findViewById(R.id.bNegValue);
        negativeRslt = findViewById(R.id.negativeRslt);
        negativeCalc = findViewById(R.id.negativeCalc);
        negativeCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(aNegValue.getText().toString());
                b  = Double.parseDouble(bNegValue.getText().toString());

                solve = Math.pow(a,2) + Math.pow(b,2) - (2 * a * b);
                negativeRslt.setText("(a+b)\u00b2 = a\u00b2 - 2ab + b\u00b2\n--> " + a + "\u00b2" + " - 2(" + a + ")(" + b + ") + " + b + "\u00b2\n--> " + solve + ".");
            }
        });
    }
}