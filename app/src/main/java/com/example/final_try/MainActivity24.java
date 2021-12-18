package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity24 extends AppCompatActivity {
    private Button  positiveFormula, negativeFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);

        positiveFormula = findViewById(R.id.positiveFormula);
        negativeFormula = findViewById(R.id.negativeFormula);

        positiveFormula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity25.class);
                startActivity(startIntent);
            }
        });

        negativeFormula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity26.class);
                startActivity(startIntent);
            }
        });
    }
}