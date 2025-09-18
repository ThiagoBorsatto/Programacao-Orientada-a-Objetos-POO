package models1;

public class MotorComPistoes {
    private int numeroDePistoes;
    private String tipoDaCombustivel;

    public MotorComPistoes(int numeroDePistoes, String tipoDaCombustivel) {
        this.numeroDePistoes = numeroDePistoes;
        this.tipoDaCombustivel = tipoDaCombustivel;
    }

    public int getNumeroDePistoes() {
        return numeroDePistoes;
    }

    public void setNumeroDePistoes(int numeroDePistoes) {
        this.numeroDePistoes = numeroDePistoes;
    }

    public String getTipoDaCombustivel() {
        return tipoDaCombustivel;
    }

    public void setTipoDaCombustivel(String tipoDaCombustivel) {
        this.tipoDaCombustivel = tipoDaCombustivel;
    }

    public void ligarMotor() {
        System.out.println("Motor de " + numeroDePistoes + " Pistões ligando!");
    }
}
