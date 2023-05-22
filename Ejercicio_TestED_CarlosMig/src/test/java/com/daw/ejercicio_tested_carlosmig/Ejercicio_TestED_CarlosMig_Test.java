/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.daw.ejercicio_tested_carlosmig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;



/**
 *
 * @author carcas
 */

public class Ejercicio_TestED_CarlosMig_Test {

    @Test
    public void testNotasAlumnos() {
        Ejercicio_TestED_CarlosMig.main(new String[0]);

        // Comprobar que se han introducido 10 notas y nombres
        assertEquals(10, Ejercicio_TestED_CarlosMig.notas.length);
        assertEquals(10, Ejercicio_TestED_CarlosMig.alumnos.length);

        // Comprobar que todas las notas están entre 0 y 10
        for (float nota : Ejercicio_TestED_CarlosMig.notas) {
            assertTrue(nota >= 0 && nota <= 10);
        }

        // Comprobar que los resultados están correctamente asignados
        for (int i = 0; i < Ejercicio_TestED_CarlosMig.notas.length; i++) {
            String resultado = Ejercicio_TestED_CarlosMig.resultado[i];
            float nota = Ejercicio_TestED_CarlosMig.notas[i];
            if (nota < 5) {
                assertEquals("SUSPENSO", resultado);
            } else if (nota < 7) {
                assertEquals("BIEN", resultado);
            } else if (nota < 9) {
                assertEquals("NOTABLE", resultado);
            } else {
                assertEquals("SOBRESALIENTE", resultado);
            }
        }
    }
}


