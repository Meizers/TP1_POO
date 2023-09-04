package ar.edu.unlu.poo.tareas;
import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private int prioridad;
    private boolean completada = false;
    private LocalDate fecha_limite;

    public void cambiar_descripcion(String nueva_descripcion) {
        descripcion = nueva_descripcion;
    }

    public void cambiar_prioridad(int nueva_prioridad) {
        prioridad = nueva_prioridad;
    }

    public void definir_fecha(LocalDate fecha){
        fecha_limite = fecha;
    }

    public void terminada() {
        completada = true;
    }

    public boolean vencida() {
        return !completada && LocalDate.now().isAfter(fecha_limite);
    }

    public boolean completa() {
        return completada;
    }

    public void mostrar() {
        if (vencida()) {
            System.out.println("(Vencida)..." + descripcion);
        } else {
            System.out.println(descripcion);
        }
    }
}
