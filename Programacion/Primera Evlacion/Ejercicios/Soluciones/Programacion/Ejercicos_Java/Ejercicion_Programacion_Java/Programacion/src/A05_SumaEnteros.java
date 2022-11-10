import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Escribir un Pseudocódigo que calcule la suma
//de los N primeros números enteros positivos
public class A05_SumaEnteros {
    public static int calcularSumaFor(int n) {
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static void sumaenteros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número:");
        int num = sc.nextInt();
        System.out.println("La suma de los " + num + " primeros números enteros es: " + calcularSumaFor(num));
    }
}
