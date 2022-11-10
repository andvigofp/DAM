import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Escribir Pseudocódigo que lea de entrada 3 números y que indique cuál es el mayor de ellos.
public class A03_ObtenerMayor3 {
    public static void obtenerMayor(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
    }

    public static void mayorde3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número:");
        int n1 = sc.nextInt();

        System.out.println("Introduzca el segundo número:");
        int n2 = sc.nextInt();

        System.out.println("Introduzca el tercer número:");
        int n3 = sc.nextInt();

        obtenerMayor(n1, n2, n3);
    }
}
