package modulo4E5;

public class Funcionario extends Usuario{
    private int matriculaDoFuncionario;

    public Funcionario(String nome, String email, String id, int matriculaDoFuncionario) {
        super(nome, email, id);
        this.matriculaDoFuncionario = matriculaDoFuncionario;
    }

    public int getLimiteEmprestimos() {
        return 5;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getId() { return id; }
}
