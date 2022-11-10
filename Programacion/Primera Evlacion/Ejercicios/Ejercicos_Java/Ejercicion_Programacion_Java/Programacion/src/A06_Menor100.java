import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Leer desde el teclado una serie de números hasta obtener uno inferior a 100
public class A06_Menor100 {
    public static void NunMenorMientras(int num) {


        do  {
            Scanner leer = new Scanner(System.in);
            System.out.println("Introduzca el número menor que 100:");
            num = leer.nextInt();
        } while(num >= 100);

}

    public static void menor100() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un Número:");
        int N = sc.nextInt();
        NunMenorMientras(N);
    }
}