import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class A06_Tablas_Multiplicar {
    public static void main(String[] args) {
        Scanner valor=new Scanner(System.in);
        for (int i = 0; i <=10; i++) {
            System.out.println("Tabla del "+i);
            for (int j = 0; j <= 10; j++) {
                System.out.println(i+"*"+j+"="+i*j);

                System.out.println("-------------------------");

            }

        }
    }
}
