package principal;

public class q3 {
    public static void main(String[] args) {
        contaBancaria c1 = new contaBancaria(1000); // Saldo inicial de 1000
        System.out.println("Saldo inicial: " + c1.getSaldo());

        c1.depositar(500);
        c1.sacar(200);
        System.out.println("Saldo atual: " + c1.getSaldo());
    }
}

class contaBancaria{
    private double saldo;

    public contaBancaria(double saldoIniciar){
        this.saldo = saldoIniciar;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Seu deposito de " + valor + " foi realizado com sucesso! Saldo atual: " + saldo);
        } else {
            System.out.println("Valor incorreto!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " foi realizado com sucesso! Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

}
