package com.javarush.task.task03.task0320;


/* 
Скромность украшает программиста
*/

import java.io.*;
import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        //String sAge = bufferedReader.readLine();
        //int nAge = Integer.parseInt(sAge);
        System.out.println(name +" зарабатывает $5,000. Ха-ха-ха!");

    }
}
