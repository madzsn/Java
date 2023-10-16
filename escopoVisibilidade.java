public class escopoVisibilidade {
    private int variavelPrivada = 10;
    public int variavelPublica = 20;

    public void metodoExemplo() {
        int variavelLocal = 30;
        System.out.println("Variável Privada: " + variavelPrivada);
        System.out.println("Variável Pública: " + variavelPublica);
        System.out.println("Variável Local: " + variavelLocal);
    }

    public static void main(String[] args) {
        escopoVisibilidade exemplo = new escopoVisibilidade();
        exemplo.metodoExemplo();
        System.out.println("Váriavel Pública: " + exemplo.variavelPublica);
    }

}
