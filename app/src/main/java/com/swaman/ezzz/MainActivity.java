package com.swaman.ezzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageView snd,blnc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportActionBar().hide();
        snd=findViewById(R.id.snd_btn);
        blnc=findViewById(R.id.chk_btn);

        snd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Msg send btn", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,amntActivity.class));
            }
        });

        blnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Balance view btn", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,otpActivity.class));
            }
        });

    }
}