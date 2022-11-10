/**
 * @Author: Andrés Fernández Pereira
 */

//Ejercico de dificultad (alta). Realiza un programa
//que genere letras aleatoriamente y determine si son vocales
//o consonantes
public class A05_Ejercicio8 {

    public static void main(String[] args) {
        calcularletras();

    }

    private static void calcularletras() {
        char caracter = (char) (Math.random()*26+'A');
        System.out.println(caracter);

        if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U' || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {

            System.out.println("la letra " + caracter + " Es vocal" );
        }else {
            System.out.println("la letra " + caracter + " Es cosonante" );
        }
    }
}
