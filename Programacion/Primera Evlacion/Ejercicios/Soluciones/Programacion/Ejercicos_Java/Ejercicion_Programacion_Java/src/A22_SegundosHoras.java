import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Diseñar el algoritmo (ordinograma y pseudocódigo) correspondiente a un programa
//que exprese en horas, minutos y segundos un tiempo expresado en segundos.
public class A22_SegundosHoras {
    public static void convertirhoras(float seg) {
        Scanner sc = new Scanner(System.in);
       float horas, minutos;
       horas = (float) Math.floor(seg / 3600);
       seg = seg % 3600;
       minutos = (float) Math.floor(seg / 60);
       seg = seg % 60;
       System.out.println("Horas: "+horas+" minutos "+minutos+ " segunods "+seg);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduzca los segundos");
       float seg;
       seg = sc.nextFloat();
        convertirhoras(seg);
    }
}
