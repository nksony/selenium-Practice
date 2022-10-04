package javaExamples;

import java.util.Scanner;

public class SwapWithoutTemp {
int a,b;
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter value for a");
		int a=obj.nextInt();
		System.out.println("enter value for b");
		int b=obj.nextInt();
		
		a=a+b;
		System.out.println("value of A:" +a);
		b=a-b;
		System.out.println("value of B" +b);
		
		a=a-b;
		System.out.println("value of A" +a);
		
		
		
	}
		
}
