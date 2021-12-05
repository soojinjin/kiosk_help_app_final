package com.example.kiosk_help_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.kiosk_help_app.alone.Movie.AloneMovieSelectOnsiteReservationActivity;
import com.example.kiosk_help_app.alone.Transfer.AloneTransferSelectOnsiteReservationActivity;
import com.example.kiosk_help_app.alone.cafe.AloneCafeSelectStorePackageActivity;
import com.example.kiosk_help_app.alone.fastfood.AloneFastfoodSelectStorePackageActivity;
import com.example.kiosk_help_app.challenge.Movie.ChallengeMovieSelectOnsiteReservationActivity;
import com.example.kiosk_help_app.challenge.Transfer.ChallengeTransferSelectOnsiteReservationActivity;
import com.example.kiosk_help_app.challenge.cafe.ChallengeCafeSelectStorePackageActivity;
import com.example.kiosk_help_app.challenge.fastfood.ChallengeFastfoodSelectStorePackageActivity;

public class SelectChallengeKioskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_challenage_kiosk);

        ImageButton ff_btn = (ImageButton) findViewById(R.id.ChallengeFF_btn);

        ff_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChallengeFastfoodSelectStorePackageActivity.class);
                startActivity(intent);
            }
        });

        ImageButton cafe_btn = (ImageButton) findViewById(R.id.ChallengeCafe_btn);

        cafe_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChallengeCafeSelectStorePackageActivity.class);
                startActivity(intent);
            }
        });

        ImageButton transfer_btn = (ImageButton) findViewById(R.id.ChallengeTransport_btn);

        transfer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChallengeTransferSelectOnsiteReservationActivity.class);
                startActivity(intent);
            }
        });

        ImageButton movie_btn = (ImageButton) findViewById(R.id.ChallengeMovie_btn);

        movie_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChallengeMovieSelectOnsiteReservationActivity.class);
                startActivity(intent);
            }
        });
    }
}