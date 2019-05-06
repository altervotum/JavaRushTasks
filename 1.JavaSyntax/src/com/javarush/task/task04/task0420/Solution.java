package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int iA = Integer.parseInt(reader.readLine());
        int iB = Integer.parseInt(reader.readLine());
        int iC = Integer.parseInt(reader.readLine());
        int max = Math.max(Math.max(iA,iB),Math.max(iB,iC));
        int min = Math.min(Math.min(iA,iB),Math.min(iB,iC));
        int mid = iA+iB+iC - (max+min);
        System.out.println(max + " " + mid + " " + min);


        }

    }