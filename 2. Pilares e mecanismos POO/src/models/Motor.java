package models;

public class Motor{
    public Veiculos veiculos= new Veiculos("Azul","Honda");

    public void funcionar() {
        veiculos.ligar();
    }
}
