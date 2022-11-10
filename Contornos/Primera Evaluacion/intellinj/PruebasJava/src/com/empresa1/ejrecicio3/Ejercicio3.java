package com.empresa1.ejrecicio3;

import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Comercial comercial3 = new Comercial();

        System.out.println("Escriba el nombre deñ comercial :");
        comercial3.nombre= sc.nextLine();



        System.out.println(comercial3);

    }
}
