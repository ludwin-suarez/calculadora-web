/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jara.calculadoraweb.controller;

import com.jara.calculadoraweb.service.calculadoraServiceInterface;
//import com.jara.calculadora.service.CalculadoraService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author LUDWIN SUAREZ JARA
 */
@Controller
public class calculadoraController {
   private final calculadoraServiceInterface service;

    public calculadoraController(calculadoraServiceInterface service) {
        this.service = service;
    }

    //http://localhost:8080/sumar?numero1=10&numero2=5
    //http://localhost:8080/restar?numero1=10&numero2=5
    //http://localhost:8080/multiplicar?numero1=10&numero2=5
    //http://localhost:8080/dividir?numero1=10&numero2=5

 @GetMapping("/")
public String mostrarCalculadora() {
    return "calculadora";
}   
    
@GetMapping("/calcular")//DIFF
public String calcular(
        @RequestParam double numero1,
        @RequestParam double numero2,
        @RequestParam String operacion,
        Model model) {

    double resultado = 0;

    switch (operacion) {

        case "sumar":
            resultado = service.sumar(numero1, numero2);
            break;

        case "restar":
            resultado = service.restar(numero1, numero2);
            break;

        case "multiplicar":
            resultado = service.multiplicar(numero1, numero2);
            break;

        case "dividir":
            resultado = service.dividir(numero1, numero2);
            break;
    }

    model.addAttribute("resultado", resultado);

    return "calculadora";
}
}
