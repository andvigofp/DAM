import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
//App javva que rellene un array estático de N posiciones (incidicados por el usuario)
//con númros léidos de teclado
//Calular la media de los valores contenidos en el array, empleando un
//método aparte, al que se le pase dicho array
//Método qie realice recuento de números negativos, empleando un método
//aparte, al que se le pase dicho array;

//Método que muestre los elementos por pantalla y que tmabíen devuelva la
//cantidad de ellos que son superipores a la media de los valores del array.

//Verificar que los valores introducidos sean positivos

public class Arrays_por_Teclado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos números quieres introducir");
        int tamañonumeros = leer.nextInt();
        int[] alamacenarnumeros = new int[tamañonumeros];
        /*Meter numeros en la array*/
        for (int i = 0; i < alamacenarnumeros.length; i++) {
            int positivos;
            // Verificar que los valores introducidos sean positivos
            do {
                System.out.println("Introduzca contenido en posición" + i + ":");
                positivos = leer.nextInt();
                if (positivos >=0)
                    alamacenarnumeros[i] = positivos;
            } while (positivos < 0);
            System.out.println("Introduce números positivos");


        }

        /*Listar numeros en la array*/
        for (int j = 0; j < alamacenarnumeros.length; j++) {
            System.out.println(alamacenarnumeros[j]);
        }


        // Media
        System.out.println("La media de los números " + Calcularmedia(alamacenarnumeros));


    //Negativos
    System.out.println("Los números negativos ");
    System.out.println("La cantidad de los números negativos " + CalcularNegativos(alamacenarnumeros));


    //Calcular los números superiores a la media de la cantidad
       System.out.println("La cantidad de numeros mayores que la media: " + CalcularmediaSuperior(alamacenarnumeros,Calcularmedia(alamacenarnumeros) ));
    }

    private static int CalcularmediaSuperior(int[] alamacenarnumeros, double calcularmedia) {
        int Superior = 0;
        for (int j = 0; j< alamacenarnumeros.length; j++) {
            if (alamacenarnumeros[j] >  calcularmedia) {
                Superior = Superior +1;
                //Superior++
            }

        }
        return  Superior;
    }

    private static int CalcularNegativos(int[] alamacenarnumeros) {
        int negativos = 0;
        for (int j = 0; j < alamacenarnumeros.length; j++) {
            if (alamacenarnumeros[j] < 0 ) {
                negativos = negativos + 1;
                //negativos++;
            }

        }
        return negativos;
    }


    private static double Calcularmedia (int[] alamacenarnumeros){
            double media = 0;
            for (int j = 0; j < alamacenarnumeros.length; j++) {

                media = alamacenarnumeros[j] + media;

            }


            return (int) (media / alamacenarnumeros.length);
        }


    }

