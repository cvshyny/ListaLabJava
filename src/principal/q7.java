package principal;

public class q7 {
    public static void main(String[] args) {
        double saldoPositivo = 5000.0;
        double saldoNegativo = -450.0;

        double jurosPositivos = Banco.calculaTaxaJuros(saldoPositivo);
        double jurosNegativos = Banco.calculaTaxaJuros(saldoNegativo);

        System.out.println("Saldo positivo: " + saldoPositivo);
        System.out.println("Taxa de juros para saldo positivo: " + jurosPositivos);

        System.out.println("Saldo negativo: " + saldoNegativo);
        System.out.println("Taxa de juros para saldo negativo: " + jurosNegativos);
    }
}

class Banco{
    public static double calculaTaxaJuros(double saldo) {
        double taxaPositiva = 0.03; 

        double taxaNegativa = 0.05; 

        if (saldo >= 0) {
            return saldo * taxaPositiva;
        } else {
            return saldo * taxaNegativa;
        }
    }
}