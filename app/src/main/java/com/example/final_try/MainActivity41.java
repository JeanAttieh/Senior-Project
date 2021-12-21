package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
                    Intent startIntent = new Intent(getApplication(), MainActivity42.class);
                    startActivity(startIntent);
            }
        });

        electricity = findViewById(R.id.electricity);
        electricity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent startIntent = new Intent(getApplication(), MainActivity43.class);
                    startActivity(startIntent);
            }
        });

    }
}