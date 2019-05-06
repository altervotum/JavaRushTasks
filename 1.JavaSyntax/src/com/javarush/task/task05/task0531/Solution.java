package com.javarush.task.task05.task0531;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* Совершенствуем функциональность*/
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int min = min(a, b, c, d, e);
        //int minimum = min(minimum1,e);

        System.out.println("Minimum = " + min);
    }


    public static int min(int a, int b, int c, int d, int e) {
        //return (a < b && a < c && a < d && a < e) ? a : ((b < a & b < c & b < d & b < e) ? b : ((c < a & c < b & c < d & c < e)? c : (d < a & d < b & d < c & d < e)? d : e));
        int min1 = Math.min(d, e);
        int min2 = Math.min((Math.min(a, b)), c);
        int min3 = Math.min(min1, min2);
        return min3;
    }
}
