package modulo4E5;

public class TesteBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Emprestimo emprestimo = new Emprestimo();

        biblioteca.setNome("Biblioteca do SENAI");

        Livro livro1 = new Livro("Clean Code", "Robert Martin", "978-0132350884", 2008);
        Livro livro2 = new Livro("Design Patterns", "Gang of Four", "978-0201633610", 1994);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Usuario estudante = new Estudante("Ana Silva", "ana@email.com", "E001", 3,17,"ADS");
        Usuario professor = new Professor("Dr. João", "joao@email.com", "P001",5 ,35,"TI");
        Usuario funcionario = new Funcionario("Pedro Alberto", "pedroalberto@email.com", "F001", 4,41,888777);
        Usuario usuarioExterno = new UsuarioExterno("Carlos Pereira", "carlospereira@email.com", "UE001", 2, 323424, 8);

        biblioteca.cadastrarUsuario(estudante);
        biblioteca.cadastrarUsuario(professor);
        biblioteca.cadastrarUsuario(funcionario);
        biblioteca.cadastrarUsuario(usuarioExterno);


        biblioteca.mostrarLimiteUsuario(estudante);
        biblioteca.mostrarLimiteUsuario(professor);
        biblioteca.mostrarLimiteUsuario(funcionario);
        biblioteca.mostrarLimiteUsuario(usuarioExterno);

        livro1.emprestar();
        livro1.emprestar();

        biblioteca.listarLivrosDisponiveis();

        livro1.devolver();
        biblioteca.listarLivrosDisponiveis();

        emprestimo.controleDeMultaPorAtrasoDeDevolucao();
        emprestimo.historicoDeEmprestimoPorUsuario(biblioteca.getUsuarios(), 1);

        biblioteca.verificarIsbn("978-0132350884");
        biblioteca.verificarEmailDoUsuario("ana@email.com");
        biblioteca.verificarIdadeDoUsuario();
    }
}
