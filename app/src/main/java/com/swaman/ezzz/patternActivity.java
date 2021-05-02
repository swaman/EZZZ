package com.swaman.ezzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.andrognito.patternlockview.PatternLockView;
import com.andrognito.patternlockview.listener.PatternLockViewListener;
import com.andrognito.patternlockview.utils.PatternLockUtils;

import java.util.List;

public class patternActivity extends AppCompatActivity implements PatternLockViewListener {
    PatternLockView lock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern);
        this.getSupportActionBar().hide();


        lock=findViewById(R.id.pattern_lock_view);
        lock.addPatternLockListener(this);

    }

    @Override
    public void onStarted() {

    }

    @Override
    public void onProgress(List<PatternLockView.Dot> progressPattern) {

    }

    @Override
    public void onComplete(List<PatternLockView.Dot> pattern) {


        if(PatternLockUtils.patternToString(lock,pattern).equalsIgnoreCase("0125"))
        {

            lock.setViewMode(PatternLockView.PatternViewMode.CORRECT);
            startActivity(new Intent(patternActivity.this,MainActivity.class));
            finishAffinity();
        }else
        {
            lock.setViewMode(PatternLockView.PatternViewMode.WRONG);
            Toast.makeText(this, "wrong pattern", Toast.LENGTH_SHORT).show();

        }



    }

    @Override
    public void onCleared() {

    }
}