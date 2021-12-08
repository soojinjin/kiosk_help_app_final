package com.example.kiosk_help_app.challenge.Movie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.kiosk_help_app.R;
import com.example.kiosk_help_app.challenge.cafe.ChallengeCafeStoreActivity;

public class ChallengeMovieSelectOnsiteReservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_movie_select_onsite_reservation2);

        ImageButton movie_onsite_btn = (ImageButton) findViewById(R.id.Challenge_Movie_Onsite_btn);
        movie_onsite_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChallengeMovieOnsiteActivity.class);
                startActivity(intent);
            }
        });

        ImageButton package_btn = (ImageButton) findViewById(R.id.ChallengePackage_btn);
        package_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChallengeCafeStoreActivity.class);
                startActivity(intent);
            }
        });
    }
}