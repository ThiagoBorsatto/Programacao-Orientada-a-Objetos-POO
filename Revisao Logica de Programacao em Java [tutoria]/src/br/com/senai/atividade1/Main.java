package br.com.senai.atividade1;

public class Main {
    public static void main(String[] args) {
        Trabalhador trabalhador1 = new Trabalhador();
        Trabalhador trabalhador2 = new Trabalhador("Vinicius","001.002.003-01",30,"232323-01",3200.43);
        Trabalhador trabalhador3 = new Trabalhador();
        Trabalhador trabalhador4 = new Trabalhador();

        trabalhador1.setNome("Adalberto Alfredo Romario Dos Santos");
        System.out.println(trabalhador1.getNome());

        System.out.println(Trabalhador.getTotalTrabalhadores());

        System.out.println("Nome: " + trabalhador2.getNome() + "  |  CPF: " + trabalhador2.getCpf() + "  |  Idade: " + trabalhador2.getIdade());
        System.out.println("Número Matrícula: " + trabalhador2.getMatriculaDoFuncionario() + "  |  Sálario: R$" + trabalhador2.getSalario());
    }
}
