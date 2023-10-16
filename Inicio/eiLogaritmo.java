package Inicio;
public class eiLogaritmo {
    public static void main (String[] args) {

        System.out.println(log (2,128));
    }

    public static double log (double base, double valor) {
        return Math.log(valor) / Math.log(base);
    }
    
}
