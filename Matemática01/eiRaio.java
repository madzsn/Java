package Matemática01;
import java.util.Scanner;

public class eiRaio {
    public static void main (String[] args) {

        Scanner kelvin = new Scanner(System.in);

        double raio;
        double area;

        System.out.print("Escreva o valor do raio: ");
        raio = kelvin.nextDouble();

        area = raio * 3.14 * 3.14;
        System.out.println("O valor da area vai ser: " + area);
        
    }
    
}
