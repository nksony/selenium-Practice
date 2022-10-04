package collectionFramewrk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//1st method

public class SynchronizedArrayList {

	public static void main(String[] args) {
 List<String>nameList=Collections.synchronizedList(new ArrayList<String>());
 
nameList.add("java");
nameList.add("python");
nameList.add("Ruby");

//iterator
synchronized (nameList) {
	Iterator<String> it=nameList.iterator();
	while(it.hasNext()) {
	System.out.println(it.next());
	}
}
//2nd method
CopyOnWriteArrayList<String>empList=new CopyOnWriteArrayList<String>();
empList.add("sony");
empList.add("prem");
Iterator<String> it=empList.iterator();
while(it.hasNext()) {
System.out.println(it.next());

	}

}
}
