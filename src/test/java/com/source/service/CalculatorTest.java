/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source.service;

import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author magz_
 */
public class CalculatorTest {
    
    static Logger logger = Logger.getLogger(CalculatorTest.class.getName());
    
    @Test
    public void calculatorAddTest() {
        Calculator calculator = new Calculator(4.0, 3.0, "+");
        assertEquals(7.0, calculator.getResult());
        logger.info("calculatorTest add - Ok!");
    }

    @Test
    public void calculatorSubTest() {
        Calculator calculator = new Calculator(4.0, 3.0, "-");
        assertEquals(1.0, calculator.getResult());
        logger.info("calculatorTest sub - Ok!");
    }      
}
