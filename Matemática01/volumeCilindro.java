package Matemática01;
import java.util.Scanner;

public class volumeCilindro {
    public static void main (String[] args) {

        Scanner cirilo = new Scanner(System.in);

        System.out.print("Raio da base: ");
        float raio = cirilo.nextFloat();

        System.out.print("Altura: ");
        float altura = cirilo.nextFloat();

        float volume = (float) (3.14 * (raio * raio) * altura);
        System.out.println("Volume: " + volume);

    }
    
}
