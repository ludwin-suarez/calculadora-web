/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jara.calculadoraWebTest;

import com.jara.calculadoraweb.service.calculadoraServiceImpl;
//import static org.junit.Assert.assertEquals; JUnit 4
//import org.junit.Test; // JUnit 4
// Spring Boot 2.1.6.RELEASE, una versión bastante antigua. está en el pom.xml
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test; //JUnit 5

/**
 *
 * @author LUDWIN SUAREZ JARA
 */
public class calculadoraServiceImplTest {
@Test
public void probarSuma() {
    calculadoraServiceImpl service = new calculadoraServiceImpl();
    double resultado = service.sumar(10, 5);
    assertEquals(15, resultado);
}  

@Test
public void probarResta(){
    calculadoraServiceImpl service = new calculadoraServiceImpl();
    double resultado = service.restar(10, 5);
    assertEquals(5, resultado);
}

@Test
 public void probarMultiplicacion(){
    calculadoraServiceImpl service = new calculadoraServiceImpl();
    double resultado = service.multiplicar(10, 5);
    assertEquals(50, resultado);
}
 
 @Test
  public void probarDivision(){
    calculadoraServiceImpl service = new calculadoraServiceImpl();
    double resultado = service.dividir(10, 5);
    assertEquals(2, resultado);
}  
}
