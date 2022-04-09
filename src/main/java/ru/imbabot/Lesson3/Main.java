package ru.imbabot.Lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static String[] words = {"a","a","a","a","c","d","e","z"};


    private static void wordUnique(String[]arr) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(arr[i], 1);
            } else if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for (Map.Entry<String, Integer> map1 : map.entrySet()){
            System.out.println(map1.getKey() + " " + map1.getValue());
        }
    }

    public static void main(String[] args) {
        wordUnique(words);
    }
}
