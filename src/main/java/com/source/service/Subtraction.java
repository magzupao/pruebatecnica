/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source.service;

/**
 *
 * @author magz_
 */
public class Subtraction {
    
    public Double result;
    
    public Subtraction(Double number1, Double number2) {
            sub(number1, number2);
    }

    public void sub(Double number1, Double number2) {
        if(number1>number2) {
            result = number1 - number2;
        }else{
            throw new RuntimeException(" number1 must be greater than number2");
        }        
    }      
}
