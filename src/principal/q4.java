package principal;

public class q4 {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5.0, 4.0); // Triângulo com base 5 e altura 4
        double area = triangulo.calcularArea();

        System.out.println("Base do triângulo: " + triangulo.getBase());
        System.out.println("Altura do triângulo: " + triangulo.getAltura());
        System.out.println("Área do triângulo: " + area);
    }
}

class Triangulo{
    private double base;   
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}