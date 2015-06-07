package com.onebip.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by giorgio on 07/06/15.
 */
public class NumberTest {

    @Test
    public void testFizzBuzz() throws Exception {
        assertEquals("1", new Number(1).fizzBuzz());
        assertEquals("2", new Number(2).fizzBuzz());
        assertEquals("Fizz", new Number(3).fizzBuzz());
        assertEquals("4", new Number(4).fizzBuzz());
        assertEquals("Buzz", new Number(5).fizzBuzz());
        assertEquals("Fizz", new Number(6).fizzBuzz());
        assertEquals("7", new Number(7).fizzBuzz());
        assertEquals("8", new Number(8).fizzBuzz());
        assertEquals("Fizz", new Number(9).fizzBuzz());
        assertEquals("Buzz", new Number(10).fizzBuzz());
        assertEquals("FizzBuz", new Number(15).fizzBuzz());
        assertEquals("FizzBuzz", new Number(30).fizzBuzz());
    }
}