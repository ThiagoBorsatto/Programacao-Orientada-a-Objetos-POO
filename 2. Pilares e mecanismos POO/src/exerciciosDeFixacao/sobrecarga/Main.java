package exerciciosDeFixacao.sobrecarga;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Mensagem mensagem = new Mensagem();
        List<String> listaDeDestinatarios = new ArrayList<>();

        System.out.println(calculadora.somar(2,2));
        System.out.println(calculadora.somar(2.5,2.4));
        System.out.println(calculadora.somar(2,2,2));
        // O "mesmo método atendendo um necessidade diferente.

        mensagem.enviar("Estou chegando em casa!");
        mensagem.enviar("Estou chegando em casa!","Mãe");

        listaDeDestinatarios.add("Mãe");
        listaDeDestinatarios.add("Pai");
        listaDeDestinatarios.add("Jorge (irmão)");
        System.out.println();
        mensagem.enviar("Estou chegando em casa!",listaDeDestinatarios);
    }
}
