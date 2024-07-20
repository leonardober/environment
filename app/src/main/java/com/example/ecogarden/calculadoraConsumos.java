package com.example.ecogarden;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class calculadoraConsumos extends AppCompatActivity {

    private EditText horasUso;
    private Button calcularUso;
    private TextView resultadoFinal;
    private TextView cerrarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculadora_consumos);

        horasUso = findViewById(R.id.editTextText);
        calcularUso = findViewById(R.id.button);
        resultadoFinal = findViewById(R.id.textView15);
        cerrarSesion = findViewById(R.id.textView18);

        calcularUso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularConsumo();
            }
        });

    }

    private void calcularConsumo() {

        String HorasUsoStr = horasUso.getText().toString();

        if(!HorasUsoStr.isEmpty()){
          int HorasEnUso = Integer.parseInt(HorasUsoStr);

          ProductoAlquiler alquiler = new ProductoAlquiler("Ratrillo Neumatico", 1200, 90);

          int consumption = CalculadoraConsumo.calcularConsumoDiario(alquiler, HorasEnUso);

          resultadoFinal.setText("Consumo diario: " + consumption + " Wh");

        }else {

            resultadoFinal.setText("Ingrese las horas de uso");

        }

        cerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(calculadoraConsumos.this, MainActivity.class);
                startActivity(back);
            }
        });
    }
}