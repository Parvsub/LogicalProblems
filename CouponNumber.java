package com.LogicalProblems;

public class CouponNumber {
    public static void main(String[] args) {
        char[] characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int random = (int) (Math.random() * 10000000);      // to get the random numbers
        StringBuffer stringBuffer = new StringBuffer();     // To create mutable string objects

        while (random > 0) {
            stringBuffer.append(characters[random % characters.length]);
            random /= characters.length;
        }

        String couponCode = stringBuffer.toString();
        System.out.println("Coupon Code: " + couponCode);
    }
}