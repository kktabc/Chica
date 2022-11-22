package com.Chica.test;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.append("abc");
        int a = 1;
        sb.append(a);
        String str = sb.toString();
        System.out.println(str);


    }
}
