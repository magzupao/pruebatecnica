/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source.controller;

import com.source.dto.DataDTO;
import com.source.dto.OperationDTO;
import com.source.service.AdditionTest;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.context.request.WebRequest;

/**
 *
 * @author magz_
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CalculatorControllerTest {

    static Logger logger = Logger.getLogger(AdditionTest.class.getName());

    @Autowired
    CalculatorController calculatorController;

    @MockBean
    HttpServletResponse httpResponse;

    @MockBean
    WebRequest reques;

    @Test
    public void testAdd() {
        OperationDTO operationDTO = new OperationDTO();
        operationDTO.setNumber1(2.0);
        operationDTO.setNumber2(3.0);
        operationDTO.setOperator("+");

        DataDTO dataDTO = calculatorController.operation(operationDTO, httpResponse, reques);

        Assertions.assertEquals(dataDTO.getResult(), 5.0);
        logger.info("CalculatorControllerTest - add - Ok");
    }

    @Test
    public void testSub() {
        OperationDTO operationDTO = new OperationDTO();
        operationDTO.setNumber1(3.0);
        operationDTO.setNumber2(2.0);
        operationDTO.setOperator("-");

        DataDTO dataDTO = calculatorController.operation(operationDTO, httpResponse, reques);

        Assertions.assertEquals(dataDTO.getResult(), 1.0);
        logger.info("CalculatorControllerTest - sub - Ok");
    }
    
}
