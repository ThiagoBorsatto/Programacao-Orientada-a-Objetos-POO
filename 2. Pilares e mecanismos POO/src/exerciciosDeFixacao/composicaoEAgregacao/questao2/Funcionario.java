package exerciciosDeFixacao.composicaoEAgregacao.questao2;

public class Funcionario {
    private String nomeDoFuncionario;
    private String cargoDoFuncionario;
    private double salarioDoFuncionario;

    public Funcionario() {
    }

    public Funcionario(String nomeDoFuncionario, String cargoDoFuncionario, double salarioDoFuncionario) {
        this.nomeDoFuncionario = nomeDoFuncionario;
        this.cargoDoFuncionario = cargoDoFuncionario;
        this.salarioDoFuncionario = salarioDoFuncionario;
    }

    public String getNomeDoFuncionario() {
        return nomeDoFuncionario;
    }

    public void setNomeDoFuncionario(String nomeDoFuncionario) {
        this.nomeDoFuncionario = nomeDoFuncionario;
    }

    public String getCargoDoFuncionario() {
        return cargoDoFuncionario;
    }

    public void setCargoDoFuncionario(String cargoDoFuncionario) {
        this.cargoDoFuncionario = cargoDoFuncionario;
    }

    public double getSalarioDoFuncionario() {
        return salarioDoFuncionario;
    }

    public void setSalarioDoFuncionario(double salarioDoFuncionario) {
        this.salarioDoFuncionario = salarioDoFuncionario;
    }
}
