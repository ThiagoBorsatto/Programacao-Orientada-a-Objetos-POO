package modulo4E5;

public class Funcionario extends Usuario{
    private int matriculaDoFuncionario;

    public Funcionario(String nome, String email, String id, int numeroDeLivrosEmprestados, int idade, int matriculaDoFuncionario) {
        super(nome, email, id, numeroDeLivrosEmprestados, idade);
        this.matriculaDoFuncionario = matriculaDoFuncionario;
    }

    public int getLimiteEmprestimos() {
        return 5;
    }
}
