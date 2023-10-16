package Quimica01;
import java.util.Scanner;

public class areaEsfera {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o raio em cm: ");
        double raio = scanner.nextDouble();

        double area = 4 * Math.PI * raio * raio;

        System.out.println("A área da superfície da esfera é aproximadamente " + area + "cm².");

    }
    
}
