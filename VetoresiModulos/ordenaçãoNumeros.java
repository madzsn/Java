package VetoresiModulos;


public class ordenaçãoNumeros {
    public static void main (String[] args) {
        int[] juninho = { 5, 2, 8, 1, 9, 3 };
        metodo(juninho);

        System.out.println("lista ordenada");
        for (int i = 0; i < juninho.length; i++) {
            System.out.print(juninho[i]);

        }

    }

    public static void metodo(int[] juninho){
        for (int contadorVet1 = 0; contadorVet1 < juninho.length -1; contadorVet1++){ //corta o dedao
            for (int contadorVet2 = 0; contadorVet2 < juninho.length - contadorVet1 -1; contadorVet2++){
                if (juninho[contadorVet2]>juninho[contadorVet1]){
                    int temp = juninho[contadorVet2];
                    juninho[contadorVet2] = juninho [contadorVet2+1];
                    juninho[contadorVet2 + 1] = temp;

                }
            }
        }
    }
 }

    
        
       
