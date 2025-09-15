package br.com.senai.atividade2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudante> listaDeEstudante = new ArrayList<>();
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        listaDeEstudante.add(estudante1);
        listaDeEstudante.add(estudante2);

        estudante1.setNome("Thiago");
        estudante1.setIdade(24);
        estudante1.adicionarNota(1,6);
        estudante1.adicionarNota(2,7);
        estudante1.adicionarNota(3,7);
        estudante1.adicionarNota(4,7);

        estudante2.setNome("Douglas");
        estudante2.setIdade(22);
        estudante2.adicionarNota(1,9);
        estudante2.adicionarNota(2,8.5);
        estudante2.adicionarNota(3,8.7);
        estudante2.adicionarNota(4,9.4);

        listarAlunos(listaDeEstudante);
        System.out.println("Total de alunos: " + Estudante.getTotalEstudantes());
    }

    public static void listarAlunos(List<Estudante> listaDeEstudantes) {
        for (int estudante = 0; estudante < listaDeEstudantes.size(); estudante++) {
            Estudante aluno  = listaDeEstudantes.get(estudante);
            System.out.println("Nome: " + aluno.getNome() + "  |  Idade: " + aluno.getIdade());
           /* for (int bimestre = 1; bimestre <= 4; bimestre++) {
                System.out.println("Nota no " + bimestre + "º Bimestre foi: " + aluno. );
            }
            */
            int bimestre=1;
            for (double nota : aluno.getNotas()) {
                System.out.println("Nota no " + bimestre + " bimestre: " + nota);
                bimestre++;
            }

            System.out.println("Média do aluno: " + aluno.calcularMedia());
            System.out.println("O aluno foi aprovado? " + aluno.estaAprovado());
            System.out.println();
        }
    }
}
