package br.com.senai.atividade2;

import java.util.List;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas = new double[4];
    private static int totalEstudantes = 0;

    public Estudante() {
        totalEstudantes++;
    }

    public Estudante(String nome, int idade) {
        this();
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 16 && idade <= 80) {
            this.idade = idade;
        }
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void adicionarNota(int bimestre, double nota) {
        if (bimestre >= 1 && bimestre <= 4 && nota >= 0 && nota <= 10) {
            notas[bimestre - 1] = nota;
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }

    public static int getTotalEstudantes() {
        return totalEstudantes;
    }

    public String toString() {
        return String.format("Estudante{nome='%s', idade=%d, média=%.2f}",
                nome, idade, calcularMedia());
    }
}
