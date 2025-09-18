import models.Frota;
import models.Motor;
import models.Veiculos;
import models1.MotorComPistoes;
import models1.VeiculosADiesel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Composição:
        Veiculos veiculos = new Veiculos("Ford","Verde");

        Motor motor = new Motor();
        motor.funcionar();

        veiculos.ligar();
        motor.veiculos.ligar();

        // Outro exemplo de composição:
        MotorComPistoes motorComPistoes = new MotorComPistoes(4,"Alcool");

        VeiculosADiesel veiculosADiesel = new VeiculosADiesel();
        veiculosADiesel.funcionarMotor();

        motorComPistoes.ligarMotor();

        //Agregação:
        List<Veiculos> listaDeVeiculos = new ArrayList<>();
        Veiculos veiculos1 = new Veiculos("Yamaha","Rosa");

        listaDeVeiculos.add(veiculos);
        listaDeVeiculos.add(veiculos1);

        Frota frota = new Frota(listaDeVeiculos, "Frota do Thiago");
        String nomeVeiculo = frota.getNomeVeiculos();
        System.out.println(nomeVeiculo);
        System.out.println("Quantidade de veiculos [" + frota.getNome() + "]: " + frota.getListaDeVeiculos().size());

        System.out.println("Veiculos: " + listaDeVeiculos.size());
        // listaDeVeiculos.clear();
        System.out.println("Veiculos: " + "[" + frota.getNome() + "] " + frota.getListaDeVeiculos().size());

        frota = new Frota( new ArrayList<>());
        System.out.println("Veiculos: " + listaDeVeiculos.size());
        System.out.println("Veiculos: " + "[" + frota.getNome() + "] " + frota.getListaDeVeiculos().size());
    }
}
