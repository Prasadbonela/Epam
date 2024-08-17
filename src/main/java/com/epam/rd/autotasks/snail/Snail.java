package com.epam.rd.autotasks.snail;
import java.util.*;

public class Snail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int u = sc.nextInt();
		int d = sc.nextInt();
		int h = sc.nextInt();

		if((u<h) && (u<=d)){
			System.out.println("Impossible");
		}
		else if (u>h) {
			System.out.println(1);
		}
		else {
			int count=0;
			int days=0;
			for(int i=0;i<h;i++){
				days+=u;
				count++;
				if(days==h){
					break;
				}
				days-=d;
			}
			System.out.println(count);
		}
	}
}