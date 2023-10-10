package Matemática01;
import java.util.Scanner;

public class volumeArea {
    public static void main (String[] args) {

        Scanner piti = new Scanner(System.in);

        System.out.print("Digite o tamanho da aresta: ");
        float aresta = piti.nextFloat();

        float volume = (aresta * aresta * aresta);
        System.out.println("Volume: " + volume);
        float area = (aresta * aresta);
        System.out.println("Área: " + area);
    }
    
}


