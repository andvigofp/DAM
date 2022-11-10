package Aceptaelreto;

import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Gregorio_XIII {
    public static void main(String[] args) {
        int numCasos, anio;
        Scanner leer = new Scanner(System.in);
        numCasos = leer.nextInt();

        for (int i = 0; i < numCasos; i++) {
            anio = leer.nextInt();
            if (anio % 4 !=0) {
                System.out.println("28");

            } else if (anio % 400 ==0) {
                System.out.println("29");
            } else if (anio % 100 ==0) {
                System.out.println("28");
            } else {
                System.out.println("29");
            }

        }
    }

    }




