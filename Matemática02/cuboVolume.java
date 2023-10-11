package Matemática02;
import java.util.Scanner;

public class cuboVolume {
    public static void main (String[] args) {

        Scanner cubo = new Scanner(System.in);

        System.out.print("Digite o volume do cubo: ");
        float volume = cubo.nextFloat();

        float aresta = (float) Math.cbrt (volume);
        System.out.print("O tamanho de uma aresta vai ser: " + aresta);
    }
    
}
