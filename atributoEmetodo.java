class pessoa {
 String nome;
 int idade;

 void saudade() {
    System.out.println("Olá, meu nome é " + nome + "e tenho " + idade + "anos.");

 }
}
public class atributoEmetodo {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Alice";
        pessoa1.idade = 30;
        pessoa1.saudacao();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Bob";
        pesssoa2.idade = 25;
        pessoa2.saudacao();
    }
}
