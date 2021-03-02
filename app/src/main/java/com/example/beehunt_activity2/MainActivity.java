package com.example.beehunt_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnNext = findViewById(R.id.btnProceed);
        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick (View v) {

        Intent next = new Intent(this, Story.class);

        switch (v.getId()) {
            case R.id.btnProceed:
                startActivity(next);
                break;
        }
    }
}