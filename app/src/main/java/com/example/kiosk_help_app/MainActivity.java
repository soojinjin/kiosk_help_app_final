package com.example.kiosk_help_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.kiosk_help_app.alone.fastfood.AloneFastfoodSelectStorePackageActivity;
import com.example.kiosk_help_app.alone.fastfood.AloneFastfoodStoreActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //혼자하기 버튼을 클릭했을때
        Button alone_btn =  findViewById(R.id.btn_start);
        alone_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AloneFastfoodSelectStorePackageActivity.class);
                startActivity(intent);
            }
        });

    }



}