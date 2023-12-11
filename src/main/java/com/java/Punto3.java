package com.java;

import java.util.Random ;
import java.util.Scanner;

public class Punto3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener longitud de la contraseña
        System.out.print("Cuantos caracteres quiere tener en la contrasena? (entre 8 y 16): ");
        int longitud = scanner.nextInt();

        // Preguntas de preferencias al usuario
        System.out.print("Incluir letras mayusculas? (si/no): ");
        String incluirMayusculas = scanner.next();

        System.out.print("Incluir numeros? (si/no): ");
        String incluirNumeros = scanner.next();

        System.out.print("Incluir caracteres especiales? (si/no): ");
        String incluirEspeciales = scanner.next();

        // Ejecutar metodo para generar contraseña aleatoria
        String contrasena = generarContrasena(longitud, incluirMayusculas, incluirNumeros, incluirEspeciales);

        // Imprimir contraseña generada pero si el usuario escribe la longitud mal no la da
        if (longitud >= 8 && longitud <= 16) {
            System.out.println("Contrasena generada: " + contrasena);
            
        }else {
            System.out.println("La longitud de la contrasena debe estar entre 8 y 16 caracteres !Ponga la longitud bien eh¡");
        }
        
    }

    // Metodo para generar contraseña aleatoria
    public static String generarContrasena(int longitud, String incluirMayusculas, String incluirNumeros, String incluirEspeciales) {
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String caracteresEspeciales = "!@#$%^&*";

        String caracteres = minusculas;

        
        // Incluir letras mayusculas
        if (incluirMayusculas.equalsIgnoreCase("si")) {
            caracteres += mayusculas;
        }

        // Incluir numeros
        if (incluirNumeros.equalsIgnoreCase("si")) {
            caracteres += numeros;
        }

        // Incluir caracteres especiales
        if (incluirEspeciales.equalsIgnoreCase("si")) {
            caracteres += caracteresEspeciales;
        }

        StringBuilder contrasena = new StringBuilder();
        Random random = new Random();

        
        // Generar caracteres aleatorios
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            char caracter = caracteres.charAt(index);
            contrasena.append(caracter);
        }

        return contrasena.toString();
    }
}
