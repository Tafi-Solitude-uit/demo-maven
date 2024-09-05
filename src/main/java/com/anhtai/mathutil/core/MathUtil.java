package com.anhtai.mathutil.core;

public class MathUtil {
    //viết hàm tính gia thừa n! = 1.2.3.4.5...n
    //0! = 1! = 1
    //21! tràn kiểu long
    //<0 ! không tính được, không có giai thừa cho số âm
    public static long getFactorial(int n)
    {
        if (n < 0 || n > 20)
        {
            throw new IllegalArgumentException("n must be between 0 -> 20");
        }
        
        if (n == 0 || n == 1)
            return 1;
        long product = 1;
        
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        
        return product;
    }
}

//TDD - Test Driven Development
//Test first devolopment
//khi viết code ta phải lưu ý ngay, viết test cáe/tình huống test
//app/hàm phải được đề cập
//test ngay những gì ta viết ra, test trước khi ta viết hoàn thiện
