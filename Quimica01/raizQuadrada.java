package Quimica01;
import java.util.Scanner;

public class raizQuadrada {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite um número real não negativo: ");
        double numero = scanner.nextDouble();

        if (numero < 0) {
            System.out.println("O número digitado não é válido. Por favor, insira um número não negativo.");
        } else {
            double raizQuadrada = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é " + raizQuadrada + ".");
        }


    }
    
}
