class animal {
    void emitirSom() {
        System.out.println("Som genérico de um animal.");
    }
}

class Cachorro extends Animal{
    void emitirSom() {
        System.out.println("Latido de um cachorro.");
    }
}

class Gato extends Animal{
    void emitirSom() {
        System.out.println("Miado de um Gato.");
    }
}

public class ExemploHeranca {
    public static void main(String [] args){
        Animal animal = new Cachorro();
        animal.emitirSom();

        Animal animal2 = new Gato();
        animal2.emitirSom();
    }
}