import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * @Author: Andrés Fernández Pereira
 */
public class Menu {
    public static void primero() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        do {
            System.out.println("Pulsar 0 Para volver a la pantalla: \n");
            System.out.print(" 1. Areatriangulo \n");
            System.out.print(" 2. DivisionMayor \n");
            System.out.print(" 3. ObtenerMayr3 \n");
            System.out.print(" 4. Fechas \n");
            System.out.print(" 5. SumarEnteros \n");
            System.out.print(" 6. Menor100 \n");
            System.out.print(" 7. ContarPositivos \n");
            System.out.print(" 8. ContarPositivos \n");
            System.out.print(" 9. MostrarPares \n");
            System.out.print(" 10. Salir del Menú \n");

            System.out.print(" Introduce un número \n");
            opcion = sn.nextInt();

            try {

                switch (opcion) {
                    case 1:
                        A01_AreaTriangulo.AreaTriangulo();
                        break;
                    case 2:
                        A02_DivisonMayor.divisionmayormenor();
                        break;
                    case 3:
                        A03_ObtenerMayor3.mayorde3();
                        break;
                    case 4:
                        A04_Fechas.mostrarfecha();
                        break;
                    case 5:
                        A05_SumaEnteros.sumaenteros();
                        break;
                    case 6:
                        A06_Menor100.menor100();
                        break;
                    case 7:
                        A07_ContarPositivos.NumerosPositivos();
                        break;
                    case 8:
                        A08_Factorial.factorial();
                        break;
                    case 9:
                        A09_mostrarPares.mostrarpares();
                    case 10:
                        salir = true;
                        ;
                        break;
                    default:
                        System.out.print(" Introduce un número 1 y 10 \n");


                }


            } catch (InputMismatchException e) {
                System.out.print(" Debes un número \n");
                sn.next();
            }
            System.out.print("Salio Correctamente \n");
        } while (!salir);
    }


    public static void segundo() {

        Scanner sn = new Scanner(System.in);
        boolean salir2 = false;
        int opcion2;

        do {
            System.out.println("Pulsar 0 Para volver a la pantalla: \n");
            System.out.print(" 1. MostarContraseña \n");
            System.out.print(" 2. MediaNotas \n");
            System.out.print(" 3. Media de la suma \n");
            System.out.print(" 4. Tablas de Multiplicar \n");
            System.out.print(" 5. Advina Numeros \n");
            System.out.print(" 6. Salir del Menú \n");

            System.out.print(" Introduce un número \n");
            opcion2 = sn.nextInt();

            try {

                switch (opcion2) {
                    case 1:
                        A10_ComprobarPassword.comprobarContraseña();
                        break;
                    case 2:
                        A11_ObtenerMediaNotas.ObtenerMediaNotas();
                        break;
                    case 3:
                        A12_ObtenerMediaSuma.ObtenerMediaSuma();
                        break;
                    case 4:
                      A13_TablasMultiplicar.MostrarTablaMultiplicar();
                        break;
                    case 5:
                        A14_AdivinarNumeros.Adivinarnumero();
                        break;
                    case 6:
                        salir2 = true;
                        ;
                        break;
                    default:
                        System.out.print(" Introduce un número 1 y 6 \n");


                }


            } catch (InputMismatchException e) {
                System.out.print(" Debes un número \n");
                sn.next();
            }
            System.out.print("Salio Correctamente \n");
        } while (!salir2);
    }
}


