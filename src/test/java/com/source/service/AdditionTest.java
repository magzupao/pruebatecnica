/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source.service;

import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author magz_
 */
public class AdditionTest {
    
    static Logger logger = Logger.getLogger(AdditionTest.class.getName());
    
    @Test    
    public void addTest() throws Exception{
        Addition add = new Addition(2.0,3.0);
        assertEquals(5.0,add.result);
        logger.info("addTest - Ok!");
    }         
    
    @Test
    public void addNullTest() throws Exception{
        assertThrows(NullPointerException.class, ()-> new Addition(null,null));
        logger.info("addNullTest - Ok!");
    }       
}
