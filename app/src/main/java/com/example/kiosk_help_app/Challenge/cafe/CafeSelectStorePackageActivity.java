package com.example.kiosk_help_app.Challenge.cafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kiosk_help_app.R;

public class CafeSelectStorePackageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_select_store_package);

        ImageButton store_btn = (ImageButton) findViewById(R.id.AloneStore_btn);
        store_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChallengeCafeStoreActivity.class);
                startActivity(intent);
            }
        });

        ImageButton package_btn = (ImageButton) findViewById(R.id.AlonePackage_btn);
        package_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChallengeCafeStoreActivity.class);
                startActivity(intent);
            }
        });

    }
}