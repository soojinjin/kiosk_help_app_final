package com.example.kiosk_help_app.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kiosk_help_app.MainActivity;
import com.example.kiosk_help_app.R;

public class ChallengeMissionSuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_challenge_mission_success);

        Intent getIntent = getIntent();
        int time = getIntent.getIntExtra("time", 0);
        TextView score_view = (TextView) findViewById(R.id.score);
        score_view.setText("score: " + time);

        Button ok = (Button) findViewById(R.id.success_ok);
        ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}