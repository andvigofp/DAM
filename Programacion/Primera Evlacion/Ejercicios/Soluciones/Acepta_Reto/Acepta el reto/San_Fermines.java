package Aceptaelreto;

import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class San_Fermines {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num = 0;
        int mayor;
        int total;

        while(leer.hasNext()) {
            mayor = 0;
            total = leer.nextInt();

            if (total >= 1){
                for (int i=0; i<total; i++) {
                    num = leer.nextInt();

                    if (num > mayor) {
                        mayor = num;
                    }
                }
                System.out.println(mayor);
            }
        }
    }
}
