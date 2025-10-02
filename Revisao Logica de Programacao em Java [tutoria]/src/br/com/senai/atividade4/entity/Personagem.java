package br.com.senai.atividade4.entity;

public class Personagem {
    private String nome;
    private String tipoDaClasse;
    private int vida;
    private int ataque;
    private int defesa;
    private int nivel;

    public Personagem() {
    }

    public Personagem(String nome, String tipoDaClasse, int vida, int ataque, int defesa, int nivel) {
        this.nome = nome;
        this.tipoDaClasse = tipoDaClasse;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDaClasse() {
        return tipoDaClasse;
    }

    public void setTipoDaClasse(String tipoDaClasse) {
        this.tipoDaClasse = tipoDaClasse;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
