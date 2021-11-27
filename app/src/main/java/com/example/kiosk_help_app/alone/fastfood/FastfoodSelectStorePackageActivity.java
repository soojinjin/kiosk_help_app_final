package com.example.kiosk_help_app.alone.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.kiosk_help_app.R;

public class FastfoodSelectStorePackageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kiosk_help_app.R.layout.activity_package_store_select_fastfood);


        ImageButton store_btn = (ImageButton) findViewById(R.id.AloneStore_btn);
        store_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AloneFastfoodStoreActivity.class);
                startActivity(intent);
            }
        });
    }
}