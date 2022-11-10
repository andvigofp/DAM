import java.util.Arrays;

/**
 * @Author: Andrés Fernández Pereira
 */
public class A01_Ordenar_Arrglo_Forma_Descendente {
    //@param args the command line argumentos
    public static void main(String[] args) {
        int numeros [] = {2,5,6,10,9,8,1,4};
        Arrays.sort(numeros);
        for (int i = numeros.length-1; i >=0;i--) {
            System.out.println(""+numeros[i]);
        }
    }
}