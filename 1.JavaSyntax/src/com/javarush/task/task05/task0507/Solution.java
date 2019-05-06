package com.javarush.task.task05.task0507;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Среднее арифметическое
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int count = 0;
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            int num = Integer.parseInt(reader.readLine());
            sum += num;
            int sum1 = sum + 1;
            count++;

            if (num == -1){
                System.out.println((double) (sum1)/(count-1));
                break;
            }

        }
    }
}

