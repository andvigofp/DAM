import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class A20_MayorSerie {
    public static void mayorSerie() {
        Scanner sc = new Scanner(System.in);
        int numMayor, numMenor, num = 0;


        numMayor=0;
        numMenor=9999;

        while (num !=-1 ) {
            if (num > numMayor){
                numMayor=num;


            }else if (num < numMenor) {
                numMenor= num;

            }

        }
        System.out.println("El mayor es: "+numMayor+ " y el menor: "+numMenor);
    }

    public static void main(String[] args) {
        mayorSerie();
    }
}
