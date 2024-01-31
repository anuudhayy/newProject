package Guviprgs;

import java.util.Scanner;

public class printTotalcost {
    public static void main(String[] args) {
        float totalamt,dicount,payable;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the amount");
        totalamt=scanner.nextFloat();
        if(totalamt<500){
            payable=totalamt;
            System.out.println("amount should be paid:"+payable);
            System.out.println("No discount is applied");
        } else if (totalamt>=500 && totalamt>=1000) {
            dicount=(totalamt*10)/100;
            payable=totalamt-dicount;
            System.out.println("amount should be paid:"+payable);
            System.out.println("Discount is applicable");


        }
        else{
            dicount=(totalamt*20)/100;
            payable=totalamt-dicount;
            System.out.println("amount should be paid:"+payable);
            System.out.println("Discount is applicable");
        }
    }
}
