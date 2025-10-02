package exerciciosDeFixacao.composicaoEAgregacao.questao2;

import java.util.List;

public class Empresa {
    List<Funcionario> listaDeFuncionarioDaEmpresa;

    public Empresa(List<Funcionario> listaDeFuncionario) {
        this.listaDeFuncionarioDaEmpresa = listaDeFuncionario;
    }

    public void imprimirDadosDosFuncionarios() {
        System.out.println("=== Lista dos Funcionários Da Empresa ===");
        for (Funcionario funcionario : listaDeFuncionarioDaEmpresa) {
            System.out.println("Nome do funcionário: " + funcionario.getNomeDoFuncionario());
            System.out.println("Cargo do funcionário: " + funcionario.getCargoDoFuncionario());
            System.out.println("Sálario do funcionário: R$" + funcionario.getSalarioDoFuncionario());
            System.out.println();
        }
    }

    public void fecharEmpresa() {
        this.listaDeFuncionarioDaEmpresa.clear();
    }
}
