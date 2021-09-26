package com.kunal;

import java.util.Scanner;

public class IfConditions{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a+b==10){
            System.out.println("Hello World");
        }
        else{
            System.out.println("Less than 10");
        }
    }
}