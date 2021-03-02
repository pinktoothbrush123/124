package com.example.beehunt_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChatConvo extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_convo);

        Button btnConvo = findViewById(R.id.btnChatconvo);
        btnConvo.setOnClickListener(this);

        TextView girl = findViewById(R.id.txtGirl);
        Intent CHATConvo = getIntent();

        boolean Truth = CHATConvo.getBooleanExtra("TheTruth", true);

        if (Truth == true) {
            girl.setText("Why are jogging here in the first place? Haven't you seen the signs before going inside the jungle?");
        } else {
            girl.setText("The bees won't attack you unless you done something to them");

        }

    }

    @Override
    public void onClick(View v) {
        Intent next = new Intent(ChatConvo.this, ChatConvo2.class);
        switch (v.getId()) {
            case R.id.btnChatconvo:
                startActivity(next);
                break;
        }
    }
}