package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity3 extends AppCompatActivity {
    private   Button area, volume, functionAdEquation, trigonometry, vector, statistic, sequence, derivative, probabilityAndSets, logarithm, specialLimit, integralAndPrimitive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        this.setTitle("Mathematics");
        area = findViewById(R.id.area);
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity4.class);
                startActivity(startIntent);
            }
        });

        volume = findViewById(R.id.volume);
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplication(), MainActivity14.class);
                startActivity(startIntent);
            }
        });

        functionAdEquation = findViewById(R.id.functionAndEquation);
        functionAdEquation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity21.class);
                startActivity(startIntent);
            }
        });

        trigonometry = findViewById(R.id.trigonometry);
        trigonometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity27.class);
                startActivity(startIntent);
            }
        });

        vector = findViewById(R.id.vector);
        vector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity35.class);
                startActivity(startIntent);
            }
        });

        statistic = findViewById(R.id.statistic);
        statistic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity36.class);
                startActivity(startIntent);
            }
        });

        probabilityAndSets = findViewById(R.id.probabilityAndSet);
        probabilityAndSets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity44.class);
                startActivity(startIntent);
            }
        });

        sequence = findViewById(R.id.sequence);
        sequence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity45.class);
                startActivity(startIntent);
            }
        });

        derivative = findViewById(R.id.derivative);
        derivative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity46.class);
                startActivity(startIntent);
            }
        });

        logarithm = findViewById(R.id.logarithm);
        logarithm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity47.class);
                startActivity(startIntent);
            }
        });

        specialLimit = findViewById(R.id.specialLimit);
        specialLimit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity48.class);
                startActivity(startIntent);
            }
        });

        integralAndPrimitive = findViewById(R.id.integralAndPrimitive);
        integralAndPrimitive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity49.class);
                startActivity(startIntent);
            }
        });
    }
}


