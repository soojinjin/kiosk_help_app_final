package com.example.kiosk_help_app.challenge.Transfer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.kiosk_help_app.ListViewItem;
import com.example.kiosk_help_app.ListviewAdapter;
import com.example.kiosk_help_app.PayCheckActivity;
import com.example.kiosk_help_app.R;
import com.example.kiosk_help_app.timetable.SeatTableActivity;
import com.example.kiosk_help_app.timetable.TransferGangneungTimetableActivity;

import java.util.ArrayList;

public class ChallengeTransferOnsiteActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private ChallengeTransferOneFragment selectOneFragment;
    private ChallengeTransferTwoFragment selectTwoFragment;
    private ChallengeTransferThreeFragment selectThreeFragment;

    private ChallengeTransferTimeTableFragment selectTimeOneFragment;
    private ChallengeTransferTimeTableTwoFragment selectTimeTwoFragment;

    private ListView listView;
    private ArrayList<ListViewItem> data;
    private ListviewAdapter myAdapter = null;
    private int menu_cost_sum;
    //private BFragment fragmentB;
    private FragmentTransaction transaction1;
    private FragmentTransaction transaction2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_challenge_transfer_onsite);
        //
        ArrayAdapter<ListViewItem> adapter;
        adapter = new ArrayAdapter<ListViewItem>(this, R.layout.list_view_type, data);
        //


        fragmentManager = getSupportFragmentManager();

        selectOneFragment = new ChallengeTransferOneFragment();
        selectTwoFragment = new ChallengeTransferTwoFragment();
        selectThreeFragment = new ChallengeTransferThreeFragment();

        selectTimeOneFragment = new ChallengeTransferTimeTableFragment();
        selectTimeTwoFragment = new ChallengeTransferTimeTableTwoFragment();

        transaction1 = fragmentManager.beginTransaction();
        transaction1.replace(com.example.kiosk_help_app.R.id.frameLayout, selectOneFragment).commitAllowingStateLoss();

        transaction2 = fragmentManager.beginTransaction();
        transaction2.replace(com.example.kiosk_help_app.R.id.frameLayout2, selectTimeOneFragment).commitAllowingStateLoss();

    }
    public void mOnPopupClick(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, PayCheckActivity.class);
        intent.putExtra("name", data);
        startActivityForResult(intent, 1);
    }

    @SuppressLint("MissingSuperCall")
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                //데이터 받기
                String result = data.getStringExtra("result");
            }
        }
    }

    public void addTransferOneMenuHandler(int item) {
        //지역 선택시 하단 프레임 레이아웃에 해당 시간표 출력
        transaction2 = fragmentManager.beginTransaction();
        switch (item) {
            case 1:
                transaction2.replace(com.example.kiosk_help_app.R.id.frameLayout2, selectTimeOneFragment).commitAllowingStateLoss();
                break;
            case 2:
                transaction2.replace(com.example.kiosk_help_app.R.id.frameLayout2, selectTimeTwoFragment).commitAllowingStateLoss();
                break;
            case 3:
              /*  data.add(new ListViewItem("스태커4 와퍼 세트", "9900"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 9900;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));*/
                break;
            case 4:
               /* data.add(new ListViewItem("통 베이컨 와퍼 세트", "8500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 8500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));*/
                break;
        }
    }

    public void addTransferTwoMenuHandler(int item) {
        TextView cost_sum = findViewById(R.id.alone_ff_cost_sum);
        switch (item) {
            case 1:
                data.add(new ListViewItem("더블 불고기 버거세트", "8900" + myAdapter.getCount()));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 8900;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 2:
                data.add(new ListViewItem("치킨버거 세트", "7400"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 7400;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 3:
                data.add(new ListViewItem("스태커4 와퍼 세트", "9900"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 9900;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 4:
                data.add(new ListViewItem("통 베이컨 와퍼 세트", "8500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 8500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
        }
    }

    public void popUpSelectSeat(int item) {
        //지역 선택시 하단 프레임 레이아웃에 해당 시간표 출력
        transaction2 = fragmentManager.beginTransaction();
        Intent intent = new Intent(getApplicationContext(), SeatTableActivity.class);
        switch (item) {
            case 1:
                startActivity(intent); // 수정 필요
                break;
            case 2:
                startActivity(intent);
                break;
            case 3:
              /*  data.add(new ListViewItem("스태커4 와퍼 세트", "9900"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 9900;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));*/
                break;
            case 4:
               /* data.add(new ListViewItem("통 베이컨 와퍼 세트", "8500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 8500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));*/
                break;
        }
    }


    public void clickHandler(View view) {
        transaction1 = fragmentManager.beginTransaction();

        switch (view.getId()) {
            case R.id.challenge_transfer_1:
                transaction1.replace(com.example.kiosk_help_app.R.id.frameLayout, selectOneFragment).commitAllowingStateLoss();
                break;
            case R.id.challenge_transfer_2:
                transaction1.replace(com.example.kiosk_help_app.R.id.frameLayout, selectTwoFragment).commitAllowingStateLoss();
                break;
            case R.id.challenge_transfer_3:
                transaction1.replace(com.example.kiosk_help_app.R.id.frameLayout, selectThreeFragment).commitAllowingStateLoss();
                break;

        }
    }
}