package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int countBelowZero = 0;
        int countAfterZero = 0;
        if (a > 0){
            countAfterZero++;
        }
        else if(a != 0){
            countBelowZero++;
        }
        if (b > 0){
            countAfterZero++;
        }
        else if(b != 0){
            countBelowZero++;
        }
        if (c > 0){
            countAfterZero++;
        }
        else if(c != 0){
            countBelowZero++;
        }
        System.out.println("количество отрицательных чисел: " + countBelowZero);
        System.out.println("количество положительных чисел: " + countAfterZero);


    }
}
