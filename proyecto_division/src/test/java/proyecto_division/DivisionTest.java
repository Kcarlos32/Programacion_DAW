/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package proyecto_division;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author carcas
 */
public class DivisionTest {
    
    public DivisionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
         System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
         System.out.println("································");
         System.out.println("======= TEST DE ERRORES ========");
         System.out.println("======= Division ========");
         System.out.println("································");
         System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("Prueba finalizada");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
         System.out.println("································");
         System.out.println("====== PRUEBA FINALIZADA =======");
         System.out.println("································");
         System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCalcularDivision() throws Exception {
        System.out.println("calcularDivision");
        float dividendo = 32.0F;
        float divisor = 2.0F;
        Division instance = new Division();
        float expResult = 16.0F;
        float result = instance.calcularDivision(dividendo, divisor);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testFactorialConCero() throws Exception {
        Division factorial = new Division();
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            factorial.calcularDivision(420, 0);
        });
        String mensajeError = "Error. El divisor no puede ser 0.";
        String excepcionReal = exception.getMessage();
        Assertions.assertTrue(excepcionReal.contains(mensajeError));
    }
    
}
