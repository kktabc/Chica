package com.Chica.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest5 {
    public static void main(String[] args) {
        Random r = new Random();
        // 生成1-100之间的随机数
        int number = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("make a guess");
            int guess = sc.nextInt();
            if (guess > number){
                System.out.println("try smaller");

            }
            else if (guess < number){
                System.out.println("try larger");

            }
            else{
                System.out.println("bingo!");
                break;
            }
            System.out.println("make a guess:");

        }



        // 生成任意数之间的随机数
        // 7~15
        // 先变成0开始 -> 0-8
        // 再尾部加1 0 - 9
        // 最后随机数结果再加7


    }
}
