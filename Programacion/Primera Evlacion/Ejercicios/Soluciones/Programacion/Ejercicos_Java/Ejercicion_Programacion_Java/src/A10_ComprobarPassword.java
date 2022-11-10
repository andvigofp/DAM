import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Escribir un Pseudocódigo que pida una contraseña (3 intentos máximo)
// hasta que la clave sea 111, 222 o 333
public class A10_ComprobarPassword {
    public static void comprobarContraseña() {
        Scanner sc = new Scanner(System.in);
        int password;
        int numIntentos;
        numIntentos=3;
     do {
        System.out.println("Ingrese la contraseña, te quedan " + numIntentos+ " Intentos 3");
        password = sc.nextInt();
        numIntentos = numIntentos -1;

     }  while (!(password ==333) && !(password ==222) && !(password ==111) && !(numIntentos <1));

        if ((password ==111  | password ==222 | password ==333)){
            System.out.println("La contraseña es correcta");
        } else
            System.out.println("Has superado número de intentos");


    }



    public static void main(String[] args) {

        comprobarContraseña();


    }
}