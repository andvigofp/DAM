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
public class A18_TratarNotas_1 {

    public static void capturaNotas() {
        Scanner sc = new Scanner(System.in);
        int mayorNotaNum = 0;
        String mayorNotaCad = "";
        String notaStr = "";
        int nota = 0;
        String notaCad = "";

        while (!notaStr.equals("s") && !notaStr.equals("S")) {
            System.out.println("Introduzca nota (S para salir):");
            notaStr = sc.next();
            if (!notaStr.equals("s") && !notaStr.equals("S")) {
                nota = Integer.parseInt(notaStr);
                switch (nota) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        notaCad = "Insuficiente";
                        break;
                    case 5:
                        notaCad = "Suficiente";
                        break;
                    case 6:
                        notaCad = "Bien";
                        break;
                    case 7:
                    case 8:
                        notaCad = "Notable";
                        break;
                    case 9:
                    case 10:
                        notaCad = "Sobresaliente";
                        break;
                }
                System.out.println(nota + ": " + notaCad);
                if (nota > mayorNotaNum) {
                    mayorNotaNum = nota;
                    mayorNotaCad = notaCad;
                }
            }
        }
        System.out.println("La mayor nota fue: " + mayorNotaNum + ": " + mayorNotaCad);
    }

    public static void main(String args[]) {
        capturaNotas();
    }
}
