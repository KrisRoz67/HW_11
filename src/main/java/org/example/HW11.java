package org.example;

import java.util.*;

public class HW11 {
    public static void main(String[] args) {
        HW11 main = new HW11();
        System.out.println("-------------------1-----------------");
        System.out.println(main.maxDuplicate(List.of(1, 2, 3)));
        System.out.println(main.maxDuplicate(List.of(1, 2, 2)));
        System.out.println(main.maxDuplicate(List.of(1, 2, 2, 3, 1)));
        System.out.println("-------------------2-----------------");
        System.out.println(main.wordNumeration(new ArrayList<>(List.of("hi", "hi", "welcome"))));
        System.out.println(main.wordNumeration(new ArrayList<>(List.of("Hi", "hi", "welcome", "no", "hI", "HI"))));
        System.out.println("-------------------3-----------------");
        System.out.println(main.makeBricks(3, 1, 8));
        System.out.println(main.makeBricks(3, 1, 9));
        System.out.println(main.makeBricks(3, 2, 10));
    }

    /**
     * Первый вариант решения
     * public Integer maxDuplicate(List<Integer> nums) {
     * List<Integer> num = new ArrayList<>();
     * int count = 1;
     * for (int i = 0; i < nums.size(); i++) {
     * for (int y = i + 1; y < nums.size(); y++) {
     * if (nums.get(i).equals(nums.get(y))) {
     * count++;
     * }
     * if (count > 1) {
     * num.add(nums.get(i));
     * count = 1;
     * }
     * <p>
     * }
     * }
     * if (num.isEmpty()) {
     * return null;
     * }
     * return Collections.max(num);
     * }
     **/

    public Integer maxDuplicate(List<Integer> nums) {
        Set<Integer> setOfInt = new HashSet<>();
        List<Integer> duplicate = new ArrayList<>();
        for (Integer n : nums) {
            if (!setOfInt.add(n)) {
                duplicate.add(n);
            }
        }
        if (duplicate.isEmpty()) {
            return null;
        } else {
            return Collections.max(duplicate);
        }
    }

    public List<String> wordNumeration(List<String> words) {
        int count = 1;
        String str;
        for (int i = 0; i < words.size(); i++) {
            str = words.get(i);
            if (!str.contains("#")) {
                words.set(i, str + "#" + count);
            }
            for (int y = i + 1; y < words.size(); y++) {
                String nextStr = words.get(y);
                if (nextStr.equalsIgnoreCase(str)) {
                    count++;
                    words.set(y, nextStr + "#" + count);
                }
            }
            count = 1;
        }
        return words;
    }

    public boolean makeBricks(int small, int big, int goal) {
        int qtyNeededBig = goal / 5;
        int qtyLeft;
        if (qtyNeededBig >= big) {
            qtyLeft = goal - big * 5;
        } else {
            qtyLeft = goal - qtyNeededBig * 5;
        }

        return (qtyLeft == 0 || qtyLeft <= small);
    }
}