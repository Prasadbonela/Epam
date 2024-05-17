package com.epam.rd.autotasks.snail;
import java.util.*;

public class Snail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int uf=sc.nextInt();
		int df=sc.nextInt();
		int hf=sc.nextInt();
		int count=0;
		int initial=0;
		if((uf==df || uf<df)&&(uf<hf)) {
			System.out.println("Impossible");
		}
		else if(uf>hf) {
			System.out.println(1);
		}
		else {
			initial=(hf-df)/(uf-df);
			if((hf-df)%(uf-df)!=0) {
				initial++;
			}
		System.out.println(initial);
	}
	}
}