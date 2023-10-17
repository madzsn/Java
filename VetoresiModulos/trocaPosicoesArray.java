package VetoresiModulos;
import java.util.Arrays;

public class trocaPosicoesArray {
    public static void main (String[] args) {
        int [] array = {4, 7, 2, 1};
        trocaPosicoes(array, 1, 2);

        System.out.println("Array após troca: " + Arrays.toString(array));
    }

    public static void trocaPosicoes(int[] array, int pos1, int pos2) {
        int temp = array[pos1]; // 7
        array[pos1] = array[pos2]; // 2
        array [pos2] = temp; //7

    }
}
