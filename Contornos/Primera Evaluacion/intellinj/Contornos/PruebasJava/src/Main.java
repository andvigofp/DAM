import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Programador p1 = new Programador();


        /* Input */
        System.out.println("Escriba el nombre del programador :");
        p1.nombre = sc.nextLine();


        System.out.println("¿En qué lenguaje programa? :");
        p1.lenguaje = sc.nextLine();



        /* Output */
        Programador.mostrarProgramador(p1);





        }


    }
