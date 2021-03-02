package com.example.beehunt_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InsideTheHouseDecision extends AppCompatActivity implements View.OnClickListener{

    boolean Open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_the_house_decision);


        Button btn1st = findViewById(R.id.btnOpen);
        Button btn2nd = findViewById(R.id.btnDontOpen);

        btn1st.setOnClickListener(this);
        btn2nd.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {

        Intent HouseDe = new Intent(InsideTheHouseDecision.this, HouseOutcome.class);

        switch (view.getId()) {
            case R.id.btnOpen:
                Open= true;
                HouseDe.putExtra("opened",Open);
                startActivity(HouseDe);
                break;

            case R.id.btnDontOpen:
                Open = false;
                HouseDe.putExtra("opened",Open);
                startActivity(HouseDe);
                break;
        }
    }
}