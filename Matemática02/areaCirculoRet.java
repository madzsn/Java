package Matemática02;
import java.util.Scanner;

public class areaCirculoRet {
    public static void main (String[] args) {
        Scanner ret = new Scanner(System.in);

        System.out.print("Digite o comprimento do retângulo: ");
        float compri = ret.nextFloat();

        System.out.print("Digite a largura desse retângulo: ");
        float larg = ret.nextFloat();

        float raio = (float) ((compri + larg )/ (2 * 3.14));
        System.out.println("Raio: " + raio);

        float area = (float) (3.14 * (raio * raio));
        System.out.print("A Área vai ser: " + area);
    }
    
}
