package exerciciosDeFixacao.sobreescrita.questao1;

public class Horista extends Funcionario{

    @Override
    public double calcularSalario() {
        int horasTrabalhadas = 80;
        double valorPorHoraTrabalhada = 20;

        return horasTrabalhadas * valorPorHoraTrabalhada;
    }
}
