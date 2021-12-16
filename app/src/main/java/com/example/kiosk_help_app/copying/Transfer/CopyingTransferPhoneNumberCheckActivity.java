package com.example.kiosk_help_app.copying.Transfer;

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

public class CopyingTransferPhoneNumberCheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_copying_transfer_phone_number_check);

        EditText reservation_phone_number = (EditText) findViewById(R.id.copying_transfer_phone_input);
        EditText reservation_year_number = (EditText) findViewById(R.id.copying_transfer_year_input);

        Button reservation_ok = (Button) findViewById(R.id.Copying_transfer_reservation_ok2);
        Intent intent = new Intent(this, TransferReservationInfoActivity.class);
        reservation_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(reservation_phone_number.getText().length() == 0){
                    Toast toast = Toast.makeText(getApplicationContext(), "휴대폰번호를 입력해주세요.", Toast.LENGTH_SHORT);
                    toast.show();
                    //값이 안들어왔을 경우
                }else if(reservation_year_number.getText().length() == 0){
                    Toast toast = Toast.makeText(getApplicationContext(), "생년월일을 입력해주세요.", Toast.LENGTH_SHORT);
                    toast.show();
                    //값이 안들어왔을 경우
                }else if(reservation_phone_number.getText().toString().equals("01012345678")||reservation_year_number.getText().toString().equals("19980916")){
                    //예약번호와 일지하는경우
                    intent.putExtra("number", 1);
                    startActivityForResult(intent, 1);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "휴대전화 번호와 일치하는 예약정보가 없습니다.", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }


        });
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