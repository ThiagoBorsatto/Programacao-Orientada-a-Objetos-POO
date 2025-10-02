package br.com.senai.atividade5.entity;

public class Produto {
    private int codigo;
    private int quantidadeDoProduto;
    private String nomeDoProduto;
    private double precoDoProduto;

    public Produto() {
    }

    public Produto(int codigo, int quantidadeDoProduto, String nomeDoProduto, double precoDoProduto) {
        this.codigo = codigo;
        this.quantidadeDoProduto = quantidadeDoProduto;
        this.nomeDoProduto = nomeDoProduto;
        this.precoDoProduto = precoDoProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidadeDoProduto() {
        return quantidadeDoProduto;
    }

    public void setQuantidadeDoProduto(int quantidadeDoProduto) {
        this.quantidadeDoProduto = quantidadeDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }
}
