package com.java;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {

        System.out.println("\n\033[46m" + "Punto 1" + "\033[0m");
        
        //Creacion del scanner de insercion
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();

        // Variable para almacenar la suma
        int suma = 0;


        //Algoritmo para obtener la suma y cada uno de los numeros multiplos de 3 o 5
        for (int i = 0; i < num; i++) {

            if (i % 3 == 0 || i % 5 == 0 && i < num) {
                suma = suma + i;
                System.out.println(i);
            } else if (i % 3 == 0 && i % 5 == 0) {
                continue;
            }   
        }
            System.out.println("La suma es: " + suma);
        }

    }

