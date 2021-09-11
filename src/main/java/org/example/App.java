package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */
public class App 
{
    public static void main( String[] args )
    {
        //Q_5
        Scanner sc = new Scanner(System.in);
        String n1, n2;
        int a, b, sum, sub, mul, quo;

        System.out.print("What is the first number? ");
        n1 = sc.nextLine();
        System.out.print("What is the second number? ");
        n2 = sc.nextLine();

        a = Integer.parseInt(n1);
        b = Integer.parseInt(n2);
        sum = a + b;
        sub = a - b;
        mul = a * b;
        quo = a / b;

        System.out.println(n1 + " + " + n2 + " = " + sum + "\n" +
                n1 + " - " + n2 + " = " + sub + "\n" +
                n1 + " * " + n2 + " = " + mul + "\n" +
                n1 + " / " + n2 + " = " + quo + "\n");
    }
}
