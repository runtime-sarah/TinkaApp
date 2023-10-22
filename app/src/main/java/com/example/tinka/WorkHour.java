package com.example.tinka;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WorkHour extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnWorkHours = findViewById(R.id.btnWorkhour);
        btnWorkHours.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                displayWorkingHours();
                return true;
            }
        });

        btnWorkHours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WorkHour.this, "Long-press to view work hours", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void displayWorkingHours() {
        Toast.makeText(this, "Working Hours: Sun-Tus: 8:00 AM - 11:00 PM", Toast.LENGTH_LONG).show();
    }
}





