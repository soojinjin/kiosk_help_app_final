package com.example.kiosk_help_app.challenge.Transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.kiosk_help_app.R;
import com.example.kiosk_help_app.alone.Transfer.AloneTransferReservationActivity;
import com.example.kiosk_help_app.challenge.Transfer.ChallengeTransferOnsiteActivity;

public class ChallengeTransferSelectOnsiteReservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_transfer_select_onsite_reservation2);

        ImageButton onsite_btn = (ImageButton) findViewById(R.id.Challenge_Transfer_Onsite_btn);
        onsite_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChallengeTransferOnsiteActivity.class);
                startActivity(intent);
            }
        });

        ImageButton package_btn = (ImageButton) findViewById(R.id.Challenge_Transfer_Reservation_btn);
        package_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChallengeTransferReservationActivity.class);
                startActivity(intent);
            }
        });
    }
}