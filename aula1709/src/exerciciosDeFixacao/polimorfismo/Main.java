package exerciciosDeFixacao.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();

        quadrado.calcularArea();
        circulo.calcularArea();
        triangulo.calcularArea();
    }
}
