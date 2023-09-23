package principal;

public class q1 {
    public static void main(String[] args){
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        animal.fazerBarulho();
        cachorro.fazerBarulho();
        gato.fazerBarulho();
    }
}


class Animal {
    public void fazerBarulho() {
        System.out.println("Animal fazendo barulho");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerBarulho() {
        System.out.println("AUAU");
    }
}

class Gato extends Animal {
    @Override
    public void fazerBarulho() {
        System.out.println("MIAU");
    }
}
