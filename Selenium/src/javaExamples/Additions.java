package javaExamples;

import java.util.Scanner;

public class Additions {
public static void main(String args[]) {
	float a,b,c;
	Scanner obj=new Scanner(System.in);//System.in for entering value from Keyboard
	                                        //Scanner=for reading the value
	System.out.println("enter the value of a & b");
	a=obj.nextInt();//nextint() for validating the no is integer or not
	b=obj.nextInt();
	c=a+b;
	System.out.println("value of addition"+c);
	
}

}
 
	
