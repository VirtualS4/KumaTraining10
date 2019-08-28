package com.example.rona.kumatraining10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Beartivity4 extends AppCompatActivity {


    String hasil = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity4);
        Button n0 = findViewById(R.id.n0);
        Button n1 = findViewById(R.id.n1);
        Button n2 = findViewById(R.id.n2);
        Button n3 = findViewById(R.id.n3);
        Button n4 = findViewById(R.id.n4);
        Button n5 = findViewById(R.id.n5);
        Button n6 = findViewById(R.id.n6);
        Button n7 = findViewById(R.id.n7);
        Button n8 = findViewById(R.id.n8);
        Button n9 = findViewById(R.id.n9);
        Button plus = findViewById(R.id.btn_p);
        Button minus = findViewById(R.id.btn_m);
        Button kali = findViewById(R.id.btn_k);
        Button bagi = findViewById(R.id.btn_b);
        Button titik = findViewById(R.id.titik);
        initbtn(n0);
        initbtn(n1);
        initbtn(n2);
        initbtn(n3);
        initbtn(n4);
        initbtn(n5);
        initbtn(n6);
        initbtn(n7);
        initbtn(n8);
        initbtn(n9);
        initbtn(plus);
        initbtn(minus);
        initbtn(kali);
        initbtn(bagi);
        initbtn(titik);

        Button jumlahkan =  findViewById(R.id.btn_hitung);
        jumlahkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText screen =  findViewById(R.id.hasil);
                String str = screen.getText().toString();
                String temp_angka = "0";
                String angka = "0";
                double number = 0;
                double temp_number = 0;
                String temp_hasil = "0";
                int test = 0;
                int b = 0;
                for(int i = 0;i<str.length();i++){
                    if(str.charAt(i) == '+'){
                        int a;

                        for(a = i+1;a<str.length();a++){
                            if(str.charAt(a) == '+'||str.charAt(a) == '*'||str.charAt(a) == '/'||str.charAt(a) == '-'){
                                break;
                            }else{
                                angka = angka + String.valueOf(str.charAt(a));
                            }
                        }
                        if(b==0){

                        }else{
                            temp_angka = temp_hasil;
                        }
                        b++;


                        i = a-1;
                        number = Double.parseDouble(angka);
                        temp_number = Double.parseDouble(temp_angka);
                        if(b==0){
                            temp_hasil = String.valueOf((Double.parseDouble(temp_hasil) + (temp_number+number)));
                        }else{
                            temp_hasil = String.valueOf(temp_number+number);
                        }
                        number = 0;
                        temp_number = 0;
                        temp_angka = "0";
                        angka = "0";


                    }else if(str.charAt(i) == '-'){
                        int a;
                        for(a = i+1;a<str.length();a++){
                            if(str.charAt(a) == '+'||str.charAt(a) == '*'||str.charAt(a) == '/'||str.charAt(a) == '-'){
                                break;
                            }else{
                                angka = angka + String.valueOf(str.charAt(a));
                            }
                        }
                        if(b==0){

                        }else{
                            temp_angka = temp_hasil;
                        }
                        b++;

                        i = a-1;
                        number = Double.parseDouble(angka);
                        temp_number = Double.parseDouble(temp_angka);
                        if(b==0){
                            temp_hasil = String.valueOf((Double.parseDouble(temp_hasil) + (temp_number-number)));
                        }else{
                            temp_hasil = String.valueOf(temp_number-number);
                        }
                        number = 0;
                        temp_number = 0;
                        temp_angka = "0";
                        angka = "0";

                    }else if(str.charAt(i) == '*'){
                        int a;
                        for(a = i+1;a<str.length();a++){
                            if(str.charAt(a) == '+'||str.charAt(a) == '*'||str.charAt(a) == '/'||str.charAt(a) == '-'){
                                break;
                            }else{
                                angka = angka + String.valueOf(str.charAt(a));
                            }
                        }
                        if(b==0){

                        }else{
                            temp_angka = temp_hasil;
                        }
                        b++;
                        i = a-1;
                        number = Double.parseDouble(angka);
                        temp_number = Double.parseDouble(temp_angka);
                        if(b==0){
                            temp_hasil = String.valueOf((Double.parseDouble(temp_hasil) + (temp_number*number)));
                        }else{
                            temp_hasil = String.valueOf(temp_number*number);
                        }
                        number = 0;
                        temp_number = 0;
                        temp_angka = "0";
                        angka = "0";


                    }else if(str.charAt(i) == '/'){
                        int a;
                        for(a = i+1;a<str.length();a++){
                            if(str.charAt(a) == '+'||str.charAt(a) == '*'||str.charAt(a) == '/'||str.charAt(a) == '-'){
                                break;
                            }else{
                                angka = angka + String.valueOf(str.charAt(a));
                            }
                        }
                        i = a-1;
                        if(b==0){

                        }else{
                            temp_angka = temp_hasil;
                        }
                        b++;

                        number = Double.parseDouble(angka);
                        temp_number = Double.parseDouble(temp_angka);
                        if(b==0){
                            temp_hasil = String.valueOf((Double.parseDouble(temp_hasil) + (temp_number/number)));
                        }else{
                            temp_hasil = String.valueOf(temp_number/number);
                        }

                        number = 0;
                        temp_number = 0;
                        temp_angka = "0";
                        angka = "0";
                    }else{
                        temp_angka = temp_angka + String.valueOf(str.charAt(i));
                        System.out.println(temp_angka);
                    }
                }
                screen.setText(temp_hasil);
                hasil = "";
            }
        });

        Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil = "";
                EditText screen = findViewById(R.id.hasil);
                screen.setText(hasil);
            }
        });

    }

    private void initbtn(final Button btn){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil = hasil + btn.getText().toString();
                EditText screen =  findViewById(R.id.hasil);
                screen.setText(hasil);
            }
        });
    }
}
