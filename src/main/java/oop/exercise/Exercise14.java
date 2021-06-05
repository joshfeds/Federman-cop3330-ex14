package oop.exercise;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */
/*What is the order amount? 10
        What is the state? WI
        The subtotal is $10.00.
        The tax is $0.55.
        The total is $10.55.*/
public class Exercise14
{
    static Scanner input = new Scanner(System.in);
    public static String getOrder() {
        System.out.print("What is the order amount? ");
        return input.nextLine();
    }
    public static String getState() {
        System.out.print("What is the state? ");
        return input.nextLine();
    }
    public static String getTax() {
        System.out.print("What is the state? ");
        return input.nextLine();
    }
    public static void main( String[] args ) {
        String amount = getOrder();
        String state = getState();
        String tax =
    }
}
