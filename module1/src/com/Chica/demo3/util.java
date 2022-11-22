package com.Chica.demo3;

import java.util.ArrayList;

public class util {
    private util(){

    }

    static int maxAge(ArrayList<Student> arr){
        int max = 0;
        for (int i = 0; i <arr.size() ; i++) {
            Student s = arr.get(i);
            if (s.getAge() > max){
                max = s.getAge();
            }

        }
        return max;
    }
}
