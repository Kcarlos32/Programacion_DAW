package proyecto_division;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("DIVISIÓN ENTRE DOS NÚMEROS REALES");
        Scanner teclado = new Scanner(System.in);
        boolean error;
        do {
            try {
                error = false;
                System.out.printf("Teclee el dividendo (entre %g y %g):", -Float.MAX_VALUE, Float.MAX_VALUE);
                float i = teclado.nextFloat();
                System.out.printf("Teclee el divisor:  (entre %g y %g):", -Float.MAX_VALUE, Float.MAX_VALUE);
                float j = teclado.nextFloat();
                Division x = new Division();
                float resultado = x.calcularDivision(i, j);
                System.out.printf("La división %f/%f = %f\n", i, j, resultado);
            } catch (NumberFormatException e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println("Error en la conversión");
                error = true;
            } catch (InputMismatchException e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println("Error. El dato tecleado no es válido");
                error = true;
            } catch (Exception e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println(e.getMessage()); // Muestra el error
                error = true;
            }
        } while (error);
    }
}
