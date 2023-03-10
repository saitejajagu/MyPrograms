package com.testingautomation;

import java.util.Scanner;

public class addtionofnumbers {
        public static void main(String[] args)
        {
            int a,b;
            Scanner s=new Scanner(System.in);
            System.out.println("enter the value of a:");
            a=s.nextInt();
            System.out.println("enter the value of b:");
            b=s.nextInt();
            int c=a+b;
            System.out.println("addition of two numbers is:"+c);
        }
    }

