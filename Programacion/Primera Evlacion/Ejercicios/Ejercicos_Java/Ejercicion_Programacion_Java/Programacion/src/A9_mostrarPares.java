import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class A9_mostrarPares {
    public static void mostrarpares() {
    int suma =1;
    for (int i = 1; i<=10; i++) {
       if (i % 2==0 ) {
           System.out.println(""+i) ;
        }
        }

    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        mostrarpares();

    }
}