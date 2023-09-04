import java.time.LocalDate;
import ar.edu.unlu.poo.tareav4.Administrador;
import ar.edu.unlu.poo.tareav4.Tarea;

public class Main {
    public static void main(String[] args) {
        LocalDate maniana = LocalDate.now().plusDays(1);
        LocalDate ayer = LocalDate.now().minusDays(1);
        LocalDate en_15_dias = LocalDate.now().plusDays(15);
        LocalDate en_10_dias =LocalDate.now().plusDays(10);
        LocalDate en_11_dias =LocalDate.now().plusDays(11);
        LocalDate en_19_dias =LocalDate.now().plusDays(19);

        Tarea tarea_supermercado = new Tarea();
        tarea_supermercado.cambiar_descripcion("ir al supermercado maniana");
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

        Tarea tarea_lol = new Tarea();
        tarea_lol.cambiar_descripcion("Jugar al League of legends");
        tarea_lol.cambiar_prioridad(2);
        tarea_lol.definir_fecha(en_10_dias);
        tarea_lol.definir_recordatorio(LocalDate.now());

        Tarea tarea_votar = new Tarea();
        tarea_votar.cambiar_descripcion("Ir a votar");
        tarea_votar.cambiar_prioridad(1);
        tarea_votar.definir_fecha(en_11_dias);
        tarea_votar.definir_recordatorio(maniana);

        Tarea tarea_viaje = new Tarea();
        tarea_viaje.cambiar_descripcion("Ir a egipto");
        tarea_viaje.cambiar_prioridad(4);
        tarea_viaje.definir_fecha(en_19_dias);
        tarea_viaje.definir_recordatorio(maniana);



        Administrador administrador = new Administrador();
        administrador.set_tarea(tarea_supermercado);
        administrador.set_tarea(tarea_repuesto);
        administrador.set_tarea(tarea_cine);
        administrador.set_tarea(tarea_animecom);
        administrador.set_tarea(tarea_lol);
        administrador.set_tarea(tarea_votar);
        administrador.set_tarea(tarea_viaje);
        administrador.completar_tarea("ir al supermercado maniana","RobertoUwu25",LocalDate.now());
        administrador.completar_tarea("Ir a egipto","Tutankamon",ayer);
        administrador.completar_tarea("Ir a votar","RobertoUwu25",ayer);
        administrador.completar_tarea("ir a la animecom","Tomas Resnik",LocalDate.of(2023, 9, 23));
        administrador.completar_tarea("Jugar al League of legends","Tomas Resnik",LocalDate.now());
        administrador.mostrar_completas_colaborador("RobertoUwu25");
        System.out.println("\n");
        administrador.mostrar_completas_colaborador("Tutankamon");
        System.out.println("\n");
        administrador.mostrar_completas_colaborador("Tomas Resnik");
    }
}