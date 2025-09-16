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
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado: " + usuario.getNome());
    }

    public void listarLivrosDisponiveis() {
        System.out.println("\\\\n=== Livros Disponíveis ===");
        for (Livro livro : acervo) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }

    public void mostrarLimiteUsuario(Usuario usuario) {
        System.out.println(usuario.getNome() + " pode emprestar até " +
                usuario.getLimiteEmprestimos() + " livros");
    }
}
