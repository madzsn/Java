package VetoresiModulos;

import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas vão ser atribuídas? ");
        int numero = scanner.nextInt();
        double nota[] = new double[numero];
        
        

        for (int i = 0; i < nota.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            nota[i] = Double.parseDouble(scanner.next());
        } 
        double media = jack(nota);
        System.out.print("Média: " + media);
            }


            public static double jack(double[] vetor) {
                double soma = 0;
                int contador = 0;
        
                for (int i = 0; i < vetor.length; i++) {
                    soma += vetor[i];
                    contador++;
                }
        
                return soma / contador;
    }
}
