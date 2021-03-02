package com.example.beehunt_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PathDecisionOutcome extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path_decision_outcome);

        Button Proceed = findViewById(R.id.btnPathProceed);
        Proceed.setOnClickListener(this);

        TextView PathDecision = findViewById(R.id.txtPathOutcome);
        Intent next = getIntent();

        boolean Panic = next.getBooleanExtra("Panicked",true);

        if (Panic == true) {
            PathDecision.setText("The Bees noticed your panicking and aggressively fly towards you. " );
        } else {
            PathDecision.setText("You remained calm, and quietly ran away, but the bees still notices you.");
        }

    }

    @Override
    public void onClick (View view) {

        Intent next = new Intent(PathDecisionOutcome.this, NextDecision.class);
        switch (view.getId()) {
            case R.id.btnPathProceed:
                startActivity(next);
                break;
        }
    }
}