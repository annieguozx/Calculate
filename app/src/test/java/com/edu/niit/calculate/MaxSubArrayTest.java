package com.edu.niit.calculate;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by annie on 2017/3/14.
 */
public class MaxSubArrayTest {
    private MaxSubArray maxSubArray;
    int[] arr = { -2,5,3,-6,4,-8,6 };
    @Before
    public void setUp() throws Exception {
        maxSubArray = new MaxSubArray();
    }
    @Test
    public void tesgetMaxSubArray1() throws Exception {
        assertEquals(8,maxSubArray.getMaxSubArray1(arr),0);
    }
    @Test
    public void tesgetMaxSubArray2() throws Exception {
        assertEquals(8,maxSubArray.getMaxSubArray2(arr),0);
    }
}