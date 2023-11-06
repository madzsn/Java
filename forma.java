class Forma {
    void desenhar() {
        System.out.println("Desenhando uma forma genérica.");
    }
}

class circulo extends Forma {
    void desenhar() {
        System.out.println("Desenhando um círculo");
    }
}

class quadrado extends Forma {
    void desenhar() {
        System.out.println("Desenhando um quadrado.");
    }
}

public class Forma {
    public static void main (String[] args) {
        Forma forma1 = new circulo();
        forma1.desenhar();

        Forma forma2 = new quadrado();
        forma2.desenhar();
    }
}
