import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Calcular la media aritmética de 7 notas
//numéricas introducidas por teclado
public class A11_ObtenerMediaNotas {
    public static void ObtenerMediaNotas() {
        Scanner sc = new Scanner(System.in);
        int nota;

        int sumaNotas;
        sumaNotas=0;
        for (int contNotas=1; contNotas<=7; contNotas++){
        System.out.println("Intrdoduzca Nota: ");
        nota = sc.nextInt();
        sumaNotas=sumaNotas+nota;
        }
        System.out.println("La nota de la asignatura es: " +sumaNotas/7);
    }


    public static void main(String[] args) {
        ObtenerMediaNotas();
    }
}