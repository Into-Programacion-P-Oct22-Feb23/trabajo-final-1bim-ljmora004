package problema07;

import java.util.Scanner;
import java.util.Locale;

public class Problema07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double numero;
        int contador = 2;
        double resultado = 0;
        System.out.println("Ingrese hasta que número desea sumar: ");
        numero = entrada.nextDouble();

        if (numero >= 2) {
            while (contador <= numero) {
                resultado = contador + 2;
                contador = contador + 2;
            }
        } else {
            System.out.println("Error, el número ingresado es menor a 2."
                    + "\nIntentelo de nuevo.");
        }

        System.out.printf("La suma de los números pares hasta el "
                + "número %.2f es: %.2f\n", numero, resultado);
    }

}
