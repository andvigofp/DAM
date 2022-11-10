import java.util.Arrays;

/**
 * @Author: Andrés Fernández Pereira
 */
public class A01_Ordenar_Arreglo_Forma_Ascendente {
    //@param args the command line argumentos
    public static void main(String[] args) {
        int numeros [] = {2,5,6,10,9,8,1,4};
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length;i++) {
            System.out.println(""+numeros[i]);
        }
    }
}
