package com.example.agrendra.bumbukost_r2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MenuActivity extends AppCompatActivity {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        setContentView(R.layout.activity_menu);
    }

    public void rendang(View view) {

        intent = new Intent(this, MainActivity.class);
        intent.putExtra("title","Rendang");
        intent.putExtra("picture", R.drawable.rendang);
        intent.putExtra("detail","Merupakan makanan Yang berasal dari Padang Sumatra Barat, " +
                "dan menjadi makanan paling diminati dan terlezat di tahun 2016 oleh Genius World Record, " +
                "dan menjadi kebanggaan tersendiri Bagi Indonesia serta bagi Rakyat Minangkabau sendiri");
        startActivity(intent);

        /*Intent intent = new Intent(MenuActivity.this, MainActivity.class);
        MenuActivity.this.startActivity(intent);
        MenuActivity.this.finish();*/
    }


    public void bumbu(View view) {
        //oke
    }

    public void minum(View view) {
    }

    public void sarapan(View view) {
    }

    public void cemilan(View view) {
    }
}

