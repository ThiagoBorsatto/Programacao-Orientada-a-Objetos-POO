package br.com.senai.atividade4;

import br.com.senai.atividade4.battleSystem.CriarPersonagem;
import br.com.senai.atividade4.battleSystem.SistemaDeBatalha;

public class Main {
    public static void main(String[] args) {
        CriarPersonagem criarPersonagem = new CriarPersonagem();
        SistemaDeBatalha sistemaDeBatalha = new SistemaDeBatalha();

        criarPersonagem.criarPersonagem();
        sistemaDeBatalha.encontroComMonstro();
    }
}
