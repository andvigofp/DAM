import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Ejemplo_numero_aleatorios_for {
    public static void Adivinarnumero() {
        Scanner sc = new Scanner(System.in);

        for (int i=1; i<=100; i++) {
            double aleatorio=Math.random();
            System.out.println(aleatorio);
        }

    }

    public static void main(String[] args) {
        Adivinarnumero();
    }
}

