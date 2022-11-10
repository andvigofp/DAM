import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Crear una aplicación que solicite notas numéricas (S para salir) y
// muestre por pantalla su equivalente en letras (Sobresaliente, notable,
//bien, suficiente, suspenso). Al terminar, deberá mostrar la mayor nota en
//número y letra.
public class A15_TratarNotas {
    public static void CapturasNotas() {
        Scanner sc = new Scanner(System.in);
        int nota;
        int mayorNotaNum = 0;
        String  mayorNotacad= "" ;
       String notacad="";

        do {
            System.out.println("Introduzca nota: (999 para salir");
            nota = sc.nextInt();

            switch (nota) {
                case 1,2,3,4: System.out.println(nota + " Insuficiente");
                break;
                case 5: System.out.println(notacad + " Suficiente");
                break;
                case 6: System.out.println(notacad + " Bien");
                break;
                case 7,8: System.out.println(notacad + " Notable");
                break;
                case 9,10: System.out.println(notacad + " Sobresaliente");



            }



        }while (nota != 999) ;

        if (nota!=999){
            System.out.println(nota+ ": "+ notacad);

        }else {
            mayorNotaNum=nota;
            mayorNotacad=notacad;
        }
        System.out.println("La mayor nota fue:" + mayorNotaNum + ": "+ mayorNotacad);
        }




    public static void main(String[] args) {
        CapturasNotas();
    }

}