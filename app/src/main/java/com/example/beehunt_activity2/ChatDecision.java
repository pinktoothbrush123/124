package com.example.beehunt_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChatDecision extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_decision);

        Button nextChat = findViewById(R.id.btnChat);
        nextChat.setOnClickListener(this);

        TextView ChatOutcome = findViewById(R.id.txtTalkoutcome);
        TextView you = findViewById(R.id.txtYou);
        Intent chatDecision = getIntent();

        boolean itsTruth = chatDecision.getBooleanExtra("Truth", true);


        if (itsTruth == true) {
            ChatOutcome.setText("You tell the truth. ");
            you.setText("Because i was jogging and accidentally hit their hive ");
        } else {
            ChatOutcome.setText("You tell a Lie");
            you.setText("They started attacking me out of nowhere!");
        }
    }

    @Override
    public void onClick(View v) {

        Intent dChat = new Intent(ChatDecision.this, ChatConvo.class);

        switch (v.getId()) {
            case R.id.btnChat:
                startActivity(dChat);
                break;
        }
    }
}