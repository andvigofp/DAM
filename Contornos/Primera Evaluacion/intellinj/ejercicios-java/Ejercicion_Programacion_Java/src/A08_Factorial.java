import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Escribir un Pseudocódigo que calcule el factorial de un número
public class A08_Factorial {
    public static void factorial() {
        //Ej.: El factorial de 5 es: 5*4*3*2*1
        long factorial = 1;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }

    public static void main(String[] args) {
        //Ej.: El factorial de 5 es: 5*4*3*2*1


        Scanner sc = new Scanner(System.in);

        factorial();
    }
}
