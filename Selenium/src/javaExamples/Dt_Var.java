package javaExamples;

public class Dt_Var {
	int b=20; //instance vaariable
	static int empid=101;
public void m1() {
	//Dt/Vr
	int a=10;
	System.out.println("m1 executed");
	System.out.println(a+"local variable");
}
public void m2() {
	System.out.println("m2 Executed");
	System.out.println(b+"instance variable");
	System.out.println(empid+"static variable");
}
public void m3() {
	System.out.println("m3 executed");
	System.out.println(empid+"static variable");
}

	public static void main(String[] args) {
		
		Dt_Var obj=new Dt_Var();
		System.out.println("main method executed");
		obj.m1();
		obj.m2();
		obj.m3();
		
	}

}
