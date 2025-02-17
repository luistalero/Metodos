package com.arreglos;

public class MetodoJavaSinRetorno {
    public static void saludar() {
        System.out.println("Hola, Bienvenido a Java!");
    }
    public static void CalcularSuma(int a, int b) {
        int suma = a + b;
        System.out.println("La Suma de los numeros es :" + suma);
    }
    public static void main(String[] args) {
        saludar();
        CalcularSuma(6, 8);
    }
}
