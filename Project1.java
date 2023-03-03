package com.mycompany.project1;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada de la consola
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número
        System.out.print("Por favor, ingrese el primer número: ");
        int numero = scanner.nextInt();
        
        // Declarar variables
        int vector[] = new int [numero];
        int suma =0;
        
        //construccion del vector
        for(int i=0;i<numero;i++){
            //lenado de vector
            vector[i] = scanner.nextInt();
            suma =vector[0] + vector [numero-1];
        }

        // Imprimir el resultado en la consola
        System.out.println("El resultado de la suma es: " + suma);
    }
}
