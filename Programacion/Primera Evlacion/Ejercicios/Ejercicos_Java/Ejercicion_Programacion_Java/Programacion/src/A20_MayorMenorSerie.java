import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

// Algoritmo que imprima el mayor y el menor número de una serie de números introducidos por teclado(-1 para salir)
public class A20_MayorMenorSerie {
    public static void mayorSerie() {
        Scanner sc = new Scanner(System.in);
        int num=0;
        int mayornun=0;
        int nunmenor=99999;



        while (num!=-1) {
            System.out.println("Introduzca un número ");
            num = sc.nextInt();
            if (num !=-1) {
                if (num>mayornun){
                    mayornun=num;

                } else if(num<=nunmenor) {
                    nunmenor=num;
                }

            }
        }
            System.out.println("El mayor es: "+mayornun+" y el menor: "+nunmenor);

        }


    public static void main(String[] args) {
        mayorSerie();
    }
    }