package com.example.beehunt_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PathOutOfTheHouse extends AppCompatActivity implements View.OnClickListener{

    boolean PathOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path_out_of_the_house);

        Button btn1st = findViewById(R.id.btnImmaHeadOut);
        Button btn2nd = findViewById(R.id.btnThankYou);

        btn1st.setOnClickListener(this);
        btn2nd.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {

        Intent OutPath = new Intent(PathOutOfTheHouse.this, FinalOutcome.class);

        switch (view.getId()) {
            case R.id.btnImmaHeadOut:
                PathOut= true;
                OutPath.putExtra("OutHouse", PathOut);
                startActivity(OutPath);
                break;

            case R.id.btnThankYou:
                PathOut = false;
                OutPath.putExtra("OutHouse", PathOut);
                startActivity(OutPath);
                break;
        }
    }
}