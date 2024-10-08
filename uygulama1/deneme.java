package com.example.uygulama1;

import androidx.annotation.NonNull;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);



        System.out.print("cm değerini Giriniz");
        float cm=oku.nextFloat();


        System.out.println("cm"+cm*2.54 );

    }
}
