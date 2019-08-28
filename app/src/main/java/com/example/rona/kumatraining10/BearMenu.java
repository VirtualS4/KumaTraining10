package com.example.rona.kumatraining10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BearMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bear_menu);

        initbtn((Button)findViewById(R.id.lat1),Beartivity.class);
        initbtn((Button)findViewById(R.id.lat2),Beartivity2.class);
        initbtn((Button)findViewById(R.id.lat3),Beartivity3.class);
        initbtn((Button)findViewById(R.id.lat4),Beartivity4.class);

    }

    private void initbtn(Button btn,final Class bearclass){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bearsense = new Intent(BearMenu.this,bearclass);
                startActivity(bearsense);
            }
        });
    }

}
