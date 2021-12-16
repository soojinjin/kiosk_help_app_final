package com.example.kiosk_help_app.challenge.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kiosk_help_app.R;
import com.example.kiosk_help_app.challenge.cafe.ChallengeCafeSelectStorePackageActivity;

public class ChallengeFastfoodMissionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_challenge_fastfood_mission);

        Button ok = (Button) findViewById(R.id.challenge_mission_ok);
        ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), ChallengeFastfoodSelectStorePackageActivity.class);
                startActivity(intent);
            }
        });
    }
}