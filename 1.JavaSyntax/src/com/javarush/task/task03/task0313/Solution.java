package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        /*System.out.println("МамаМылаРаму");
        System.out.println("МамаРамуМыла");
        System.out.println("МылаМамаРаму");
        System.out.println("МылаРамуМама");
        System.out.println("РамуМамаМыла");
        System.out.println("РамуМылаМама");
        //напишите тут ваш код */
        String arra[]=new String[3];
        arra[0]="Мама";
        arra[1]="Мыла";
        arra[2]="Раму";
        for (int a=0;a<3;a++) {
            for (int b = 0; b < 3; b++) {
                for (int c = 0; c < 3; c++) {
                    if (c != b && b!=a && c!=a)
                        System.out.println(arra[a]+arra[b]+arra[c]);
                }
                //System.out.println();
            }
        } //System.out.println();
    }}