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
public interface calculadoraServiceInterface {
    double sumar(double numero1, double numero2);

    double restar(double numero1, double numero2);

    double multiplicar(double numero1, double numero2);

    double dividir(double numero1, double numero2);    
}
