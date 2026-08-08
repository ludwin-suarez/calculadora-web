/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jara.calculadoraweb.service;
import org.springframework.stereotype.Service;

/**
 *
 * @author LUDWIN SUAREZ JARA
 */
@Service
public class calculadoraServiceImpl implements calculadoraServiceInterface{

    @Override
    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    @Override
    public double restar(double numero1, double numero2) {
         return numero1 - numero2;
    }

    @Override
    public double multiplicar(double numero1, double numero2) {
       return numero1 * numero2;
    }

    @Override
    public double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }
    
}
