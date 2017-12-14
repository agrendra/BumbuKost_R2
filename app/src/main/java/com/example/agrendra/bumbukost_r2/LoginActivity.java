package com.example.agrendra.bumbukost_r2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.inuser);
        password = (EditText) findViewById(R.id.inpass);
        //Button Login= (Button) findViewById(R.id.btnlog);
        //Button SigUp= (Button) findViewById(R.id.btnsigup);

        /*Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent (this, MenuActivity.class);
                startActivity(intent);
                String user_name = username.getText().toString();
                String pass_ = password.getText().toString();
                if (user_name.equals("admin")&&pass_.equals("12345")) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    MainActivity.this.startActivity(intent);
                    MainActivity.this.finish();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Username dan Password Salah!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        SigUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/

    }

    public void login(View view) {
        Intent intent = new Intent (this, MenuActivity.class);
        startActivity(intent);
    }

    public void signup(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}
