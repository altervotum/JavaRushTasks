package com.javarush.task.task04.task0404;

/* 
Учет котов
*/

public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
        //напишите тут ваш код
        Cat cat = new Cat();
        Cat.catsCount++;
        System.out.println(Cat.catsCount);


    }

    public static void main(String[] args) {
       // System.out.println(Cat.catsCount);
        addNewCat();
    }
}
