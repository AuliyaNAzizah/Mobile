package com.example.asus.kalkulatorku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hitung2Activity extends AppCompatActivity {

    EditText edtAlas, edtTinggi, edtAlas2, edtTinggi2;
    Button btSegi3, btJarGen, btBack;
    TextView txtHsl3, txtHsl4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung2);

        getSupportActionBar().setTitle("HITUNG LUAS");

        edtAlas = (EditText) findViewById(R.id.editDiagonal1);
        edtTinggi = (EditText) findViewById(R.id.editDiagonal2);
        edtAlas2 = (EditText) findViewById(R.id.editDiagonal3);
        edtTinggi2 = (EditText) findViewById(R.id.editDiagonal4);
        btSegi3 = (Button) findViewById(R.id.btnKetupat);
        btJarGen = (Button) findViewById(R.id.btnJarGen);
        btBack = (Button) findViewById(R.id.btnBack);
        txtHsl3 = (TextView) findViewById(R.id.txtKetupat);
        txtHsl4 = (TextView) findViewById(R.id.txtJarGen);

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bk = new Intent(getApplicationContext(),MoreActivity.class);
                startActivity(bk);
            }
        });
    }

    public void hasilSegi3 (View V){
        String alas = edtAlas.getText().toString().trim();
        String tinggi = edtTinggi.getText().toString().trim();
        double a = Double.parseDouble(alas);
        double t = Double.parseDouble(tinggi);
        double segitiga = 0.5 * a * t;
        txtHsl3.setText(" "+segitiga);
    }

    public void hasilJarGen (View V){
        String alas = edtAlas2.getText().toString().trim();
        String tinggi = edtTinggi2.getText().toString().trim();
        double a = Double.parseDouble(alas);
        double t = Double.parseDouble(tinggi);
        double jajargenjang = a * t;
        txtHsl4.setText(" "+jajargenjang);
    }
}
