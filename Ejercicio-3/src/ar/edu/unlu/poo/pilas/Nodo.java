package ar.edu.unlu.poo.pilas;

public class Nodo {
    private Object tipo_elemento;
    private Nodo siguiente = null;

    public void n_guardar_dato(Object elemento){
        tipo_elemento = elemento;
    }

    public Object n_recuperar(){
        return tipo_elemento;
    }

    public void n_definir_siguiente(Nodo n){
        siguiente = n;
    }

    public Nodo n_recuperar_siguiente(){
        return siguiente;
    }
}
