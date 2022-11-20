
package problema03;

import java.util.Scanner;
import java.util.Locale;
        
public class Problema03 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        int tipo;
        int horasTrabajadas;
        double costoHora;
        double valorAdicional;
        double salarioFinal;
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado que es: ");
        tipo = entrada.nextInt();
        System.out.println("Ingrese el número de horas trabajadas: ");
        horasTrabajadas = entrada.nextInt();
        System.out.println("Ingrese la cuota a pagar por hora: ");
        costoHora = entrada.nextDouble();
        
        salarioFinal = costoHora * horasTrabajadas;
        
        if (tipo == 1){
            valorAdicional = costoHora * 1.5;
            salarioFinal = valorAdicional * horasTrabajadas;
        }else if(tipo == 2){
            valorAdicional = costoHora * 2;
            salarioFinal = valorAdicional * horasTrabajadas;
        }else if(tipo == 3){
            valorAdicional = costoHora * 2.5;
            salarioFinal = valorAdicional * horasTrabajadas;
        }else if(tipo == 4){
            valorAdicional = costoHora * 3;
            salarioFinal = valorAdicional * horasTrabajadas;
        }else{
            System.out.println("Lo sentimos, el tipo de empleado ingresado "
                    + "no existe o no tiene derecho a pago por horas extras.");
        }
        System.out.printf("El empleado %s de tipo %d tiene un "
                + "salario final de %.2f dólares\n", nombre, 
                tipo, salarioFinal);
    }
    
}
