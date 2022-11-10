import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class A17_Nominas {
    public static void calculoNominas(float horastrabajo) {
     float tarifa = 30;
     int horas, sueldo, dif_horas, tarifa_extra, salario_extra, Impuesto, sueldo_total;

    if (horastrabajo <=35) {
        sueldo= (int) (horastrabajo*tarifa);

        } else  {

        }
    }


    public static void main(String[] args) {
    System.out.println("Introduce las horas de Trabajo ==> ");
    Scanner sc = new Scanner(System.in);
    float horas = sc.nextFloat();
        calculoNominas(horas);

    }
}