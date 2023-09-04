package ar.edu.unlu.poo.colas;

public class Cola {
    private Nodo frente = null;
    private Nodo atras = null;


    public boolean c_es_vacia(){
        return frente == null;
    }

    public void c_encolar(Object dato){
        Nodo elem = new Nodo();
        elem.n_guardar_dato(dato);
        if (c_es_vacia()){
            frente = elem;
        } else {
            atras.n_definir_siguiente(elem);
        }
        atras = elem;
    }

    public Object c_desencolar(){
        if (c_es_vacia()){
            System.out.println("Cola vacia, no se puede desencolar\n");
            return null;
        } else {
            Object dato = frente.n_recuperar();
            frente = frente.n_recuperar_siguiente();
            return dato;
        }
    }

    public Object c_recuperar(){
        if (c_es_vacia()){
            System.out.println("Cola vacia, no se puede recuperar\n");
            return null;
        } else {
            return frente.n_recuperar();
        }
    }



    public void c_mostrar(){ //la cola no deberia de poder mostrarse ya que po definicion la cola no puede acceder a sus elementos solo al frente y al final, pero coloco la funcion para mostrar que funciona
        if (frente == null){
            System.out.println("La cola esta vacia\n");
        } else {
            Nodo actual = frente;
            String acumulador = "Contenido de la cola : ";
            while (actual.n_recuperar_siguiente() != null){
                acumulador += " " + actual.n_recuperar();
                actual = actual.n_recuperar_siguiente();
            }
            acumulador += " " + actual.n_recuperar();
            System.out.println(acumulador);
        }
    }

}
