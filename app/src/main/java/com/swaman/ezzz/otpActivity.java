package com.swaman.ezzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class otpActivity extends AppCompatActivity {

    Button df;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        df=findViewById(R.id.end_btn);
        df.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(otpActivity.this,MainActivity.class));
                finishAffinity();


            }
        });
    }
}