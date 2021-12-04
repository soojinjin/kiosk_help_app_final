package com.example.kiosk_help_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.kiosk_help_app.alone.Movie.MovieSelectOnsiteReservationActivity;
import com.example.kiosk_help_app.alone.Transfer.TransferSelectOnsiteReservationActivity;
import com.example.kiosk_help_app.alone.cafe.CafeSelectStorePackageActivity;
import com.example.kiosk_help_app.alone.fastfood.FastfoodSelectStorePackageActivity;

public class SelectCopyingKioskActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_alone_kiosk);

        ImageButton ff_btn = (ImageButton) findViewById(R.id.AloneFF_btn);

        ff_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FastfoodSelectStorePackageActivity.class);
                startActivity(intent);
            }
        });

        ImageButton cafe_btn = (ImageButton) findViewById(R.id.AloneCafe_btn);

        cafe_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CafeSelectStorePackageActivity.class);
                startActivity(intent);
            }
        });

        ImageButton transfer_btn = (ImageButton) findViewById(R.id.AloneTransport_btn);

        transfer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MovieSelectOnsiteReservationActivity.class);
                startActivity(intent);
            }
        });

        ImageButton movie_btn = (ImageButton) findViewById(R.id.AloneMovie_btn);

        movie_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TransferSelectOnsiteReservationActivity.class);
                startActivity(intent);
            }
        });


    }
}
