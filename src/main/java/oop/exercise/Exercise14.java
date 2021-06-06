package oop.exercise;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Exercise14
{
    static Scanner input = new Scanner(System.in);
    static final float STATE_TAX = 0.055F;
    public static String getOrder() {
        System.out.print("What is the order amount? ");
        return input.nextLine();
    }
    public static String getState() {
        System.out.print("What is the state? ");
        return input.nextLine();
    }
    public static void getTotal(String a, String state){
        int subtotal = Integer.parseInt(a);
        float tax = subtotal * STATE_TAX;
        float total = subtotal + tax;

        Locale convert = new Locale("en", "US");
        NumberFormat printDollar = NumberFormat.getCurrencyInstance(convert);

        String taxState = "The total is " + printDollar.format(subtotal) + ".";

        if(state.equals("WI"))
        {
            taxState = "The subtotal is " + printDollar.format(subtotal) +
                    "\nThe tax is " + printDollar.format(tax) +
                    "\nThe total is " + printDollar.format(total) + ".";
        }

        System.out.print(taxState);

    }
    public static void main( String[] args ) {
        String amount = getOrder();
        String state = getState();
        getTotal(amount, state);
    }
}
