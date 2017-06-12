package com.example.asus.kalkulatorku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hitung3Activity extends AppCompatActivity {
    EditText edtDiagonal1, edtDiagonal2, edtDiagonal3, edtDiagonal4;
    Button btKetupat, btLayang, btBack;
    TextView txtHsl5, txtHsl6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung3);
        getSupportActionBar().setTitle("HITUNG LUAS");

        edtDiagonal1 = (EditText) findViewById(R.id.editDiagonal1);
        edtDiagonal2 = (EditText) findViewById(R.id.editDiagonal2);
        edtDiagonal3 = (EditText) findViewById(R.id.editDiagonal3);
        edtDiagonal4 = (EditText) findViewById(R.id.editDiagonal4);
        btKetupat = (Button) findViewById(R.id.btnKetupat);
        btLayang = (Button) findViewById(R.id.btnLayang);
        btBack = (Button) findViewById(R.id.btnBack);
        txtHsl5 = (TextView) findViewById(R.id.txtKetupat);
        txtHsl6 = (TextView) findViewById(R.id.txtLayang);

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bk = new Intent(getApplicationContext(),MoreActivity.class);
                startActivity(bk);
            }
        });
    }
    public void hasilKetupat (View V){
        String diagonal1 = edtDiagonal1.getText().toString().trim();
        String diagonal2 = edtDiagonal2.getText().toString().trim();
        double d1 = Double.parseDouble(diagonal1);
        double d2 = Double.parseDouble(diagonal2);
        double ketupat = 0.5 * d1 * d2;
        txtHsl5.setText(" "+ketupat);
    }

    public void hasilLayang (View V){
        String diagonal3 = edtDiagonal3.getText().toString().trim();
        String diagonal4 = edtDiagonal4.getText().toString().trim();
        double d1 = Double.parseDouble(diagonal3);
        double d2 = Double.parseDouble(diagonal4);
        double layang = 0.5 * d1 * d2;
        txtHsl6.setText(" "+layang);
    }
}
