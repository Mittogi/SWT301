/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mittogi.mathutil.core;

// Quy tắc đặt tên package trong Java
// Tên miền công ty đảo ngược, đi kèm thông tin dự án/project và mod
// com.tên-cty.tên-dự-án.module.Tên-Class
// com.microsoft.sqlserver.jdbc.
// com.giaolang.mathutil.core.
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PHAT-CL
 */

// Class này chứa các test case dùng để test code của các class chính bên MathUtility
public class MathUtilityTest {
    
    // Test case là bộ data đầu vào + thao tác nhập xuất trên app, màn hình, trên hàm để verify 1 hàm, màn hình, chức năng chạy đúng hay sai
    // Test case #1: Check/Test getF() with n = 0
    // * Input/Given n = 0
    // * Step/Procedure (Bước test)
    // Call method getFactorial(n)
    // * Expective Result: 1 (Hy vọng 0! = 1)
    // * Actual Result: ??? Chờ chạy hàm mới biết
    // * Status: Passed | Failed
    @Test // Framework ép ta phải viết code theo 1 quy tắc nào đó
          // Thư viện cho viết tự do, gọi hàm tự do
    // Framework là thư viện, nhưng thư viện không hẳn là framework
    public void testFactorialGivenRightArg0ReturnWell() {
        assertEquals(1, MathUtility.getFactoial(0));
    } 
    
    // Test case #2: Check/Test getF() with n = 1
    // * Input/Given n = 1
    // * Step/Procedure (Bước test)
    // Call method getFactorial(n)
    // * Expective Result: 1 (Hy vọng 1! = 1)
    // * Actual Result: ??? Chờ chạy hàm mới biết
    // * Status: Passed | Failed
    @Test
    public void testFactorialGivenRightArg1ReturnWell() {
        assertEquals(1, MathUtility.getFactoial(1));
    }
    
    // Test case #3: CheckF() with n = 5, expective = 120
    @Test
    public void testFactorialGivenRightArg5ReturnWell() {
        assertEquals(120, MathUtility.getFactoial(5));
    }
    
    @Test
    public void testFactorialGivenRightArg12345ReturnWell() {
        assertEquals(1, MathUtility.getFactoial(1));
        assertEquals(2, MathUtility.getFactoial(2));
        assertEquals(6, MathUtility.getFactoial(3));
        assertEquals(24, MathUtility.getFactoial(4));
        assertEquals(120, MathUtility.getFactoial(5));
    }
    
    // Thấy ngoại lệ mừng rơi nước mắt
    // Test case #5: Check getF() with n = -1, the method throw Exception
    @Test
    public void testFactorialGivenWrongArgNegative1ThrowException() {
        
        assertThrows(IllegalArgumentException.class, 
                     () -> {MathUtility.getFactoial(-1);});
    }
}
