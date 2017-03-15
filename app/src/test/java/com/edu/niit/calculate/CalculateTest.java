package com.edu.niit.calculate;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by annie on 2017/3/10.
 */
public class CalculateTest {

    private Calculate calculate;
    @Before
    public void setUp() throws Exception {
        calculate = new Calculate();
    }
    @Test
    public void testSum() throws Exception {
        assertEquals(6d, calculate.sum(1d, 5d), 0);
    }

    @Test
    public void testSubstract() throws Exception {
        assertEquals(1d, calculate.substract(4d, 3d), 0);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(2d, calculate.divide(4d, 2d), 0);
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(16d, calculate.multiply(4d, 4d), 0);
    }
}