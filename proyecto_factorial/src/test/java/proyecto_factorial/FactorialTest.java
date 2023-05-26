/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package proyecto_factorial;

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
public class FactorialTest {
    
    public FactorialTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
         System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
         System.out.println("································");
         System.out.println("======= PRUEBA ERRORES ========");
         System.out.println("======= Factorial ========");
         System.out.println("································");
         System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
    
    @AfterAll
    public static void tearDownClass() {
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
    public void testFactorialPositivos() throws Exception {
        byte n = 5;
        Factorial instance = new Factorial();
        float expResult = 120.0F;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testFactorialNegativos() throws Exception {
        byte n = 0;
        Factorial instance = new Factorial();
        float expResult = 1.0F;
        float result = instance.factorial(n);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testFactorialConCero() throws Exception {
        Factorial factorial = new Factorial();
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            factorial.factorial((byte) -1);
        });
        String mensajeError = "Error. El número tiene que ser >=0";
        String excepcionReal = exception.getMessage();
        Assertions.assertTrue(excepcionReal.contains(mensajeError));
    }
    
}
