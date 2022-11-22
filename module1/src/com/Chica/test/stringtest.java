package com.Chica.test;

public class stringtest {
    public static void main(String[] args) {
        // 通过new 新建字符串
        String s2 = new String("abc");
        System.out.println(s2);

        // 传递一个字符数组
        ;
        String s4 = "Abc";
        System.out.println(s2==s4);
        System.out.println(s2.equals(s4));
        System.out.println(s2.equalsIgnoreCase(s4));
    }
}
