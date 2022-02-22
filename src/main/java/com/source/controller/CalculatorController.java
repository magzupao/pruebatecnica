/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source.controller;

import com.source.dto.DataDTO;
import com.source.dto.OperationDTO;
import com.source.service.Calculator;
import io.corp.calculator.TracerImpl;
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

    TracerImpl tracer = new TracerImpl();

//    @RequestMapping(value = {"/api/operation"}, method = {RequestMethod.POST})
//    public DataDTO operation(@RequestBody OperationDTO operationDTO,
//                           HttpServletResponse httpResponse,
//                           WebRequest request) {
//        logger.info(" *** CalculatorController ");
//        Calculator calculator = new Calculator(operationDTO.getNumber1(),
//                operationDTO.getNumber2(),operationDTO.getOperator());
//
//        DataDTO dataDTO = new DataDTO();
//        dataDTO.setNumber1(operationDTO.getNumber1());
//        dataDTO.setNumber2(operationDTO.getNumber2());
//        dataDTO.setOperator(operationDTO.getOperator());
//        dataDTO.setResult(calculator.getResult());
//        logger.info(" *** CalculatorController result " + dataDTO.getResult());
//        tracer.trace(dataDTO.getResult());
//        httpResponse.setStatus(HttpStatus.CREATED.value());
//        return dataDTO;
//    }    
    @RequestMapping(value = {"/api/operation"}, method = {RequestMethod.GET})
    public DataDTO operation(@RequestBody OperationDTO operationDTO,
            HttpServletResponse httpResponse,
            WebRequest request) {

        logger.info(" *** CalculatorController ");
        DataDTO dataDTO = new DataDTO();

        Calculator calculator = new Calculator(operationDTO.getNumber1(),
                operationDTO.getNumber2(), operationDTO.getOperator());

        dataDTO.setNumber1(operationDTO.getNumber1());
        dataDTO.setNumber2(operationDTO.getNumber2());
        dataDTO.setOperator(operationDTO.getOperator());
        dataDTO.setResult(calculator.getResult());
        logger.info(" *** CalculatorController result " + dataDTO.getResult());
        tracer.trace(dataDTO.getResult());
        httpResponse.setStatus(HttpStatus.CREATED.value());

        return dataDTO;
    }
}
