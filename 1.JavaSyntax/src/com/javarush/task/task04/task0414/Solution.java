package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String X = reader.readLine();
        int iX = Integer.parseInt(X);


        if ((iX % 400 != 0) && (iX % 100 == 0) || iX % 4 != 0)
            System.out.println("количество дней в году: 365");
        else
            System.out.println("количество дней в году: 366");

    }
}