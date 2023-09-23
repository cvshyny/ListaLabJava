package principal;

public class q6 {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(10.0);
        double area = circulo1.calcularArea();

        System.out.println("Raio do círculo: " + circulo1.getRaio());
        System.out.println("Área do círculo: " + area);
    }
}

class Circulo{
    private double raio; 

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double getRaio() {
        return raio;
    }
}