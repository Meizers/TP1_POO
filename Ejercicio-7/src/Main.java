import ar.edu.unlu.poo.ecuacion.Ecuacion_segundo_grado;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        Ecuacion_segundo_grado ecuacion1 = new Ecuacion_segundo_grado(1, -3, 2);
        double[] raices1 = ecuacion1.resolver();
        if (raices1.length == 2) {
            System.out.println("Raíces: " + raices1[0] + ", " + raices1[1]);
        } else if (raices1.length == 1) {
            System.out.println("Raíz única: " + raices1[0]);
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }

        Ecuacion_segundo_grado ecuacion2 = new Ecuacion_segundo_grado(1, 0, -1);
        double[] raices2 = ecuacion2.resolver();
        if (raices2.length == 2) {
            System.out.println("Raíces: " + raices2[0] + ", " + raices2[1]);
        } else if (raices2.length == 1) {
            System.out.println("Raíz única: " + raices2[0]);
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }

        Ecuacion_segundo_grado ecuacion3 = new Ecuacion_segundo_grado(1, -2, 1);
        double[] raices3 = ecuacion3.resolver();
        if (raices3.length == 2) {
            System.out.println("Raíces: " + raices3[0] + ", " + raices3[1]);
        } else if (raices3.length == 1) {
            System.out.println("Raíz única: " + raices3[0]);
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }

        Ecuacion_segundo_grado ecuacion4 = new Ecuacion_segundo_grado(2, 3, 5);
        double[] raices4 = ecuacion4.resolver();
        if (raices4.length == 2) {
            System.out.println("Raíces: " + raices4[0] + ", " + raices4[1]);
        } else if (raices4.length == 1) {
            System.out.println("Raíz única: " + raices4[0]);
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }

        System.out.println("\n");

        double x = 2;
        System.out.println("el resultado de Y para el valor de x = " + x + " es : " + ecuacion1.calcularY(x));
        System.out.println("el resultado de Y para el valor de x = " + x + " es : " + ecuacion2.calcularY(x));
        System.out.println("el resultado de Y para el valor de x = " + x + " es : " + ecuacion3.calcularY(x));
    }
}





