package modulo3.atividade2;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private  String categoria;

    public Produto() {
    }

    public Produto(int codigo, String nome, double preco, String categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    public double calcularPrecoComDesconto(int idade, double valorDaCompra) {
        double valorComDesconto = 0.0;

        if (idade >= 60) {
            valorComDesconto = valorDaCompra - (valorDaCompra * 0.1);
        }
        return valorComDesconto;
    }
}
