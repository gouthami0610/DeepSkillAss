package com.cognizant.loan;

import static org.junit.Assert.*;

import com.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
//
//    @Test
//    public void testAdd() {
//
//        //arrange
//        Calculator calculator = new Calculator();
//
//        //act
//        int result = calculator.add(10, 20);
//
//        //assert
//        assertEquals(30, result);
//    }


    Calculator calculator;

    @Before
    public void setup() {

        System.out.println("Before Test");

        calculator = new Calculator();
    }

    @Test
    public void testAdd() {

        //Arrange
        int a = 10;
        int b = 20;

        //Act
        int result = calculator.add(a, b);

        //Assert
        assertEquals(30, result);
    }

    @After
    public void tearDown() {

        System.out.println("After Test");

        calculator = null;
    }
}