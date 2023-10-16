package Quimica01;
import java.util.Scanner;

public class totalEletrons {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite a configuração eletrônica: ");
        String configuracaoEletronica = scanner.nextLine();

        int totalEletrons = 0;
        for (int i = 0; i < configuracaoEletronica.length(); i++) {
            if(Character.isDigit(configuracaoEletronica.charAt(i))) {
                totalEletrons += Character.getNumericValue(configuracaoEletronica.chatAt(i));

            }
        }
    }
    System.out.println("O átomo possui " + totalEletrons + "elétrons.");
}
