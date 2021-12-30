package com.example.final_try;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView mathBtn, physicsBtn, chemistryBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.setTitle("Calculation");

        mathBtn = findViewById(R.id.mathBtn);
        mathBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(startIntent);

            }
        });
        physicsBtn = findViewById(R.id.physicsBtn);
        physicsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), MainActivity41.class);
                startActivity(startIntent);
            }
        });
        chemistryBtn = findViewById(R.id.chemistryBtn);
        chemistryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startIntent = new Intent(getApplicationContext(), MainActivity59.class);
                startActivity(startIntent);
            }
        });


    }
}
