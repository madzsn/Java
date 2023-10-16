public class operadoresLogicos {
    public static void main (String[] args) {
        boolean ehEstudante = true;
        boolean temNotaBoa = false;

        boolean podeParticipar = ehEstudante && temNotaBoa; // AND
        boolean precisaMelhorar = ehEstudante || temNotaBoa; // OR
        boolean naoEhEstudante = !ehEstudante; // NOT

        System.out.println("Pode participar: " + podeParticipar);
        System.out.println("Precisa Melhorar: " + precisaMelhorar);
        System.out.println("Não é estudante: " + naoEhEstudante);
    }
    
}
