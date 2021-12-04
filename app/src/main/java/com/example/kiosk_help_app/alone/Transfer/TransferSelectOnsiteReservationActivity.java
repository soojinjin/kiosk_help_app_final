package com.example.kiosk_help_app.alone.Transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.kiosk_help_app.R;
import com.example.kiosk_help_app.alone.Movie.AloneMovieOnstieActivity;
import com.example.kiosk_help_app.alone.cafe.AloneCafeStoreActivity;

public class TransferSelectOnsiteReservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_transfer_select_onsite_reservation);

        ImageButton movie_onsite_btn = (ImageButton) findViewById(R.id.Alone_Transfer_Onsite_btn);
        movie_onsite_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AloneTransferOnsiteActivity.class);
                startActivity(intent);
            }
        });

        ImageButton package_btn = (ImageButton) findViewById(R.id.AlonePackage_btn);
        package_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AloneCafeStoreActivity.class);
                startActivity(intent);
            }
        });
    }
}