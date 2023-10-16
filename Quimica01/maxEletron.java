package Quimica01;
import java.util.Scanner;

public class maxEletron {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = 3; // número da camada
        int maxElectrons = 2 * n * n;

        System.out.println("A terceira camada pode acomodar até " + maxElectrons + " elétrons.");

    }
    
}
