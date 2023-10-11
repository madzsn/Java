package Matemática02;
import java.util.Scanner;

public class areaEsfera {
    public static void main (String[] args) {

        Scanner esfera = new Scanner(System.in);
        System.out.print("Digite a área da esfera: ");
        float area = esfera.nextFloat();

        float raio = (float) Math.sqrt( area / (3.14 * 4) );
        System.out.print("O raio da esfera vai ser: " + raio);


    }
}