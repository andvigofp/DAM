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
public class A16_TablasMultiplicar {

    public static void mostrarTablasMultiplicar() {

        for (int i = 0; i <= 10; i++) {
            System.out.println("TABLA DEL " + i);
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println("_______________");
        }
    }

    public static void main(String args[]) {
       mostrarTablasMultiplicar();
    }
}
