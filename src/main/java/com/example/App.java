package com.example;
 
public class App {
    public static String fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number of terms cannot be negative");
        }
        StringBuilder result = new StringBuilder();
        long a = 0;
        long b = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(a);
            long next = a + b;
            a = b;
            b = next;
        }
        return result.toString();
    }
 
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
}