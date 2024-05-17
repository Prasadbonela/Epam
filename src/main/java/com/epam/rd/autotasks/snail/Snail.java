package com.epam.rd.autotasks.snail;
import java.util.*;

public class Snail {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int days = 0;
        int workdone = 0;
        if (a == b) {
            System.out.println("Impossible");
        } 
        else {
            days = (h - b) / (a - b);
            if ((h - b) % (a - b) != 0) {
                days += 1;
            }
        System.out.println(days);
    }
}
}