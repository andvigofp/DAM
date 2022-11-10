import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Escribir un Pseudocódigo que lea 3 números los cuales significan
//una fecha (día, mes, año). Comprobar que sea válida la fecha, si no es valido
//que imprima un mensaje de error, y si es válida imprimir el mes con su nombre.
public class A04_Fechas {
    public static void ComprobarFecha(int d, int m, int a) {


        if (d > 31 || d < 1 || m < 1 || m > 12 || a < 0) {
            System.out.println("La fecha no es Válida: " + a);

        } else if (m == 4 || m == 6 || m == 9 || m == 11 && d > 30) {
            System.out.println("Error día" + d);
        } else if (m == 2 && d > 28) {
            System.out.println("Febrero no puede tener más de 28 días " + m + a);
        }
        switch (m) {
            case 1:
                System.out.println(d + " de Enero de " + a);
                break;
            case 2:
                System.out.println(d + " de Febrero de " + a);
                break;
            case 3:
                System.out.println(d + " de Marzo de " + a);
                break;
            case 4:
                System.out.println(d + " de Abril de " + a);
                break;
            case 5:
                System.out.println(d + " de Mayo de " + a);
                break;
            case 6:
                System.out.println(d + " de Junio de " + a);
                break;
            case 7:
                System.out.println(d + " de Julio de " + a);
                break;
            case 8:
                System.out.println(d + " de Agosto de " + a);
                break;
            case 9:
                System.out.println(d + " de Septiembre de " + a);
                break;
            case 10:
                System.out.println(d + " de Octubre de " + a);
                break;
            case 11:
                System.out.println(d + " de Noviembre de " + a);
                break;
            case 12:
                System.out.println(d + " de Diciembre de " + a);
                break;
        }

    }


    public static void mostrarfecha() {
        Scanner src = new Scanner(System.in);
        System.out.println("Introduce dia :");
        int dia = src.nextInt();
        System.out.println("Introduce el mes:");
        int mes = src.nextInt();
        System.out.println("Introduce el año:");
        int  ano = src.nextInt();

        ComprobarFecha(dia, mes, ano);

    }
}
