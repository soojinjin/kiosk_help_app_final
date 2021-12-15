package com.example.kiosk_help_app.alone.Movie;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.kiosk_help_app.ListViewItem;
import com.example.kiosk_help_app.ListviewAdapter;
import com.example.kiosk_help_app.R;
import com.example.kiosk_help_app.timetable.TransferReservationInfoActivity;

import java.util.ArrayList;

public class AloneMovieSeatSelect extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //타이틀바 없애기
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_alone_movie_seat_select);
        Intent intent = new Intent(this, AloneMovieSeatCheckAndPay.class);


        ImageButton seat_1 = findViewById(R.id.alone_movie_seat_1);
        seat_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //여기서는 좌석을 클릭했을 때 구현 내용이 들어가야한다.

            }
        });

    }




}