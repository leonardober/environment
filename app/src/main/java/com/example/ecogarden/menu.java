package com.example.ecogarden;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class menu extends AppCompatActivity {
    private TextView cerrarSesion;
    private TextView resultadoPrecioRastrillo;
    private TextView resultadoPrecioAuto;
    private TextView resultadoPrecioGuadana;
    private EditText productos;
    private Button calcularDescuento;
    private Button calcularConsumo;
    private EditText precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        cerrarSesion = findViewById(R.id.textView3);

        productos = findViewById(R.id.editTextText6);
        precio = findViewById(R.id.editTextText7);

        resultadoPrecioGuadana = findViewById(R.id.textView20);
        resultadoPrecioAuto = findViewById(R.id.textView21);
        resultadoPrecioRastrillo = findViewById(R.id.textView22);

        calcularDescuento = findViewById(R.id.button3);
        calcularConsumo = findViewById(R.id.button4);


        calcularDescuento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ingreseProducto = productos.getText().toString();
                double precioingresado = Double.parseDouble(precio.getText().toString());
                double precioDescuento = precioingresado;

                switch (ingreseProducto.toLowerCase()){

                    case "GUADANA":
                        precioDescuento *= 0.5;
                        resultadoPrecioGuadana.setText(String.format("GUADANA ELECTRICA: " + precioDescuento));
                        break;

                    case "MINIAUTO":
                        precioDescuento *= 0.5;
                        resultadoPrecioAuto.setText(String.format("MINIAUTO LABRADOR: " + precioDescuento));
                        break;

                    case "RASTRILLO":
                        precioDescuento *= 0.5;
                        resultadoPrecioRastrillo.setText(String.format("RASTRILLO NEUMARICO: " + precioDescuento));
                        break;

                    default:
                        break;
                }
            }
        });

        cerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backP = new Intent(menu.this, MainActivity.class);
                startActivity(backP);
            }
        });

        calcularConsumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backP = new Intent(menu.this, calculadoraConsumos.class);
                startActivity(backP);
            }
        });


    }
}