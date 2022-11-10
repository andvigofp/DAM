import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Utilidades {
    public static double introducirNumero(double i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número, el decimal con coma");
        return sc.nextDouble();
    }


}


