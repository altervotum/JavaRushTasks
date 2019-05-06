package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB = reader.readLine();
        int i1 = Integer.parseInt(sA);
        int i2 = Integer.parseInt(sB);

        if (i1>0 && i2 >0) System.out.println("1");
        else if (i1<0 && i2>0) System.out.println("2");
        else if (i1<0 && i2<0) System.out.println("3");
        else if (i1>0 && i2<0) System.out.println("4");
    }
}
