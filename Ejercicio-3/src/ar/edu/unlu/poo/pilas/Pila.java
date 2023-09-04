package ar.edu.unlu.poo.pilas;

public class Pila {
    private Nodo tope = null;

    public void p_apilar(Object dato){
        Nodo elem = new Nodo();
        elem.n_guardar_dato(dato);
        if (tope == null){
            tope = elem;
        } else {
            elem.n_definir_siguiente(tope);
            tope = elem;
        }
    }

    public Object p_desapilar(){
        if (tope == null){
            return null;
        } else {
            Object dato = tope.n_recuperar();
            tope = tope.n_recuperar_siguiente();
            return dato;
        }
    }

    public boolean p_es_vacia(){
        return (tope == null);
    }

    public Object p_recuperar(){
        return tope.n_recuperar();
    }

    public void p_mostrar(){//La pila no deberia de poder mostrarse ya que por definicion la pila solamente puede acceder a su tope, pero pongo la funcion para mostrar que funciona el programa
        if (tope == null){
            System.out.println("La pila esta vacia\n");
        } else {
            Nodo actual = tope;
            String acumulador = "Contenido de la pila : ";
            while (actual.n_recuperar_siguiente() != null){
                acumulador += " " + actual.n_recuperar();
                actual = actual.n_recuperar_siguiente();
            }
            acumulador += " " + actual.n_recuperar();
            System.out.println(acumulador);
        }
    }

}
