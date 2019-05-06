package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int h = number / 100;
        int d = (number - h * 100) / 10;
        int i = (number - (h * 100 + d*10));
        return number = h + d + i;
    }
}