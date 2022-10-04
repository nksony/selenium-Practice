package interview;

import java.util.Scanner;

public class ToCheckPerfectNo {
	public static void main (String args[]) {
		int n,  sum=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		n=sc.nextInt();

		for(int i=1;i<n;i++) {

			if(n%i==0) {
				sum=sum+i;
			}

		}
		if(n==sum) 
			System.out.println("perfect no");
			
			else
				System.out.println("not aperfect no");
		

}
}