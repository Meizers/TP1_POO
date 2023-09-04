package ar.edu.unlu.poo.lista_doble_enlaze;

public class Nodo_doble {
    private Object tipo_elemento;
    private Nodo_doble siguiente = null;
    private Nodo_doble anterior = null;

    public void n_guardar_dato(Object elemento){
        tipo_elemento = elemento;
    }

    public Object n_recuperar(){
        return tipo_elemento;
    }

    public void n_definir_siguiente(Nodo_doble n){
        siguiente = n;
    }

    public void n_definir_anterior(Nodo_doble n){
        anterior = n;
    }

    public Nodo_doble n_recuperar_siguiente(){
        return siguiente;
    }

    public Nodo_doble n_recuperar_anterior(){
        return anterior;
    }
}
