package interview;

import java.util.Scanner;

public class PrimeNoGvnInterval {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st no");
	int start=sc.nextInt();
	System.out.println("enter end no");
	 int end=sc.nextInt();
	 
	 
	 for(int n=start;n<=end;n++)  {
		 boolean b=true;
	 for( int i=2;i<n;i++) 
	        {
		 if(n%i==0) {
			 
		 
			 b=false;
		 
		 break;
		 
	      }
		 
	 }
	 if(b)
		 System.out.println(n);
}
}
}