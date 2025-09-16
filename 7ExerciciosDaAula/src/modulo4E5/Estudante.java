package modulo4E5;

public class Estudante extends Usuario{
    private String curso;

    public Estudante(String nome, String email, String id, String curso) {
        super(nome, email, id);
        this.curso = curso;
    }

    public int getLimiteEmprestimos() {
        return 3;
    }

    public String getCurso() { return curso; }
}
