package com.Chica.test;

public class twoDArray {
    public static void calculateSum(int[][] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
            System.out.println(total);
            total = 0;
        }

    }
    public static void main(String[] args) {
        // 初始化
//        int[][] arr1 = {{1,2,3},{4,5,6}};
//        int [][] arr2 = {
//                {1,2,3},
//                {4,5,6,7,8}
//        };

        int[][] arr1 = new int[4][];

        arr1[0] = new int[] {22, 66, 44};
        arr1[1] = new int[] {77,33,88};
        arr1[2]= new int[] {25,45,66};
        arr1[3] = new int[] {11,66,99};

        calculateSum(arr1);

        // 获取元素
//        System.out.println(arr2[1].length);

        // 遍历
//        for (int i = 0; i < arr2.length; i++) {
//
//            for (int j = 0; j <arr2[i].length ; j++) {
//                System.out.print(arr2[i][j]+ " ");
//            }
//            System.out.println();
//        }
    }
}
