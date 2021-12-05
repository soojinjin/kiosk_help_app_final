package com.example.kiosk_help_app.copying.Movie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.kiosk_help_app.R;
import com.example.kiosk_help_app.copying.Movie.CopyingMovieOnsiteActivity;
import com.example.kiosk_help_app.copying.cafe.CopyingCafeStoreActivity;

public class MovieSelectOnsiteReservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_movie_select_onsite_reservation3);

        ImageButton movie_onsite_btn = (ImageButton) findViewById(R.id.Copying_Movie_Onsite_btn);
        movie_onsite_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CopyingMovieOnsiteActivity.class);
                startActivity(intent);
            }
        });

        ImageButton package_btn = (ImageButton) findViewById(R.id.CopyingPackage_btn);
        package_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CopyingCafeStoreActivity.class);
                startActivity(intent);
            }
        });
    }
}