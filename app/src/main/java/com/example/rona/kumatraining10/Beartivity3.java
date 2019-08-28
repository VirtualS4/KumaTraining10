package com.example.rona.kumatraining10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Beartivity3 extends AppCompatActivity implements View.OnClickListener {
    double cel = 5;
    double pcel = 0;
    double far = 9;
    double pfar = 32;
    double rear = 4;
    double prear = 0;
    double kel = 5;
    double pkel = 273;
    EditText no1;

    TextView hasilc;
    TextView hasilf;
    TextView hasilr;
    TextView hasilk;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity3);
        Button btn = findViewById(R.id.btn_hitung);
        btn.setOnClickListener(this);
        hasilc = findViewById(R.id.txt_c);
        hasilf = findViewById(R.id.txt_f);
        hasilk = findViewById(R.id.txt_k);
        hasilr = findViewById(R.id.txt_r);
        no1 = findViewById(R.id.angka1);
    }

    public void onClick(View v){
        double angka1 = Double.parseDouble(no1.getText().toString().trim());
        double hasilcel = 0;
        double hasilfar = 0;
        double hasilkel = 0;
        double hasilrear = 0;
        RadioGroup rg = findViewById(R.id.rgroup);
        int id =  rg.getCheckedRadioButtonId();
        switch (id){
            case R.id.celcius:
                 hasilcel = Hitung(angka1,cel,pcel,cel,pcel);
                 hasilfar = Hitung(angka1,cel,pcel,far,pfar);
                 hasilkel = Hitung(angka1,cel,pcel,kel,pkel);
                 hasilrear = Hitung(angka1,cel,pcel,rear,prear);

                hasilc.setText("Celcius = "+hasilcel);
                hasilf.setText("Fahrenheit = "+hasilfar);
                hasilk.setText("Kelvin = "+hasilkel);
                hasilr.setText("Reamur = "+hasilrear);
                break;
            case R.id.fahren:
                 hasilcel = Hitung(angka1,far,pfar,cel,pcel);
                 hasilfar = Hitung(angka1,far,pfar,far,pfar);
                 hasilkel = Hitung(angka1,far,pfar,kel,pkel);
                 hasilrear = Hitung(angka1,far,pfar,rear,prear);

                hasilc.setText("Celcius = "+hasilcel);
                hasilf.setText("Fahrenheit = "+hasilfar);
                hasilk.setText("Kelvin = "+hasilkel);
                hasilr.setText("Reamur = "+hasilrear);
                break;
            case R.id.kelvin:
                hasilcel = Hitung(angka1,kel,pkel,cel,pcel);
                hasilfar = Hitung(angka1,kel,pkel,far,pfar);
                hasilkel = Hitung(angka1,kel,pkel,kel,pkel);
                hasilrear = Hitung(angka1,kel,pkel,rear,prear);

                hasilc.setText("Celcius = "+hasilcel);
                hasilf.setText("Fahrenheit = "+hasilfar);
                hasilk.setText("Kelvin = "+hasilkel);
                hasilr.setText("Reamur = "+hasilrear);
                break;
            case R.id.reamur:
                hasilcel = Hitung(angka1,rear,prear,cel,pcel);
                hasilfar = Hitung(angka1,rear,prear,far,pfar);
                hasilkel = Hitung(angka1,rear,prear,kel,pkel);
                hasilrear = Hitung(angka1,rear,prear,rear,prear);

                hasilc.setText("Celcius = "+hasilcel);
                hasilf.setText("Fahrenheit = "+hasilfar);
                hasilk.setText("Kelvin = "+hasilkel);
                hasilr.setText("Reamur = "+hasilrear);
                break;
        }
    }

    private double Hitung(double angka,double ban_awal,double per_awal,double ban_akhir,double per_akhir){
        angka = (((angka-per_awal)/ban_awal)*ban_akhir)+per_akhir;
        return angka;
    }
}
