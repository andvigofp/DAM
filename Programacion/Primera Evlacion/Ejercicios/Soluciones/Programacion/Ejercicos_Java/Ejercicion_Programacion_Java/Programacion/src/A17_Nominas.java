import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Realice un Pseudocódigo que calcule la nómina salarial neto, de unos obreros cuyo trabajo se paga en horas.
//El cálculo se realiza de la siguiente forma:
//- Las primeras 35 horas mensuales a una tarifa fija. (30 ?, por ejemplo)
//- Las horas extras se pagan a 1.5 más de la tarifa fija.
//- Los impuestos a deducir de los trabajadores varian:
//- Si el sueldo mensual es menor que 1000 ?, el sueldo es libre de impuesto
// - En caso contrario, se descontará un 20% de impuestos
public class A17_Nominas {
    public static void calculoNominas(float horastrabajo) {
        float tarifa = 30;
        Float horas, sueldo, dif_horas, tarifa_extra, salario_extra, Impuesto, sueldo_total;

        if (horastrabajo <= 35) {
            sueldo = (float) (horastrabajo * tarifa);

        } else {
            dif_horas = horastrabajo - 35;
            tarifa_extra = (float) (tarifa * 1.5);
            salario_extra = tarifa_extra * dif_horas;
            sueldo = (float) ((35 * tarifa + salario_extra));


        }
        Impuesto = Float.valueOf(0);
        float salario_total = 0;
        if (sueldo > 1000) {
            Impuesto = (float) (sueldo * 0.20);
            salario_total = sueldo - Impuesto;
            System.out.println("Sueldo al mes: " + sueldo + " Valor de Impuesto: " + Impuesto + " El salario Netos es " + salario_total);

        } else {
            System.out.println("Tu sueldo Neto es: " +sueldo);
        }



    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Introduce las horas de Trabajo ==> ");

    int horas = sc.nextInt();
        calculoNominas(horas);

    }
}