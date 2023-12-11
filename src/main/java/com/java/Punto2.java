
package com.java;


//Importacion de la clase Scanner
import java.util.Scanner; 

public class Punto2 {

    public static void main(String[] args) {

        System.out.println("\n\033[46m" + "Punto 2" + "\033[0m");
        //Creacion del scanner de insercion
        Scanner sc = new Scanner(System.in);
        System.out.print("Valida tu contrasena: ");
        String password = sc.nextLine();
        
        //Validacion para saber que contraseña es de mas de 8 caracteres
        if (password.length() < 8) {
            System.out.println("Contraseña demasiado corta");
        
        // Validacion para saber si la contraseña tiene al menos un caracter especial, una letra mayúscula, una letra minúscula y un número    
        } else {

            // Variables para saber si la contraseña tiene al menos un caracter especial, una letra mayúscula, una letra minúscula y un número en estaodo falso antes de hacer la verificacion
            boolean caracterEspecial = false;
            boolean mayuscula = false;
            boolean minuscula = false;
            boolean numero = false;
        
        // Se valida cada caracter de la contraseña y se hace el cambio de estado de las variables
            for (int i = 0; i < password.length(); i++) {
                char caracter = password.charAt(i);
        
                if (caracter >= 33 && caracter <= 38|| caracter == 42  || caracter == 64 || caracter == 94) {
                    caracterEspecial = true;
                }
                if (caracter >= 65 && caracter <= 90) {
                    mayuscula = true;
                }
                if (caracter >= 97 && caracter <= 122) {
                    minuscula = true;
                }
                if (caracter >= 48 && caracter <= 57) {
                    numero = true;
                }
            }

        // Imprimir los errores o la validez de la contraseña
            if (!caracterEspecial) {
                System.out.println("La contraseña debe contener al menos un caracter especial");
            } else if (!mayuscula) {
                System.out.println("La contraseña debe contener al menos una letra mayúscula");
            } else if (!minuscula) {
                System.out.println("La contraseña debe contener al menos una letra minúscula");
            } else if (!numero) {
                System.out.println("La contraseña debe contener al menos un número");
            } else {
                System.out.println("Contraseña válida");
            }
        }
        
    
}
    
}


