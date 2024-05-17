package com.epam.rd.autotasks.snail;
import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int uf=sc.nextInt();
		int df=sc.nextInt();
		int hf=sc.nextInt();
		int count=0;
		int initial=0;
		if(uf==df && uf<hf) {
			System.out.println("Impossible");
		}
		else if(uf>hf) {
			System.out.println(1);
		}
		else {
		for(int i=initial;i<=hf;i++) {
			initial=initial+(uf-df);
			if(initial>=hf) {
				break;
			}
			else {
				count++;
			}
		}
		System.out.println(count);
	}
	}
}