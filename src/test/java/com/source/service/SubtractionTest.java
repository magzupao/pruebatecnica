/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source.service;

import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 *
 * @author magz_
 */
public class SubtractionTest {

    static Logger logger = Logger.getLogger(AdditionTest.class.getName());

    @Test
    public void subTest() {
        Subtraction sub = new Subtraction(4.0, 3.0);
        assertEquals(1.0, sub.result);
        logger.info("subTest - Ok!");
    }
    
    @Test    
    public void subNumber2GreaterNumber1ErrorTest(){
        assertThrows(RuntimeException.class, ()-> new Subtraction(4.0,5.0));
        logger.info("subNumber1GreaterNumber2Test - Ok!");
    }    
}
