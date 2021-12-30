package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity49 extends AppCompatActivity {
    private Button freeFalling, angledProjectile, slidingMotion, attractiveForce, pressure, linearExpansion, soundSpeed, relativisticMass, timeDilation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main49);
        this.setTitle("Tools");

        freeFalling = findViewById(R.id.freeFalling);
        freeFalling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplication(), MainActivity50.class);
                startActivity(startIntent);
            }
        });

        angledProjectile = findViewById(R.id.angledProjectile);
        angledProjectile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity51.class);
                startActivity(startIntent);
            }
        });

        slidingMotion = findViewById(R.id.slidingMotion);
        slidingMotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity52.class);
                startActivity(startIntent);
            }
        });

        pressure = findViewById(R.id.pressure);
        pressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity53.class);
                startActivity(startIntent);
            }
        });

        attractiveForce = findViewById(R.id.attractiveForce);
        attractiveForce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity54.class);
                startActivity(startIntent);
            }
        });

        linearExpansion = findViewById(R.id.linearExpansion);
        linearExpansion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity55.class);
                startActivity(startIntent);
            }
        });

        soundSpeed = findViewById(R.id.soundSpeed);
        soundSpeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity57.class);
                startActivity(startIntent);
            }
        });

        relativisticMass = findViewById(R.id.relativisticMass);
        relativisticMass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity56.class);
                startActivity(startIntent);
            }
        });

        timeDilation = findViewById(R.id.timeDilation);
        timeDilation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity58.class);
                startActivity(startIntent);
            }
        });

    };
}