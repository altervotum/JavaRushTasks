package com.javarush.task.task05.task0532;
import java.io.*;
/* Задача по алгоритмам*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            int maximum = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int number = Integer.parseInt(reader.readLine());
                if (number > maximum)
                    maximum = number;
            }

            //напишите тут ваш код

            System.out.println(maximum);
        }
    }
}
