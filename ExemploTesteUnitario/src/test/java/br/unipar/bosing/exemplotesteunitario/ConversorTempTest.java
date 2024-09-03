/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.unipar.bosing.exemplotesteunitario;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 00236544
 */
public class ConversorTempTest {
    
    private ConversorTemp conv;
    
    public ConversorTempTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        conv = new ConversorTemp();
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCelsiusParaFah() {
        
        assertEquals(89.6,conv.celsiusParaFah(32.0));
        assertEquals(35.6,conv.celsiusParaFah(2.0));
        assertEquals(30.2,conv.celsiusParaFah(-1.0));
        
    }

    @Test
    public void testFahParaCelsius() {
        
        assertEquals(32.0,conv.fahParaCelsius(89.6));
        assertEquals(2.0,conv.fahParaCelsius(35.6));
        assertEquals(-1.0,conv.fahParaCelsius(30.2));
        
    }

    @Test
    public void testCelsiusParaKelvin() {
        
         assertEquals(276.15,conv.celsiusParaKelvin(3.0));
         assertEquals(280.15,conv.celsiusParaKelvin(7.0));
         assertEquals(272.15,conv.celsiusParaKelvin(-1.0));
         
  
    }
    
}
