package com.example.kiosk_help_app.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.kiosk_help_app.R;

public class TransferGangneungTimetableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_transfer_gangneung_timetable);
    }

    public void GangneungOnClickHandler(View view){
        switch (view.getId()) {
          /*  case R.id.alone_transfer_2:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectOneFragment).commitAllowingStateLoss();
                break;
            case R.id.alone_transfer_2:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectTwoFragment).commitAllowingStateLoss();
                break;
            case R.id.alone_transfer_3:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectThreeFragment).commitAllowingStateLoss();
                break;*/

        }
    }
}