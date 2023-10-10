package Matemática01;

import java.util.Scanner; // Dá a entrada ao usuário

public class volumeEsfera {
    public static void main (String[] args) {
        Scanner bolinha = new Scanner(System.in);

        System.out.print("Digite o valor do raio da esfera: ");
        float raio = bolinha.nextFloat();

        //Declarando a operação que vai ser feita no código
        float volume = (float) Math.sqrt((4/3)* 3.14 * raio);  
        // Saíoda do resultado da operação
        System.out.print ("O volume da esfera vai ser: " + volume);
    }
    
}
