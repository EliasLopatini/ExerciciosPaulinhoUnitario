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
public class CalcularTest {
    
    private Calcular calc;
    
    public CalcularTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        calc = new Calcular();
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomarValores() {
        
        assertEquals(4 ,calc.soma(2, 2));
        assertEquals(1 ,calc.subtracao(3, 2));
        assertEquals(5 ,calc.divisao(10, 2));
        assertEquals(20 ,calc.multiplicacao(10, 2));
   
    }
    
}
