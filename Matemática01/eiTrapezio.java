package Matemática01;
import java.util.Scanner;

public class eiTrapezio {
    public static void main (String[] args) {

        Scanner trapaz = new Scanner(System.in);

        System.out.print ("Valor base 01: ");
        float base1 = trapaz.nextFloat();

        System.out.print ("Valor base 02: ");
        float base2 = trapaz.nextFloat();

        System.out.print ("Valor altura: ");
        float altura = trapaz.nextFloat();

        float trapezio = (float) Math.sqrt ((base1 + base2) * altura /2);
        
        System.out.println ("A área do trapézio vai ser: " + trapezio);
    }
    
}
