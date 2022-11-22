package problema09;

import java.util.Scanner;
import java.util.Locale;

public class Problema09 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero;
        int contador = 1;
        int positivos = 0;
        int terminoPositivo = 12;
        int negativos = 0;
        int terminoNegativo = -11;
        String mensaje = "";

        String serie = "S1 = 12−11+24−22+36−33+48−44";
        System.out.print("Cuál es el número de términos que "
                + "desea imprimir de la serie:\n" + serie + "\n>> ");
        numero = entrada.nextInt();

        if (numero <= 8) {
            while (contador <= numero) {
                if (numero == 1) {
                    mensaje = mensaje + terminoPositivo;
                } else if (contador % 2 == 1) {
                    positivos = positivos + terminoPositivo;
                    mensaje = mensaje + "+" + Integer.toString(positivos);
                } else if (contador % 2 == 0) {
                    negativos = negativos + terminoNegativo;
                    mensaje = mensaje + Integer.toString(negativos);
                }
                contador = contador + 1;
            }
        }else{
            System.out.println("Error, el número de términos que "
                    + "escogió no exite.");
        }
        System.out.println(mensaje);

    }

}
