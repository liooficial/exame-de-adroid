package com.example.invocaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText contraseña, usuario;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login1);

        b1 = (Button) findViewById(R.id.inicioo);
        texto = (TextView) findViewById(R.id.tlogin);
        contraseña = (EditText) findViewById(R.id.contraseña);
        usuario = (EditText) findViewById(R.id.usuario);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario2="liooficial",contraseña2="12345",usuario1=usuario.getText().toString(),contraseña1=contraseña.getText().toString();
                String login="login1";
                if (usuario1.equals(usuario2)){
                    if(contraseña1.equals(contraseña2)){
                        Intent i =new Intent(MainActivity.this,login3.class);
                        i.putExtra("usuario",usuario2);
                        i.putExtra("invoco",login);
                        startActivity(i);
                    }else{
                        texto.setText("La contraseña esta mal");
                    }
                }else{
                    texto.setText("El usuario no existe");
                }
            }
        });
    }
}