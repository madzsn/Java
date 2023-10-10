package Matemática01;

import java.util.Scanner;

public class volumeEsfera {
    public static void main (String[] args) {
        Scanner bolinha = new Scanner(System.in);

        System.out.print("Digite o valor do raio da esfera: ");
        float raio = bolinha.nextFloat();

        float volume = (float) Math.sqrt((4/3)* 3.14 * raio);
        System.out.print ("O volume da esfera vai ser: " + volume);
    }
    
}
