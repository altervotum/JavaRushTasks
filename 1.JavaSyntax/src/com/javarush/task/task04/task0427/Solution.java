package com.javarush.task.task04.task0427;
/*
Описываем числа
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b = reader.readLine();
        int a = Integer.parseInt(b);
        int len = b.length();
        if (a%2==0 && a>=1 && a <=999) {
            if (len ==1)
                System.out.println("четное однозначное число");
            if (len == 2)
                System.out.println("четное двузначное число");
            if (len == 3)
                System.out.println("четное трехзначное число");
        }
        if (a%2!=0 && a>=1 && a <=999){
            if (len ==1)
                System.out.println("нечетное однозначное число");
            if (len == 2)
                System.out.println("нечетное двузначное число");
            if (len == 3)
                System.out.println("нечетное трехзначное число");

        }




    }
}
