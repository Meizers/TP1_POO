package ar.edu.unlu.poo.tareav3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Administrador {
    private ArrayList<Tarea> lista = new ArrayList<>();

    public void set_tarea(Tarea tarea){
        lista.add(tarea);
    }

    public Tarea get_tarea(String descripcion) {
        for (Tarea tarea : lista) {
            if (tarea.get_descripcion().equals(descripcion)) {
                return tarea;
            }
        }
        return null;
    }

    public void completar_tarea(String descripcion){
        for (Tarea tarea : lista) {
            if (tarea.get_descripcion().equals(descripcion)) {
                tarea.completar();
            }
        }
    }

    public void mostrar_no_vencidas(){
        ArrayList<Tarea> lista_prioridad = new ArrayList<>();
        for (Tarea tarea : lista){
            if (!tarea.vencida() && !tarea.completa()){
                lista_prioridad.add(tarea);
            }
        }
        Collections.sort(lista_prioridad, new Comparador_prioridad());
        System.out.println("\n\nLista de tareas no vencidas ordenadas por prioridad :\n");
        for (Tarea tarea : lista_prioridad) {
            tarea.mostrar();
            System.out.println("Prioridad : " + tarea.get_prioridad()); // queda feo pero para que puedan ver que esta ordenado por prioridad
        }
        Comparator<Tarea> comparador_fecha = Comparator.comparing(Tarea::get_fecha_limite);
        Collections.sort(lista_prioridad,comparador_fecha);
        System.out.println("\n\nLista de tareas no vencidas ordenadas por fecha :\n");
        for (Tarea tarea : lista_prioridad) {
            tarea.mostrar();
            System.out.println("Fecha : " + tarea.get_fecha_limite());
        }
    }
}
