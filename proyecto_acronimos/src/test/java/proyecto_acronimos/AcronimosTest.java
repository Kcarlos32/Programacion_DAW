/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package proyecto_acronimos;

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
public class AcronimosTest {
    
    public AcronimosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
         System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
         System.out.println("································");
         System.out.println("======= TEST DE ERRORES ========");
         System.out.println("======= Acronimo ========");
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
    public void testObtenerAcronimoCamel() {
        System.out.println("obtenerAcronimo");
        String cadena = "Hola jefe Popo";
        Acronimos instance = new Acronimos();
        String expResult = "H.j.P.";
        String result = instance.obtenerAcronimo(cadena);
        assertEquals(expResult, result);
    }
    @Test
     public void testObtenerAcronimoVacio() {
        System.out.println("obtenerAcronimo");
        String cadena = "";
        Acronimos instance = new Acronimos();
        String expResult = "";
        String result = instance.obtenerAcronimo(cadena);
        assertEquals(expResult, result);
    }
     @Test
    public void testObtenerAcronimoUnaPalabra() {
        System.out.println("obtenerAcronimo");
        String cadena = "Jose";
        Acronimos instance = new Acronimos();
        String expResult = "J.";
        String result = instance.obtenerAcronimo(cadena);
        assertEquals(expResult, result);
    }
     @Test
    public void testObtenerAcronimoEspacioAlPrincipio() {
        System.out.println("obtenerAcronimo");
        String cadena = " Antonio pepe romero";
        Acronimos instance = new Acronimos();
        String expResult = "A.p.r.";
        String result = instance.obtenerAcronimo(cadena);
        assertEquals(expResult, result);
    }
}
