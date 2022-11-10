/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app2;

import java.util.Scanner;

/**
 *
 * @author nccasares
 */
public class A15_MediaSuma {

    public static void obtenerMediaSuma() {
        Scanner sc = new Scanner(System.in);
        int sumaNum = 0;
        int contNum=0;
        int num=-1;
        while(num!=0) {
            System.out.println("Introduzca número (0 para salir):");
            num = sc.nextInt();
            sumaNum += num;
            if (num!=0) contNum+=1;
            //contNum++
        }
        System.out.println("La suma de los números es: " + sumaNum + " y la media: " + sumaNum/contNum);
    }

    public static void main(String args[]) {
        obtenerMediaSuma();
    }
}
