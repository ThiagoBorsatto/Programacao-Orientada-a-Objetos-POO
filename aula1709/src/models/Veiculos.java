package models;

public class Veiculos {
    private String marca;
    private String cor;

    public void ligar() {
        System.out.println("Carro ligando " + cor + " " + marca);
    }

    public Veiculos(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
