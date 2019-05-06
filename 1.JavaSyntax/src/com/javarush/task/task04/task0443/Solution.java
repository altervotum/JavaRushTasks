package com.javarush.task.task04.task0443;
/*
Как назвали, так назвали
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sName = reader.readLine();
        String sYear = reader.readLine();
        String sMonth = reader.readLine();
        String sDay = reader.readLine();
        System.out.println("Меня зовут " + sName + ".");
        System.out.println("Я родился " + sDay + "." + sMonth + "." + sYear);
    }
}
