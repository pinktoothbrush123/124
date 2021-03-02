package com.example.beehunt_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HouseOutcome extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_outcome);

        Button btnHome = findViewById(R.id.btnHouse);
        btnHome.setOnClickListener(this);

        TextView txtHouse = findViewById(R.id.txtBalayOutcome);
        Intent HouseDe = getIntent();

        boolean open = HouseDe.getBooleanExtra("opened",true);

        if (open== true) {
            txtHouse.setText("You open the door, and as you open it you meet the owner of the house. ");
        } else {
            txtHouse.setText("You decided to stay in the living room, but suddenly the owner comes out of the room to see what the commotion is all about.");
        }

    }

    @Override
    public void onClick (View view) {

        Intent home = new Intent(HouseOutcome.this, HouseStoryAfter.class);
        switch (view.getId()) {
            case R.id.btnHouse:
                startActivity(home);
                break;
        }
    }
}