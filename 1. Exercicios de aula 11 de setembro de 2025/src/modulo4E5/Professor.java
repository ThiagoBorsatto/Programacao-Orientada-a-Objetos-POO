package modulo4E5;

public class Professor extends Usuario{
    private String departamento;

    public Professor(String nome, String email, String id, int numeroDeLivrosEmprestados, int idade, String departamento) {
        super(nome, email, id, numeroDeLivrosEmprestados, idade);
        this.departamento = departamento;
    }

    public int getLimiteEmprestimos() {
        return 10;
    }

    public String getDepartamento() { return departamento; }
}
