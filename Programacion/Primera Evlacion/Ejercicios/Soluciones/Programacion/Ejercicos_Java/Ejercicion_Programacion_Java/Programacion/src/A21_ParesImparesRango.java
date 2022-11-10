import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

// Introducir 2 números por teclado. Imprimir los números que hay entre ambos, contar cuántos hay y cuántos son pares.
// Calcular el producto de los impares
public class A21_ParesImparesRango {
    public static void ParesImapresRango (int num1, int num2) {
        Scanner sc = new Scanner(System.in);
     int prodImpares, contPares, aux, cont;
     prodImpares=1;
     cont=0;
     contPares=0;

     for (aux = num1 +1; aux<=num2 - 1; aux++) {
         cont = cont +1;
         if (aux % 2==0){
             contPares= contPares+1;
         }else {
             prodImpares=prodImpares *aux;
         }
            System.out.println(aux);
     }
        System.out.println("El producto de los números impares es: " +prodImpares);
        System.out.println("Se ha encontrado "+contPares+ " Números pares en ese rango.");
        System.out.println("Se han encontrado "+cont+ " números ene ese rango");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca número 1");
        int n1;
        n1= sc.nextInt();
        System.out.println("Introduzca número2");
        int n2;
        n2= sc.nextInt();
        ParesImapresRango(n1, n2);
    }
}