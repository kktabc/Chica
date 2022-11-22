package com.Chica.test;

public class ArrayTest {
    public static void main(String[] args) {
        // 数据类型 [] 数组名
        // int [] array
        //  数据类型 数组名[]
        // int array[]
        // 静态初始化
//        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
//        int count = 0;
//        //System.out.println(array1);
//        // 直接打印数组会得到的是数组的地址值
//        for (int i=0;i< array1.length; i++) {
//            if (array1[i] %2 == 0){
//                array1[i] /= 2;
//
//            }
//            else{
//                array1[i] *= 2;
//            }
//        }
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println(array1[i]);
//        }
        // 动态初始化
        int[] arr2 = {1,2,3,4,5,6};
        for (int i = 0; i < arr2.length/2; i++) {
            int tmp = arr2[i];
            arr2[i] = arr2[arr2.length-i-1];
            arr2[arr2.length-i-1] = tmp;

        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
