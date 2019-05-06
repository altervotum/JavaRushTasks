package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sName = reader.readLine();
        String sAge = reader.readLine();
        int iAge = Integer.parseInt(sAge);

        if (iAge > 20)
            System.out.println("И 18-ти достаточно");



    }
}
