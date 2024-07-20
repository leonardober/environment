package com.example.ecogarden;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button inicio;
    private EditText ingresarUsuario;
    private EditText ingresarContraseña;
    private TextView registrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        inicio = findViewById(R.id.cacular);
        ingresarUsuario = findViewById(R.id.horas);
        ingresarContraseña = findViewById(R.id.editTextTextPassword);
        registrarse = findViewById(R.id.muestraR);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguienteP1 = new Intent(MainActivity.this, menu.class);
                startActivity(siguienteP1);
            }
        });

        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguienteP2 = new Intent(MainActivity.this, registrarse.class);
                startActivity(siguienteP2);
            }
        });
    }
}