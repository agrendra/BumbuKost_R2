package com.example.agrendra.bumbukost_r2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final EditText username = (EditText) findViewById(R.id.inuser);
        final EditText password = (EditText) findViewById(R.id.inpass);
        Button Login= (Button) findViewById(R.id.btnlog);
        Button SigUp= (Button) findViewById(R.id.btnsigup);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main4Activity.this, Main3Activity.class);
                Main4Activity.this.startActivity(intent);
                Main4Activity.this.finish();
                /*String user_name = username.getText().toString();
                String pass_ = password.getText().toString();
                if (user_name.equals("admin")&&pass_.equals("12345")) {
                    Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                    MainActivity.this.startActivity(intent);
                    MainActivity.this.finish();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Username dan Password Salah!!",Toast.LENGTH_SHORT).show();
                }*/
            }
        });

        SigUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main4Activity.this, Main3Activity.class);
                Main4Activity.this.startActivity(intent);
                Main4Activity.this.finish();
            }
        });
    }
}
