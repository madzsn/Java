package Quimica01;
import java.util.Scanner;

public class gramaMol01 {
    public static void main (String[] args) {
        Scanner molzinho = new Scanner(System.in);

        System.out.print("Digite a quantidade de massa em gramas: ");
        double massa = molzinho.nextDouble();

        System.out.print("Digite a massa molar em g/mol: ");
        double massaMolar = molzinho.nextDouble();

        double quantidadeMol = massa / massaMolar;

        System.out.println ("A quantidade de mols é: " + quantidadeMol);


    }
    
}
