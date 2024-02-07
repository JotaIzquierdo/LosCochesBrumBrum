package LOSCOCHESBRUMBRUM;

public class Coche {
private String matricula;
private Rueda rueda;
private Puerta puerta;
private Rueda [] ruedas = new Rueda[4];
private Puerta [] puertas = new Puerta[2];
private Motor motor = new Motor(false);

    public Coche(String matricula) {
        this.matricula = matricula;
        for (int i = 0; i < ruedas.length;i++){
            ruedas[i] = new Rueda();
        }
        for (int i = 0; i < puertas.length;i++){
            puertas[i] = new Puerta();
        }

    }
    public void starStop(){
        if (ruedas[0].isInflada()&&ruedas[1].isInflada()&&ruedas[2].isInflada()&&ruedas[3].isInflada()){
            if (motor.isMotor()) {
                motor.apagado();
            } else {
                motor.encendido();
            }
        }else System.out.println("El motor no se puede arrancar porque hay ruedas con presión demasiado baja");

    }
    public void reparar(){
        for (Rueda value : ruedas) {
            if (value.isInflada()) {
                rueda.inflar();
            }
        }
        System.out.println("Ruedas infladas");
    }
    public void elevalunas(){
        if (motor.isMotor()){
            for(int i = 0; i< puertas.length;i++){
                System.out.println("Ventana "+i);
                puertas[i].abrirCerrarVentana();
            }
        }else System.out.println("El motor no está encendido, no se pueden subir las ventanas");
    }
    public void elevalunas(int puerta){
        if (motor.isMotor()){
            System.out.println("Ventana "+puerta);
            puertas[puerta].abrirCerrarVentana();
        }else System.out.println("El motor no está encendido, no se pueden subir las ventanas");
    }
}


