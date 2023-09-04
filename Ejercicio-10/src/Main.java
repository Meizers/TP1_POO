import java.time.LocalDate;
import ar.edu.unlu.poo.tareasv2.Tarea;

public class Main {
    public static void main(String[] args) {
        LocalDate maniana = LocalDate.now().plusDays(1);
        LocalDate ayer = LocalDate.now().minusDays(1);
        LocalDate en_15_dias = LocalDate.now().plusDays(15);

        Tarea tarea_supermercado = new Tarea();
        tarea_supermercado.cambiar_descripcion("ir al supermercado mañana");
        tarea_supermercado.cambiar_prioridad(3);
        tarea_supermercado.definir_fecha(maniana);
        tarea_supermercado.definir_recordatorio(maniana);

        Tarea tarea_repuesto = new Tarea();
        tarea_repuesto.cambiar_descripcion("consultar repuesto del auto");
        tarea_repuesto.cambiar_prioridad(2);
        tarea_repuesto.definir_fecha(ayer);
        tarea_repuesto.definir_recordatorio(ayer);

        Tarea tarea_cine = new Tarea();
        tarea_cine.cambiar_descripcion("ir al cine a ver la nueva pelicula de marvel");
        tarea_cine.cambiar_prioridad(1);
        tarea_cine.definir_fecha(ayer);
        tarea_repuesto.definir_recordatorio(ayer);

        Tarea tarea_animecom = new Tarea();
        tarea_animecom.cambiar_descripcion("ir a la animecom");
        tarea_animecom.cambiar_prioridad(4);
        tarea_animecom.definir_fecha(en_15_dias);
        tarea_animecom.definir_recordatorio(ayer);


        tarea_supermercado.mostrar();
        System.out.println("Vencida: " + tarea_supermercado.vencida());
        System.out.println("Completa: " + tarea_supermercado.completa());
        System.out.println("Prioridad: " + tarea_supermercado.get_prioridad());

        System.out.println("\n");
        tarea_repuesto.mostrar();
        System.out.println("Vencida: " + tarea_repuesto.vencida());
        System.out.println("Completa: " + tarea_repuesto.completa());
        System.out.println("Prioridad: " + tarea_repuesto.get_prioridad());

        System.out.println("\n");
        tarea_cine.mostrar();
        System.out.println("Vencida: " + tarea_cine.vencida());
        System.out.println("Completa: " + tarea_cine.completa());
        System.out.println("Prioridad: " + tarea_cine.get_prioridad());


        System.out.println("\n");
        tarea_animecom.mostrar();
        System.out.println("Vencida: " + tarea_animecom.vencida());
        System.out.println("Completa: " + tarea_animecom.completa());
        System.out.println("Prioridad: " + tarea_animecom.get_prioridad());
    }
}