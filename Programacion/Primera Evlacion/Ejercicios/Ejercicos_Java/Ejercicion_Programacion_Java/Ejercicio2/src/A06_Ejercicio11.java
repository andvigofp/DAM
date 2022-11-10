import java.util.Scanner;
import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.format.*;  // Este paquete contiene DateTimeFormatter.
/**
 * @Author: Andrés Fernández Pereira
 */

//Realiza un programa con una variable entera t la cual
//contiene un tiempo en segundos y queremos coonocer este
//tiempo pero expesado en horas, minutos y segundos
public class A06_Ejercicio11 {



    public static void segundos_Horas(int t) {


        int horas, minutos, segundos;
        System.out.println(t);
        horas = t / 3600;
        t = t % 3600;
        minutos =t/ 60;
        segundos =t % 60;

        System.out.println( " Horas: "+ horas + " Minutos: " + minutos+ " Segundos: " + segundos);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiempo;
        System.out.println("Introduzca los segundos a convertir:");
        tiempo = sc.nextInt();
        segundos_Horas(tiempo);
    }
}




