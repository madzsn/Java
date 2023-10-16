package Quimica01;
import java.util.Scanner;

public class forçaNecessaria {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa em kg: ");
        double massa = scanner.nextDouble();

        System.out.print("Digite a aceleração em m/s²: ");
        double aceleracao = scanner.nextDouble();

        double forca = massa * aceleracao;

        System.out.println("A força necessária é " + forca + "N.");

    }
    
}
