package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testCalculatorAddition(){

        Calculator calculatorAddition = new Calculator();

        Assertions.assertEquals(6, calculatorAddition.addition(1, 5));

        Assertions.assertNotEquals(8, calculatorAddition.addition(5, 5));
    }

    @Test
    public void testCalculatorSubtraction(){
        Calculator calculatorSubtraction = new Calculator();

        Assertions.assertEquals(3, calculatorSubtraction.subtraction(5, 2));

        Assertions.assertNotEquals(5, calculatorSubtraction.subtraction(4, 1));
    }

    @Test
    public void testCalculatorMultiplication(){
        Calculator calculatorMultiplication = new Calculator();

        Assertions.assertEquals(25, calculatorMultiplication.multiplication(5, 5));

        Assertions.assertNotEquals(40, calculatorMultiplication.multiplication(5, 5));
    }

    @Test
    public void testCalculatorDivision(){
        Calculator calculatorDivsion = new Calculator();

        Assertions.assertEquals(2, calculatorDivsion.division(10, 5));
        Assertions.assertNotEquals(3, calculatorDivsion.division(10, 5));

        Assertions.assertEquals(0.5, calculatorDivsion.division(5, 10));
        Assertions.assertNotEquals(0.25, calculatorDivsion.division(5, 10));
    }
}
