package com.javarush.task.task06.task0611;

/* Класс StringHelper*/

public class StringHelper {
    public static String multiply(String s) {
        String result = s;
        //напишите тут ваш код
        for (int i = 0; i <= 5; i++)
        {result = result + s;}
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for (int i =  0; i <= count; i++)
        //напишите тут ваш код
        {result = result + s;}
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("test",10));

    }
}
