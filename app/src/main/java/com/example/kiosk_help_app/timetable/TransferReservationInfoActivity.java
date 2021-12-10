package com.example.kiosk_help_app.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kiosk_help_app.ListViewItem;
import com.example.kiosk_help_app.ListviewAdapter;
import com.example.kiosk_help_app.R;

import java.util.ArrayList;

public class TransferReservationInfoActivity extends Activity {

    private int seatNumber;
    private ListviewAdapter myAdapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //타이틀바 없애기
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_transfer_reservation_info);

        //UI 객체생성
        //ListView pay_list = (ListView)findViewById(R.id.alone_ff_pay_list);


        //데이터 가져오기
        Intent intent = getIntent();
        seatNumber = intent.getIntExtra("number", 0);
        //myAdapter = new ListviewAdapter(this, data);
        //pay_list.setAdapter(myAdapter);
        // txtText.setText(data);
    }

    //확인 버튼 클릭
    public void mOnClose(View v){
        //데이터 전달하기
        Intent intent = new Intent();
        intent.putExtra("result", "Close Popup");
        setResult(RESULT_OK, intent);
        Toast.makeText(getApplicationContext(), "결제가 완료 되었습니다.",Toast.LENGTH_LONG).show();
        //액티비티(팝업) 닫기
        finish();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //바깥레이어 클릭시 안닫히게
        if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
            return false;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        //안드로이드 백버튼 막기
        return;
    }
}