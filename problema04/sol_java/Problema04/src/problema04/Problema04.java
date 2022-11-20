
package problema04;

import java.util.Scanner;
import java.util.Locale;

public class Problema04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double numeroUno;
        double numeroDos; 
        double numeroTres;
        
        System.out.println("Ingrese el primer número: ");
        numeroUno = entrada.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        numeroDos = entrada.nextDouble();
        System.out.println("Ingrese el tercer número: ");
        numeroTres = entrada.nextDouble();
        
        if (numeroUno == numeroDos || numeroDos == numeroTres){
            System.out.println("Error, los números no pueden repetirse."
                    + "\nIntentelo de nuevo.");
        }else if(numeroUno > numeroDos && numeroUno > numeroTres){
            System.out.printf("El número mayor es el número: %.2f\n", 
                    numeroUno);
        }else if(numeroDos > numeroUno && numeroDos > numeroTres){
            System.out.printf("El número mayor es el número: %.2f\n", 
                    numeroDos);
        }else{
            System.out.printf("El número mayor es el número: %.2f\n", 
                    numeroTres);
        }
    }
    
}
