package exerciciosDeFixacao.sobrecarga;

public class Calculadora {
    /*  A Sobrecarga de métodos reduz o aclopamento por torna os métodos mais independentes, criando a possibilidade de chamar um método
        que já existe/mesmo nome mas que ele atende uma necessidade diferente.
     */

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }
}
