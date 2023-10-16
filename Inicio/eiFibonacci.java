package Inicio;
public class eiFibonacci {
    public static void main (String[] args) {
        
        int numero = 10;
        int primeiro = 0, segundo = 1;
        System.out.print ("Sequência de Fibonacci: " + primeiro + ", " + segundo);

        for (int i = 2; i < numero; i++) {
            int proximo = primeiro + segundo;
            System.out.print (" , " + proximo);
            primeiro = segundo;
            segundo = proximo;
        }

  }
}
