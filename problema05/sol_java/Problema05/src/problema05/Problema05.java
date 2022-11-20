
package problema05;

import java.util.Scanner;
import java.util.Locale;

public class Problema05 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double x;
        double y;
        
        System.out.println("Ingrese el valor de X: ");
        x = entrada.nextDouble();
        System.out.println("Ingrese el valor de Y: ");
        y = entrada.nextDouble();
        
        if (x >= 0 && y >= 0){
            System.out.print("Valores pertenecientes al cuadrante 1.\n");
        }else if(x < 0 && y >= 0){
            System.out.print("Valores pertenecientes al cuadrante 2.\n");
        }else if(x < 0 && y < 0){
            System.out.print("Valores pertenecientes al cuadrante 3.\n");
        }else{
            System.out.print("Valores pertenecientes al cuadrante 4.\n");
        }
    }
    
}
