package VetoresiModulos;

public class somaParesArray {

    public static void main(String[] args) {
        //Declarando e inicializando um Array
        int[] arrayFornecido = { 2, 3, 6, 8, 10, 11 };
        System.out.println("Array fornecido: " + java.util.Arrays.toString(arrayFornecido));
        int somaPares = somaPares(arrayFornecido);
        System.out.println("Soma dos números pares: " + somaPares);
    }

    public static int somaPares(int[] array) {
        int soma = 0;
        for (int num : array) {
            if (ehPar(num)) {
                soma += num;
            }
        }
        return soma;
    }

    public static boolean ehPar(int num) {
        return num % 2 == 0;
    }
}