package Guviprgs;

import java.util.Scanner;

public class task1Prg3 {
    public static void main(String[] args) {
        int reverse=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        System.out.println("The Entered number is:"+num);
        while (num!=0){
            int remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;

        }
        System.out.println("the reversed  num is:"+reverse);
    }
}
