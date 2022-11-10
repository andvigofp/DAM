/**
 * @Author: Andrés Fernández Pereira
 */
//Realiza una clase minumero con un método esVampiro que diga si un número es vampiro o no. Un número es
//Vampiro si es obtenido a partir del producto de dos números que se obtienen a partir de los digitos
//del mismo (los dos colmillos). Por ejemplo 2187=27x81 ó 1260=21x60
public class A10_Vampiros {
    public static void main(String[] args) {
        int [] Digito = new int[4];
        int [] productoDigito = new int[4];

        for (int num1 = 10; num1 <=99; num1++) {
            for (int num2 = num1; num2 <=99; num2++) {

            if ((num1 * num2) % 9 != (num1 + num2) %9) {

            int producto = num1 * num2;
            Digito[0] = num1 /10;
            Digito[1] = num1 % 10;
            Digito[2] = num2 / 10;
            Digito[3] = num2 % 10;
            productoDigito [0] = producto /1000;
            productoDigito[1] = (producto % 1000) / 100;
            productoDigito[2] = producto % 1000 % 100 / 10;
            productoDigito[3] = producto % 1000 % 100 / 10;
            int count = 0;
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    if (productoDigito[x] == Digito [y]) {
                        count++;
                        productoDigito[x] = -1;
                        Digito[y] = -2;
                        if (count == 4)  {
                            System.out.println(num1 + " * " + num2 + " : "+ producto);
                        }
                    }
                }
            }
            }
            }
        }

    }
}
