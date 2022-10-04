package interview;

import java.util.Scanner;

public class SumOfFactors {
	public static void main(String arga[]) {
		int num,  sum=0; 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		num=sc.nextInt();//accepting no in form of integer
		
		
		for(int i=1;i<=num;i++){
			if(num%i==0) {
				sum=sum+i;
				System.out.println("foctors of no is:"+ i);
			}
		}
		
		System.out.println("sum:"+sum);
	}

}
