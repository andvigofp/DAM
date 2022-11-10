import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner src = new Scanner(System.in);
            String mensaje;
            do {
                System.out.println("Intrdozca un mensaje:");
                mensaje = src.nextLine();


            } while (!mensaje.equals("FIN"));
        }
    }
