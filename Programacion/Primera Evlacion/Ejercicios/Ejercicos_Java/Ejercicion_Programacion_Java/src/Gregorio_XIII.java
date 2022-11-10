import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Gregorio_XIII {
    public static void main(String[] args) {
        int numCasos , anio=0;


    

        for (numCasos = 0; numCasos > 1; numCasos--) {
            if ((anio % 4 == 0) && ((anio % 100 == 0) || (anio % 400 == 0))) {
                System.out.println("El año es bisiesto");
            } else {
                System.out.println("El año no es bisiesto");
            }

}

}
}
