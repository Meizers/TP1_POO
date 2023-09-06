package ar.edu.unlu.poo.password;
import java.util.Random;

public class Password {
    private static final String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String minusculas = "abcdefghijklmnopqrstuvwxyz";
    private static final String numeros = "0123456789";
    private static final int tamanio_por_defecto = 8;

    private String password;
    private int longitud;

    public Password(int longitud) {
        if (longitud < 1) {
            throw new IllegalArgumentException("Error, la longitud de la Paswword debe ser mayor a 0");
        }
        this.longitud = longitud;
        generar_Password();
    }

    public Password() {
        this(tamanio_por_defecto);
    }

    private void generar_Password() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String allCharacters = mayusculas + minusculas + numeros;

        for (int i = 0; i < longitud; i++) {
            char randomChar = allCharacters.charAt(random.nextInt(allCharacters.length()));
            sb.append(randomChar);
        }

        password = sb.toString();
    }

    public boolean Es_fuerte() {
        int minusculas_totales = 0;
        int mayusculas_totales = 0;
        int digitos_totales = 0;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayusculas_totales++;
            } else if (Character.isLowerCase(c)) {
                minusculas_totales ++;
            } else if (Character.isDigit(c)) {
                digitos_totales++;
            }
        }

        return mayusculas_totales > 2 && minusculas_totales > 1 && digitos_totales >= 2;
    }

    public String get_Password() {
        return password;
    }

    public int get_longitud() {
        return longitud;
    }

    public void set_longitud(int nueva_longitud) {
        if (nueva_longitud < 1) {
            throw new IllegalArgumentException("Error, la longitud de la Paswword debe ser mayor a 0");
        }
        longitud = nueva_longitud;
        generar_Password();
    }
    public void generarContraseñaFuerte() {
        if (Es_fuerte() == true){
            return;
        } else {
            generar_Password();
            while (!Es_fuerte()) {
                generar_Password();
            }
        }
    }
}
