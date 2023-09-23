package principal;

public class q8 {
    public static void main(String[] args) {
        Imprimivel documento = new Documento();
        Imprimivel foto = new Foto();

        documento.imprimir();
        foto.imprimir();
    }
}

interface Imprimivel {
    void imprimir();
}

class Documento implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo documento...");
    }
}

class Foto implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo foto...");
    }
}