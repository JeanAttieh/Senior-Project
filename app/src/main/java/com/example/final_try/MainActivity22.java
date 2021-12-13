package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity22 extends AppCompatActivity {
    private EditText aValue, bValue, cValue;
    private Button quadraticCalc;
    private TextView quadraticRslt;
    private double a, b, c, delta, x, x1, x2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        this.setTitle("Quadratic equation");

        aValue = findViewById(R.id.aValue);
        bValue = findViewById(R.id.bValue);
        cValue = findViewById(R.id.cValue);
        quadraticRslt = findViewById(R.id.quadraticRslt);
        quadraticCalc = findViewById(R.id.quadraticCalc);
        quadraticCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.parseDouble(aValue.getText().toString());
                b = Double.parseDouble(bValue.getText().toString());
                c = Double.parseDouble(cValue.getText().toString());

                delta = Math.pow(b, 2) - (4 * a * c);
                if (delta < 0) {
                    quadraticRslt.setText("Δ < 0.\nNo solution.");
                } else if (delta == 0) {
                    x = (-b) / (2 * a);
                    quadraticRslt.setText("Δ = 0. Unique solution, \nx = " + x + ".");
                } else {
                    x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
                    x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
                    quadraticRslt.setText("Δ > 0. Two solutions, \nx1 = " + x1 + "\nx2 = " + x2 + ".");
                }
            }
        });
    }
}