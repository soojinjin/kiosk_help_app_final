package com.example.kiosk_help_app.Challenge.cafe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.kiosk_help_app.ListViewItem;
import com.example.kiosk_help_app.ListviewAdapter;
import com.example.kiosk_help_app.PayCheckActivity;
import com.example.kiosk_help_app.R;

import java.util.ArrayList;

public class ChallengeCafeStoreActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private ChallengeCafeCoffeeFragment selectCoffeeFragment;
    private ChallengeCafeLatteFragment selectLatteFragment;
    private ChallengeCafeAdeFragment selectAdeFragment;
    private ChallengeCafeTeaFragment selectTeaFragment;
    private ChallengeCafeSmoothieFragment selectSmoothieFragment;
    private ChallengeCafeDessertFragment selectDessertFragment;
    private ListView listView;
    private ArrayList<ListViewItem> cafe_data;
    private ListviewAdapter myAdapter = null;
    private int menu_cost_sum;
    //private BFragment fragmentB;
    private FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alone_cafe_store);
        //
        ArrayAdapter<ListViewItem> adapter;
        adapter = new ArrayAdapter<ListViewItem>(this, R.layout.list_view_type, cafe_data);
        //
        cafe_data = new ArrayList<ListViewItem>();
        myAdapter = new ListviewAdapter(this, cafe_data);
        listView  = (ListView)findViewById(R.id.alone_ff_listview);
        listView.setAdapter(myAdapter);
        TextView cost_sum = findViewById(R.id.alone_ff_cost_sum);

        Button buy_button = findViewById(R.id.alone_ff_buy_btn);


        fragmentManager = getSupportFragmentManager();

        selectCoffeeFragment = new ChallengeCafeCoffeeFragment();
        selectLatteFragment = new ChallengeCafeLatteFragment();
        selectTeaFragment = new ChallengeCafeTeaFragment();
        selectAdeFragment = new ChallengeCafeAdeFragment();
        selectSmoothieFragment = new ChallengeCafeSmoothieFragment();
        selectDessertFragment = new ChallengeCafeDessertFragment();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, selectCoffeeFragment).commitAllowingStateLoss();


    }



    public void mOnPopupClick(View v){
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, PayCheckActivity.class);
        intent.putExtra("name", cafe_data);
        startActivityForResult(intent, 1);
    }

    @SuppressLint("MissingSuperCall")
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==1){
            if(resultCode==RESULT_OK){
                //데이터 받기
                String result = data.getStringExtra("result");
            }
        }
    }
    public void addCafeAdeMenuHandler(int item){
        TextView cost_sum = findViewById(R.id.alone_ff_cost_sum);
        switch (item){
            case 1:
                cafe_data.add(new ListViewItem("레몬 에이드", "4800"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 4800;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 2:
                cafe_data.add(new ListViewItem("청포도 에이드", "4800"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 4800;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 3:
                cafe_data.add(new ListViewItem("석류 에이드", "4800"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 4800;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 4:
                cafe_data.add(new ListViewItem("자몽 에이드", "4800"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 4800;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
        }
    }

    public void addCafeCoffeeMenuHandler(int item){
        TextView cost_sum = findViewById(R.id.alone_ff_cost_sum);
        switch (item){
            case 1:
                cafe_data.add(new ListViewItem("콜드 브루", "4500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 4500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 2:
                cafe_data.add(new ListViewItem("아메리카노", "4000"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 4000;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 3:
                cafe_data.add(new ListViewItem("카페 라떼", "4800"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 4800;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 4:
                cafe_data.add(new ListViewItem("카라멜 마끼아또", "5200"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 5200;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
        }
    }

    public void addCafeTeaMenuHandler(int item){
        TextView cost_sum = findViewById(R.id.alone_ff_cost_sum);
        switch (item){
            case 1:
                cafe_data.add(new ListViewItem("레몬차", "4200"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 4200;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 2:
                cafe_data.add(new ListViewItem("자몽차", "4200"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 4200;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 3:
                cafe_data.add(new ListViewItem("유자차", "4200"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 4200;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 4:
                cafe_data.add(new ListViewItem("감귤차", "4200"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 4200;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
        }
    }

    public void addCafeSmoothieMenuHandler(int item){
        TextView cost_sum = findViewById(R.id.alone_ff_cost_sum);
        switch (item){
            case 1:
                cafe_data.add(new ListViewItem("민트초코 스무디", "5500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 5500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 2:
                cafe_data.add(new ListViewItem("그린티 스무디", "5500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 5500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 3:
                cafe_data.add(new ListViewItem("딸기 스무디", "5500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 5500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 4:
                cafe_data.add(new ListViewItem("블루베리 요거트 스무디", "5500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 5500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
        }
    }

    public void addCafeDessertMenuHandler(int item){
        TextView cost_sum = findViewById(R.id.alone_ff_cost_sum);
        switch (item){
            case 1:
                cafe_data.add(new ListViewItem("소프트 아이스크림", "2000"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 2000;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 2:
                cafe_data.add(new ListViewItem("마들렌", "2500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 2500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 3:
                cafe_data.add(new ListViewItem("패스츄리 와플", "2500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 2500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 4:
                cafe_data.add(new ListViewItem("마카롱", "3000"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 3000;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
        }
    }

    public void addCafeLatteMenuHandler(int item){
        TextView cost_sum = findViewById(R.id.alone_ff_cost_sum);
        switch (item){
            case 1:
                cafe_data.add(new ListViewItem("그린티 라떼", "5500" + myAdapter.getCount()));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 5500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 2:
                cafe_data.add(new ListViewItem("고구마 라떼", "5500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 5500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 3:
                cafe_data.add(new ListViewItem("밀크티", "4800"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 4800;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
            case 4:
                cafe_data.add(new ListViewItem("초콜릿 라떼", "5500"));
                myAdapter.notifyDataSetChanged();
                menu_cost_sum += 5500;
                cost_sum.setText("총 메뉴 가격 : " + Integer.toString(menu_cost_sum));
                break;
        }
    }



    public void clickHandler(View view)
    {
        transaction = fragmentManager.beginTransaction();

        switch(view.getId())
        {
            case R.id.alone_cafe_coffee_btn:
                transaction.replace(R.id.frameLayout, selectCoffeeFragment).commitAllowingStateLoss();
                break;
            case R.id.alone_cafe_latte_btn:
                transaction.replace(R.id.frameLayout, selectLatteFragment).commitAllowingStateLoss();
                break;
            case R.id.alone_cafe_smoothie_btn:
                transaction.replace(R.id.frameLayout, selectSmoothieFragment).commitAllowingStateLoss();
                break;
            case R.id.alone_cafe_ade_btn:
                transaction.replace(R.id.frameLayout, selectAdeFragment).commitAllowingStateLoss();
                break;
            case R.id.alone_cafe_Tea_btn:
                transaction.replace(R.id.frameLayout, selectTeaFragment).commitAllowingStateLoss();
                break;
            case R.id.alone_cafe_dessert_btn:
                transaction.replace(R.id.frameLayout, selectDessertFragment).commitAllowingStateLoss();
                break;
        }
    }
}