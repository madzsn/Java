package Quimica01;
import java.util.Scanner;

public class pesoObjeto {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa do objeto em kg: ");
        double massa = scanner.nextDouble();

        System.out.print("Digite a aceleração gravitacional em m/s²: ");
        double gravidade = scanner.nextDouble();

        double peso = massa * gravidade;

        System.out.println("O peso do objeto é " + peso + "N.");

    }
    
}
