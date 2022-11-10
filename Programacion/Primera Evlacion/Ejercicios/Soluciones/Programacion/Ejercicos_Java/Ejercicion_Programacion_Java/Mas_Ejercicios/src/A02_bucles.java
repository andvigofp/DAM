/**
 * @Author: Andrés Fernández Pereira
 */

//Realiza un programa utilizando bucles que muestre la siguiente figura por pantlla:
public class A02_bucles {
    public static void main(String[] args) {
        String asteriscos = "*";
        for (int i = 1; i <=5; i++) {
            System.out.println(asteriscos);
            asteriscos = asteriscos + "*";
        }
    }
}
