package principal;

public class q2 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.mover();
    }
}


interface Móvel {
    void mover();
}

class Carro implements Móvel {
    @Override
    public void mover() {
        System.out.println("Carro se movendo");
    }
}