package Guviprgs;

import java.util.Scanner;

public class task1Prg2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        System.out.println("The Entered number is:" +number);
        if(number>0){
            System.out.println("The number is positive");

        }
        else if (number<0){
            System.out.println("The number is negative");

        }
        else {
            System.out.println("The number is zero");
        }
    }
}
