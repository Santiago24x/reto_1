package com.java;

public class Punto4 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(a);
            int temp = a;
            a = b; 
            b = temp + b;
            System.out.println();
        }
    }
}


/* Explicacion del algoritmo:
Este algoritmo sirve para generar los primeros 10 nemuros de la serie fibonacci en cada iteracion del bucle for  se imprime el valor de a, se guarda el valor actual de a en una variable temporal, se actualiza el valor de a con el valor de b y se actualiza el valor de b sumando el valor temporal al valor anterior de b.
*/  
