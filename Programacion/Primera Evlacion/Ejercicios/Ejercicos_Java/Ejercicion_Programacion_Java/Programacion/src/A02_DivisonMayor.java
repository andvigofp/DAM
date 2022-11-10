import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Escribir Pseudocódigo que dados 2 valores de entrada
//imprima siempre la división del mayor entre el menor.
public class A02_DivisonMayor {

    public static float dividirMayorMenor(float num1, float num2) {
        float res;
        if (num2 > num1)
            res = num2 / num1;
        else
            res = num1 / num2;
        return res;
    }

    public static void divisionmayormenor() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número:");
        float n1 = sc.nextFloat();

        System.out.println("Introduzca el segundo número:");
        float n2 = sc.nextFloat();

        System.out.println("La división es: " + dividirMayorMenor(n1, n2));
    }
}
