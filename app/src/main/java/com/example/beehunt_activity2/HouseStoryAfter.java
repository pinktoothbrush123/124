package com.example.beehunt_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HouseStoryAfter extends AppCompatActivity implements View.OnClickListener{

    int HouseAfterStoryPage = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_story_after);
        Button HouseAfterBtn = findViewById(R.id.btnHouseStoryAfter);
        HouseAfterBtn.setOnClickListener(this);
    }

    @Override
    public void onClick (View view) {

        TextView houseAfter = findViewById(R.id.txtAfterHouse);
        Intent AfterHouseStory = new Intent(HouseStoryAfter.this,TalkDecision.class);

        switch (view.getId()) {
            case R.id.btnHouseStoryAfter:
                if (HouseAfterStoryPage == 1) {
                    houseAfter.setText("But as you were about to answer her question. The bees start banging the door even louder..");
                    HouseAfterStoryPage++;
                }
                else if (HouseAfterStoryPage == 2) {
                    houseAfter.setText("She asks, how did you get yourself into this mess");
                    HouseAfterStoryPage++;
                }

                else if (HouseAfterStoryPage == 3 ) {
                    startActivity(AfterHouseStory );
                }
                break;
        }
    }
}