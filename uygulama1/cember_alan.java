package com.example.uygulama1;

import java.util.Scanner;

public class cember_alan {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);


        System.out.print("yarı çapı giriniz");
        float y_cap=oku.nextFloat();


        System.out.println("alan="+3.14*y_cap*y_cap +"  cevre="+2*3.14*y_cap);
    }
}
