package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n = 10;
        int m = 10;
        while (n > 0){
            m = 10;
            while (m>0){

                System.out.print("S");
                m--;
            }
            System.out.println();
            n--;
        }

    }
}
