package Quimica01;
import java.util.Scanner;

public class volumeCubo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o comprimento da aresta em cm: ");
        double aresta = scanner.nextDouble();

        double volume = Math.pow(aresta, 3);

        System.out.println("O volume do cubo é " + volume + "cm³.");

    }
    
}
