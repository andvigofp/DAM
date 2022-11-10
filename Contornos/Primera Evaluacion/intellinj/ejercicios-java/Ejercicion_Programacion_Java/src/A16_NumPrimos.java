/**
 * @Author: Andrés Fernández Pereira
 */

// Escribir un Pseudocódigo que encuentre y despliegue los números primos entre uno y cien.
// Un número primo es divisible entre el mismo y la unidad por lo tanto un numero primo no puede ser par excepto el dos (2).
public class A16_NumPrimos {
    public static void numerosprimos() {

        int cont=0;
        int contardivisores=0;


        for (int primo = 1; primo <= 100; primo++) {
            contardivisores =0;
            cont=1;
         while (cont <=primo) {

            if (cont % primo==0){
                contardivisores++;

             }
                cont++;
                }
              if (contardivisores<=2) {

                System.out.println("Los numeros primos son: "+primo);
              }
            }


        }



    public static void main(String[] args) {
        numerosprimos();
    }
}