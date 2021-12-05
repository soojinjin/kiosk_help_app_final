package com.example.kiosk_help_app.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kiosk_help_app.R;

public class TransferGangneungTimetableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_transfer_gangneung_timetable);
    }

    public void GangneungOnClickHandler(View v){
        switch (v.getId()) {
            case R.id.gangneung_time_1:
                Intent intent = new Intent(getApplicationContext(), SeatTableActivity.class);
                startActivity(intent);
                break;

        }
    }
}