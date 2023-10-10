public class menorDivisor {
    public static void main (String[] args) {

        int numero = 12; // declara número
        int menorDivisor = 1; // declara divisor

        for (int i = numero; i > 1; i--) {
            if (numero % i == 0) {
                menorDivisor = i;
            }
        }
      System.out.println ("O menor divisor do número é: " + menorDivisor);
        
   }
}