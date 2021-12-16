package com.example.kiosk_help_app.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kiosk_help_app.MainActivity;
import com.example.kiosk_help_app.PayCheckActivity;
import com.example.kiosk_help_app.R;

public class SeatTableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_seat_table);
    }

    public void mOnPopupClick(View v){
        switch (v.getId()) {
            case R.id.seat_1:
                Intent intent = new Intent(this, selectSeatAndPayActivitiy.class);
                intent.putExtra("number", 1);
                startActivityForResult(intent, 1);
                break;

        }
    }

    @SuppressLint("MissingSuperCall")
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==1){
            if(resultCode==RESULT_OK){
                //데이터 받기
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
        }
    }
}