package modulo3.atividade3;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor joao = new Desenvolvedor();
        Gerente fernando = new Gerente();

        joao.setNome("João da Silva");
        joao.setCpf(00100200304);
        joao.setMatriculaDoFuncionario(232425);
        joao.setSalario(2998.13);
        joao.setModificadorDeCargo(2.25);

        fernando.setNome("Fernando Marcio");
        fernando.setCpf(00200300405);
        fernando.setMatriculaDoFuncionario(242526);
        fernando.setSalario(5000);
        fernando.setModificadorDeCargo(5.33);

        System.out.println(calcularSalario(65, joao));
    }

    public static double calcularSalario(int numeroDeHorasTrabalhadas, Funcionario funcionario) {
        double salarioDoFuncionario;
        double valorDaHora = 20.50;
        double modificadorDeCargo;

        modificadorDeCargo = funcionario.getModificadorDeCargo();

        salarioDoFuncionario = (numeroDeHorasTrabalhadas * valorDaHora);
        salarioDoFuncionario *= modificadorDeCargo;

        return salarioDoFuncionario;
    }
}
