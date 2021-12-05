package com.example.kiosk_help_app.Challenge.Transfer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kiosk_help_app.R;

public class TransferSelectOnsiteReservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_select_onsite_reservation);

        ImageButton onsite_btn = (ImageButton) findViewById(R.id.Alone_Transfer_Onsite_btn);
        onsite_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChallengeTransferOnsiteActivity.class);
                startActivity(intent);
            }
        });

        /*ImageButton package_btn = (ImageButton) findViewById(R.id.AlonePackage_btn);
        package_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AloneCafeStoreActivity.class);
                startActivity(intent);
            }
        });*/
    }
}