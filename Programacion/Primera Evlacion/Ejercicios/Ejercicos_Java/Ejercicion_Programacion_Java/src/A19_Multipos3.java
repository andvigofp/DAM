import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class A19_Multipos3 {
    public static void contarMultipos(int num) {
        Scanner sc = new Scanner(System.in);
    int aux, contMult;

    aux=1;
    contMult=0;

    while (aux <= num) {
      if (aux % 3==0){
          System.out.println(aux);
          contMult = contMult + 1;
        }
      aux = aux + 1;
    }
    System.out.println("Se ha encontado " + contMult +" multiplos 3");
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();

        contarMultipos(num);
    }
}