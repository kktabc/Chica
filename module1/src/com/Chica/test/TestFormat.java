package com.Chica.test;

import java.text.NumberFormat;
import java.util.Locale;

public class TestFormat {
    public static void main(String[] args) {

        String format = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(1123.75 );
        System.out.println(format);
    }
}
