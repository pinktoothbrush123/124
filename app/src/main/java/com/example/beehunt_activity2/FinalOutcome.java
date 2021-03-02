package com.example.beehunt_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalOutcome extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_outcome);

        Button buttonFinal = findViewById(R.id.btnLastFinal);
        buttonFinal.setOnClickListener(this);

        TextView textFinal = findViewById(R.id.txtfinaloutcome);
        Intent none = getIntent();

        boolean PathOut = none.getBooleanExtra("OutHouse",true);

        if (PathOut == true) {
            textFinal.setText("you immediately ran towards the path. " );
        } else {
            textFinal.setText("she smiles back at you.");
        }

    }

    @Override
    public void onClick (View view) {

        Intent end = new Intent(FinalOutcome.this, LastPart.class);

        switch (view.getId()) {
            case R.id.btnLastFinal:
                startActivity(end);
                break;
        }
    }
}