/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcounting;

import java.util.Random;

/**
 *
 * @author SHAMIM
 */
public class TestCounting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        int a[] = new int[10];
//        
//        int x;
//        
//        for(int i = 0; i < 10; i++)
//        {
//            for(int j = 0; j < 10; j++)
//            {
//                Random ran = new  Random();
//                x = ran.nextInt(10);
//                System.out.println("random value = " + x);
//                a[x]++;
//            }
//        }
//        int sum = 0;
//        int b = 0;
//        for (int i : a) {
//            sum += i;
//            System.out.println(b + " = " + i);
//            b++;
//        }
//        System.out.println("Total Value = " + sum);
        
        String s = "aaabbbcccAAABBBCCC";
        int[] c = new int[122]; 
        for (int i = 0; i < s.length(); i++) {
            int p = (int) s.charAt(i);
            c[p]++;
        }
        
        int csum = 0;
        int j = 0;
        for (int i : c) {
            csum += i;
            System.out.println((char)j + " = " + i);
            j++;
        }
        
    }
    
}
