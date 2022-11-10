import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * @Author: Andrés Fernández Pereira
 */
// Menu1
public class Menu {
    public static void primero() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        do {
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

//Menu3
    public static void segundo() {

        Scanner sn = new Scanner(System.in);
        boolean salir2 = false;
        int opcion2;

        do {
            System.out.print(" 1. MostarContraseña \n");
            System.out.print(" 2. MediaNotas \n");
            System.out.print(" 3. Media de la suma \n");
            System.out.print(" 4. Tablas de Multiplicar \n");
            System.out.print(" 5. Advina Numeros \n");
            System.out.print(" 6. Tratar Notas \n");
            System.out.print(" 7. NumerosPrimos \n");
            System.out.print(" 8. Nominas \n");
            System.out.print(" 9. ParesImpares \n");
            System.out.print(" 10. Salir del Menú \n");

            System.out.print(" Introduce un número \n");
            opcion2 = sn.nextInt();

            try {
                Scanner sc = new Scanner(System.in);
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
                        A15_TratarNotas.CapturasNotas();
                        break;
                    case 7:
                        A16_NumPrimos.numerosprimos();
                        break;
                    case 8:
                        System.out.println("Introduce las horas de Trabajo ==> ");
                        int horas = sc.nextInt();
                        A17_Nominas.calculoNominas(horas);
                        break;
                    case 9:
                        A18_ParesImpares.SumasParesImpares();
                        break;
                    case 10:
                        salir2 = true;
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
        } while (!salir2);
    }


//-----------------------------------------------------
    public static void tercero() {

        Scanner sn = new Scanner(System.in);
        boolean salir3 = false;
        int opcion3;

        do {
            System.out.print(" 1. Multipo3 \n");
            System.out.print(" 2. MayorMnorSerie \n");
            System.out.print(" 3. ParesImparesRango \n");
            System.out.print(" 4. SegundoHoras \n");
            System.out.print(" 5. CalculoSueldo \n");
            System.out.print(" 6. SumaDigitos \n");
            System.out.print(" 7. Salir del Menú \n");

            System.out.print(" Introduce un número \n");
            opcion3 = sn.nextInt();

            try {
                Scanner sc = new Scanner(System.in);
                switch (opcion3) {
                    case 1:

                        System.out.println("Introduce un número");
                        int num = sc.nextInt();
                       A19_Multipos3.contarMultipos(num);
                        break;
                    case 2:
                        // Algoritmo que imprima el mayor y el menor número de una serie de números introducidos por teclado(-1 para salir)
                        A20_MayorMenorSerie.mayorSerie();
                        break;
                    case 3:
                        System.out.println("Introduzca número 1");
                        int n1;
                        n1= sc.nextInt();
                        System.out.println("Introduzca número2");
                        int n2;
                        n2= sc.nextInt();
                        A21_ParesImparesRango.ParesImapresRango(n1,n2);
                        break;
                    case 4:
                        System.out.println("Introduzca los segundos");
                        float seg;
                        seg = sc.nextFloat();
                        A22_SegundosHoras.convertirhoras(seg);
                    case 5:
                        System.out.println("Introduzca sueldo");
                        int s;
                        s = sc.nextInt();
                        A23_CalcularSueldo.calculosueldo(s);
                    case 6:
                        System.out.println("Introduce el número");
                        int nume;
                        nume = sc.nextInt();
                        A24_sumaDigitos.sumarDigitos(nume);
                    case 7:
                        salir3 = true;
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
        } while (!salir3);
    }

}


