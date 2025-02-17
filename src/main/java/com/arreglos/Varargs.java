package com.arreglos;

public class Varargs {
    public static void imprimirNombres(String... nombres) {
        for (String nombre : nombres) {
            System.out.println("Hola, " + nombre + "!");
        }
    }
    public static void imprimirValor(Object... valores) {
        for (Object valor : valores) {
            System.out.println("Hola, " + valor + "!");
        }
    }
    public static void main(String[] args) {

        String[] frutas = {"Manzana", "Banana", "cereza"};
        imprimirNombres("Luis", "Catalina", "Manuel", "Jessica");
        imprimirValor((Object[]) frutas);
        imprimirValor("luis", 12);
    }
}

