package interview;

//import java.util.Scanner;

public class CheckAllPrimeNoInBtwn {
	public static void main(String args[]) {
	
		 for(int n=1;n<=1000;n++) {
			 boolean b=true;

			for(int i=2;i<n;i++) {
				
				
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