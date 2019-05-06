package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sX = reader.readLine();
        int iX = Integer.parseInt(sX);
        if (iX == 1) System.out.println("понедельник");
        if (iX == 2) System.out.println("вторник");
        if (iX == 3) System.out.println("среда");
        if (iX == 4) System.out.println("четверг");
        if (iX == 5) System.out.println("пятница");
        if (iX == 6) System.out.println("суббота");
        if (iX == 7) System.out.println("воскресенье");
        if (iX > 7) System.out.println("такого дня недели не существует");
        if (iX < 1) System.out.println("такого дня недели не существует");
    }
}