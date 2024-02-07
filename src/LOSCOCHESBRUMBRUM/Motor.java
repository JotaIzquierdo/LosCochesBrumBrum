package LOSCOCHESBRUMBRUM;

public class Motor {
    private boolean motor;

    public Motor(boolean motor) {
        this.motor = motor;
    }
    public void encendido(){
        System.out.println("motor encendido");
        motor=true;
    }
    public void apagado(){
        System.out.println("Motor apagado");
        motor=false;
    }

    public boolean isMotor() {
        return motor;
    }
}
