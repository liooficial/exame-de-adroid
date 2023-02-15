package com.example.invocaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login3 extends AppCompatActivity implements SensorEventListener {
    TextView t1,h2;
    Sensor proximidad,acelerometo;
    SensorManager s1;
    MediaPlayer m1;

    int canciones []={R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h};
    String can []={"Baila Morena  Hector y Tito ft Don Omar  Glory.mp3","Don Omar  Conteo.mp3","c.mp3","Two Feet  Quick Musical Doodles and Sex.mp3","Two Feet  Love Is A Bitch Español.mp3","Two Feet  Had Some Drinks.mp3","Don Omar  Danza Kuduro ft Lucenzo.mp3","Don Omar  Salio El Sol Official Music Video.mp3"};
    int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);
        t1=(TextView) findViewById(R.id.b);
        h2=(TextView) findViewById(R.id.h2);
        s1=(SensorManager) getSystemService(SENSOR_SERVICE);
        proximidad=s1.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        acelerometo=s1.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        s1.registerListener(this,proximidad,SensorManager.SENSOR_DELAY_NORMAL);
        s1.registerListener(this,acelerometo,SensorManager.SENSOR_DELAY_NORMAL);
        t1.setText("cancion: "+can[index]);
        m1=MediaPlayer.create(this,canciones[index]);

    }
    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        switch (sensorEvent.sensor.getType()){
            case Sensor.TYPE_PROXIMITY:
                String texto=String.valueOf(sensorEvent.values[0]);
                float valor=Float.parseFloat(texto);
                if(valor==5){
                    m1.start();
                }else{
                    m1.stop();
                    Intent i =new Intent(login3.this,login4.class);
                    startActivity(i);
                }
                break;
            case Sensor.TYPE_ACCELEROMETER:
                String acelerometro=String.valueOf(sensorEvent.values[0]);
                float valor1=Float.parseFloat(acelerometro);
                //h2.setText(acelerometro);
                if(valor1>29){
                    if(m1.isPlaying()){
                        m1.stop();
                        if(index>=7){
                            index=0;
                        }else{
                            index++;
                        }
                        m1=MediaPlayer.create(this,canciones[index]);
                        m1.start();
                        t1.setText("cancion: "+can[index]);
                    }
                }
                break;
        }
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
