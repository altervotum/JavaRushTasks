package com.javarush.task.task08.task0801;
/* HashSet из растений*/
import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> s = new HashSet<>();
        s.add("арбуз");
        s.add("банан");
        s.add("вишня");
        s.add("груша");
        s.add("дыня");
        s.add("ежевика");
        s.add("женьшень");
        s.add("земляника");
        s.add("ирис");
        s.add("картофель");

        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());


    }
}
