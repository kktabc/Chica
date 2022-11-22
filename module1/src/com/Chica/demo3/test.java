package com.Chica.demo3;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(45);
        Student s2 = new Student();
        s2.setAge(29);
        Student s3 = new Student();
        s3.setAge(39);

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        System.out.println("max age is:" + util.maxAge(arr));

    }
}
