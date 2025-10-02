package exerciciosDeFixacao.polimorfismo;

public class Circulo extends Forma {

    public void calcularArea() {
        System.out.println("Um círculo com um raio de 2 metros vai ter uma área de " + (Math.PI * (2 * 2)) + " de circunferência.");
    }
}
