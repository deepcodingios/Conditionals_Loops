package com.pradeep;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        /*
        Syntax of For Loop. Generally a For loop is used when we know about the number of times the loop repeats
         */
        for (int num = 1; num <= 5; num++){
            System.out.print(num + " ");
        }
        /*
        Syntax of While Loop. Use a While Loop when you don't know about how many times a loop will be running.
         */
        int num = 1;
        while (num <= 5){
            System.out.print(num);
            num += 1;
        }

        /*
        Syntax of do-while loop. Use do-while when the condition has to be executed at least once.
         */
        int number = 1;
        do {
            System.out.println("Hello World");
        }while (number != 1);

    }
}
