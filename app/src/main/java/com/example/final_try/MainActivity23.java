package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity23 extends AppCompatActivity {
    private   EditText aValueForDiffSquare, bValueForDiffSquare;
    private   TextView differenceOfSquareRslt;
    private   Button differenceOfSquareSolve;
    private   int a, b;
    private   double solve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);
        this.setTitle("Difference of two squares");

        aValueForDiffSquare = findViewById(R.id.aValueForDiffSquare);
        bValueForDiffSquare = findViewById(R.id.bValueForDiffSquare);
        differenceOfSquareRslt = findViewById(R.id.differenceOfSquareRslt);

        differenceOfSquareSolve = findViewById(R.id.differenceOfSquareSolve);
        differenceOfSquareSolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a = Integer.parseInt(aValueForDiffSquare.getText().toString());
                b = Integer.parseInt(bValueForDiffSquare.getText().toString());

                solve = Math.pow(a, 2) - Math.pow(b, 2);
                differenceOfSquareRslt.setText("(a-b) (a+b) = a\u00b2 + ab - ab - b\u00b2\n--> a\u00b2 - b\u00b2\n--> " + a + "\u00b2 " + " - " + b + "\u00b2\n" + solve);

            }


        });
    }
}
