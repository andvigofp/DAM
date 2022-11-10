import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
// Dado un número determinar la suma de sus dígitos
public class A24_sumaDigitos {
    public static void sumarDigitos (int n) {
        Scanner sc = new Scanner(System.in);
        int suma;
        suma =0;
        int resto;


        while (n!=0) {
            resto = (int) Math.floor(n-(n/10)*10);
            suma = suma + resto;
            n= n/10;
        }
        System.out.println(suma);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número");
        int nume;
        nume = sc.nextInt();

       System.out.println("La suma de los digitos de " + nume + " es: ");
       sumarDigitos(nume);

    }
}