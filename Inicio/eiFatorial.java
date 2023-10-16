package Inicio;
public class eiFatorial {
    public static void main (String[] args) {

        int numero = 30;
        int fatorial= 1;

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial* i;
        }
        System.out.println ("O fatorial do número vai ser: " + fatorial);
    } 
}
