package VetoresiModulos;
import java.util.Scanner;
public class numeroPrimo {

// Verifica se o número é primo ou não
    public static boolean ehPrimo (int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Principal função para entrada do usuário
    public static void main (String[]  args) {
        Scanner primo = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = primo.nextInt();
        
        if (ehPrimo(numero)) {
            System.out.print("O número é primo.");
        } else {
            System.out.print("O número não é primo.");
        }
    }
}
     
        
    

