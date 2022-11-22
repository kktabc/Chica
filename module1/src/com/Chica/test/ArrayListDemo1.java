package com.Chica.test;
import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 泛型 <E> 表示集合里存储数据类型
        // 打印时进过java处理会直接打印出集合里的内容而不是地址
        ArrayList<GrilFriend> gf = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add("hello");
        arr1.add("world");
        arr1.add("java");
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        System.out.println(arr1.size());
        System.out.println(arr1.get(2));
        System.out.println(arr2);
        GrilFriend g1 = new GrilFriend();
        gf.add(g1);


    }
}
