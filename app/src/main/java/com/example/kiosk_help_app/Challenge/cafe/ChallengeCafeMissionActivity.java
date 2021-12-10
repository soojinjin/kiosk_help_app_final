package com.example.kiosk_help_app.challenge.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.kiosk_help_app.ListViewItem;
import com.example.kiosk_help_app.R;

import java.util.ArrayList;

public class ChallengeCafeMissionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_challenge_cafe_mission);

        Button ok = (Button) findViewById(R.id.challenge_mission_ok);
        ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), ChallengeCafeSelectStorePackageActivity.class);
                startActivity(intent);
            }
        });
    }
}