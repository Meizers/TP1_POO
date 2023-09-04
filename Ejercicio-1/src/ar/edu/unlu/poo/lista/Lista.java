package ar.edu.unlu.poo.lista;

public class Lista {
    private Nodo inicio = null;

    public void l_agregar(Object dato) {
        Nodo elem = new Nodo();
        elem.n_guardar_dato(dato);
        if (inicio == null) {
            inicio = elem;
            System.out.println("elemento agregado\n");
        } else {
            Nodo actual = inicio;
            while (actual.n_recuperar_siguiente() != null) {
                actual = actual.n_recuperar_siguiente();
            }
            actual.n_definir_siguiente(elem);
            System.out.println("elemento agregado\n");
        }
    }

    public boolean l_es_vacia(){
        if (inicio == null){
            return true;
        } else {
            return false;
        }
    }

    public int l_longitud(){
        Nodo actual = inicio;
        int cantidad = 0;
        if (actual == null){
            return cantidad;
        } else {
            cantidad++;
            while (actual.n_recuperar_siguiente() != null){
                cantidad++;
                actual = actual.n_recuperar_siguiente();
            }
            return cantidad;
        }
    }

    public void l_borrar(Object dato){
        if (inicio.n_recuperar() == dato){
            inicio = inicio.n_recuperar_siguiente();
        } else {
            Nodo actual = inicio;
            while (actual.n_recuperar_siguiente() != null && actual.n_recuperar_siguiente().n_recuperar() != dato){
                actual = actual.n_recuperar_siguiente();
            }
            if (actual.n_recuperar_siguiente() == null){
                System.out.println("elemento no encontrado en la lista\n");
                return;
            } else {
                Nodo aux = actual.n_recuperar_siguiente();
                actual.n_definir_siguiente(aux.n_recuperar_siguiente());
                System.out.println("elemento Eliminado\n");
            }
        }
    }

    public Object l_recuperar(int pos){
        if (pos == 1){
            return inicio.n_recuperar();
        } else {
            Nodo actual = inicio;
            for (int i = 1;i < pos;i++){
                actual = actual.n_recuperar_siguiente();
            }
            return actual.n_recuperar();
        }
    }

    public void l_insertar(Object dato, int pos){
        Nodo elem = new Nodo();
        elem.n_guardar_dato(dato);
        if (pos == 1){
            elem.n_definir_siguiente(inicio);
            inicio = elem;
            System.out.println("elemento Insertado\n");
        } else {
            Nodo actual = inicio;
            for (int i = 1;i < pos-1;i++){
                actual = actual.n_recuperar_siguiente();
            }
            elem.n_definir_siguiente(actual.n_recuperar_siguiente());
            actual.n_definir_siguiente(elem);
            System.out.println("elemento Insertado\n");
        }
    }
}