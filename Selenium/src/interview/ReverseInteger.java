package interview;

public class ReverseInteger {
public static void main(String args[]) {
	int num=5678956;
	
    int rev=0;
    
   while(num>0) {
	  // num=num/10;
	  rev=rev*10+num%10;
	  num=num/10;
    	
    }
   System.out.println("reverse no is:"+rev);
  System.out.println("------------------------");
   //StringBuffer st=new StringBuffer();
 int num1=123456;
 System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
}


}