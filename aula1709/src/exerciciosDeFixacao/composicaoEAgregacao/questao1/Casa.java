package exerciciosDeFixacao.composicaoEAgregacao.questao1;

public class Casa {
    // Um objeto casa não deveria existir sem esses atributos, assim caso a "casa" seja destruída seus componentes também seriam.

    Porta porta = new Porta();
    Janela janela = new Janela();
    Telhado telhado = new Telhado();
}
