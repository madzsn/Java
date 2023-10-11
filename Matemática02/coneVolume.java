package Matemática02;
import java.util.Scanner;

public class coneVolume {
    public static void main (String[] args) {

        Scanner cone = new Scanner(System.in);

        System.out.print("Digite o volume do cone: ");
        float volume = cone.nextFloat();

        System.out.print("Digite a altura do cone: ");
        float altura = cone.nextFloat();

        float raio = (float) Math.sqrt(volume * (3 * altura) * 3.14);
        System.out.print("O raio do cone vai ser: " + raio);
    }
    
}
