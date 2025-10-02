package modulo3.atividade3;

public class Funcionario {
    private String nome;
    private int cpf;
    private int matriculaDoFuncionario;
    private double salario;
    private double modificadorDeCargo;

    public Funcionario() {
    }

    public Funcionario(String nome, int cpf, int matriculaDoFuncionario, double salario, double modificadorDeCargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.matriculaDoFuncionario = matriculaDoFuncionario;
        this.salario = salario;
        this.modificadorDeCargo = modificadorDeCargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getMatriculaDoFuncionario() {
        return matriculaDoFuncionario;
    }

    public void setMatriculaDoFuncionario(int matriculaDoFuncionario) {
        this.matriculaDoFuncionario = matriculaDoFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getModificadorDeCargo() {
        return modificadorDeCargo;
    }

    public void setModificadorDeCargo(double modificadorDeCargo) {
        this.modificadorDeCargo = modificadorDeCargo;
    }
}
