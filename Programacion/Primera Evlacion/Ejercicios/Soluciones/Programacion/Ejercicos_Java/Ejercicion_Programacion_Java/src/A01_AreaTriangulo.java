/**
 * @Author: Andrés Fernández Pereira
 */

//Escribir un Pseudocódigo que calcule el área de un
//triángulo recibiendo como entrada el valor de base y
//altura.
import java.util.Scanner;

public class A01_AreaTriangulo {
    public static double calcularArea(double base, double altura) {

        return base*altura/2;
    }
    public static void AreaTriangulo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la base del triángulo:");
        double b = sc.nextFloat();

        System.out.println("Introduzca la altura del triángulo:");
        double a = sc.nextFloat();

        System.out.println("El área es: " + calcularArea(b, a));
    }




}
