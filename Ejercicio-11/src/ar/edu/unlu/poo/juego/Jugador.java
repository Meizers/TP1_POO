package ar.edu.unlu.poo.juego;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Jugador {
    private String nombre;
    private List<String> palabras;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.palabras = new ArrayList<>();
    }

    public void agregar_palabra(String palabra, Map<String, Integer> diccionario) {
        if (diccionario.containsKey(palabra.toLowerCase())) {
            palabras.add(palabra.toLowerCase());
        } else {
            System.out.println("La palabra '" + palabra + "' no existe en el diccionario.");
        }
    }

    public int calcular_puntaje() {
        int puntaje = 0;
        for (String palabra : palabras) {
            for (char letra : palabra.toCharArray()) {
                puntaje++;
                if ("kzxwq".contains(String.valueOf(letra))) {
                    puntaje++;
                }
            }
        }
        return puntaje;
    }

    public String get_nombre() {
        return nombre;
    }
}

