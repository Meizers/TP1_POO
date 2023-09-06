import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ar.edu.unlu.poo.password.Password;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese cuantas claves desea generar: ");
        int cant_claves = scanner.nextInt();
        List<Password> passwords = new ArrayList<>();

        System.out.print("Ingrese la longitud de las contraseñas: ");
        int longitud = scanner.nextInt();
        for (int i = 0; i < cant_claves  ; i++) {
            Password password = new Password(longitud);
            passwords.add(password);
        }

        System.out.println("Contraseñas generadas:");
        for (Password password : passwords) {
            System.out.print(password.get_Password() + " - ");
            if (password. Es_fuerte()) {
                System.out.println("Fuerte");
            } else {
                System.out.println("Débil");
                password.set_longitud(8); // Regenerar contraseñas débiles con longitud predeterminada
            }
        }

        System.out.println("\n");

        System.out.println("Contraseñas fuertes generadas:");
        for (Password password : passwords) {
            password.generarContraseñaFuerte();
            System.out.print(password.get_Password() + " - ");
            if (password. Es_fuerte()) {
                System.out.println("Fuerte");
            } else {
                System.out.println("Débil");
                password.set_longitud(8); // Regenerar contraseñas débiles con longitud predeterminada
            }
        }
    }
}
