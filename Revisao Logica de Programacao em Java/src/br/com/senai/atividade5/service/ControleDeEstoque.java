package br.com.senai.atividade5.service;

import br.com.senai.atividade5.entity.Produto;

import java.util.List;

public class ControleDeEstoque {

    public void quantidadeDeProdutoEmEstoque(List<Produto> listaDeProdutos) {
        Produto produtos;
        int totalDeProdutos = 0;

        System.out.println();
        for (int produto = 0; produto < listaDeProdutos.size(); produto++) {
            produtos = listaDeProdutos.get(produto);
            totalDeProdutos += produtos.getQuantidadeDoProduto();

            System.out.println("Código: " + produtos.getCodigo() + "  |  Nome do Produto: " + produtos.getNomeDoProduto() + "  |  Preço do Produto: " + produtos.getPrecoDoProduto() + "  |  Quantidade do Produto: " + produtos.getQuantidadeDoProduto());
            System.out.println("Total de Produtos: " + totalDeProdutos);
        }
        System.out.println();
    }
}
