package com.example.kiosk_help_app.alone.Transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.kiosk_help_app.R;
import com.example.kiosk_help_app.alone.Movie.AloneMovieOnstieActivity;
import com.example.kiosk_help_app.alone.cafe.AloneCafeStoreActivity;

public class AloneTransferSelectOnsiteReservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_transfer_select_onsite_reservation);

        ImageButton onsite_btn = (ImageButton) findViewById(R.id.Alone_Transfer_Onsite_btn);
        onsite_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AloneTransferOnsiteActivity.class);
                startActivity(intent);
            }
        });

        ImageButton package_btn = (ImageButton) findViewById(R.id.Alone_Transfer_Reservation_btn);
        package_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AloneTransferReservationActivity.class);
                startActivity(intent);
            }
        });
    }
}