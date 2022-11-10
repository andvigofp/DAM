package com.empresa1.ejecicios_con_comercial.ejercicio2;

import com.empresa1.ejecicios_con_comercial.Comercial;

import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Comercial comercial = new Comercial();

        /* Input */

        System.out.println("Escriba el nombre del comercial:");
        comercial.nombre = sc.nextLine();

        System.out.println("¿Qué idioma habla?");
        comercial.idioma = sc.nextLine();


        /* Output */
        System.out.println(comercial);


    }


}