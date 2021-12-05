package com.example.kiosk_help_app.Challenge.Movie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kiosk_help_app.Challenge.cafe.ChallengeCafeStoreActivity;
import com.example.kiosk_help_app.R;

public class MovieSelectOnsiteReservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_select_onsite_reservation);

        ImageButton movie_onsite_btn = (ImageButton) findViewById(R.id.Alone_Movie_Onsite_btn);
        movie_onsite_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChallengeMovieOnstieActivity.class);
                startActivity(intent);
            }
        });

        ImageButton package_btn = (ImageButton) findViewById(R.id.AlonePackage_btn);
        package_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChallengeCafeStoreActivity.class);
                startActivity(intent);
            }
        });
    }
}