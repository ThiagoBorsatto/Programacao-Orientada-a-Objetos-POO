package br.com.senai.atividade4.battleSystem;

import br.com.senai.atividade4.characterClasses.Arqueiro;
import br.com.senai.atividade4.characterClasses.Guerreiro;
import br.com.senai.atividade4.characterClasses.Mago;
import br.com.senai.atividade4.entity.Personagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriarPersonagem {
    Scanner scanner = new Scanner(System.in);
    public static Personagem personagemDoJogador = new Personagem();
    Guerreiro guerreiro = new Guerreiro();
    Mago mago = new Mago();
    Arqueiro arqueiro = new Arqueiro();
    List<Personagem> listaDePersonagens = new ArrayList<>();

    public void criarPersonagem() {
        String classeEscolhidaPeloJogador;
        String nomeDoPersonagem;

        System.out.println("--- CRIADOR DE PERSONAGEM ---");
        System.out.print("Digite um nome para o personagem: ");
        nomeDoPersonagem = scanner.nextLine();

        criarListaDeClasses();
        printClassesDePersonagens();
        classeEscolhidaPeloJogador = scanner.nextLine();
        for (int classe = 0; classe < listaDePersonagens.size(); classe++) {
            String tipoDeClasses = listaDePersonagens.get(classe).getNome();
            if (classeEscolhidaPeloJogador.equalsIgnoreCase(tipoDeClasses)) {
                personagemDoJogador = listaDePersonagens.get(classe);
                personagemDoJogador.setNome(nomeDoPersonagem);
            }
        }

        printStatusPersonagemJogador();
    }

    public void criarListaDeClasses() {
        listaDePersonagens.add(guerreiro);
        listaDePersonagens.add(mago);
        listaDePersonagens.add(arqueiro);
    }

    public void printClassesDePersonagens() {
        Personagem classesDePersonagens;

        System.out.println("--- OPÇÕES DE CLASSES ---");
        for (int opcoesDeClasses = 0; opcoesDeClasses < listaDePersonagens.size(); opcoesDeClasses++) {
            classesDePersonagens = listaDePersonagens.get(opcoesDeClasses);
            System.out.println("CLASSE " + classesDePersonagens.getNome().toUpperCase() + ":");
            System.out.println("Vida: " + classesDePersonagens.getVida());
            System.out.println("Ataque: " + classesDePersonagens.getAtaque());
            System.out.println("Defesa: " + classesDePersonagens.getDefesa());
            System.out.println();
        }
        System.out.print("Escolha a sua classe (Digite o nome da Classe): ");
    }

    public void printStatusPersonagemJogador() {
        System.out.println();
        System.out.println("--- STATUS DO PERSONAGEM CRIADO ---");
        System.out.println("Nome do personegem: " + personagemDoJogador.getNome());
        System.out.println("Classe: " + personagemDoJogador.getTipoDaClasse());
        System.out.println("Vida: " + personagemDoJogador.getVida());
        System.out.println("Ataque: " + personagemDoJogador.getAtaque());
        System.out.println("Defesa: " + personagemDoJogador.getDefesa());
    }
}
