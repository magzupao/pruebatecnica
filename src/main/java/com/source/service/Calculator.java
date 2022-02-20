/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source.service;

import com.source.service.Addition;

/**
 *
 * @author magz_
 */
public class Calculator {
    
    private Double result;

    public Calculator(Double number1, Double number2, String strOperator){
        calculate(number1, number2, strOperator);
    }

    public void calculate(Double number1, Double number2, String strOperator){

        char operator = strOperator.charAt(0);

        switch(operator) {
            case '+':
                Addition add = new Addition(number1, number2);
                result = add.result;
                break;
            case '-':
                Subtraction sub = new Subtraction(number1, number2);
                result = sub.result;
                break;                
            default:
        }
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }    
}


