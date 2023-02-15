package com.example.invocaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login4 extends AppCompatActivity {
    Button b1;
    EditText NOM,EDAD,TELEFONO,FECHA,GENERO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login4);
        b1 = (Button) findViewById(R.id.enviar);
        NOM=(EditText) findViewById(R.id.nom);
        EDAD=(EditText) findViewById(R.id.edad);
        TELEFONO=(EditText) findViewById(R.id.tel);
        FECHA=(EditText) findViewById(R.id.nac);
        GENERO=(EditText) findViewById(R.id.gen);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i = new Intent(login4.this, login2.class);
                    i.putExtra("NOM",NOM.getText().toString());
                    i.putExtra("EDA",EDAD.getText().toString());
                    i.putExtra("telefono",TELEFONO.getText().toString());
                    i.putExtra("fecha",FECHA.getText().toString());
                    i.putExtra("genero",GENERO.getText().toString());
                    startActivity(i);


            }
        });
    }
}