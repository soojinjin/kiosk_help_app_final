package com.example.kiosk_help_app.copying.fastfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.kiosk_help_app.ListViewItem;
import com.example.kiosk_help_app.ListviewAdapter;
import com.example.kiosk_help_app.MainActivity;
import com.example.kiosk_help_app.PayCheckActivity;
import com.example.kiosk_help_app.R;

import java.util.ArrayList;

public class CopyingFastfoodStoreActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private CopyingFastfoodSaleFragment selectSaleFragment;
    private CopyingFastfoodSideFragment selectSideFragment;
    private CopyingFastfoodDrinkFragment selectDrinkFragment;
    private CopyingFastfoodWhopperFragment selectWhopperFragment;
    private CopyingFastfoodPremiumFragment selectPremiumFragment;
    private ListView listView;
    private ArrayList<ListViewItem> data;
    private ListviewAdapter myAdapter = null;
    private int menu_cost_sum;
    //private BFragment fragmentB;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_copying_fastfood_store);
        //
        ArrayAdapter<ListViewItem> adapter;
        adapter = new ArrayAdapter<ListViewItem>(this, R.layout.list_view_type, data);
        //
        data = new ArrayList<ListViewItem>();
        myAdapter = new ListviewAdapter(this, data);
        listView  = (ListView)findViewById(R.id.copying_ff_listview);
        listView.setAdapter(myAdapter);
        TextView cost_sum = findViewById(R.id.copying_ff_cost_sum);

        Button buy_button = findViewById(R.id.copying_ff_buy_btn);


        fragmentManager = getSupportFragmentManager();

        selectSaleFragment = new CopyingFastfoodSaleFragment();
        selectSideFragment = new CopyingFastfoodSideFragment();
        selectPremiumFragment = new CopyingFastfoodPremiumFragment();
        selectWhopperFragment = new CopyingFastfoodWhopperFragment();
        selectDrinkFragment = new CopyingFastfoodDrinkFragment();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectSaleFragment).commitAllowingStateLoss();

    }

    public void mOnPopupClick(View v){
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, PayCheckActivity.class);
        intent.putExtra("name", data);
        startActivityForResult(intent, 1);
    }

    @SuppressLint("MissingSuperCall")
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==1){
            if(resultCode==RESULT_OK){
                //데이터 받기
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        }
    }
    public void addFFSaleMenuHandler(int item){
        TextView cost_sum = findViewById(R.id.copying_ff_cost_sum);
        switch (item){
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

    public void addFFPremiumMenuHandler(int item){
        TextView cost_sum = findViewById(R.id.copying_ff_cost_sum);
        switch (item){
            case 1:
                data.add(new ListViewItem("불고기 버거세트", "6200"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 6200;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 2:
                data.add(new ListViewItem("치즈 버거세트", "5800"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 5800;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 3:
                data.add(new ListViewItem("크리스피 버거세트", "7000"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 7000;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 4:
                data.add(new ListViewItem("치킨치즈 버거세트", "6000"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 6000;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
        }
    }

    public void addFFDrinkMenuHandler(int item){
        TextView cost_sum = findViewById(R.id.copying_ff_cost_sum);
        switch (item){
            case 1:
                data.add(new ListViewItem("소프트 아이스크림", "2000"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 2000;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 2:
                data.add(new ListViewItem("선데이 아이스크림", "2500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 2500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 3:
                data.add(new ListViewItem("콜라", "1500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 1500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 4:
                data.add(new ListViewItem("사이다", "1500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 1500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
        }
    }

    public void addFFSideMenuHandler(int item){
        TextView cost_sum = findViewById(R.id.copying_ff_cost_sum);
        switch (item){
            case 1:
                data.add(new ListViewItem("치즈 볼", "3000"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 3000;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 2:
                data.add(new ListViewItem("치즈 스틱", "2500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 2500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 3:
                data.add(new ListViewItem("양념 감자", "2000"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 2000;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 4:
                data.add(new ListViewItem("감자 튀김", "1500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 1500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
        }
    }

    public void addFFWhopperMenuHandler(int item){
        TextView cost_sum = findViewById(R.id.copying_ff_cost_sum);
        switch (item){
            case 1:
                data.add(new ListViewItem("불고기 버거", "5200"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 5200;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 2:
                data.add(new ListViewItem("치즈 버거", "4800"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 4800;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 3:
                data.add(new ListViewItem("크리스피 버거", "6000"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 6000;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 4:
                data.add(new ListViewItem("치킨치즈 버거", "5000"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 5000;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
        }
    }



    public void clickHandler(View view)
    {
        transaction = fragmentManager.beginTransaction();

        switch(view.getId())
        {
            case R.id.copying_ff_sale_btn:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectSaleFragment).commitAllowingStateLoss();
                break;
            case R.id.copying_ff_side_btn:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectSideFragment).commitAllowingStateLoss();
                break;
            case R.id.copying_ff_drink_btn:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectDrinkFragment).commitAllowingStateLoss();
                break;
            case R.id.copying_ff_premium_btn:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectPremiumFragment).commitAllowingStateLoss();
                break;
            case R.id.copying_ff_whopper_btn:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectWhopperFragment).commitAllowingStateLoss();
                break;
        }
    }
}