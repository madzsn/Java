package Matemática01;
import java.util.Scanner;


public class eiPiramide {
    public static void main (String[] args) {
        Scanner steve = new Scanner(System.in);

        System.out.print("Base: ");
        float base = steve.nextFloat();

        System.out.print("Altura: ");
        float altura = steve.nextFloat();

        float volume = (base * altura / 3);
        System.out.println("Volume: " + volume);

    }
    
}
