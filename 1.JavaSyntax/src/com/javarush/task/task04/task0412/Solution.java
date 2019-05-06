package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int iA = Integer.parseInt(sA);
        if (iA==0)
        {
            System.out.println("0");
        }
        if (iA > 0)
        {iA = iA*2;
            System.out.println(iA);}
        if (iA <0)
        {iA=iA+1;
            System.out.println(iA); }




    }

}