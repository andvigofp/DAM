import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Calculadora {
    public static void main(String[] args) {
       double num1=Utilidades.introducirNumero(2.1);
        double num2 =Utilidades.introducirNumero(2.1);
        int c;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ha introducido: "+num1 + " y "+num2+" indique que operaciones desea hacer ");
            System.out.println("pulse 0 para salir");
            System.out.println("pulse 1 para sumar");
            System.out.println("pulse 2 para restar");
            System.out.println("pulse 3 para multiplicar");
            System.out.println("pulse 4 para dividir");
            c=leer.nextInt();
            switch (c) {
                case 1 -> System.out.println(num1 + " + " +num2+ " = " + (num1 + num2));
                case 2 -> System.out.println(num1 + " - " +num2+ " = " + (num1 - num2));
                case 3 -> System.out.println(num1 + " * " +num2+ " = " + (num1 * num2));
                case 4 -> System.out.println(num1 + " / " +num2+ " = " + (num1 / num2));
            }

        }while(c!=0);

    }
}
