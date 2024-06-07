/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mittogi.mathutil.main;

import com.mittogi.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author PHAT-CL
 */
public class MathUtil {
    
    public static void main(String[] args) {
        //Cách 2: Test hàm bằng cách pop up
        int n = 0;
        long expectiveValue = 1;
        long actualValue; // = ?? // Chờ hàm trả về
        actualValue = MathUtility.getFactoial(n);
        
        String result = n + "! | Expected: " + expectiveValue
                            + " | Actual: " + actualValue;
        
        JOptionPane.showMessageDialog(null, result);
    }

//    public static void main(String[] args) {
//        //Test case #01
//        //N = 0, Expective Value = 1, Actual Value = ??? Status = Passed/Failed
//        int n = 0;
//        long expectiveValue = 1;
//        long actualValue; // = ?? // Chờ hàm trả về
//   
//        actualValue = MathUtility.getFactoial(n);
//        System.out.println("0! | Expected: " + expectiveValue
//                            + " | Actual: " + actualValue);
//        
//        //Test case #02
//        //N = 1, Expective Value = 1, Actual Value = ??? Status = Passed/Failed
//        n = 1;
//        expectiveValue = 1;
//        
//        actualValue = MathUtility.getFactoial(n);
//        System.out.println("1! | Expected: " + expectiveValue
//                            + " | Actual: " + actualValue);
//        
//        //Test case #03
//        //N = 1, Expective Value = 1, Actual Value = ??? Status = Passed/Failed 
//        n = 5;
//        expectiveValue = 120;
//        
//        actualValue = MathUtility.getFactoial(n);
//        System.out.println("5! | Expected: " + expectiveValue
//                            + " | Actual: " + actualValue);
//        
//        //Test case #04
//        //N = -1, Expective Value = IllegalArgumentException, Actual Value = ??? Status = Passed/Failed 
//        System.out.println("Check if the Illegal Argument Exception is throw");
//        n = -1;
//        
//        actualValue = MathUtility.getFactoial(n);
//        System.out.println("5! | Expected: " + expectiveValue
//                            + " | Actual: " + actualValue);
//    }
    
    
}
