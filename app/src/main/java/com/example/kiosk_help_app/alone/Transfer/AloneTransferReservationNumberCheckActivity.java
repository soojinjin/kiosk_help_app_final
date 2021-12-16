package com.example.kiosk_help_app.alone.Transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kiosk_help_app.MainActivity;
import com.example.kiosk_help_app.R;
import com.example.kiosk_help_app.timetable.TransferReservationInfoActivity;
import com.example.kiosk_help_app.timetable.selectSeatAndPayActivitiy;

public class AloneTransferReservationNumberCheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_alone_transfer_reservation_number_check);

        EditText reservation_number = (EditText) findViewById(R.id.Alone_transfer_reservation_number_input);
        Button reservation_ok = (Button) findViewById(R.id.Alone_transfer_reservation_ok);
        Intent intent = new Intent(this, TransferReservationInfoActivity.class);
        reservation_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(reservation_number.getText().length() == 0){
                    Toast toast = Toast.makeText(getApplicationContext(), "예약번호를 입력해주세요.", Toast.LENGTH_SHORT);
                    toast.show();
                    //값이 안들어왔을 경우
                }else if(reservation_number.getText().toString().equals("ABCDEFG1234")){
                    //예약번호와 일지하는경우
                    intent.putExtra("number", 1);
                    startActivityForResult(intent, 1);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "예약번호와 일치하는 예약정보가 없습니다.", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });



    }



    public void mOnPopupClick(View v){
        switch (v.getId()) {
            case R.id.seat_1:

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