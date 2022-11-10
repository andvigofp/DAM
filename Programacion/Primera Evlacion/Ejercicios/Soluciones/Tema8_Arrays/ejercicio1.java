import java.util.Scanner;

/**
 * - App Java que rellene un array estático de N posiciones (indicadas por el usuario) con números leídos de teclado.
 * - Calcular la media de los valores contenidos en el array, empleando un método aparte, al que se le pase dicho array
 * - Método que realice recuento de números negativos, empleando un método aparte, al que se le pase dicho array
 * - Método que muestre los elementos por pantalla y que también devuelva la cantidad de ellos que son
 *   superiores a la media de los valores del array.
 * - Verificar que los valores introducidos sean positivos
 */

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca número de posiciones del array:");
        /*int longitud = sc.nextInt();
        int[] array = new int[longitud];*/
        int[] array = new int[sc.nextInt()];

        for (int i = 0; i < array.length; i++) {
            int lectura;
            // Verificar que los valores introducidos sean positivos
            do {
                System.out.println("Introduzca contenido en la posición " + i + ":");
                lectura = sc.nextInt();
                if (lectura >= 0)
                    array[i] = lectura;
            } while (lectura < 0);
        }

        System.out.println("CONTENIDO:");
        for (int el : array)
            System.out.println(el);

        // MEDIA
        double media = calcularMedia(array);
        System.out.println("-> La media es: " + media);

        // RECUENTO NEGATIVOS
        System.out.println("-> El array contiene " + contarNegativos(array) + " números negativos.");

        // ELEMENTOS SUPERIORES A LA MEDIA
        System.out.println("-> Existen " + elementosSupMedia(array, media) + " elementos superiores a la media.");
    }

    // Calcular la media de los valores contenidos en el array, empleando un método aparte, al que se le pase dicho array
    public static double calcularMedia(int[] array) {
        double suma = 0;
        for (int el : array)
            suma += el;
        return suma / array.length;
    }

    // Método que realice recuento de números negativos, empleando un método aparte, al que se le pase dicho array
    public static int contarNegativos(int[] arrayNum) {
        int cont = 0;
        for (int el : arrayNum) {
            if (el < 0)
                cont++;
        }
        return cont;
    }

    // Método que muestre los elementos por pantalla y que también devuelva la cantidad de ellos que son
    // superiores a la media de los valores del array.
    public static int elementosSupMedia(int[] arrayNum, double media) {
        //double media = calcularMedia(array);
        int cont = 0;
        System.out.println("ELEMENTOS SUPERIORES A LA MEDIA:");
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] > media) {
                System.out.println("Elemento: " + arrayNum[i]);
                cont++;
            }
        }
        return cont;
    }

}