package com.empresa1.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Empleado empleado = new Empleado();

        System.out.println("Escriba el nombre del Empleado:");
        empleado.nombre = sc.nextLine();

        System.out.println("Edad:");

        int numero = sc.nextInt();
        empleado.setEdad(numero);


        /* Output */
        System.out.println(empleado);
    }


}
