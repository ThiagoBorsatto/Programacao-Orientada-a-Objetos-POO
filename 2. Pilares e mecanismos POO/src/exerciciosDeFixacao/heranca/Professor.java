package exerciciosDeFixacao.heranca;

public class Professor extends Pessoa{
    private String diciplina;

    public Professor(String diciplina) {
        this.diciplina = diciplina;
    }

    public Professor(String nome, int idade, String diciplina) {
        super(nome, idade);
        this.diciplina = diciplina;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }
}
