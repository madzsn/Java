package Quimica01;
import java.util.Scanner;


public class formulaEstrutural {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite a fórmula estrutural da molécula: ");
        String formulaEstrutural = scanner.nextLine();

        // Verificação simples para identificar se a molécula é aromática
        if (formulaEstrutural.contains("C6H6")) {
            System.out.println("A molécula é aromática.");
        } else {
            System.out.println("Não foi possível determinar o tipo da molécula com base na entrada.");
        }


    
}
}
