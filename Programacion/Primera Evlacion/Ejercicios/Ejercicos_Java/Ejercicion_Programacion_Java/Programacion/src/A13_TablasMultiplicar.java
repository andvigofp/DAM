import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Escribir un Pseudocódigo que calcule las tablas de multiplicar
public class A13_TablasMultiplicar {
    public static void MostrarTablaMultiplicar() {

        Scanner sc = new Scanner(System.in);


    for (int i=1; i<=10; i++) {
        System.out.println("Tabla del " +i);
     for (int j=1; j<=10; j++) {
         System.out.println(i+ " * " + j + "="+ i*j );
     }

    }
        System.out.println("---------------");
    }
    public static void main(String[] args) {
       MostrarTablaMultiplicar();

    }
}
