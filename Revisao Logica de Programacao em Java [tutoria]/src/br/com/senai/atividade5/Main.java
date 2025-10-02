package br.com.senai.atividade5;

import br.com.senai.atividade5.entity.Produto;
import br.com.senai.atividade5.entity.Venda;
import br.com.senai.atividade5.service.ControleDeEstoque;
import br.com.senai.atividade5.service.RelatorioDeVenda;

public class Main {
    public static void main(String[] args) {
        Venda venda = new Venda();
        ControleDeEstoque controleDeEstoque = new ControleDeEstoque();
        RelatorioDeVenda relatorioDeVenda = new RelatorioDeVenda();

        Produto banana = new Produto();
        banana.setCodigo(100);
        banana.setNomeDoProduto("Banana");
        banana.setPrecoDoProduto(2.55);
        banana.setQuantidadeDoProduto(32);

        Produto cafe = new Produto(101, 31,"Café", 24.99);

        venda.listarProdutos(banana);
        venda.listarProdutos(cafe);

        venda.totalEmEstoque();

        controleDeEstoque.quantidadeDeProdutoEmEstoque(Venda.listaDeProdutos);

        venda.venderProduto(banana,15);

        relatorioDeVenda.relatorioDeProdutosVendidos(Venda.listaDeProdutos);
    }
}
