package collectionFramewrk;

import java.util.ArrayList;

public class ArryList_Meethod {

	public static void main(String[] args) {
		
	ArrayList<String>ar1=new ArrayList<String>();
      ar1.add("Java");
      ar1.add("Python");
      ar1.add("Ruby");
      ar1.add("C#");
      
      ArrayList<String>ar2=new ArrayList<String>();
      ar2.add("Selenium");
      ar2.add("testing");
      ar2.add("Devops");
      
     // ar1.addAll(ar2);  For adding different ArrayList 
	
      //	System.out.println(ar1);
     //  	ar1.addAll( 2,ar2);
     // 	System.out.println(ar1);
     // 	ar1.clear();To clear the ArrayList
     // 	ar1.clear();
     //		 System.out.println(ar1);
     // ar1.clone()//for clone the arraylist
      ArrayList<String> CloneList=(ArrayList<String>)ar1.clone();
      System.out.println(CloneList);
      
      //ar1.contains()
      System.out.println(ar1.contains("Python"));
      System.out.println(ar1.contains("Devops"));
      System.out.println(ar1.containsAll(ar2));
	}

}
