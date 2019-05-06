package com.javarush.task.task06.task0613;

/* Кот и статика */

public class Solution {
    public static void main(String[] args) {
        // Создай 10 котов
        //int catCoun = 0;
        while (Cat.catCount < 10){
            Cat cat = new Cat();

        }
        System.out.println(Cat.catCount);

        // Выведи значение переменной catCount
    }

    public static class Cat {
        // Создай статическую переменную catCount
        public static int catCount;

        public Cat(){
            catCount++;
        }

        // Создай конструктор
    }
}
