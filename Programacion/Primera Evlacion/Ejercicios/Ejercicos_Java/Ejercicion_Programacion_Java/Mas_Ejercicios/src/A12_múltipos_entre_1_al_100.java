import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
//Realiza un programa que muestre por pantalla los números del 1 al 100
// sin mostrar aquellos números múltipos de 5
public class A12_múltipos_entre_1_al_100 {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {


            if (i % 5!=0 ){
                System.out.println(i);
            }
        }
    }
}
