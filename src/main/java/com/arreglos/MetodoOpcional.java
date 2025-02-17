package com.arreglos;

import java.util.Optional;

public class MetodoOpcional {
    public static void saludar(Optional<String> nombre) {
        System.out.println("Hola, " + nombre.orElse("Invitado") + "!");
    }
    public static void main(String[] args) {
        saludar(Optional.of("Spock"));
        saludar(Optional.empty());
    }
}
