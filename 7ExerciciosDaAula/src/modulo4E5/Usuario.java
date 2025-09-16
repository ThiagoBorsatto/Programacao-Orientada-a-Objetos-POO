package modulo4E5;

public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String id;

    public Usuario(String nome, String email, String id) {
        this.nome = nome;
        this.email = email;
        this.id = id;
    }

    public abstract int getLimiteEmprestimos();

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getId() { return id; }
}
