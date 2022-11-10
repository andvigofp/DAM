import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

// Realiza un método que, dado un número de tres cifras, averigue si es un número Armstrong.
// Un número es Armostrong cuando la suma de cada uno de los números que componene elevado al número
// de dígitos de dicho número da como resultado el propio número. Como esta definición es algo
// compleja, con la siguiente imagen se verá más claro qué es un número Amstrong


public class A04B_Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número");
        int num = sc.nextInt();
        System.out.println("Los nnumeros Asmtong " + num + " son "+ calcularArmstrong(num));
    }

    private static int calcularArmstrong(int n) {
        int suma=0;
        while (n!=0) {
            suma = suma %10;

            suma +=  (Math.pow(n, n/10*10));
            System.out.println("Los numeros Amstrong es " +suma);
            n /=10;


        }
        return suma;
    }
}
