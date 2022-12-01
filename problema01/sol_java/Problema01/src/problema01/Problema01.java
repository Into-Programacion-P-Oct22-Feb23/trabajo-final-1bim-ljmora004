
import java.util.Scanner;
import java.util.Locale;

public class Problema01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double angulo1 = 0;
        double angulo2 = 0;
        double angulo3 = 0;
        String tipoTriangulo = " ";

        System.out.println("Ingrese el tamaño del primer ángulo");
        angulo1 = entrada.nextDouble();
        System.out.println("Ingrese el tamaño del segundo ángulo");
        angulo2 = entrada.nextDouble();
        System.out.println("Ingrese el tamaño del tercer ángulo");
        angulo3 = entrada.nextDouble();

        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            tipoTriangulo = tipoTriangulo + "Es un triangulo rectángulo";
        } else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
            tipoTriangulo = tipoTriangulo + "Es un triangulo acutángulo";
        } else if (angulo1 > 90 && angulo1 < 180 || angulo2 > 90 && angulo2 < 180
                || angulo3 > 90 && angulo3 < 180) {
            tipoTriangulo = tipoTriangulo + "Es un triangulo obtusángulo";
        }

        System.out.println(tipoTriangulo);
    }
}
