import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Ingrese la base del trinagulo:");
        double base = src.nextDouble();
        System.out.println("Ingrese la altura del trinagulo:");
        double altura = src.nextDouble();
        double area = (base*altura)/2;
        System.out.println("El Area es:" + area);
    }
}