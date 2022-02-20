/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source.controller;

import com.source.dto.DataDTO;
import com.source.service.Calculator;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
/**
 *
 * @author magz_
 */
@RestController
public class CalculatorController {
     
    static Logger logger = Logger.getLogger(CalculatorController.class.getName());
 
    @RequestMapping(value = {"/api/operation"}, method = {RequestMethod.POST})
    public DataDTO operation(@RequestBody DataDTO dataDTO,
                           HttpServletResponse httpResponse,
                           WebRequest request) {
        logger.info(" *** CalculatorController ");
        Calculator calculator = new Calculator(dataDTO.getNumber1(),
                dataDTO.getNumber2(),dataDTO.getOperator());

        dataDTO.setNumber1(dataDTO.getNumber1());
        dataDTO.setNumber2(dataDTO.getNumber2());
        dataDTO.setResult(calculator.getResult());
        logger.info(" *** CalculatorController result " + dataDTO.getResult());
        httpResponse.setStatus(HttpStatus.CREATED.value());
        return dataDTO;
    }    
    
}
