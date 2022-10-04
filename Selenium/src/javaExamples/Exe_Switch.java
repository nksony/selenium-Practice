package javaExamples;

import java.util.Scanner;

public class Exe_Switch {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Substaction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		System.out.println("enter the 1st Nummber");
		int a=obj.nextInt();
		System.out.println("enter 2nd number");
		int b=obj.nextInt();
		System.out.println("enter the choice");
		int ch=obj.nextInt();
		switch(ch){
		case 1:
		System.out.println(a+b);
		break;
		
		case 2:
			System.out.println(a-b);
			break;
			
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println("value is:"+ (a/b));
			break;
			default:
				System.out.println("default choice");
				
		}
			
		
				
	}

}