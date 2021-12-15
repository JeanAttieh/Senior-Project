package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity27 extends AppCompatActivity {
    private Button  fundamental, trigRatios, trigLaws, angleRelations, trigFormulas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main27);
        this.setTitle("Trigonometry");

        fundamental = findViewById(R.id.fundamental);
        fundamental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity28.class);
                startActivity(startIntent);
            }
        });

        trigRatios = findViewById(R.id.trigRatios);
        trigRatios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity29.class);
                startActivity(startIntent);
            }
        });

        trigLaws = findViewById(R.id.trigLaws);
        trigLaws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity30.class);
                startActivity(startIntent);
            }
        });

        angleRelations = findViewById(R.id.angleRelations);
        angleRelations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity31.class);
                startActivity(startIntent);
            }
        });

        trigFormulas = findViewById(R.id.trigFormulas);
        trigFormulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity32.class);
                startActivity(startIntent);
            }
        });
    }
}