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
import com.example.kiosk_help_app.challenge.Transfer.ChallengeTransferOneFragment;
import com.example.kiosk_help_app.challenge.Transfer.ChallengeTransferThreeFragment;
import com.example.kiosk_help_app.challenge.Transfer.ChallengeTransferTwoFragment;
import com.example.kiosk_help_app.timetable.TransferGangneungTimetableActivity;

import java.util.ArrayList;

public class ChallengeTransferOnsiteActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private ChallengeTransferOneFragment selectOneFragment;
    private ChallengeTransferTwoFragment selectTwoFragment;
    private ChallengeTransferThreeFragment selectThreeFragment;


    private ListView listView;
    private ArrayList<ListViewItem> data;
    private ListviewAdapter myAdapter = null;
    private int menu_cost_sum;
    //private BFragment fragmentB;
    private FragmentTransaction transaction;

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



        transaction = fragmentManager.beginTransaction();
        transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectOneFragment).commitAllowingStateLoss();

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
        TextView cost_sum = findViewById(R.id.challenge_ff_cost_sum);
        switch (item) {
            case 1:
                //강릉 시간표
                Intent intent = new Intent(getApplicationContext(), TransferGangneungTimetableActivity.class);
                startActivity(intent);
                break;
            case 2:
               /* data.add(new ListViewItem("치킨버거 세트", "7400"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 7400;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));*/
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
        TextView cost_sum = findViewById(R.id.challenge_ff_cost_sum);
        switch (item) {
            case 1:
                data.add(new ListViewItem("더블 불고기 버거세트", "8900"));
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

    public void addFFDrinkMenuHandler(int item) {
        TextView cost_sum = findViewById(R.id.challenge_ff_cost_sum);
        switch (item) {
            case 1:
                data.add(new ListViewItem("더블 불고기 버거세트", "8900"));
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

    public void addFFSideMenuHandler(int item) {
        TextView cost_sum = findViewById(R.id.challenge_ff_cost_sum);
        switch (item) {
            case 1:
                data.add(new ListViewItem("더블 불고기 버거세트", "8900"));
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

    public void addFFWhopperMenuHandler(int item) {
        TextView cost_sum = findViewById(R.id.challenge_ff_cost_sum);
        switch (item) {
            case 1:
                data.add(new ListViewItem("더블 불고기 버거세트", "8900"));
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


    public void clickHandler(View view) {
        transaction = fragmentManager.beginTransaction();

        switch (view.getId()) {
            case R.id.challenge_transfer_1:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectOneFragment).commitAllowingStateLoss();
                break;
            case R.id.challenge_transfer_2:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectTwoFragment).commitAllowingStateLoss();
                break;
            case R.id.challenge_transfer_3:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectThreeFragment).commitAllowingStateLoss();
                break;

        }
    }
}