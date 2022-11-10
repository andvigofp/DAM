import java.util.Scanner;
/**
 * @Author: Andrés Fernández Pereira
 */

//(Ejericico de dificultad alta) Realiza un programa utilizando bucles que muestre la siguiente figura por pantalla
// Son 8 filas par y 9 filas impar
public class A03_Bucles {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        boolean numeroCorrecto = false;
        int numFilasRombos;
        do {
            System.out.print("Introduce el número de filas (par e impar): ");
            numFilasRombos = sc.nextInt();
            if(numFilasRombos>0 && numFilasRombos%2!=0){
                numeroCorrecto = true;
            }
        } while (!numeroCorrecto);

        System.out.println("");

        int numFilas = numFilasRombos/2 + 1;

        for(int altura=1;altura<=numFilas;altura++){
            //Blancos
            for(int blancos=1;blancos<=numFilas-altura;blancos++){
                System.out.print(" ");
            }
            //Asteriscos
            for(int asteriscos=1;asteriscos<=(2*altura)-1;asteriscos++){
                System.out.print("*");
            }
            System.out.println("");
        }

        numFilas--;

        for(int altura=1;altura<=numFilas;altura++){
            //Blancos
            for(int blancos=1;blancos<=altura;blancos++){
                System.out.print(" ");
            }
            //Asteriscos
            for(int asteriscos=1;asteriscos<=(numFilas-altura)*2 +1;asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

