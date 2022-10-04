package interview;

import java.util.Scanner;

public class PerfectNoInBtwn {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st no");
		int n=sc.nextInt();
		System.out.println("enter 2nd no");
		n=sc.nextInt();

		for (n=1;n<=10000;n++) {

			int sum=0;
			for(int i=1;i<n;i++) {

				if(n%i==0)
					sum=sum+i;
			}
			if(sum==n)
				System.out.println("perfect no :"+n);
		}


	}


}