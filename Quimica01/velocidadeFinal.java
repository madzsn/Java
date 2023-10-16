package Quimica01;
import java.util.Scanner;

public class velocidadeFinal {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite a aceleração gravitacional em m/s²: ");
        double gravidade = scanner.nextDouble();

        double velocidadeFinal = Math.sqrt(2 * gravidade * altura);

        System.out.println("A velocidade final é " + velocidadeFinal + " m/s.");

    }
    
}
