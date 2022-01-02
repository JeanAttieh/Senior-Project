package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity62 extends AppCompatActivity {
    private Button  areaConv, dataConv, fuelConv, lengthConv, powerConv, pressureConv,
            speedConv, temperatureConv, timeConv, volumeConv, weightConv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main62);
        this.setTitle("Conversion");

        areaConv = findViewById(R.id.areaConv);
        areaConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity63.class);
                startActivity(startIntent);
            }
        });

        dataConv = findViewById(R.id.dataConv);
        dataConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity64.class);
                startActivity(startIntent);
            }
        });

        fuelConv = findViewById(R.id.fuelConv);
        fuelConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity65.class);
                startActivity(startIntent);
            }
        });

        lengthConv = findViewById(R.id.lengthConv);
        lengthConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity66.class);
                startActivity(startIntent);
            }
        });

        powerConv = findViewById(R.id.powerConv);
        powerConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity67.class);
                startActivity(startIntent);
            }
        });

        pressureConv = findViewById(R.id.pressureConv);
        pressureConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity68.class);
                startActivity(startIntent);
            }
        });

        speedConv = findViewById(R.id.speedConv);
        speedConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity69.class);
                startActivity(startIntent);
            }
        });

        temperatureConv = findViewById(R.id.temperatureConv);
        temperatureConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity70.class);
                startActivity(startIntent);
            }
        });

        timeConv = findViewById(R.id.timeConv);
        timeConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity71.class);
                startActivity(startIntent);
            }
        });

        volumeConv = findViewById(R.id.volumeConv);
        volumeConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(),MainActivity72.class);
                startActivity(startIntent);
            }
        });

        weightConv = findViewById(R.id.weightConv);
        weightConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity73.class);
                startActivity(startIntent);
            }
        });
    }
}