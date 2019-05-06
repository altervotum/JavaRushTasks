package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine();
        String num1 = bufferedReader.readLine();
        String num2 = bufferedReader.readLine();
        System.out.println(name+" получает "+ num1+ " через "+num2+" лет.");
        //"Имя" получает "число1" через "число2" лет.
    }
}
