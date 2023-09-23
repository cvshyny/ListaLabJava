package principal;

public class q5 {
    public static void main(String[] args) {
        estudante estudante = new estudante("Camilly", 19);

        System.out.println("Nome do estudante: " + estudante.getNome());
        System.out.println("Idade do estudante: " + estudante.idade);

        estudante.exibirInformacoes();
        System.out.println("---------------------------");
        estudante.exibirInfoEstudante();
    }
}


class pessoa{
    private String nome;
    protected int idade;

    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}


class estudante extends pessoa {
    public estudante(String nome, int idade) {
        super(nome, idade);
    }

    public void exibirInfoEstudante() {
        System.out.println("Este é um estudante.");
    }
}