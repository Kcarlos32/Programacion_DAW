/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.daw.calculadoraed;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author carcas
 */
public class SumaTest {
    
    public SumaTest() {
    }

    @Test
    public void testGetSuma() {
        System.out.println("Prueba de getSuma");
        double x = 1.0;
        double y = 1.0;
        Suma instance = new Suma();
        double expResult = 4;
        double result = instance.getSuma(x, y);
        assertEquals(expResult, result, 0.00001 );
    }

    @Test
    public void testIncrementa() {
    }
    
}
