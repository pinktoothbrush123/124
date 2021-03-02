package com.example.beehunt_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StoryPathDecision extends AppCompatActivity implements View.OnClickListener {

    boolean Panic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_path_decision);


        Button btn1st = findViewById(R.id.btnPanic);
        Button btn2nd = findViewById(R.id.btnStayCalm);

        btn1st.setOnClickListener(this);
        btn2nd.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {

        Intent next = new Intent(StoryPathDecision.this, PathDecisionOutcome.class);

        switch (view.getId()) {
            case R.id.btnPanic:
                Panic= true;
                next.putExtra("Panicked", Panic);
                startActivity(next);
                break;

            case R.id.btnStayCalm:
                Panic = false;
                next.putExtra("Panicked", Panic);
                startActivity(next);
                break;
        }
    }
}