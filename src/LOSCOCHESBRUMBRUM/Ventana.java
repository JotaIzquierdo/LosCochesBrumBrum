package LOSCOCHESBRUMBRUM;

public class Ventana {
    private boolean subida;
    public Ventana(){
        subida=true;
    }
    public Ventana(boolean s){
        subida=s;
    }
    public void subirVentana(){
        subida=true;
    }
    public void bajaVentana(){
        subida=false;
    }

    public boolean isSubida() {
        return subida;
    }
}
