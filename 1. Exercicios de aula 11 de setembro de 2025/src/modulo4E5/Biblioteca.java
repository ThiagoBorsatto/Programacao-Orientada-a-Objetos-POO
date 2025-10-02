package modulo4E5;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> acervo = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

    public Biblioteca() {
    }

    public Biblioteca(String nome, List<Livro> acervo, List<Usuario> usuarios) {
        this.nome = nome;
        this.acervo = acervo;
        this.usuarios = usuarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
        System.out.println("Livro adicionado ao acervo: " + livro.getTitulo());
        System.out.println();
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado: " + usuario.getNome());
        System.out.println();
    }

    public void listarLivrosDisponiveis() {
        System.out.println("=== Livros Disponíveis ===");
        for (Livro livro : acervo) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
        System.out.println();
    }

    public void mostrarLimiteUsuario(Usuario usuario) {
        System.out.println(usuario.getNome() + " pode emprestar até " + usuario.getLimiteEmprestimos() + " livros");
        System.out.println();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void verificarIsbn(String isbnNovoLivro) {
        for (Livro acervo : acervo) {
            if (acervo.getIsbn().equalsIgnoreCase(isbnNovoLivro)) {
                System.out.println("O ISBN informado é inválido!");
            }
        }
        System.out.println();
    }

    public void verificarEmailDoUsuario(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(email)) {
                System.out.println("O email informado já está cadastrado em outro usúario!");
            }
        }
        System.out.println();
    }

    public void verificarIdadeDoUsuario() {
        int idadeMinimaParaCadastro = 13;

        for (Usuario usuario : usuarios) {
            if (usuario.getIdade() < idadeMinimaParaCadastro) {
                System.out.println("O usúario deve ter mais de " + idadeMinimaParaCadastro + " anos para se cadastrar!");
            }
        }
        System.out.println();
    }
}
