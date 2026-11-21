package org.example;

import java.util.Scanner;

public class test {
    public static void main(String[]args)
    {
        System.out.println("Enter value of b:");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        System.out.println("Enter value of c:");
        int c = a.nextInt();
        System.out.println("Enter a divisior e:");
        int e = a.nextInt();
        if(b%e==0 && c%e==0)
        {
            System.out.println("GCD of Two Number :"+e);

        }
        else {
            System.out.println("Not found ");
        }
    }

}
