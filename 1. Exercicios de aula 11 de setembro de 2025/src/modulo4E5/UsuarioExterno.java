package modulo4E5;

public class UsuarioExterno extends Usuario {
    private int codigoDoUsuarioExterno;

    public UsuarioExterno(String nome, String email, String id,int numeroDeLivrosEmprestados, int codigoDoUsuarioExterno, int idade) {
        super(nome, email, id, numeroDeLivrosEmprestados, idade);
        this.codigoDoUsuarioExterno = codigoDoUsuarioExterno;
    }

    public int getLimiteEmprestimos() {
        return 3;
    }
}
