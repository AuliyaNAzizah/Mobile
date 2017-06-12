package com.example.asus.kalkulatorku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoreActivity extends AppCompatActivity {
    Button btHitung1, btHitung2, btHitung3, btHitung4, btBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        getSupportActionBar().setTitle("HITUNG LUAS");
        btHitung1 = (Button) findViewById(R.id.btnHitung1);
        btHitung1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ht1 = new Intent(getApplicationContext(), hitung1Activity.class);
                startActivity(ht1);
            }});

        btHitung2 = (Button) findViewById(R.id.btnHitung2);
        btHitung2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ht2 = new Intent(getApplicationContext(), hitung2Activity.class);
                startActivity(ht2);
            }
        });

        btHitung3 = (Button) findViewById(R.id.btnHitung3);
        btHitung3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ht3 = new Intent(getApplicationContext(), hitung3Activity.class);
                startActivity(ht3);
            }
        });

        btHitung4 = (Button) findViewById(R.id.btnHitung4);
        btHitung4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ht4 = new Intent(getApplicationContext(), hitung4Activity.class);
                startActivity(ht4);
            }
        });

        btBack = (Button) findViewById(R.id.btnBack);
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bk = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(bk);
            }
        });
    }
}
