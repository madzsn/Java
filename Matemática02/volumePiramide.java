package Matemática02;
import java.util.Scanner;

public class volumePiramide {
    public static void main (String[] args) {

        Scanner piramide = new Scanner(System.in);

        System.out.print("Digite o volume da pirâmide: ");
        float volume = piramide.nextFloat();

        System.out.print("Digite a altura da pirâmide: ");
        float altura = piramide.nextFloat();

        float area = (float) (volume * altura * 3);
        System.out.print("A área da pirâmide vai ser: " + area);
    }
}
