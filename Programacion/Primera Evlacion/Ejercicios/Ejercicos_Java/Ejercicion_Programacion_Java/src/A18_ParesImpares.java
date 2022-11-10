import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class A18_ParesImpares {
    public static void SumasParesImpares() {
        Scanner sc = new Scanner(System.in);
    int suma, sumaPares, sumaImpares, contImpares, contPares, aux, num;

    sumaPares=0;
    sumaImpares=0;
    contImpares=0;
    contPares=0;
    suma=0;


    for (aux =1; aux <=10; aux++) {
        System.out.println("Introduce un número ");
        num = sc.nextInt();
        suma = suma + num;



        if (num  %  2==0){
        sumaPares = sumaPares + num;
        contPares = contPares + 1;

    } else  {
        sumaImpares = sumaImpares + num;
        contImpares = contImpares + 1;

    }
    System.out.println("La media de los números impares es: " + sumaImpares/contImpares);
    System.out.println("La suma de los números pares es: " + sumaPares);
    System.out.println("Se han introducido "+ contPares + " números pares");
    System.out.println("La suma total es: " +suma);
    }

    }

    public static void main(String[] args) {
        SumasParesImpares();
    }
}
