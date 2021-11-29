package com.example.kiosk_help_app.alone.fastfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kiosk_help_app.R;

public class AloneFastfoodStoreActivity extends AppCompatActivity {


    private FragmentManager fragmentManager;
    private AloneFastfoodSaleFragment selectSaleFragment;
    private AloneFastfoodSideFragment selectSideFragment;
    //private BFragment fragmentB;
    private FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_alone_fastfood_store);

        fragmentManager = getSupportFragmentManager();

        selectSaleFragment = new AloneFastfoodSaleFragment();
        selectSideFragment = new AloneFastfoodSideFragment();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(com.example.kiosk_help_app.R.id.frameLayout, selectSaleFragment).commitAllowingStateLoss();


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
        }
    }
}