package Quimica01;
import java.util.Scanner;

public class potenciaDissipada {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite a tensão em volts: ");
        double tensao = scanner.nextDouble();

        System.out.print("Digite a resistência em ohms: ");
        double resistencia = scanner.nextDouble();

        double potencia = (tensao * tensao) / resistencia;

        System.out.println("A potência dissipada é " + potencia + "W.");

    }
    
}
