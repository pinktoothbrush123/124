package com.example.beehunt_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TalkDecision extends AppCompatActivity implements View.OnClickListener{

    boolean Truth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talk_decision);

        Button btn1st = findViewById(R.id.btnTruth);
        Button btn2nd = findViewById(R.id.btnLie);

        btn1st.setOnClickListener(this);
        btn2nd.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {

        Intent theTalkDecision = new Intent(TalkDecision.this, ChatDecision.class);

        switch (view.getId()) {
            case R.id.btnTruth:
                Truth= true;
                theTalkDecision.putExtra("Truth", Truth);
                startActivity(theTalkDecision);
                break;

            case R.id.btnLie:
                Truth = false;
                theTalkDecision.putExtra("Truth", Truth);
                startActivity(theTalkDecision);
                break;
        }
    }
}