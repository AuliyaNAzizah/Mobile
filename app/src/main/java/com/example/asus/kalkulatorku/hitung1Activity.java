package com.example.asus.kalkulatorku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hitung1Activity extends AppCompatActivity {

    EditText edtSisi, edtPangjang, edtLebar;
    Button btPersegi,btPersegipjg, btBack;
    TextView txtHsl1, txtHsl2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung1);

        getSupportActionBar().setTitle("HITUNG LUAS");
        edtSisi = (EditText) findViewById(R.id.editSisi);
        edtPangjang = (EditText) findViewById(R.id.editPanjang);
        edtLebar = (EditText) findViewById(R.id.editLebar);
        btPersegi = (Button) findViewById(R.id.btnPersegi);
        btPersegipjg = (Button) findViewById(R.id.btnPersegiPjg);
        txtHsl1 = (TextView) findViewById(R.id.txtHasil);
        txtHsl2 = (TextView) findViewById(R.id.txtHasil2);
        btBack = (Button) findViewById(R.id.btnBack);

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bk = new Intent(getApplicationContext(),MoreActivity.class);
                startActivity(bk);
            }
        });
    }
    public void hasilPersegi (View V){
        String sisi = edtSisi.getText().toString().trim();
        double s = Double.parseDouble(sisi);
        double persegi = s * s;
        txtHsl1.setText(" "+persegi);
    }
    public void hasilPanjang (View V){
        String panjang = edtPangjang.getText().toString().trim();
        String lebar = edtLebar.getText().toString().trim();
        double p = Double.parseDouble(panjang);
        double l = Double.parseDouble(lebar);
        double persegipanjang = p * l;
        txtHsl2.setText(" "+persegipanjang);
    }
}
