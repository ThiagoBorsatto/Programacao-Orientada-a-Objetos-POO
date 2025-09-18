package models;

import java.util.List;

public class Frota {
    private String nome;
    private List<Veiculos> listaDeVeiculos;

    public Frota(List<Veiculos> veiculo) {
        this.listaDeVeiculos = veiculo;
    }

    public Frota(List<Veiculos> veiculo, String nome) {
        this.listaDeVeiculos = veiculo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Veiculos> getListaDeVeiculos() {
        return listaDeVeiculos;
    }

    public void setListaDeVeiculos(List<Veiculos> listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }

    public String getNomeVeiculos() {
        String nomeDoVeiculo = "";

        for (Veiculos veiculos : this.listaDeVeiculos) {
            nomeDoVeiculo += veiculos.getMarca() + " ";
        }
        return nomeDoVeiculo;
    }
}
