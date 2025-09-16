package modulo4E5;

import java.util.Date;

public class Emprestimo {
    private int dataDeEmprestimo;
    private int dataDeDevolucao;

    public void controleDeMultaPorAtraso() {
        double multaDiaria = 0;

        while (dataDeDevolucao < dataDeEmprestimo) {
            for (int diasDeAtraso = 0; diasDeAtraso > dataDeDevolucao; diasDeAtraso++)
            multaDiaria += 0.50;
        }
    }
}
