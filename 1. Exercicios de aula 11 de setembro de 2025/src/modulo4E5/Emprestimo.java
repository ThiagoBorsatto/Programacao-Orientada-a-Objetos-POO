package modulo4E5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Emprestimo {
    private LocalDate dataDoEmprestimo = LocalDate.of(2025,8,1);
    private LocalDate dataDaDevolucao = dataDoEmprestimo.plusDays(15);
    private double valorDaMultaPorDiaAtrasado = 0.50;
    private double valorTotalDaMulta = 0.0;

    public void controleDeMultaPorAtrasoDeDevolucao() {
        LocalDate hoje = LocalDate.now();
        long diasDeAtraso;

        diasDeAtraso = ChronoUnit.DAYS.between(dataDaDevolucao,hoje);

        if (hoje.isAfter(dataDaDevolucao)) {
            valorTotalDaMulta = diasDeAtraso * valorDaMultaPorDiaAtrasado;
        }

        System.out.println("O valor da multa por atráso é de R$" + valorTotalDaMulta);
        System.out.println();
    }

    public void historicoDeEmprestimoPorUsuario(List<Usuario> listaDeUsuarios, int idDoUsuario) {
        Usuario usuario = listaDeUsuarios.get(idDoUsuario);

        System.out.println("=== Histórico do Usuário === " + usuario.getNome());
        System.out.println("Número de livros emprestados: " + usuario.numeroDeLivrosEmprestados);
        System.out.println();
    }
}
