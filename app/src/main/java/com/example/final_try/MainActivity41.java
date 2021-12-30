package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.RecursiveTask;

public class MainActivity41 extends AppCompatActivity {
    private Button  mechanics, electricity, thermal, periodic, optic, atomic, constant, tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main41);
        this.setTitle("Physics");

        mechanics = findViewById(R.id.mechanics);
        mechanics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent startIntent = new Intent(getApplicationContext(), MainActivity42.class);
                    startActivity(startIntent);
            }
        });

        electricity = findViewById(R.id.electricity);
        electricity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent startIntent = new Intent(getApplicationContext(), MainActivity43.class);
                    startActivity(startIntent);
            }
        });

        thermal = findViewById(R.id.thermal);
        thermal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity44.class);
                startActivity(startIntent);
            }
        });

        periodic= findViewById(R.id.periodic);
        periodic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity45.class);
                startActivity(startIntent);
            }
        });

        optic = findViewById(R.id.optic);
        optic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity46.class);
                startActivity(startIntent);
            }
        });

        atomic = findViewById(R.id.atomic);
        atomic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity47.class);
                startActivity(startIntent);
            }
        });

        constant = findViewById(R.id.constant);
        constant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity48.class);
                startActivity(startIntent);
            }
        });

        tool = findViewById(R.id.tool);
        tool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity49.class);
                startActivity(startIntent);
            }
        });



    }
}