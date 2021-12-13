package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity21 extends AppCompatActivity {
    private Button  quadraticEqu, differenceEqu, perfectSquare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);
        this.setTitle("Functions and equations");

        quadraticEqu = findViewById(R.id.quadraticEqu);
        differenceEqu = findViewById(R.id.differenceEqu);
        perfectSquare = findViewById(R.id.perfectSquare);

        quadraticEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(),MainActivity22.class);
                startActivity(startIntent);
            }
        });

        differenceEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), MainActivity23.class);
                startActivity(startIntent);
            }
        });

        perfectSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity23.class);
                startActivity(startIntent);
            }
        });


    }
}