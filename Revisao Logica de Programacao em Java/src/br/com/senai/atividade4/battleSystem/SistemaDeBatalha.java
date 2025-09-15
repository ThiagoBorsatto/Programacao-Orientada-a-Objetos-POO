package br.com.senai.atividade4.battleSystem;

import java.util.Scanner;

public class SistemaDeBatalha {
    Scanner scanner = new Scanner(System.in);

    public void encontroComMonstro() {
        encontroComLobo();
    }

    public void encontroComLobo() {
        String opcaoDeCombate;
        int vidaDoLobo = 60;
        int danoDoLobo = 5;

        System.out.println();
        System.out.println("Um lobo apareceu na sua frente.");
        System.out.print("Deseja ATACAR ou FUGIR do combate (DIGITE A OPÇÂO): ");
        opcaoDeCombate = scanner.nextLine();

        if (opcaoDeCombate.equalsIgnoreCase("ATACAR")) {
            System.out.println();
            System.out.println("Vida do lobo: " + vidaDoLobo);
            System.out.println("Você atacou o lobo!");
            vidaDoLobo -= CriarPersonagem.personagemDoJogador.getAtaque();
            System.out.println("Vida do lobo: " + vidaDoLobo);
            System.out.println("O lobo atacou você!");
            System.out.println("Sua vida: " + (CriarPersonagem.personagemDoJogador.getVida() - danoDoLobo));
            System.out.println("Você atacou o lobo novamente!");
            vidaDoLobo -= CriarPersonagem.personagemDoJogador.getAtaque();
            System.out.println("Vida do lobo: " + vidaDoLobo);
            System.out.println("Parabéns você derrotou o lobo!");
            System.out.println("Nível atual: " + (CriarPersonagem.personagemDoJogador.getNivel() + 1));
        } else {
            System.out.println("Você fugiu com sucesso!");
        }
    }
}
