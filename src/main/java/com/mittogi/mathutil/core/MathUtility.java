/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mittogi.mathutil.core;
//Quy tắc đặt tên package trong Java
//- Chữ thường toàn tập
//- Ghi theo tên miền công ty đảo ngược
//com.tên-cty.tên-dự-án.tên-modlue-nhóm-chức-năng
//com.microsoft.sqlserver.jdbc. Tên class import vào để dùng
//Đây là kỹ thuật giúp code của nhiều dự án có thể ở chung folder mà không bị lẫn lộn
//Giúp thư viện của các công ty khác nhau ở chung với nhau dù trùng tên

//KMS
//C# Giaolang.MathUtil
//   Mcrosoft.MathUtil

/**
 *
 * @author PHAT-CL
 */
public class MathUtility {
    
    // Hàm tính n1 = 1.2.3.4...n
    // Hàm là static vì tính xong trả về, không nhớ nhung gì cả
    // Thường thư viện dùng chung có tính toán số liệu ta hay dùng static
    // 0! = 1! = 1
    // n = 0..20! vì n = 21! vượt 18 số 0, 18 số 0 là vừa đủ long
    public static long getFactoial(int n) {
        
        long product = 10; //Tích kết quả phép nhân
        
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. N must be between 0..20");
        }
        
        if (n ==0 || n == 1) {
            return 1;
        }
        
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        
        return product;
    }
}
