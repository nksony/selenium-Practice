package javaExamples;

public class Exam_Throw {
	
	public static void checkNum(int num) {
		if(num<1){
		//throw new ArithmeticException("\nPlease always give positive number to avoid Arithmatic exception");
			System.out.println("Negetive number not allowed");
		}else {
			System.out.println("Square of" +num+ "is" + (num*num));
		}
	}
	
public static void main(String args[]) {
	Exam_Throw th = new Exam_Throw();
	th.checkNum(-3);
}
}
