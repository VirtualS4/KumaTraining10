package com.example.rona.kumatraining10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Beartivity2 extends AppCompatActivity implements View.OnClickListener{

    EditText no1;
    EditText no2;
    EditText hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity2);

        no1 = findViewById(R.id.no1);
        no2 = findViewById(R.id.no2);

        hasil = findViewById(R.id.hasil);


        Button btn = findViewById(R.id.btn_p);
        btn.setOnClickListener(this);
        btn = findViewById(R.id.btn_m);
        btn.setOnClickListener(this);
        btn = findViewById(R.id.btn_k);
        btn.setOnClickListener(this);
        btn = findViewById(R.id.btn_b);
        btn.setOnClickListener(this);

    }

    public void onClick(View v){
        double angka1 = Double.parseDouble(no1.getText().toString().trim());
        double angka2 = Double.parseDouble(no2.getText().toString().trim());
        final int btnp = R.id.btn_p;
        final int btnm = R.id.btn_m;
        final int btnk = R.id.btn_k;
        final int btnb = R.id.btn_b;
        switch (v.getId()){
            case btnp:
                hasil.setText(""+(angka1+angka2));
                break;
            case btnm :
                hasil.setText(""+(angka1-angka2));
                break;
            case btnk:
                hasil.setText(""+(angka1*angka2));
                break;
            case btnb:
                hasil.setText(""+(angka1/angka2));
                break;
        }
    }
}
