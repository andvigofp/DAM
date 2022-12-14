import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
//Lucku Number: Se desea conocer (número de la suerte) de cualquiera persona.
//El número de la suerte se consigue reduciendo la fecha de nacimiento
public class A04_Lucky_Number {
    public static void main (String args[]) {


        Scanner entrada = new Scanner(System.in);

        int dia, mes, anho;
        int resultado;

        String fecha;
        String nombre ="";


        System.out.print("Introduce fecha de tu nacimiento: ");
        fecha = entrada.nextLine();
        dia = Integer.parseInt(fecha.substring(0,2));
        mes = Integer.parseInt(fecha.substring(3,5));
        anho = Integer.parseInt(fecha.substring(6,10));
        resultado = dia + mes + anho;

        boolean fechaIncorrecta = false;
        fechaIncorrecta =(anho > 9999) || (dia < 1 || dia > 31) || (mes < 1 || mes > 12);

        if (fechaIncorrecta)
            System.out.println("La fecha introducida no es correcta");
        do{
        }
        while (fechaIncorrecta);
        resultado = dia + mes + anho;

        do{
            resultado = resultado / 10 + resultado % 10;
        }
        while (resultado > 9 || resultado < 1);

        System.out.println("Hola diganos su nombre");
        nombre=entrada.next();
        System.out.println(nombre +" Numero de la suerte es: " + resultado);
        System.out.println();
    }


}