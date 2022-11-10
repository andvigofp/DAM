package com.empresa1.ejercicio3;

import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class ejercicio3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Comercial comercial3 = new Comercial();

        /* Input */
        System.out.println("Escriba el noimbre del comercial");
        comercial3.nombre = sc.nextLine();

        System.out.println("¿Que idioma sabe");
        comercial3.idioma = sc.nextLine();

        System.out.println(comercial3);
    }
}
