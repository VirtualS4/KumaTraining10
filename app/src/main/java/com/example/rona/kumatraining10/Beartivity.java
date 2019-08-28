
package com.example.rona.kumatraining10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Beartivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity);
        final Button btn =  findViewById(R.id.btn);
        final EditText p = findViewById(R.id.panjang);
        final EditText l = findViewById(R.id.lebar);
        final TextView hasil = findViewById(R.id.hasilluas);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double panjang = Double.parseDouble(p.getText().toString().trim());
                double lebar = Double.parseDouble(l.getText().toString().trim());

                hasil.setText("Luas :"+panjang*lebar);

            }
        });
    }

}
