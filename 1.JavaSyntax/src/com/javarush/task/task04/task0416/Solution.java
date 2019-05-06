package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        String st = reader.readLine();
        double t = Double.parseDouble(st);
        double i = 0;
        do{
            if ((t>=i)&&(t<(i+3)))
                System.out.println("зелёный");
            else
            if ((t>=(i+3))&&(t<(i+4)))
                System.out.println("жёлтый");
            else
            if ((t>=(i+4))&&(t<(i+5)))
                System.out.println("красный");
            i+=5;
        }
        while (i<=t);
    }
}