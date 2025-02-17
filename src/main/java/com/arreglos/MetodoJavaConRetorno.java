package com.arreglos;

public class MetodoJavaConRetorno {
    public static int sumar(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int resultado = sumar(5, 10);
        System.out.println("La suma es: " +  resultado);
    }
}

