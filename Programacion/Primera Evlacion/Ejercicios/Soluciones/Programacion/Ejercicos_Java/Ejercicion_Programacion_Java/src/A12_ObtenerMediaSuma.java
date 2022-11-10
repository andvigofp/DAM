import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Algoritmo que pida números hasta que se introduzca un cero.
//Debe imprimir la suma y la media de todos los números introducidos.
public class A12_ObtenerMediaSuma {
    public static void ObtenerMediaSuma() {
        Scanner sc = new Scanner(System.in);
     int num;
     int contNum;
     int sumaNum;

     contNum=0;
     sumaNum=0;
     do {
         System.out.println("Introducir número 0: para salir" );
         num= sc.nextInt();
         sumaNum=sumaNum+num;
     } while (num!=0);
        System.out.println("La suma de los dos números es: " + sumaNum + " y la media es " + sumaNum/(contNum-1) );

    }

    public static void main(String[] args) {
    ObtenerMediaSuma();
    }
}
