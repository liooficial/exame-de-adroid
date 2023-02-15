package com.example.invocaciones;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class login2 extends AppCompatActivity {
    TextView NOM,EDAD,TELEFONO,FECHA,GENERO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        NOM=(TextView) findViewById(R.id.nom);
        EDAD=(TextView) findViewById(R.id.edad);
        TELEFONO=(TextView) findViewById(R.id.tel);
        FECHA=(TextView) findViewById(R.id.nac);
        GENERO=(TextView) findViewById(R.id.gen);

        NOM.setText(getIntent().getExtras().getString("NOM"));
        EDAD.setText(getIntent().getExtras().getString("EDA"));
        TELEFONO.setText(getIntent().getExtras().getString("telefono"));
        FECHA.setText(getIntent().getExtras().getString("fecha"));
        GENERO.setText(getIntent().getExtras().getString("genero"));

    }

}