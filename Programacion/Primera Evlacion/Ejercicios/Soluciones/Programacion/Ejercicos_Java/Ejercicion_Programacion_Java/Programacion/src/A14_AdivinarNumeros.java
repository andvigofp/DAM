import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Escribir un Pseudocódigo permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100.
//A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,
//además de los intentos que te quedan (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el
//número (además te dice en cuántos intentos lo has acertado), si se llega al límite de intentos te muestra el número que
//había generado.
public class A14_AdivinarNumeros {
    public static void Adivinarnumero() {
        Scanner sc = new Scanner(System.in);


        int numAleatorio;
        int numintentos;
        int contador = 10;

        //Obtener número aleatorio
        numAleatorio = (int) (Math.random() * 100 + 1);
        System.out.println("Intenta adivinar un número aleatorio entre 1 y 100: " + " Tienes 1o intentos");
        System.out.println(numAleatorio);

        // Realización del do-while

        do {
            System.out.println("Numero contandor " + contador);
            System.out.println("Introcuce el que creas posible : ");
            numintentos = sc.nextInt();

            if (numintentos > numAleatorio) {
                System.out.println("El número que buscas es menor, te quedan " + (contador-1) + " intentos");


            } else if (numintentos < numAleatorio) {
                System.out.println("El número que buscas es mayor, te quedan " + (contador-1) + " intentos");
            } else {
                System.out.print("!CORRECTO " + numAleatorio + " era el número que estabas " + " buscando, has necesitado " + (10 -(contador-1)) + " intentos");
            }

            contador--;

            } while (numintentos != numAleatorio && contador > 0) ;
        if (contador ==0) {
            System.out.println("Has perdido. El número aleatorio era " + numAleatorio);
        }

        }


    public static void main(String[] args) {
        Adivinarnumero();
    }
}
