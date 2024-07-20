package com.example.ecogarden;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class registrarse extends AppCompatActivity {

    private ImageView volver;
    private EditText usuario;
    private EditText password;
    private Button registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registrarse);

        volver = findViewById(R.id.imageView2);
        usuario = findViewById(R.id.editTextText2);
        password = findViewById(R.id.editTextTextPassword2);
        registro = findViewById(R.id.button2);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(registrarse.this, MainActivity.class);
                startActivity(back);
            }
        });

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back1 = new Intent(registrarse.this, MainActivity.class);
                startActivity(back1);
            }
        });
    }
}