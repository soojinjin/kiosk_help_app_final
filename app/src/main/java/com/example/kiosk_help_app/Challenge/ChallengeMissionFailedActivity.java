package com.example.kiosk_help_app.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kiosk_help_app.MainActivity;
import com.example.kiosk_help_app.R;
import com.example.kiosk_help_app.challenge.cafe.ChallengeCafeSelectStorePackageActivity;

public class ChallengeMissionFailedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_challenge_mission_failed);

        Button ok = (Button) findViewById(R.id.failed_ok);
        ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}