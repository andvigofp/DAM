import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

// (Ejercicio de dificultad alta) Realiza un programa que dado un importe en euros
// nos indique el mínimo número de billetes y la cantidad sobrante que se pueden utilizar
// para obtener dicha cantidad

public class A07_Ejercicio12 {
    public static void main(String[]args)
    {
        int cantidad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la cantidad en euros");
        cantidad = sc.nextInt();
        int quinientos = cantidad / 500;
        cantidad = cantidad - 500 * quinientos;
        int doscientos = cantidad / 200;
        cantidad = cantidad - 200 * doscientos;
        int cien = cantidad / 100;
        cantidad = cantidad - 100 * cien;
        int cincuenta = cantidad / 50;
        cantidad = cantidad - 50 * cincuenta;
        int veinte = cantidad / 20;
        cantidad = cantidad - 20 * veinte;
        int diez = cantidad / 10;
        cantidad = cantidad - 10 * diez;
        int cinco = cantidad / 5;
        cantidad = cantidad - 5 * cinco;
        System.out.println(quinientos + " Billetes de 500");
        System.out.println(doscientos + " Billetes de 200");
        System.out.println(cien + " Billetes de 100");
        System.out.println(cincuenta + " Billetes de 50");
        System.out.println(veinte + " Billetes de 20");
        System.out.println(diez + " Billetes de 10");
        System.out.println(cinco + " Billetes de 5");
        System.out.println("Sobran " + cantidad + " euros");
    }
}

