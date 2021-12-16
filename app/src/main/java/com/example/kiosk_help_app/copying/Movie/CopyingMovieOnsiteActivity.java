package com.example.kiosk_help_app.copying.Movie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kiosk_help_app.R;
import com.example.kiosk_help_app.alone.Movie.AloneMovieSeatSelect;

public class CopyingMovieOnsiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_copying_movie_onsite);
    }

    public void recommendMovieOnClick(View v){
        Intent intent = new Intent(this, AloneMovieSeatSelect.class);
        switch (v.getId()){
            case R.id.copying_recommend_movie_1:
                startActivity(intent);
                break;

            case R.id.copying_recommend_movie_2:
                startActivity(intent);
                break;

            case R.id.copying_recommend_movie_3:
                startActivity(intent);
                break;



        }
    }
}