import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
    int  d, m, a;
        System.out.println("Introduce dia :");
        d = src.nextInt();
        System.out.println("Introduce el mes:");
        m = src.nextInt();
        System.out.println("Introduce el año:");
        a = src.nextInt();

if (d > 31 || d < 1 || m < 1 || m > 12 || a < 0 ) {
    System.out.println("La fecha no es Válida: "  + a);

}else if (m==4 || m==6 || m==9 || m==11 && d>30) {
System.out.println("Error día" + d);
    }
else if (m==2 && d > 28) {
    System.out.println("Febrero no puede tener más de 28 días " + m +a);
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

    }

