package com.example.beehunt_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LastPart extends AppCompatActivity implements View.OnClickListener {

    int last = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_part);
        Button EndButton = findViewById(R.id.btnEnd);
        EndButton.setOnClickListener(this);
    }

    @Override
    public void onClick (View view) {

        TextView LastText = findViewById(R.id.txtLast);
        Intent partLast = new Intent(LastPart.this,TheEnd.class);

        switch (view.getId()) {
            case R.id.btnEnd:
                if (last == 1) {
                    LastText.setText("You look back at her");
                    last++;
                }
                else if (last == 2) {
                    LastText.setText("That's when the bees starts to swarm her.");
                    last++;
                }
                else if (last == 3) {
                    LastText.setText("And she vanishes");
                    last++;
                }
                else if (last == 4 ) {
                    startActivity(partLast);
                }
                break;
        }
    }
}