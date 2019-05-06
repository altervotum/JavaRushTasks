package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name){
    this.name = name;
    age = 12;
    weight =4;
    color = "red";
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight =weight;
        color = "red";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        weight =4;
        color = "red";
    }

    public Cat(int weight, String color){
        //this.name = name;
        age = 12;
        this.weight =weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address){
        age = 12;
        this.weight =weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
