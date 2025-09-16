package modulo4E5;

public class Professor extends Usuario{
    private String departamento;

    public Professor(String nome, String email, String id, String departamento) {
        super(nome, email, id);
        this.departamento = departamento;
    }

    public int getLimiteEmprestimos() {
        return 10; // Professores podem pegar 10 livros
    }

    public String getDepartamento() { return departamento; }
}
