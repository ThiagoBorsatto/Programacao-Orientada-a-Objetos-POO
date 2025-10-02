package br.com.senai.atividade3;

import br.com.senai.atividade3.service.LivroService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LivroService livroService = new LivroService();
        boolean execucao = true;

        do {
            int opcao;
            printMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    livroService.cadastrarLivro();
                    break;
                case 2:
                    livroService.emprestarLivro();
                    break;
                case 3:
                    livroService.devolverLivro();
                    break;
                case 4:
                    livroService.consultarDisponibilidade();
                    break;
                case 5:
                    livroService.listarLivrosPorAutores();
                    break;
                case 6:
                    execucao = false;
                    System.out.println();
                    System.out.println("PROGRAMA ENCERRADO!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
                    break;
            }
        } while (execucao);
    }

    public static void printMenu() {
        System.out.println("--- MENU DE LIVROS ---");
        System.out.println("1 - CADASTRAR LIVRO:");
        System.out.println("2 - EMPRESTAR LIVRO: ");
        System.out.println("3 - DEVOLVER LIVRO: ");
        System.out.println("4 - CONSULTAR DISPONIBILIDADE DOS LIVROS: ");
        System.out.println("5 - LISTAR LIVROS POR AUTOR: ");
        System.out.println("6 - ENCERRAR PROGRAMA:");
        System.out.println();
        System.out.print("ESCOLHA UMA OPÇÃO: ");
    }
}
