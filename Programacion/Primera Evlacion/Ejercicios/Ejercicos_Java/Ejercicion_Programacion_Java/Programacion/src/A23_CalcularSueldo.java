import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//  A un trabajador le descuentan de su sueldo el 10% hasta los 1000 euros,
// si cobra entre 1000 y 2000 , a mayores el 5% del adicional, y por encima
// de 2000 el 3% del adicional (sobre 2000). Calcular el descuento y sueldo neto que recibe el
// trabajador dado su sueldo.

public class A23_CalcularSueldo {
 public static void calculosueldo(int s) {
     Scanner sc = new Scanner(System.in);
     double descuento;

     if (s <=1000) {
         descuento =  s * 0.1;

     } else if (s>1000 && s<=2000) {
         descuento =  1000*0.1  +  (s - 1000) *0.05;

     }else {
         descuento =  1000*0.1  + (s - 1000) *0.05 + (s - 2000) *0.03;
     }
    System.out.println("Descuento: "+descuento);

     System.out.println("Sueldo neto: "+(s -descuento));

 }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Introduzca sueldo");
     int s;
     s = sc.nextInt();
     calculosueldo(s);
    }
}