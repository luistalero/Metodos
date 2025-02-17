package com.arreglos;

//import java.util.Scanner;
import java.util.Optional;

public class MetodoOpcional {
    public static void saludar(Optional<String> nombre) {
        System.out.println("Hola, " + nombre.orElse("Invitado") + "!");
    }
    public static void main(String[] args) {

        saludar(Optional.of("Luis"));
        saludar(Optional.empty()); 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Ingrese su nombre de Registro: ");
        // String nombre = sc.nextLine();

        // if (nombre == null) {
        //     saludar(Optional.of(nombre));
        // } else {
        //    saludar(Optional.empty()); 
        // }
        
        
    
        // sc.close();
    }
}
