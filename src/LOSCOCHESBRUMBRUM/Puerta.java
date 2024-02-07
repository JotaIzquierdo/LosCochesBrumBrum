package LOSCOCHESBRUMBRUM;

public class Puerta {
    private boolean abierta;
    private Ventana ventana;
    public Puerta(){
        ventana=new Ventana();
        abierta=false;
    }
    public void abrirCerrarPuerta(){
        abierta=!abierta;
        System.out.printf("La puerta está %S",(abierta)?"abierta":"cerrada");
    }
    public void abrirCerrarVentana(){
        if (ventana.isSubida()) {
            ventana.bajaVentana();
            System.out.println("Ventana bajada");
        } else {
            ventana.subirVentana();
            System.out.println("Ventana subida");
        }
    }

}
