package com.example.kiosk_help_app.challenge.Transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.kiosk_help_app.R;
import com.example.kiosk_help_app.alone.Transfer.AloneTransferPhoneNumberCheckActivity;
import com.example.kiosk_help_app.alone.Transfer.AloneTransferReservationNumberCheckActivity;

public class ChallengeTransferReservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_challenge_transfer_reservation);

        ImageButton reservationNumber_btn = findViewById(R.id.Challenge_transfer_reservation_number);
        reservationNumber_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AloneTransferReservationNumberCheckActivity.class);
                startActivity(intent);
            }
        });

        ImageButton phoneNumber_btn = findViewById(R.id.Challenge_transfer_phone_number);
        phoneNumber_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AloneTransferPhoneNumberCheckActivity.class);
                startActivity(intent);
            }
        });
    }
}