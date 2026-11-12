package org.example;

// Sprint 13 - Gün 2
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        int n = Math.abs(number);
        int original = n;
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String digits = String.valueOf(number);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < digits.length(); i++) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(words[digits.charAt(i) - '0']);
        }
        return result.toString();
    }
}
