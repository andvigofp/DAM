/**
 * @Author: Andrés Fernández Pereira
 */
//¿Qué mostrará el siguiente códico por pantalla?
public class A04_Ejercicio4 {
    public static void main(String[] args) {


        // Inicializamos la variable 5
        int num = 5;
        int num2 = 4;

        //+= Quiere decir que lo que en la variablm, 5 en este caso
        // sumarle 5-1*4+1 =2.
        // Entonces mostrará 7, los 5 que ya tenia más 2 de la operación

        num += num -1 * 4 + 1;

        // Cambiamos el valor de la variable 4.

        System.out.println(num);
        // %= Quiere decir que el numero, 4 en este caso sera igual
        // al resto de la division del número

        //Ejemplo
        // 4 %= 7 * 4 % 3 * 7 >> 1;
        //4 %= 28 % 3 *7 >> 1;
        //Llegados a este punto, el operador >>(x) lo que hace es desplazar los bits de 7 X veces a la derecha, en este caso 1.
        //7 en binario es 111 asi que al desplazar los bits se queda en 11 que es el 3.

       //Entonces la operacion quedaria de la siguiente manera:
        //4 %= 3;
        //Al dividir 4/3 es 1 con resto 1 asi que el valor de numero sera 1.

        //devolverá 7 y en el segundo devolverá 1
        num2 %= 7 * num2 % 3 * 7 >> 1;
        System.out.println(num2);
    }
}

