package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        int iA = Integer.parseInt(sA);
        int iB = Integer.parseInt(sB);
        int iC = Integer.parseInt(sC);
        if (iA == iB) System.out.println("3");
        else if (iA == iC) System.out.println("2");
        else if (iB == iC) System.out.println("1");

    }
}
