package com.example.beehunt_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Story extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Button btnNext = findViewById(R.id.btnStory);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {

        Intent next = new Intent(this, StoryPathDecision.class);

        switch (v.getId()) {
            case R.id.btnStory:
                startActivity(next);
                break;
        }
    }
}