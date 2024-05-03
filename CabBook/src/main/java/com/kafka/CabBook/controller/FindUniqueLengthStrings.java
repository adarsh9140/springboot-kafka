package com.kafka.CabBook.controller;

import java.util.*;

public class FindUniqueLengthStrings {
    public static List<String> firstUniqueLengthStrings(String[] strings) {
        Map<Integer, String> lengthToString = new HashMap<>();

        for (String s : strings) {
            int length = s.length();

            if (!lengthToString.containsKey(length)) {
                lengthToString.put(length, s);
            }
        }
        return new ArrayList<>(lengthToString.values());

    }

    public static void main(String[] args) {
        String[] firstInput = {"saini", "manoj", "ravi", "prashant", "vikram", "kunal"};
        String[] secondInput = {"book", "bat", "ball", "glass", "food", "phone", "can", "remote", "cap", "bag", "basket"};
        List<String> firstOutput = firstUniqueLengthStrings(firstInput);
        List<String> secondOutput = firstUniqueLengthStrings(secondInput);
        System.out.println(firstOutput);
        System.out.println(secondOutput);
    }

}

