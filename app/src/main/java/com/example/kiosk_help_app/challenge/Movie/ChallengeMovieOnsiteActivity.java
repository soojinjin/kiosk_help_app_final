package com.example.kiosk_help_app.challenge.Movie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kiosk_help_app.R;
import com.example.kiosk_help_app.alone.Movie.AloneMovieSeatSelect;

public class ChallengeMovieOnsiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_challenge_movie_onsite);
    }

    public void recommendMovieOnClick(View v){
        Intent intent = new Intent(this, AloneMovieSeatSelect.class);
        switch (v.getId()){
            case R.id.challenge_recommend_movie_1:
                startActivity(intent);
                break;

            case R.id.challenge_recommend_movie_2:
                startActivity(intent);
                break;

            case R.id.challenge_recommend_movie_3:
                startActivity(intent);
                break;



        }
    }
}