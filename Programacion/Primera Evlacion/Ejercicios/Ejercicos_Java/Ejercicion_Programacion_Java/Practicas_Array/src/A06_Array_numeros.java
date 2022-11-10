/**
 * @Author: Andrés Fernández Pereira
 */
//6- Dado un array de números (podemos declarar los valores de forma inmediata),
//invertir los valores.
//El primero en el final, el final en el primero, y así con todos

//7- Dada una frase que nos proporciona el usuario. Pasarlo a un array char
//8- Dado un array de números, indicar si es capicua, es decir, sí se lee igual tanto por delante como por detras.
public class A06_Array_numeros {

    //@param args the command line arguments
    public static void main(String[] args) {

        int numeros[]={1,2,3,4,5};

        int aux[]= new int [numeros.length];

        for (int i =aux.length-1, j=0; i>=0; i--, j++) {
            aux[j]=numeros[i];
            System.out.println(aux[j]);
        }

    }
}
