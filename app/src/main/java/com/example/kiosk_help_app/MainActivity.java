package com.example.kiosk_help_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //혼자하기 버튼을 클릭했을때
        ImageButton alone_btn = (ImageButton) findViewById(R.id.btn_alone);
        alone_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SelectAloneKioskActivity.class);
                startActivity(intent);
            }
        });

        ImageButton nav_btn = (ImageButton) findViewById(R.id.btn_navigation);
        nav_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SelectCopyingKioskActivity.class);
                startActivity(intent);
            }
        });

        ImageButton challenge_btn = (ImageButton) findViewById(R.id.btn_challenge);
        challenge_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SelectChallengeKioskActivity.class);
                startActivity(intent);
            }
        });


    }



}