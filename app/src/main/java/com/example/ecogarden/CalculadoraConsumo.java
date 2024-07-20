package com.example.ecogarden;

public class CalculadoraConsumo {
    public static int calcularConsumoDiario(ProductoAlquiler alquiler, int horasEnUso) {
        return alquiler.getPotencia() * horasEnUso;
    }

        public static int calcularConsumoDiario(ProductoAlquiler alquiler , int horasUso, int eficiencia) {
            return alquiler.getPotencia() * horasUso * eficiencia;
        }
    }
