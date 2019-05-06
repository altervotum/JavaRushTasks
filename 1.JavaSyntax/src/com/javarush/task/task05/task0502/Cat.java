package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if ((this.age + this.strength + this.weight) > (anotherCat.weight + anotherCat.strength + anotherCat.age ))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

    }
}
