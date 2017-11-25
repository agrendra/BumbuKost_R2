package com.example.agrendra.bumbukost_r2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main3Activity extends AppCompatActivity {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void rendang(View view) {

        intent = new Intent(this, MainActivity.class);
        intent.putExtra("title","Rendang");
        intent.putExtra("picture", R.drawable.rendang);
        intent.putExtra("detail","Merupakan makanan Yang berasal dari Padang Sumatra Barat, " +
                "dan menjadi makanan paling diminati dan terlezat di tahun 2016 oleh Genius World Record, " +
                "dan menjadi kebanggaan tersendiri Bagi Indonesia serta bagi Rakyat Minangkabau sendiri");
        startActivity(intent);

        /*Intent intent = new Intent(Main3Activity.this, MainActivity.class);
        Main3Activity.this.startActivity(intent);
        Main3Activity.this.finish();*/
    }
}
