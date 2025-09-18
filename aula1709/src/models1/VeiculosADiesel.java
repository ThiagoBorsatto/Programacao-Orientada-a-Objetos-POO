package models1;

public class VeiculosADiesel {
    public MotorComPistoes motorComPistoes = new MotorComPistoes(8,"Diesel");

    public void funcionarMotor() {
        motorComPistoes.ligarMotor();
    }
}
