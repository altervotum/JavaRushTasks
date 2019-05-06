package com.javarush.task.task08.task0802;
/* HashMap из 10 пар*/
import java.util.HashMap;
import java.util.Map;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashMap<String, String> ap = new HashMap<>();
        ap.put("арбуз", "ягода");
        ap.put("банан", "трава");
        ap.put("вишня", "ягода");
        ap.put("груша", "фрукт");
        ap.put("дыня", "овощ");
        ap.put("ежевика", "куст");
        ap.put("жень-шень", "корень");
        ap.put("земляника", "ягода");
        ap.put("ирис", "цветок");
        ap.put("картофель", "клубень");
        for (Map.Entry<String, String> p : ap.entrySet()){
            System.out.println(p.getKey() + " - " + p.getValue());
        }

    }
}
