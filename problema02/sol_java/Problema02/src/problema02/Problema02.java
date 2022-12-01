package problema02;

import java.util.Scanner;
import java.util.Locale;

public class Problema02 {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int cantidadTraje;
        double precioTraje;
        double subTotal;
        double descuento;
        double valorTotal;
        String cadenaFinal = "";

        System.out.println("Ingrese el precio del traje: ");
        precioTraje = entrada.nextDouble();
        System.out.println("Ingrese la cantidad: ");
        cantidadTraje = entrada.nextInt();
        subTotal = precioTraje * cantidadTraje;

        if (cantidadTraje == 1) {
            descuento = (subTotal * 20) / 100;
        } else {
            if (cantidadTraje == 2) {
                descuento = (subTotal * 25) / 100;
            } else {
                if (cantidadTraje == 3) {
                    descuento = (subTotal * 40) / 100;
                } else {
                    descuento = (subTotal * 50) / 100;
                }
            }
        }
        valorTotal = subTotal - descuento;
        cadenaFinal = String.format("%sEl subtotal a pagar es de: $%.2f\n"
                + "El descuento que se aplica es de: $%.2f\n"
                + "El valor final a pagar es de: $%.2f", cadenaFinal,
                subTotal, descuento, valorTotal);
        System.out.println(cadenaFinal);

    }
}
