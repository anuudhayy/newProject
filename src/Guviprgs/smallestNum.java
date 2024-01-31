package Guviprgs;

import java.util.Scanner;

public class smallestNum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the First number");
        int a=scanner.nextInt();
        System.out.println("Enter the second num");
        int b=scanner.nextInt();
        System.out.println("Enter the third num");
        int c=scanner.nextInt();
        if(a<b && a<c) {
            System.out.println("a is the smaller no");
        } else if (b<c && b<a) {
            System.out.println("b is the smaller no");

        }
        else {
                System.out.println("c is the smaller no");
        }
}
}