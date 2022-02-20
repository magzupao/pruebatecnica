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
public class Addition {
    
    public Double result;
    
    public Addition(Double number1, Double number2) {
            add(number1, number2);
    }

    public void add(Double number1, Double number2) {
        if(number1==null || number2==null){
            throw new NullPointerException(" valor es nulo");
        }else{
            result = number1+number2;
        }
    }     
}
