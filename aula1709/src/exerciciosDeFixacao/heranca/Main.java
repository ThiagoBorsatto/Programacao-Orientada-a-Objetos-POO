package exerciciosDeFixacao.heranca;

public class Main {
    public static void main(String[] args) {
        // Como nosso Aluno e Professor são uma herança de Pessoa é possível usar o mesmo métodos para os três por ele receber um parametro do tipo generico.

        Pessoa miguel = new Pessoa("Miguel", 19);
        Aluno samuel = new Aluno("Samuel",23,1333);
        Professor ana = new Professor("Ana",44,"Geografia");

        exibirDadosPessoas(miguel);
        exibirDadosPessoas(samuel);
        exibirDadosPessoas(ana);
    }

    public static void exibirDadosPessoas(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
