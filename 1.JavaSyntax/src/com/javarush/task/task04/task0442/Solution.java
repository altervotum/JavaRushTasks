package com.javarush.task.task04.task0442;
/*
Суммирование
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int iNum = Integer.parseInt(reader.readLine());
        while (true){
            int num = Integer.parseInt(reader.readLine());
            sum += num;
            if (num == -1){
                System.out.println(sum);
                break;
            }
        }
    }
}
