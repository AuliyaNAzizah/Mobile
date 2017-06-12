package com.example.asus.kalkulatorku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hitung4Activity extends AppCompatActivity {
    EditText edtSisi1, edtSisi2, edtTinggi, edtJari;
    Button btTrapesium, btLingkaran, btBack;
    TextView txtHsl7, txtHsl8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung4);

        getSupportActionBar().setTitle("HITUNG LUAS");

        edtSisi1 = (EditText) findViewById(R.id.editSisi1);
        edtSisi2 = (EditText) findViewById(R.id.editSisi2);
        edtTinggi = (EditText) findViewById(R.id.editTinggi);
        edtJari = (EditText) findViewById(R.id.editJari);
        btTrapesium = (Button) findViewById(R.id.btnTrapesium);
        btLingkaran = (Button) findViewById(R.id.btnLingkaran);
        btBack = (Button) findViewById(R.id.btnBack);
        txtHsl7 = (TextView) findViewById(R.id.txtTrapesium);
        txtHsl8 = (TextView) findViewById(R.id.txtLingkaran);

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bk = new Intent(getApplicationContext(),MoreActivity.class);
                startActivity(bk);
            }
        });
    }
    public void hasilTrapesium (View V){
        String sisi1 = edtSisi1.getText().toString().trim();
        String sisi2 = edtSisi2.getText().toString().trim();
        String tinggi = edtTinggi.getText().toString().trim();
        double s1 = Double.parseDouble(sisi1);
        double s2 = Double.parseDouble(sisi2);
        double t = Double.parseDouble(tinggi);
        double trapesium = (s1 + s2) * 0.5 * t;
        txtHsl7.setText(" "+trapesium);
    }

    public void hasilLingkaran (View V){
        String jari = edtJari.getText().toString().trim();
        double r = Double.parseDouble(jari);
        double phi = 3.14;
        double lingkaran = phi * r;
        txtHsl8.setText(" "+lingkaran);
    }
}
