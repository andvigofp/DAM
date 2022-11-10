import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double n1, n2, n3;
        System.out.println("Introduce el primer número :");
        n1 = src.nextDouble();
        System.out.println("Introduce el segundo número:");
        n2 = src.nextDouble();
        System.out.println("Introduce el tercer número:");
        n3 = src.nextDouble();
        if (n1 > n2 && n1 > n3) {
            System.out.println("El mayor es: " + n1);


            } else if  (n2 > n3 && n2 > n1)  {

                System.out.println("El mayor es: " + n2);

            }
            else if (n3 > n2 && n3 > n1) {
                System.out.println("El mayor es: " + n3);

            }
            else {
                System.out.println("Todos los números son iguales.");
        }
            }
                }


