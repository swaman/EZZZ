package com.swaman.ezzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class statusActivity extends AppCompatActivity {


    Button btnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        btnd=findViewById(R.id.done_btn);


        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(statusActivity.this,MainActivity.class));
                finishAffinity();
            }
        });
    }
}