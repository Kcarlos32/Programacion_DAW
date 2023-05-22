/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package buscarcaracter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author carcas
 */
public class OperacionsArraysTest {
    
    public OperacionsArraysTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
         System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
         System.out.println("································");
         System.out.println("======= TEST DE ERRORES ========");
         System.out.println("======= Arrays ========");
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
    public void testBuscaConCarac() {
        System.out.println("testBusca");
        char c = 'o';
        char[] v = {'a', 'e', 'i', 'o', 'u'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test
    public void testBuscaNoCarac() {
        System.out.println("testBusca");
        char c = 'x';
        char[] v = {'a', 'e', 'i', 'o', 'u'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = false;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test
    public void testBuscaVacio() {
        System.out.println("testBusca");
        char c = 'a';
        char[] v = {};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = false;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }

    @Test
    public void testBuscaArrayUno() {
        System.out.println("testBusca");
        char c = 'a';
        char[] v = {'z'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = false;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);
    }
    
}
