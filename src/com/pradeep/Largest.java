package com.pradeep;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number_1 = input.nextInt();
        int number_2 = input.nextInt();
        int number_3 = input.nextInt();

        int max = number_1;
        if (number_2 > number_1){
            max = number_2;
        }
        if (number_3 > max) {
            max = number_3;
        }
        System.out.println(max);
    }
}
