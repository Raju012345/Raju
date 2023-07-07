package main;

import java.util.Scanner;

public class SecondstoHours {

    public static void main(String[] args)
    {
        // create object of scanner class.
        Scanner in = new Scanner(System.in);

        // enter the seconds here.
        System.out.print("Enter seconds : ");

        int seconds = in.nextInt();

        int t1 = seconds % 60;
        int t2 = seconds / 60;
        int t3 = t2 % 60;

        t2 = t2 / 60;

        System.out.print("HH:MM:SS - " +t2 + ":" + t3 + ":" + t1);
        System.out.print("\n");
    }

}
