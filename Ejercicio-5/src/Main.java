import java.time.LocalDate;
import ar.edu.unlu.poo.tareas.Tarea;

public class Main {
    public static void main(String[] args) {
        LocalDate maniana = LocalDate.now().plusDays(1);
        LocalDate ayer = LocalDate.now().minusDays(1);

        Tarea tarea_supermercado = new Tarea();
        tarea_supermercado.cambiar_descripcion("ir al supermercado mañana");
        tarea_supermercado.cambiar_prioridad(3);
        tarea_supermercado.definir_fecha(maniana);

        Tarea tarea_repuesto = new Tarea();
        tarea_repuesto.cambiar_descripcion("consultar repuesto del auto");
        tarea_repuesto.cambiar_prioridad(2);
        tarea_repuesto.definir_fecha(ayer);

        Tarea tarea_cine = new Tarea();
        tarea_cine.cambiar_descripcion("ir al cine a ver la nueva pelicula de marvel");
        tarea_cine.cambiar_prioridad(1);
        tarea_cine.definir_fecha(ayer);

        tarea_supermercado.mostrar();
        System.out.println("Vencida: " + tarea_supermercado.vencida());
        System.out.println("Completa: " + tarea_supermercado.completa());

        tarea_repuesto.mostrar();
        System.out.println("Vencida: " + tarea_repuesto.vencida());
        System.out.println("Completa: " + tarea_repuesto.completa());

        tarea_cine.mostrar();
        System.out.println("Vencida: " + tarea_cine.vencida());
        System.out.println("Completa: " + tarea_cine.completa());
    }
}




