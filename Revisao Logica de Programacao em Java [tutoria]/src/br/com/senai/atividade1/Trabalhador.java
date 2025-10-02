package br.com.senai.atividade1;

public class Trabalhador {
    private String nome;
    private String cpf;
    private Integer idade;
    private String matriculaDoFuncionario;
    private Double salario;
    private static int totalTrabalhadores = 0;


    public Trabalhador() {
        totalTrabalhadores++;
    }

    public Trabalhador(String nome, String cpf, Integer idade, String matriculaDoFuncionario, Double salario) {
        this();
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.matriculaDoFuncionario = matriculaDoFuncionario;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getMatriculaDoFuncionario() {
        return matriculaDoFuncionario;
    }

    public void setMatriculaDoFuncionario(String matriculaDoFuncionario) {
        this.matriculaDoFuncionario = matriculaDoFuncionario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public static int getTotalTrabalhadores() {
        return totalTrabalhadores;
    }
}

