package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int x = Integer.parseInt(reader.readLine());
        ///int i
        while (x>0){
            System.out.println(sA);
            x--;
        }

    }
}
