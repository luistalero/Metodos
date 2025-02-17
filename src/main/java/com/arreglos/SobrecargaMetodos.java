package com.arreglos;

public class SobrecargaMetodos {
    public static int sumar(int a) {
        return a + 10;
    }
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Suma con números: " + sumar(5));
        System.out.println("Suma con dos números: " + sumar(5, 10));
    }
}
