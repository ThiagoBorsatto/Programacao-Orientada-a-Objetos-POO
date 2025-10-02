package exerciciosDeFixacao.composicaoEAgregacao.questao2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static  List<Funcionario> listaDeFuncionario = new ArrayList<>();
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();


        Funcionario engenheiroCivil = new Funcionario("Vinicius F","Engenheiro Civil", 6000);
        Funcionario estagiario = new Funcionario("Kaio A","Estagiário",800);

        montarListaDeFunionarios(engenheiroCivil);
        montarListaDeFunionarios(estagiario);

        Empresa empresa = new Empresa(listaDeFuncionario);

        imprimirDadosDosFuncionarios();
        empresa.imprimirDadosDosFuncionarios();

        empresa = new Empresa(new ArrayList<>());

        empresa.imprimirDadosDosFuncionarios();
        imprimirDadosDosFuncionarios();
    }

    public static void montarListaDeFunionarios(Funcionario funcionario) {
        listaDeFuncionario.add(funcionario);
    }

    public static void imprimirDadosDosFuncionarios() {
        System.out.println("=== Lista dos Funcionários ===");
        for (Funcionario funcionario : listaDeFuncionario) {
            System.out.println("Nome do funcionário: " + funcionario.getNomeDoFuncionario());
            System.out.println("Cargo do funcionário: " + funcionario.getCargoDoFuncionario());
            System.out.println("Sálario do funcionário: R$" + funcionario.getSalarioDoFuncionario());
            System.out.println();
        }
    }
}
