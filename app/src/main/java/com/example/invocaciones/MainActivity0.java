package com.example.invocaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class MainActivity0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent i =new Intent(MainActivity0.this,MainActivity.class);
                startActivity(i);
            }
        }, 3000);
    }
}