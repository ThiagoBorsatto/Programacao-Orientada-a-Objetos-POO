package br.com.senai.atividade5.entity;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    public static List<Produto> listaDeProdutos = new ArrayList<>();
    double totalDoEstoque;

    public void listarProdutos(Produto produto) {
        listaDeProdutos.add(produto);
    }

    public void totalEmEstoque() {
        Produto tipoDeProduto;
        double totalDoProduto;

        for (int produto = 0; produto < listaDeProdutos.size(); produto++) {
            tipoDeProduto = listaDeProdutos.get(produto);

            totalDoProduto = (tipoDeProduto.getPrecoDoProduto() * tipoDeProduto.getPrecoDoProduto());
            totalDoEstoque = totalDoProduto + totalDoEstoque;
        }
        System.out.println("O total em estoque é de R$" + totalDoEstoque);
    }

    public void venderProduto(Produto produto,int quantidadeVendida) {
        int quantidadeRestanteDeProduto;

        quantidadeRestanteDeProduto = produto.getQuantidadeDoProduto();
        produto.setQuantidadeDoProduto(quantidadeRestanteDeProduto - quantidadeVendida);
        totalDoEstoque = totalDoEstoque - (produto.getQuantidadeDoProduto() * produto.getPrecoDoProduto());
    }
}
