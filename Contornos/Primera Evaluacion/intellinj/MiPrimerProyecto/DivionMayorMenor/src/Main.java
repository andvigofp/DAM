import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        float n1, n2, mayor, menor;
        System.out.println("Ingrese el número 1:");
        n1 = src.nextFloat();
        System.out.println("Ingrese el número 2;");
        n2 = src.nextFloat();

            //Obtenemos el mayor y menor
        if (n1 > n2) {
            mayor = n2/n1;
        }else {
          menor = n1/n2;
        }
        System.out.println(n1 + " / " + n2 + " = " + n1 / n2);


    }
        }









