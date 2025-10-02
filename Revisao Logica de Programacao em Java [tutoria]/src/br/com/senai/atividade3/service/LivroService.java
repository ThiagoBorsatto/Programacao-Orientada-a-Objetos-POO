package br.com.senai.atividade3.service;

import br.com.senai.atividade3.entity.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LivroService {
    Scanner scanner = new Scanner(System.in);
    List<Livro> listaDeLivros = new ArrayList<>();

    public void cadastrarLivro() {
        Livro livro = new Livro();
        String tituloDoLivro;
        String autorDoLivro;
        int isbn;
        int anoDePublicacao;

        scanner.nextLine();
        System.out.print("Digite o título do livro: ");
        tituloDoLivro = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        autorDoLivro = scanner.nextLine();
        System.out.print("Digite o ISBN do livro: ");
        isbn = scanner.nextInt();
        System.out.print("Digite o ano de publicação do livro: ");
        anoDePublicacao = scanner.nextInt();
        System.out.println();

        livro.setTitulo(tituloDoLivro);
        livro.setAutor(autorDoLivro);
        livro.setIsbn(isbn);
        livro.setAno(anoDePublicacao);
        livro.setDisponibilidade(true);

        listaDeLivros.add(livro);
    }

    public void emprestarLivro() {
        String tituloDoLivroDesejado;
        String tituloDoLivroParaEmprestar;
        Livro livroParaEmpretar;

        System.out.print("Digite o título do livro que deseja emprestar: ");
        tituloDoLivroDesejado = scanner.nextLine();

        for (int livro = 0; livro < listaDeLivros.size(); livro++) {
            tituloDoLivroParaEmprestar = listaDeLivros.get(livro).getTitulo();
            if (tituloDoLivroDesejado.equalsIgnoreCase(tituloDoLivroParaEmprestar)) {
                livroParaEmpretar = listaDeLivros.get(livro);
                livroParaEmpretar.setDisponibilidade(false);

                System.out.println("Livro emprestado com sucesso!");
                System.out.println();
            }
        }
    }

    public void devolverLivro() {
        String tituloDoLivroDesejado;
        String tituloDoLivroParaDevolver;
        Livro livroParaEmpretar;

        System.out.print("Digite o título do livro que deseja devolver: ");
        tituloDoLivroDesejado = scanner.nextLine();

        for (int livro = 0; livro < listaDeLivros.size(); livro++) {
            tituloDoLivroParaDevolver = listaDeLivros.get(livro).getTitulo();
            if (tituloDoLivroDesejado.equalsIgnoreCase(tituloDoLivroParaDevolver)) {
                livroParaEmpretar = listaDeLivros.get(livro);
                livroParaEmpretar.setDisponibilidade(true);

                System.out.println("Livro Devolvido com sucesso!");
                System.out.println();
            }
        }
    }

    public void consultarDisponibilidade() {
        boolean disponibilidadeDeLivro;
        Livro livrosDisponiveis;

        for (int livros = 0; livros < listaDeLivros.size(); livros++) {
            disponibilidadeDeLivro = listaDeLivros.get(livros).isDisponibilidade();
            if (disponibilidadeDeLivro) {
                livrosDisponiveis = listaDeLivros.get(livros);

                System.out.println("Título do livro: " + livrosDisponiveis.getTitulo() + "  |  Nome do autor: " + livrosDisponiveis.getAutor() + "  |  ISBN: " + livrosDisponiveis.getIsbn() + "  |  Ano de publicação: " + livrosDisponiveis.getAno() + "  |  Disponibilidade: " + livrosDisponiveis.isDisponibilidade());
            }
        }
        System.out.println();

    }

    public void listarLivrosPorAutores() {
        Livro livroDoAutorEscolhido;
        String autorDesejadoListarLivros;
        String autorParaListarLivros;

        System.out.print("DIGITE O NOME DO AUTOR QUE DESEJA: ");
        autorDesejadoListarLivros = scanner.nextLine();
        System.out.println();

        for (int livros = 0; livros < listaDeLivros.size(); livros++) {
            autorParaListarLivros = listaDeLivros.get(livros).getAutor();
            if (autorParaListarLivros.equalsIgnoreCase(autorDesejadoListarLivros)) {
                livroDoAutorEscolhido = listaDeLivros.get(livros);

                System.out.println("--- LISTA DE LIVROS DO AUTOR " + autorDesejadoListarLivros.toUpperCase() + " ---");
                System.out.println("Título do livro: " + livroDoAutorEscolhido.getTitulo() + "  |  ISBN: " + livroDoAutorEscolhido.getIsbn() + "  |  Ano de publicação: " + livroDoAutorEscolhido.getAno() + "  |  Disponibilidade: " + livroDoAutorEscolhido.isDisponibilidade());
            }
        }
        System.out.println();
    }
}
