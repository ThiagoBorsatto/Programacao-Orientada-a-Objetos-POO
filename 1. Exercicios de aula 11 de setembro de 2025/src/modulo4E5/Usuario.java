package modulo4E5;

public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String id;
    protected int idade;
    protected int numeroDeLivrosEmprestados;

    public Usuario(String nome, String email, String id, int numeroDeLivrosEmprestados, int idade) {
        this.nome = nome;
        this.email = email;
        this.id = id;
        this.numeroDeLivrosEmprestados = numeroDeLivrosEmprestados;
        this.idade = idade;
    }

    public abstract int getLimiteEmprestimos();

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getId() { return id; }
    public int getNumeroDeLivrosEmprestados() { return numeroDeLivrosEmprestados; }

    public int getIdade() {
        return idade;
    }
}
