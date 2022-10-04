package javaExamples;

public class String_Palindrome {
public static void main(String aargs[]) {
	String str="mum";
	  String rev ="";
	  
	  int length=str.length();
	  
	  for (int i=length-1;i>=0;i--) {
		  rev=rev+str.charAt(i);
	  }
	  System.out.println("reversed string value is:"+rev);
	  if(str.equals(rev)){
		  System.out.println("String is palindrome");
	  }
	  else {
		  System.out.println("String is not a palinrome");
	  }
	 System.out.println("---------------------------");
	 
	 StringBuffer obj=new StringBuffer(str);
	 
	 System.out.println(obj.reverse());
    }

}
