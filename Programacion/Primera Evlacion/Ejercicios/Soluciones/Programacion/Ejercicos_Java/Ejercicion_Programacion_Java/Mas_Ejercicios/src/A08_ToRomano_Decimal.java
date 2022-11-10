
import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */

//Realiza una clase con un método decimalToRomano que transforme números en formato decimal a
//números en formato romano


public class A08_ToRomano_Decimal {

    static Scanner sca = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner valor=new Scanner(System.in);
        int numero,unidades=0,decenas=0,centenas=0,miles=0;
        String Rom1="",Rom2="",Rom3="",Rom4="";
        System.out.println("Digite el numero a convertir");
        int numeros=valor.nextInt();
        unidades=numeros%10/1;
        decenas=numeros%100/10;
        centenas=numeros%1000/100;
        miles=numeros%100000/1000;
        switch(unidades){
            case 1:
                Rom1="I";break;
            case 2:
                Rom1="II";break;
            case 3:
                Rom1="III";break;
            case 4:
                Rom1="IV";break;
            case 5:
                Rom1="V";break;
            case 6:
                Rom1="VI";break;
            case 7:
                Rom1="VII";break;
            case 8:
                Rom1="VIII";break;
            case 9:
                Rom1="IX";break;
        }
        switch(decenas){
            case 1:
                Rom2="X";break;
            case 2:
                Rom2="XX";break;
            case 3:
                Rom2="XXX";break;
            case 4:
                Rom2="XL";break;
            case 5:
                Rom2="L";break;
            case 6:
                Rom2="LX";break;
            case 7:
                Rom2="LXX";break;
            case 8:
                Rom2="LXXX";break;
            case 9:
                Rom2="XC";break;
        }
        switch(centenas){
            case 1:
                Rom3="C";break;
            case 2:
                Rom3="CC";break;
            case 3:
                Rom3="CCC";break;
            case 4:
                Rom3="CD";break;
            case 5:
                Rom3="D";break;
            case 6:
                Rom3="DC";break;
            case 7:
                Rom3="DCC";break;
            case 8:
                Rom3="DCCC";break;
            case 9:
                Rom3="CM";break;
        }
        switch(miles){
            case 1:
                Rom4="M";break;
            case 2:
                Rom4="MM";break;
            case 3:
                Rom4="MMM";break;
            case 4:
                Rom4="IV/";break;
            case 5:
                Rom4="V/";break;
            case 6:
                Rom4="VM";break;
            case 7:
                Rom4="VMM";break;
            case 8:
                Rom4="VMMM";break;
            case 9:
                Rom4="IX/";break;
        }
        System.out.println("En Romanos es "+ (Rom4+Rom3+Rom2+Rom1));

    }
}
