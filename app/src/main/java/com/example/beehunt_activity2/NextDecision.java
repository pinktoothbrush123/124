package com.example.beehunt_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NextDecision extends AppCompatActivity implements View.OnClickListener{

    int HousePage = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_decision);

        Button btnNext = findViewById(R.id.btnInsideHouse);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick (View view) {

        TextView prologueStory = findViewById(R.id.txtGoingInsideHouse);
        Intent nextDecision = new Intent(NextDecision.this, InsideTheHouseDecision.class);

        switch (view.getId()) {
            case R.id.btnInsideHouse:
                if (HousePage == 1) {
                    prologueStory.setText("When you saw the house and immediately ran inside. You finally got inside the house, and you lock the door behind you.");
                    HousePage++;
                }
                else if (HousePage == 2) {
                    prologueStory.setText("You noticed that you are in the living room. But knowing that the radioactive bees have super strength, they can easily break the door open.");
                    HousePage++;
                }
                else if (HousePage == 3) {
                    prologueStory.setText("The Bees then starts banging the door");
                    HousePage++;
                }

                else if (HousePage == 4 ) {
                    startActivity(nextDecision);
                }
                break;
        }    }
}