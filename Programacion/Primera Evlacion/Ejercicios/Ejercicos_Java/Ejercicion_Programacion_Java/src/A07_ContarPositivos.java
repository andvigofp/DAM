import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class A07_ContarPositivos {
    public static void NumerosPositivos() {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int num;
        for (int i = 0; i <= 10; i++) {

            System.out.println("Introduzca un Número:");
            num = sc.nextInt();
            if (num > 0 ){
                total += 1;

            }

        }
        System.out.println("se ha introducido: " + total + " números positivos");
    }


    public static void main(String[] args) {

        NumerosPositivos();
    }
}