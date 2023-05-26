/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package proyecto_acronimos;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author osccan
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
    public void testObtenerAcronimoIfj() {
        System.out.println("obtenerAcronimo");
        String cadena = "Joan joan Antonio";
        Acronimos instance = new Acronimos();
        String expResult = "J.j.";
        String result = instance.obtenerAcronimo(cadena);
        assertEquals(expResult, result);
    }
    @Test
    public void testObtenerAcronimoIfp() {
        System.out.println("obtenerAcronimo");
        String cadena = "Pep pepe Anto nio";
        Acronimos instance = new Acronimos();
        String expResult = "P.p.";
        String result = instance.obtenerAcronimo(cadena);
        assertEquals(expResult, result);
    }
    @Test
    public void testObtenerAcronimoIfZ() {
        System.out.println("obtenerAcronimo");
        String cadena = "Marco antonio Zuñez bob";
        Acronimos instance = new Acronimos();
        String expResult = "M.a.*.b.";
        String result = instance.obtenerAcronimo(cadena);
        assertEquals(expResult, result);
    }
    @Test
    public void testObtenerAcronimoIfz() {
        System.out.println("obtenerAcronimo");
        String cadena = "Marco antonio zuñez bob";
        Acronimos instance = new Acronimos();
        String expResult = "M.a.z.b.";
        String result = instance.obtenerAcronimo(cadena);
        assertEquals(expResult, result);
    }

    ////////////////////////////////////////
    ///// TEST DEL MEJORADO /////
    ////////////////////////////////////////
    
    @Test
    public void testObtenerAcronimoNull() throws Exception{ //He creado un test para comprobar que al entregarle un valor nulo no se salga
        Acronimo_Mejora instance = new Acronimo_Mejora();
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            instance.obtenerAcronimoM(null);
        });
        String mensajeError = "ERROR, El valor introducido es nulo";
        String excepcionReal = exception.getMessage();
        Assertions.assertTrue(excepcionReal.contains(mensajeError));
    }
    @Test
    public void testObtenerAcronimoVacioMej() throws Exception {
        System.out.println("obtenerAcronimo");
        String cadena = "";
        Acronimo_Mejora instance = new Acronimo_Mejora();
        String expResult = "";
        String result = instance.obtenerAcronimoM(cadena);
        assertEquals(expResult, result);
    }
    @Test
    public void testObtenerAcronimoIfjMej() throws Exception {
        System.out.println("obtenerAcronimo");
        String cadena = "Joan joan Antonio";
        Acronimo_Mejora instance = new Acronimo_Mejora();
        String expResult = "J.j.";
        String result = instance.obtenerAcronimoM(cadena);
        assertEquals(expResult, result);
    }
    @Test
    public void testObtenerAcronimoIfpMej() throws Exception {
        System.out.println("obtenerAcronimo");
        String cadena = "Pep pepe Anto nio";
        Acronimo_Mejora instance = new Acronimo_Mejora();
        String expResult = "P.p.";
        String result = instance.obtenerAcronimoM(cadena);
        assertEquals(expResult, result);
    }
    @Test
    public void testObtenerAcronimoIfZMej() throws Exception {
        System.out.println("obtenerAcronimo");
        String cadena = "Marco antonio Zuñez bob";
        Acronimo_Mejora instance = new Acronimo_Mejora();
        String expResult = "M.a.*.b.";
        String result = instance.obtenerAcronimoM(cadena);
        assertEquals(expResult, result);
    }
    @Test
    public void testObtenerAcronimoIfzMej() throws Exception {
        System.out.println("obtenerAcronimo");
        String cadena = "Marco antonio zuñez bob";
        Acronimo_Mejora instance = new Acronimo_Mejora();
        String expResult = "M.a.z.b.";
        String result = instance.obtenerAcronimoM(cadena);
        assertEquals(expResult, result);
    }
}
