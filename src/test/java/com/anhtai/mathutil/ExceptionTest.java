/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhtai.mathutil;

import com.anhtai.mathutil.core.MathUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author Windows
 */
public class ExceptionTest {
        //junit 5 đưa ra hàm mới dùng để kiểm tra xem1 ngoại lệ có đượcnems ra hay không
        //khi ta cố tình đưa data bậy cho hàm getF();
        //nếu đưa ra data sai -5 thì phải ném ra ngoại lệ, đúng thì xanh test
        //JUnit4 ước lượng qua @Test(expected=ten-ngoại-lệ.class)
        //JUni5 ước lươngj 1 ngoại lệ hay không qua hàm
        //Assertons.assertThrows(tên-ngoại-lệ-kì-vọng, bhoms câu lện có thể gây ra expection
        //                          1 obj chứa nhiều lệnh
        //                          obj thuộc classExecutable
        //                          chínhlaf 1 functional interface
        //serializable -> markup interface không có hàm absstract
        //Funtional interface -> chỉ có 1 hàm, Comparator (hàm compare())
        // -> dùng lamda expression
        
        //interface nói chung -> có nhiều hàm absstract
        //
    
    @Test
    public void checkFactorialGivenWrongArgumentThrowsException()
    {
        Executable wrongArg= new Executable() {
            @Override
            public void execute() throws Throwable {
                MathUtil.getFactorial(-5);
            }           
        };
        
        //lamda
        Executable wrongAr = () -> {MathUtil.getFactorial(-5);};
        Executable wrongA = () -> {MathUtil.getFactorial(-5);}; //1 câu lệnh thì có thể bỏ luôn ngoặc nhọn
        
        assertThrows(IllegalArgumentException.class, wrongA); //dependecy injection
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(25)); 
    }
    
}
