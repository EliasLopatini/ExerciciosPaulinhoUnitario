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
public class ValidaCpfTest {
    
    private ValidaCpf valida;
    
    public ValidaCpfTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
        valida = new ValidaCpf();
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testValidador() {
        assertTrue(valida.validador("12345678910"));
        assertFalse(valida.validador(""));
        assertFalse(valida.validador("8910"));
        assertFalse(valida.validador("11112345678910"));
        
    }
    
}
