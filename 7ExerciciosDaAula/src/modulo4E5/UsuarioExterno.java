package modulo4E5;

public class UsuarioExterno extends Usuario {
    private int codigoDoUsuarioExterno;

    public UsuarioExterno(String nome, String email, String id, int codigoDoUsuarioExterno) {
        super(nome, email, id);
        this.codigoDoUsuarioExterno = codigoDoUsuarioExterno;
    }

    public int getLimiteEmprestimos() {
        return 3;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getId() { return id; }
}
