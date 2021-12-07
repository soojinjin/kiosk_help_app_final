package com.example.kiosk_help_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.kiosk_help_app.copying.Movie.CopyingMovieSelectOnsiteReservationActivity;
import com.example.kiosk_help_app.copying.Transfer.CopyingTransferSelectOnsiteReservationActivity;
import com.example.kiosk_help_app.copying.cafe.CopyingCafeSelectStorePackageActivity;
import com.example.kiosk_help_app.copying.fastfood.CopyingFastfoodSelectStorePackageActivity;

public class SelectCopyingKioskActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_copying_kiosk);

        ImageButton ff_btn = (ImageButton) findViewById(R.id.CopyingFF_btn);
        ff_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CopyingFastfoodSelectStorePackageActivity.class);
                startActivity(intent);
            }
        });

        ImageButton cafe_btn = (ImageButton) findViewById(R.id.CopyingCafe_btn);
        cafe_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CopyingCafeSelectStorePackageActivity.class);
                startActivity(intent);
            }
        });

        ImageButton transfer_btn = (ImageButton) findViewById(R.id.CopyingTransport_btn);
        transfer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CopyingTransferSelectOnsiteReservationActivity.class);
                startActivity(intent);
            }
        });

        ImageButton movie_btn = (ImageButton) findViewById(R.id.CopyingMovie_btn);
        movie_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CopyingMovieSelectOnsiteReservationActivity.class);
                startActivity(intent);
            }
        });
    }
}
