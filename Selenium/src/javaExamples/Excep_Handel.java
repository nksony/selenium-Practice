package javaExamples;

public class Excep_Handel {

	public static void main(String[] args) {
		try {
			int a[]= {10,20,30,40,50,60};//arrey
			System.out.println(a[12]);
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}

	}

}
