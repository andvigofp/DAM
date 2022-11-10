package com.empresa1.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*****************************************************
         * Registro de un programador
         */

        Programador programador1 = new Programador();

        /* Input */

        System.out.println("Escriba el nombre del programador:");
        String lineaNombre = sc.nextLine(); // TODO: revisar lectura de ints como chars
        programador1.nombre = lineaNombre;

        System.out.println("¿En qué lenguaje programa?:");
        programador1.lenguaje = sc.nextLine();




        /* Output */
        System.out.println(programador1);


    }


}