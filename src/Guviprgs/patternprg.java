package Guviprgs;

import java.util.Scanner;

public class patternprg {
    public static void main(String[] args) {
        int rows=5;
        int column=5;
        for(int i=1;i<=rows;i++){
            for(int j=column;j>column-i;j--){
                System.out.print(j);
            }


                for(int j=1; j<=column-i; j++)
                {
                    System.out.print((rows - i + 1));
                }

            System.out.print("\n");
            }

            }
        }









