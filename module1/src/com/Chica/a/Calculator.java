package com.Chica.a;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
    /**
     * 等额本息方式计算每月还款金额
     * @param p 本金
     * @param mr 月利率
     * @param m 还款月数
     * @return 每月还款金额
     */
    static double calculate(double p, double mr, int m){
        double pow = Math.pow(1 +mr, m);
        return p * mr * pow / (pow-1);
    }

    static void printDetails(double p, double mr, int m, double payment){
        for (int i=0; i<m; i++){
            double payInterest = p * mr;
            double payPrincipal = payment - payInterest;
            p -= payPrincipal;
            System.out.println("month:" + (i + 1));
            System.out.println("pay by this month:" + NumberFormat.getCurrencyInstance().format(payment));
            System.out.println("principal this month:"+ NumberFormat.getCurrencyInstance().format(payPrincipal));
            System.out.println("interest this month:" + NumberFormat.getCurrencyInstance().format(payInterest));
            System.out.println("payment left:" + NumberFormat.getCurrencyInstance().format(p));

        }
        System.out.println("total payment:" + NumberFormat.getCurrencyInstance().format(payment * m));
        }

    static double inputAndCheckP(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 本金:");
        double p = scanner.nextDouble();
        while (p < 0) {
            System.out.println("your should input a valid value!");
            System.out.println("enter 本金:");
            p = scanner.nextDouble();
        }
        return p;
    }

    static double inputAndCheckMr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter year interest");
        double yr = scanner.nextDouble();
        while (yr > 36 ){
            System.out.println("not a valid value!");
            System.out.println("enter year interest");
            yr = scanner.nextDouble();
        }
        return yr/ 12.0 / 100;
    }

    static int inputAndCheckM(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter month:");
        int m = scanner.nextInt();
        while(m <=0 || m > 360){
            System.out.println("not a valid value!");
            System.out.println("enter month:");
            m = scanner.nextInt();

        }
        return m;
    }
    public static void main(String[] args) {
        double p = inputAndCheckP();
        double mr = inputAndCheckMr();
        int m = inputAndCheckM();

        double payment = calculate(p, mr, m);
        printDetails(p, mr, m, payment);


    }


}
