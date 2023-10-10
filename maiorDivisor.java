public class maiorDivisor {
    public static void main (String[] args) {
        int numero = 24; // declara número
        int maiorDivisor = 1; // declara divisor

        for (int i = 2; i<= numero; i++) { // loop for
            if (numero % i == 0) { // comando if
                maiorDivisor = i;
            }
        }
        System.out.println("O maior divisor é: " + maiorDivisor);
    }
}
