package exerciciosDeFixacao.sobreescrita;

import exerciciosDeFixacao.sobreescrita.questao1.Assalariado;
import exerciciosDeFixacao.sobreescrita.questao1.Funcionario;
import exerciciosDeFixacao.sobreescrita.questao1.Horista;
import exerciciosDeFixacao.sobreescrita.questao2.Animal;
import exerciciosDeFixacao.sobreescrita.questao2.Cachorro;
import exerciciosDeFixacao.sobreescrita.questao2.Gato;
import exerciciosDeFixacao.sobreescrita.questao2.Passaro;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Assalariado assalariado = new Assalariado();
        Horista horista = new Horista();

        System.out.println("Salários:");
        System.out.println(funcionario.calcularSalario());
        System.out.println(assalariado.calcularSalario());
        System.out.println(horista.calcularSalario());
        System.out.println();

        /* Como o "@Override" ele sobre escreve o método principal por qual classe o compilador esteja é possivel fazer com que os métodos com o nome se comportem de formas diferentes sem precisa
           passar um parâmetro distinto para cada um deles, facilitando o uso dos mesmos.
        */

        System.out.println("Som dos animais: ");
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Passaro passaro = new Passaro();

        animal.emitirSom();
        cachorro.emitirSom();
        gato.emitirSom();
        passaro.emitirSom();
    }
}
