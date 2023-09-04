package ar.edu.unlu.poo.ecuacion;

public class Ecuacion_segundo_grado {
    private final double a;
    private final double b;
    private final double c;

    public Ecuacion_segundo_grado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] resolver() {
        double discriminante = calcular_discriminante();
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return new double[]{raiz1, raiz2};
        } else if (discriminante == 0) {
            double raizUnica = -b / (2 * a);
            return new double[]{raizUnica};
        } else {
            return new double[0];
        }
    }

    public double calcularY(double x) {
        return a * x * x + b * x + c;
    }

    private double calcular_discriminante() {
        return b * b - 4 * a * c;
    }
}
