import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Realiza un método dado un número de tres cifras
public class A04_Amstrong {


    public static void armstrong(int numero) {
        int num1, num2, num3;
        num1 = (numero%10);
        num2 = (numero%100);
        num3 = (numero/100);
        if (numero == (num1 * num1 * num1 + num2 * num2 * num2 + num3 * num3 * num3)) {
               System.out.println("El numero insertado es Arsmstrong");
        } else {
            System.out.println("El nuúmero insertado no es Arsmtrong");

    }



    }

    public static int leer() {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Ingrese un número");
    num = sc.nextInt();
    return num;

    }

    public static void main(String[] args) {
        int n;
        n = leer();
        armstrong(n);
    }

}



