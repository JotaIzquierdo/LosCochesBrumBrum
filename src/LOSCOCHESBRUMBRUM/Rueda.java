package LOSCOCHESBRUMBRUM;

public class Rueda {
    private boolean inflada;

    public Rueda(boolean inflada) {
        this.inflada = inflada;
    }
    public Rueda() {
        inflada = true;
    }
    public void inflar(){
        if(inflada) System.out.println("La rueda ya estaba inflada inflada");
        inflada=true;
    }
    public void desinflar(){
        if(!inflada) System.out.println("La rueda ya estaba desinflada");
        inflada = !inflada;
    }

    public boolean isInflada() {
        return inflada;
    }
}
