/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhtai.mathutil;

import com.anhtai.mathutil.core.MathUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Windows
 */
public class FactorialTest {
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell()
    {
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        
        assertEquals(expected, actual);
        
        assertEquals(720, MathUtil.getFactorial(6));
        assertEquals(1, MathUtil.getFactorial(0)); 
    }
    
}
