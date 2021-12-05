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

public class SelectCopyingKioskActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_copying_kiosk);

        ImageButton ff_btn = (ImageButton) findViewById(R.id.AloneFF_btn);

        ff_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AloneFastfoodSelectStorePackageActivity.class);
                startActivity(intent);
            }
        });

        ImageButton cafe_btn = (ImageButton) findViewById(R.id.AloneCafe_btn);

        cafe_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AloneCafeSelectStorePackageActivity.class);
                startActivity(intent);
            }
        });

        ImageButton transfer_btn = (ImageButton) findViewById(R.id.AloneTransport_btn);

        transfer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AloneMovieSelectOnsiteReservationActivity.class);
                startActivity(intent);
            }
        });

        ImageButton movie_btn = (ImageButton) findViewById(R.id.AloneMovie_btn);

        movie_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AloneTransferSelectOnsiteReservationActivity.class);
                startActivity(intent);
            }
        });


    }
}
