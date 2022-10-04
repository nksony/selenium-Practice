package javaExamples;

import java.util.Scanner;

public class PrimeNo {

	
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter no");
		int n=obj.nextInt();
		
		int count=0;
		for( int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime no");
		}
		else {
			System.out.println("not a prime no");
		}
			
	}
	
	}