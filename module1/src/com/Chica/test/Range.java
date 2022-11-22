package com.Chica.test;

public class Range {
    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] result = new int[to-from];
        for (int i=0; i< result.length; i++){
            result[i] = arr[i+from];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] res = copyOfRange(arr, 1,5);

        // check result
        for (int i = 0; i < res.length ; i++) {
            System.out.println(res[i]);
        }
    }
}
