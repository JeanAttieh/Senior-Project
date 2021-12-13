package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class   MainActivity14 extends AppCompatActivity {
    private Button cube, cuboid, prism, cylinder, coneVolume, sphereVolume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        setTitle("Volumes");

        cube = findViewById(R.id.cube);
        cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity15.class);
                startActivity(startIntent);
            }
        });

        cuboid = findViewById(R.id.cuboid);
        cuboid.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity16.class);
                startActivity(startIntent);
            }
        });

        prism = findViewById(R.id.prism);
        prism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity17.class);
                startActivity(startIntent);
            }
        });

        cylinder = findViewById(R.id.cylinder);
        cylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity18.class);
                startActivity(startIntent);
            }
        });

        coneVolume = findViewById(R.id.coneVolume);
        coneVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity19.class);
                startActivity(startIntent);
            }
        });

        sphereVolume = findViewById(R.id.sphereVolume);
        sphereVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity20.class);
                startActivity(startIntent);
            }
        });

    }
}