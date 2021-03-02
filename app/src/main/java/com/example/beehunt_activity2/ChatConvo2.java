package com.example.beehunt_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChatConvo2 extends AppCompatActivity implements View.OnClickListener{

    int convotwo = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_convo2);

        Button btnconvo2 = findViewById(R.id.btnConvo2);
        btnconvo2.setOnClickListener(this);
    }

    @Override
    public void onClick (View view) {

        TextView Answer = findViewById(R.id.txtAnswerConvo2);
        Intent theconvo2 = new Intent(ChatConvo2.this,PathOutOfTheHouse.class);

        switch (view.getId()) {
            case R.id.btnConvo2:
                if (convotwo == 1) {
                    Answer.setText("The Girl:" +
                            "Knowing that this is a jungle, you shouldn't be here");
                    convotwo++;
                }
                else if (convotwo == 2) {
                    Answer.setText("The girl looks at the door and sees that it is about to break.");
                    convotwo++;
                }
                else if (convotwo == 3) {
                    Answer.setText("The Girl:  " +
                            "The door is gonna break any moment, Lets go!");
                    convotwo++;
                }
                else if (convotwo == 4) {
                    Answer.setText("You follow her and both of you got out of the house through the back door");
                    convotwo++;
                }
                else if (convotwo == 5) {
                    Answer.setText("And she leads you to a Path");
                    convotwo++;
                }
                else if (convotwo == 6) {
                    Answer.setText("The Girl: " +
                            "Just follow this path and it will lead you out of here");
                    convotwo++;
                }
                else if (convotwo== 7) {
                    startActivity(theconvo2);
                }
                break;
        }
    }
}