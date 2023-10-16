package Quimica01;
import java.util.Scanner;

public class massa {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de mols: ");
        double mols = scanner.nextDouble();

        System.out.print("Digite a massa molar em g/mol: ");
        double massaMolar = scanner.nextDouble();

        double massa = mols * massaMolar;

        System.out.println("A massa é: " + massa + "g");

    }
    
}
