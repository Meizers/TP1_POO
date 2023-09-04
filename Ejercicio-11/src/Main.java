import ar.edu.unlu.poo.juego.Jugador;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String, Integer> diccionario = new HashMap<>();
        diccionario.put("hola", 1);
        diccionario.put("juego", 2);
        diccionario.put("java", 3);
        diccionario.put("fotosintesis", 4);
        Jugador jugador1 = new Jugador("mateo");
        Jugador jugador2 = new Jugador("Juan Roberto Carlos Tomas Gimenese del valle de Catarmarca Tercero");
        jugador1.agregar_palabra("hola", diccionario);
        jugador1.agregar_palabra("riquelmes", diccionario);
        jugador2.agregar_palabra("juego", diccionario);
        jugador2.agregar_palabra("fotosintesis", diccionario);
        int puntajeJugador1 = jugador1.calcular_puntaje();
        int puntajeJugador2 = jugador2.calcular_puntaje();
        if (puntajeJugador1 > puntajeJugador2) {
            System.out.println(jugador1.get_nombre() + " gano con un puntaje de " + puntajeJugador1);
        } else if (puntajeJugador1 < puntajeJugador2) {
            System.out.println(jugador2.get_nombre() + " gano con un puntaje de " + puntajeJugador2);
        } else {
            System.out.println("Es un empate, ambos jugandores tienen un puntaje de " + puntajeJugador1);
        }
    }
}