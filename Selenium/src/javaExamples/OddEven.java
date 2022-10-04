package javaExamples;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int no;
		Scanner obj = new Scanner(System.in);// scanner(system.in)used for entering the no from keyboard
		System.out.println("enter any no");
		no = obj.nextInt();// verify that no is integer

		if (no % 2 == 0) { 

			System.out.println("no is even");
		}
		 else {
			System.out.println("no is odd");
		 }
		

	}

}
