import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//(Ejercicio de dificultad alta) Realiza una clase minumero con un método es Omirp
//que diga si es un número es Omirp o no. Un número es Omirp si es un número primo
// y, además al invertir sus digitos da otro número primo. Por
// ejemplo 7951 y 1957.
public class A09_método_esOmirp {
    public static void main(String[] args) {


            Scanner leer = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el límite: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("\nNúmeros emirp del 1 al " + num);
        System.out.println("**************************\n");
        for (int aux = 1; aux <= num; aux++) {
            if(aux != invertirNumero(aux) && esPrimo(aux)
                    && esPrimo(invertirNumero(aux))){
                System.out.println("\t" + aux);
            }
        }
    }

    private static int invertirNumero(int numero){
        int cifra, inverso = 0;
        while(numero!=0){
            cifra = numero%10;
            inverso = (inverso * 10) + cifra;
            numero/=10;
        }
        return inverso;
    }

    private static boolean esPrimo(int num){
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
}









