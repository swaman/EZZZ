package com.swaman.ezzz;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hihi.twiliosms.TwilioMessage;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class amntActivity extends AppCompatActivity {

    EditText mny,cnct,otp;
    Button send_btn,vry_btn;
    private OkHttpClient mClient = new OkHttpClient();
    private Context mContext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amnt);
        this.getSupportActionBar().hide();

        mny=findViewById(R.id.amnt_txt);
        cnct=findViewById(R.id.phn_txt);
        otp=findViewById(R.id.otp_txt);
        send_btn=findViewById(R.id.btn_snd);
        vry_btn=findViewById(R.id.vrfy_btn);
        mContext = getApplicationContext();


        send_btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                String anmtS=mny.getText().toString().trim();
                String ph=cnct.getText().toString().trim();
                if(anmtS.length()==0||ph.length()<10)
                {
                    Toast.makeText(amntActivity.this, "Enter valid phone or ammount", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    mny.setVisibility(View.INVISIBLE);
                    cnct.setVisibility(View.INVISIBLE);
                    send_btn.setVisibility(View.INVISIBLE);
                    otp.setVisibility(View.VISIBLE);
                    vry_btn.setVisibility(View.VISIBLE);
                }


            }
        });

        vry_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(amntActivity.this,statusActivity.class));
                finishAffinity();

            }
        });


    }



/*
    public void sendmsg(String phnnmbr,String pse)
    {
        try {
            SmsManager manager=SmsManager.getDefault();
            manager.sendTextMessage(phnnmbr,null,"bahan k lode"+pse,null,null);
            Toast.makeText(this, "sent", Toast.LENGTH_SHORT).show();

        }catch (Exception e)
        {
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
        }



         }
*/






}