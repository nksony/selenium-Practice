package interview;

import java.util.Scanner;

public class PerfectNoInGivenInterval {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter starting no");
	int start=sc.nextInt();
	System.out.println("enter end no");
	int end=sc.nextInt();

	
	for( int n=start;n<=end;n++) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
				sum=sum+i;
		}
		
		if(sum==n)
			System.out.println(n);
	}
			
			
}
}
