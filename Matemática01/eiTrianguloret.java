package Matemática01;

import java.util.Scanner;

public class eiTrianguloret {
    public static void main (String[] args) {

    Scanner hipopo = new Scanner(System.in);

    System.out.print ("Valor cateto a: ");
    float a = hipopo.nextFloat();

    System.out.print ("Valor cateto b: ");
    float b = hipopo.nextFloat();

    float hipotenusa = (float) Math.sqrt((a * a) +( b * b));

    System.out.println("O resultado da hipopo vai ser: " + hipotenusa );


    }

    
}
