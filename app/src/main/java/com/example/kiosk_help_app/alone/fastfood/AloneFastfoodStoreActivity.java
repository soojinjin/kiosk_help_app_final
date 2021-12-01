package com.example.kiosk_help_app.alone.fastfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kiosk_help_app.ListViewItem;
import com.example.kiosk_help_app.ListviewAdapter;
import com.example.kiosk_help_app.OnMenuPickerSetListener;
import com.example.kiosk_help_app.R;

import java.util.ArrayList;

public class AloneFastfoodStoreActivity extends AppCompatActivity {


    private FragmentManager fragmentManager;
    private AloneFastfoodSaleFragment selectSaleFragment;
    private AloneFastfoodSideFragment selectSideFragment;
    private AloneFastfoodDrinkFragment selectDrinkFragment;
    private AloneFastfoodWhopperFragment selectWhopperFragment;
    private AloneFastfoodPremiumFragment selectPremiumFragment;
    private ListView listView;
    private ArrayList<ListViewItem> data;


    //private BFragment fragmentB;
    private FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_alone_fastfood_store);

        fragmentManager = getSupportFragmentManager();

        selectSaleFragment = new AloneFastfoodSaleFragment();
        selectSideFragment = new AloneFastfoodSideFragment();
        selectPremiumFragment = new AloneFastfoodPremiumFragment();
        selectWhopperFragment = new AloneFastfoodWhopperFragment();
        selectDrinkFragment = new AloneFastfoodDrinkFragment();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectSaleFragment).commitAllowingStateLoss();

//        ImageButton sale_item_1 = (ImageButton) findViewById(R.id.FF_sale_item);
//        sale_item_1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext() ,"test", Toast.LENGTH_SHORT).show();
//            }
//        });
        /*
        ListView listView = (ListView)findViewById(R.id.listview);
        ArrayList<ListViewItem> data = new ArrayList<>();
        ListViewItem lion = new ListViewItem(R.drawable.lion,”Lion”);

        ListviewAdapter adapter=new ListviewAdapter(this,R.layout.listviewitem,data);
        listView.setAdapter(adapter);
        */

    }

    public void addFFMenuHandler(int item){

        switch (item){
            case 1:
                data = new ArrayList<ListViewItem>();
                data.add(new ListViewItem("더블 불고기 버거세트", "8900", R.drawable.selectff));
                listView  = (ListView)findViewById(R.id.alone_ff_listview);
                final ListviewAdapter myAdapter = new ListviewAdapter(this, data);
                listView.setAdapter(myAdapter);
                break;
        }
    }



    public void clickHandler(View view)
    {
        transaction = fragmentManager.beginTransaction();

        switch(view.getId())
        {
            case R.id.alone_ff_sale_btn:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectSaleFragment).commitAllowingStateLoss();
                break;
            case R.id.alone_ff_side_btn:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectSideFragment).commitAllowingStateLoss();
                break;
            case R.id.alone_ff_drink_btn:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectDrinkFragment).commitAllowingStateLoss();
                break;
            case R.id.alone_ff_premium_btn:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectPremiumFragment).commitAllowingStateLoss();
                break;
            case R.id.alone_ff_whopper_btn:
                transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectWhopperFragment).commitAllowingStateLoss();
                break;
        }
    }


}